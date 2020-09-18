import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    static Connection conn = null;

    public static final int[] qty_days = {
//            20200816, 20200817, 20200818, 20200819, 20200820, 20200821, 20200822, 20200823, 20200824,
//            20200825, 20200826, 20200827, 20200828, 20200829, 20200830, 20200831
            20200901
    };

    public static final String[] his_days = {
//            "2020-08-15", "2020-08-16", "2020-08-17", "2020-08-18", "2020-08-19", "2020-08-20", "2020-08-21", "2020-08-22",
//            "2020-08-23",
//            "2020-08-24",
//            "2020-08-25", "2020-08-26", "2020-08-27", "2020-08-28", "2020-08-29", "2020-08-30", "2020-08-31"
            "2020-09-01"
    };


    public static void initConn() throws ClassNotFoundException, SQLException {

        String sql;
        String url = "jdbc:mysql://localhost:3306/energybilling?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";

        String username = "root";
        String password = "root";
        try {
            // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
            // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动

            System.out.println("成功加载MySQL驱动程序");
            // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void insert() {
        // 开时时间
        Long begin = new Date().getTime();
        // sql前缀

        EngDevDayQtyVo engDevDayQtyVo = null;
        List<EngDevDayQtyVo> list = null;


        try {

            PrintStream mytxt = new PrintStream(".log.txt");

            PrintStream out = System.out;

            System.setOut(mytxt);

            System.out.println("文档执行的日期是：" + new Date());
            try {
                // 保存sql后缀
                StringBuffer suffix = new StringBuffer();
                // 设置事务为非自动提交
                conn.setAutoCommit(false);
                // Statement st = conn.createStatement();
                // 比起st，pst会更好些
                PreparedStatement pst = conn.prepareStatement("");


                // 外层循环，总提交事务次数
            for (int i = 0; i < qty_days.length; i++) {
                System.out.println("日期： " + qty_days[i]);
                list = new ArrayList<>();
                ResultSet rs = pst.executeQuery("SELECT\n" +
                        "DISTINCT a.dev_id as devId ,\n" +
                        "c.dev_type as devType\n" +
                        "\n" +
                        "FROM\n" +
                        "\teng_dev_day_qty a,\n" +
                        "\teng_dev c,\n" +
                        "\t\n" +
                        "\t(\n" +
                        "SELECT\n" +
                        "\tdev_id AS devId,\n" +
                        "\tday,\n" +
                        "\tcount( * ) AS count \n" +
                        "FROM\n" +
                        "\teng_dev_day_qty \n" +
                        "WHERE\n" +
                        "\tDAY = " + qty_days[i] + "\n" +
                        "GROUP BY\n" +
                        "\tdev_id \n" +
                        "HAVING\n" +
                        "\tcount > 1 \n" +
                        "\t) b \n" +
                        "WHERE\n" +
                        "\ta.dev_id = b.devId \n" +
                        "\tAND c.id = a.dev_id \n" +
                        "\tAND a.day = b.day\n" +
                        "\t");

                if (rs != null) System.out.println("不为空");

                while (rs.next()) {
                    engDevDayQtyVo = new EngDevDayQtyVo();
                    engDevDayQtyVo.setDevType(rs.getString("devType"));
                    engDevDayQtyVo.setDevId(rs.getString("devId"));
                    list.add(engDevDayQtyVo);
//                    System.out.println("获得的实体: " + engDevDayQtyVo.getDevId());
                }


                StringBuilder sb = new StringBuilder("" + qty_days[i]);
                sb.insert(4, "-");
                sb.insert(7, "-");

                String days1 = sb.toString().concat(" 23:59:59");
                String days2 = sb.toString().concat(" 00:00:00");
                for (EngDevDayQtyVo engDev : list) {
//                    System.out.println("li" + engDev.getDevId());
                    String nowValue = "0";
                    String lastValue = "0";
                    String dayQty = "0";
//                    pst.close();
//                    pst = conn.prepareStatement("");
                    if ("01".equals(engDev.getDevType())) {
                        //电
                        ResultSet rsEN = pst.executeQuery("SELECT\n" +
                                "\ta.total_elec_engy as nowValue\n" +
                                "FROM\n" +
                                "\teng_dev_elect_his a,\n" +
                                "\t( SELECT dev_id, max( id ) as id FROM eng_dev_elect_his WHERE " +
                                "\tcreate_time <=" + "'" + days1 + "'" + " GROUP BY dev_id ) b\n" +
                                "WHERE a.id = b.id and a.dev_id = " + engDev.getDevId());

                        while (rsEN.next()) {
                            nowValue = rsEN.getString("nowValue");
                        }

                        ResultSet rsEL = pst.executeQuery("SELECT\n" +
                                "                        a.total_elec_engy as lastValue\n" +
                                "                                FROM\n" +
                                "                        eng_dev_elect_his a,\n" +
                                "                        ( SELECT dev_id, max( id ) as id FROM eng_dev_elect_his WHERE " +
                                " create_time <= " + "'" + days2 + "'" + " GROUP BY dev_id ) b\n" +
                                "                        WHERE a.id = b.id and a.dev_id = " + engDev.getDevId());

                        while (rsEL.next()) {
                            lastValue = rsEL.getString("lastValue");
                        }

                        dayQty = new BigDecimal(nowValue).subtract(new BigDecimal(lastValue)).setScale(2,
                                BigDecimal.ROUND_HALF_UP).toString();

//                        System.out.println("值： " + nowValue + " " + lastValue + " " + dayQty);
                        String sql = "UPDATE eng_dev_day_qty SET last_dev_value=" + lastValue + ",now_dev_value=" + nowValue + "," +
                                "day_qty=" + dayQty + "where day=" + "'" + qty_days[i] + "'" +
                                "and dev_id = " + engDev.getDevId();
                        pst.addBatch(sql);
                        // 执行操作
                        pst.executeBatch();

                        conn.commit();
                    } else if ("02".equals(engDev.getDevType()) || "07".equals(engDev.getDevType())) {
                        //水
                        ResultSet rsWN = pst.executeQuery("SELECT\n" +
                                "\ta.total_amount as nowValue\n" +
                                "FROM\n" +
                                "\teng_dev_water_his a,\n" +
                                "\t( SELECT dev_id, max( id ) as id FROM eng_dev_water_his WHERE " +
                                "create_time <= " + "'" + days1 + "'" + " GROUP BY dev_id ) b\n" +
                                "WHERE a.id = b.id and a.dev_id = " + engDev.getDevId());
                        while (rsWN.next()) {
                            nowValue = rsWN.getString("nowValue");
                        }
                        ResultSet rsWL = pst.executeQuery("SELECT\n" +
                                "                        a.total_amount as lastValue\n" +
                                "                                FROM\n" +
                                "                        eng_dev_water_his a,\n" +
                                "                        ( SELECT dev_id, max( id ) as id FROM eng_dev_water_his WHERE " +
                                " create_time <= " + "'" + days2 + "'" + " GROUP BY dev_id ) b\n" +
                                "                        WHERE a.id = b.id and a.dev_id = " + engDev.getDevId());
                        while (rsWL.next()) {
                            lastValue = rsWL.getString("lastValue");
                        }

                        dayQty = new BigDecimal(nowValue).subtract(new BigDecimal(lastValue)).setScale(2,
                                BigDecimal.ROUND_HALF_UP).toString();

//                        System.out.println("值： " + nowValue + " " + lastValue + " " + dayQty);
                        String sql = "UPDATE eng_dev_day_qty SET last_dev_value=" + lastValue + ",now_dev_value=" + nowValue + "," +
                                "day_qty=" + dayQty + "where day=" + "'" + qty_days[i] + "'" +
                                "and dev_id = " + engDev.getDevId();
                        pst.addBatch(sql);
                        // 执行操作
                        pst.executeBatch();

                        conn.commit();


                    } else if ("07".equals(engDev.getDevType())) {
                        // 蒸汽
                        ResultSet rsSN = pst.executeQuery("SELECT\n" +
                                "\ta.total_amount as nowValue\n" +
                                "FROM\n" +
                                "\teng_dev_stream_his a,\n" +
                                "\t( SELECT dev_id, max( id ) as id FROM eng_dev_stream_his WHERE " +
                                " create_time <= " + "'" + days1 + "'" + " GROUP BY dev_id ) b\n" +
                                "WHERE a.id = b.id and a.dev_id = " + engDev.getDevId());
                        while (rsSN.next()) {
                            nowValue = rsSN.getString("nowValue");
                        }
                        ResultSet rsSL = pst.executeQuery("SELECT\n" +
                                "                        a.total_amount as lastValue\n" +
                                "                                FROM\n" +
                                "                        eng_dev_stream_his a,\n" +
                                "                        ( SELECT dev_id, max( id ) as id FROM eng_dev_stream_his WHERE " +
                                "create_time <= " + "'" + days2 + "'" + "  GROUP BY dev_id ) b\n" +
                                "                        WHERE a.id = b.id and a.dev_id = " + engDev.getDevId());

                        while (rsSL.next()) {
                            lastValue = rsSL.getString("lastValue");
                        }

                        dayQty = new BigDecimal(nowValue).subtract(new BigDecimal(lastValue)).setScale(2,
                                BigDecimal.ROUND_HALF_UP).toString();

//                        System.out.println("值： " + nowValue + " " + lastValue + " " + dayQty);
                        String sql = "UPDATE eng_dev_day_qty SET last_dev_value=" + lastValue + ",now_dev_value=" + nowValue + "," +
                                "day_qty=" + dayQty + "where day=" + "'" + qty_days[i] + "'" +
                                "and dev_id = " + engDev.getDevId();
                        pst.addBatch(sql);
                        // 执行操作
                        pst.executeBatch();
                        conn.commit();
                    }
                }
            }

                String sql = "\n" +
                        "\n" +
                        "DELETE\n" +
                        "FROM\n" +
                        "\teng_dev_day_qty\n" +
                        "WHERE\n" +
                        "\t(dev_id, day) IN (\n" +
                        "\t\tSELECT\n" +
                        "\t\t\tt.dev_id,\n" +
                        "\t\t\tt.day\n" +
                        "\t\tFROM\n" +
                        "\t\t\t(\n" +
                        "\t\t\t\tSELECT\n" +
                        "\t\t\t\t\tdev_id,\n" +
                        "\t\t\t\t\t`day`\n" +
                        "\t\t\t\tFROM\n" +
                        "\t\t\t\t\teng_dev_day_qty\n" +
                        "\t\t\t\tGROUP BY\n" +
                        "\t\t\t\t\tdev_id,\n" +
                        "\t\t\t\t\t`day`\n" +
                        "\t\t\t\tHAVING\n" +
                        "\t\t\t\t\tcount(1) > 1\n" +
                        "\t\t\t) t\n" +
                        "\t)\n" +
                        "AND id NOT IN (\n" +
                        "\tSELECT\n" +
                        "\t\tdt.id\n" +
                        "\tFROM\n" +
                        "\t\t(\n" +
                        "\t\t\tSELECT\n" +
                        "\t\t\t\tmin(id) AS id\n" +
                        "\t\t\tFROM\n" +
                        "\t\t\t\teng_dev_day_qty\n" +
                        "\t\t\tGROUP BY\n" +
                        "\t\t\t\tdev_id,\n" +
                        "\t\t\t\tday\n" +
                        "\t\t\tHAVING\n" +
                        "\t\t\t\tcount(1) > 1\n" +
                        "\t\t) dt\n" +
                        ")";
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                conn.commit();

                // 头等连接
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // 结束时间
            Long end = new Date().getTime();
            // 耗时
            System.out.println("cast : " + (end - begin) / 1000 + " s");


            System.setOut(out);

            System.out.println("日期保存完毕。");

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }


    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        initConn();
        insert();
    }


}
