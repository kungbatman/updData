
/**
 * Created by Lenovo on 2020/09/07.
 */

public class EngDevDayQty {
    //设备编号
    private String devId;
    //日期
    private String day;
    //上次设备读数
    private String lastDevValue;
    //本次设备读数
    private String nowDevValue;
    //本日用量
    private String dayQty;
    /**
     * 上次热量读数
     */
    private String lastHeatValue;

    /**
     * 本次热量读数
     */
    private String nowHeatValue;

    /**
     * 上次冷量读数
     */
    private String lastCoolValue;

    /**
     * 本次冷量读数
     */
    private String nowCoolValue;

    /**
     * 本日热量用量
     */
    private String dayHeat;

    /**
     * 本日冷量用量
     */
    private String dayCool;

    /**
     * 上次制冷高速风读数
     */
    private String lastCoolHighValue;

    /**
     * 本日制冷高速风读数
     */
    private String nowCoolHighValue;

    /**
     * 上次制冷中速风读数
     */
    private String lastCoolMedValue;

    /**
     * 本日制冷中速风读数
     */
    private String nowCoolMedValue;

    /**
     * 上次制冷低速风读数
     */
    private String lastCoolLowValue;

    /**
     * 本日制冷低速风读数
     */
    private String nowCoolLowValue;

    /**
     * 上次制热高速风读数
     */
    private String lastHeatHighValue;

    /**
     * 本日制热高速风读数
     */
    private String nowHeatHighValue;

    /**
     * 上次制热中速风读数
     */
    private String lastHeatMedValue;

    /**
     * 本日制热中速风读数
     */
    private String nowHeatMedValue;

    /**
     * 上次制热低速风读数
     */
    private String lastHeatLowValue;

    /**
     * 本日制热低速风读数
     */
    private String nowHeatLowValue;

    /**
     * 制冷高速风时间
     */
    private String coolHighTime;

    /**
     * 制冷中速风时间
     */
    private String coolMedTime;

    /**
     * 制冷低速风时间
     */
    private String coolLowTime;

    /**
     * 制热高速风时间
     */
    private String heatHighTime;

    /**
     * 制热中速风时间
     */
    private String heatMedTime;

    /**
     * 制热低速风时间
     */
    private String heatLowTime;

    /**
     * 上次上班时段制冷高速读数
     */
    private String lastWorkCoolHighValue;

    /**
     * 本日上班时段制冷高速读数
     */
    private String nowWorkCoolHighValue;

    /**
     * 上次上班时段制冷中速读数
     */
    private String lastWorkCoolMedValue;

    /**
     * 本日上班时段制冷中速读数
     */
    private String nowWorkCoolMedValue;

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLastDevValue() {
        return lastDevValue;
    }

    public void setLastDevValue(String lastDevValue) {
        this.lastDevValue = lastDevValue;
    }

    public String getNowDevValue() {
        return nowDevValue;
    }

    public void setNowDevValue(String nowDevValue) {
        this.nowDevValue = nowDevValue;
    }

    public String getDayQty() {
        return dayQty;
    }

    public void setDayQty(String dayQty) {
        this.dayQty = dayQty;
    }

    public String getLastHeatValue() {
        return lastHeatValue;
    }

    public void setLastHeatValue(String lastHeatValue) {
        this.lastHeatValue = lastHeatValue;
    }

    public String getNowHeatValue() {
        return nowHeatValue;
    }

    public void setNowHeatValue(String nowHeatValue) {
        this.nowHeatValue = nowHeatValue;
    }

    public String getLastCoolValue() {
        return lastCoolValue;
    }

    public void setLastCoolValue(String lastCoolValue) {
        this.lastCoolValue = lastCoolValue;
    }

    public String getNowCoolValue() {
        return nowCoolValue;
    }

    public void setNowCoolValue(String nowCoolValue) {
        this.nowCoolValue = nowCoolValue;
    }

    public String getDayHeat() {
        return dayHeat;
    }

    public void setDayHeat(String dayHeat) {
        this.dayHeat = dayHeat;
    }

    public String getDayCool() {
        return dayCool;
    }

    public void setDayCool(String dayCool) {
        this.dayCool = dayCool;
    }

    public String getLastCoolHighValue() {
        return lastCoolHighValue;
    }

    public void setLastCoolHighValue(String lastCoolHighValue) {
        this.lastCoolHighValue = lastCoolHighValue;
    }

    public String getNowCoolHighValue() {
        return nowCoolHighValue;
    }

    public void setNowCoolHighValue(String nowCoolHighValue) {
        this.nowCoolHighValue = nowCoolHighValue;
    }

    public String getLastCoolMedValue() {
        return lastCoolMedValue;
    }

    public void setLastCoolMedValue(String lastCoolMedValue) {
        this.lastCoolMedValue = lastCoolMedValue;
    }

    public String getNowCoolMedValue() {
        return nowCoolMedValue;
    }

    public void setNowCoolMedValue(String nowCoolMedValue) {
        this.nowCoolMedValue = nowCoolMedValue;
    }

    public String getLastCoolLowValue() {
        return lastCoolLowValue;
    }

    public void setLastCoolLowValue(String lastCoolLowValue) {
        this.lastCoolLowValue = lastCoolLowValue;
    }

    public String getNowCoolLowValue() {
        return nowCoolLowValue;
    }

    public void setNowCoolLowValue(String nowCoolLowValue) {
        this.nowCoolLowValue = nowCoolLowValue;
    }

    public String getLastHeatHighValue() {
        return lastHeatHighValue;
    }

    public void setLastHeatHighValue(String lastHeatHighValue) {
        this.lastHeatHighValue = lastHeatHighValue;
    }

    public String getNowHeatHighValue() {
        return nowHeatHighValue;
    }

    public void setNowHeatHighValue(String nowHeatHighValue) {
        this.nowHeatHighValue = nowHeatHighValue;
    }

    public String getLastHeatMedValue() {
        return lastHeatMedValue;
    }

    public void setLastHeatMedValue(String lastHeatMedValue) {
        this.lastHeatMedValue = lastHeatMedValue;
    }

    public String getNowHeatMedValue() {
        return nowHeatMedValue;
    }

    public void setNowHeatMedValue(String nowHeatMedValue) {
        this.nowHeatMedValue = nowHeatMedValue;
    }

    public String getLastHeatLowValue() {
        return lastHeatLowValue;
    }

    public void setLastHeatLowValue(String lastHeatLowValue) {
        this.lastHeatLowValue = lastHeatLowValue;
    }

    public String getNowHeatLowValue() {
        return nowHeatLowValue;
    }

    public void setNowHeatLowValue(String nowHeatLowValue) {
        this.nowHeatLowValue = nowHeatLowValue;
    }

    public String getCoolHighTime() {
        return coolHighTime;
    }

    public void setCoolHighTime(String coolHighTime) {
        this.coolHighTime = coolHighTime;
    }

    public String getCoolMedTime() {
        return coolMedTime;
    }

    public void setCoolMedTime(String coolMedTime) {
        this.coolMedTime = coolMedTime;
    }

    public String getCoolLowTime() {
        return coolLowTime;
    }

    public void setCoolLowTime(String coolLowTime) {
        this.coolLowTime = coolLowTime;
    }

    public String getHeatHighTime() {
        return heatHighTime;
    }

    public void setHeatHighTime(String heatHighTime) {
        this.heatHighTime = heatHighTime;
    }

    public String getHeatMedTime() {
        return heatMedTime;
    }

    public void setHeatMedTime(String heatMedTime) {
        this.heatMedTime = heatMedTime;
    }

    public String getHeatLowTime() {
        return heatLowTime;
    }

    public void setHeatLowTime(String heatLowTime) {
        this.heatLowTime = heatLowTime;
    }

    public String getLastWorkCoolHighValue() {
        return lastWorkCoolHighValue;
    }

    public void setLastWorkCoolHighValue(String lastWorkCoolHighValue) {
        this.lastWorkCoolHighValue = lastWorkCoolHighValue;
    }

    public String getNowWorkCoolHighValue() {
        return nowWorkCoolHighValue;
    }

    public void setNowWorkCoolHighValue(String nowWorkCoolHighValue) {
        this.nowWorkCoolHighValue = nowWorkCoolHighValue;
    }

    public String getLastWorkCoolMedValue() {
        return lastWorkCoolMedValue;
    }

    public void setLastWorkCoolMedValue(String lastWorkCoolMedValue) {
        this.lastWorkCoolMedValue = lastWorkCoolMedValue;
    }

    public String getNowWorkCoolMedValue() {
        return nowWorkCoolMedValue;
    }

    public void setNowWorkCoolMedValue(String nowWorkCoolMedValue) {
        this.nowWorkCoolMedValue = nowWorkCoolMedValue;
    }

    public String getLastWorkCoolLowValue() {
        return lastWorkCoolLowValue;
    }

    public void setLastWorkCoolLowValue(String lastWorkCoolLowValue) {
        this.lastWorkCoolLowValue = lastWorkCoolLowValue;
    }

    public String getNowWorkCoolLowValue() {
        return nowWorkCoolLowValue;
    }

    public void setNowWorkCoolLowValue(String nowWorkCoolLowValue) {
        this.nowWorkCoolLowValue = nowWorkCoolLowValue;
    }

    public String getLastWorkHeatHighValue() {
        return lastWorkHeatHighValue;
    }

    public void setLastWorkHeatHighValue(String lastWorkHeatHighValue) {
        this.lastWorkHeatHighValue = lastWorkHeatHighValue;
    }

    public String getNowWorkHeatHighValue() {
        return nowWorkHeatHighValue;
    }

    public void setNowWorkHeatHighValue(String nowWorkHeatHighValue) {
        this.nowWorkHeatHighValue = nowWorkHeatHighValue;
    }

    public String getLastWorkHeatMedValue() {
        return lastWorkHeatMedValue;
    }

    public void setLastWorkHeatMedValue(String lastWorkHeatMedValue) {
        this.lastWorkHeatMedValue = lastWorkHeatMedValue;
    }

    public String getNowWorkHeatMedValue() {
        return nowWorkHeatMedValue;
    }

    public void setNowWorkHeatMedValue(String nowWorkHeatMedValue) {
        this.nowWorkHeatMedValue = nowWorkHeatMedValue;
    }

    public String getLastWorkHeatLowValue() {
        return lastWorkHeatLowValue;
    }

    public void setLastWorkHeatLowValue(String lastWorkHeatLowValue) {
        this.lastWorkHeatLowValue = lastWorkHeatLowValue;
    }

    public String getNowWorkHeatLowValue() {
        return nowWorkHeatLowValue;
    }

    public void setNowWorkHeatLowValue(String nowWorkHeatLowValue) {
        this.nowWorkHeatLowValue = nowWorkHeatLowValue;
    }

    public String getLastOffCoolHighValue() {
        return lastOffCoolHighValue;
    }

    public void setLastOffCoolHighValue(String lastOffCoolHighValue) {
        this.lastOffCoolHighValue = lastOffCoolHighValue;
    }

    public String getNowOffCoolHighValue() {
        return nowOffCoolHighValue;
    }

    public void setNowOffCoolHighValue(String nowOffCoolHighValue) {
        this.nowOffCoolHighValue = nowOffCoolHighValue;
    }

    public String getLastOffCoolMedValue() {
        return lastOffCoolMedValue;
    }

    public void setLastOffCoolMedValue(String lastOffCoolMedValue) {
        this.lastOffCoolMedValue = lastOffCoolMedValue;
    }

    public String getNowOffCoolMedValue() {
        return nowOffCoolMedValue;
    }

    public void setNowOffCoolMedValue(String nowOffCoolMedValue) {
        this.nowOffCoolMedValue = nowOffCoolMedValue;
    }

    public String getLastOffCoolLowValue() {
        return lastOffCoolLowValue;
    }

    public void setLastOffCoolLowValue(String lastOffCoolLowValue) {
        this.lastOffCoolLowValue = lastOffCoolLowValue;
    }

    public String getNowOffCoolLowValue() {
        return nowOffCoolLowValue;
    }

    public void setNowOffCoolLowValue(String nowOffCoolLowValue) {
        this.nowOffCoolLowValue = nowOffCoolLowValue;
    }

    public String getLastOffHeatHighValue() {
        return lastOffHeatHighValue;
    }

    public void setLastOffHeatHighValue(String lastOffHeatHighValue) {
        this.lastOffHeatHighValue = lastOffHeatHighValue;
    }

    public String getNowOffHeatHighValue() {
        return nowOffHeatHighValue;
    }

    public void setNowOffHeatHighValue(String nowOffHeatHighValue) {
        this.nowOffHeatHighValue = nowOffHeatHighValue;
    }

    public String getLastOffHeatMedValue() {
        return lastOffHeatMedValue;
    }

    public void setLastOffHeatMedValue(String lastOffHeatMedValue) {
        this.lastOffHeatMedValue = lastOffHeatMedValue;
    }

    public String getNowOffHeatMedValue() {
        return nowOffHeatMedValue;
    }

    public void setNowOffHeatMedValue(String nowOffHeatMedValue) {
        this.nowOffHeatMedValue = nowOffHeatMedValue;
    }

    public String getLastOffHeatLowValue() {
        return lastOffHeatLowValue;
    }

    public void setLastOffHeatLowValue(String lastOffHeatLowValue) {
        this.lastOffHeatLowValue = lastOffHeatLowValue;
    }

    public String getNowOffHeatLowValue() {
        return nowOffHeatLowValue;
    }

    public void setNowOffHeatLowValue(String nowOffHeatLowValue) {
        this.nowOffHeatLowValue = nowOffHeatLowValue;
    }

    public String getWorkCoolHighTime() {
        return workCoolHighTime;
    }

    public void setWorkCoolHighTime(String workCoolHighTime) {
        this.workCoolHighTime = workCoolHighTime;
    }

    public String getWorkCoolMedTime() {
        return workCoolMedTime;
    }

    public void setWorkCoolMedTime(String workCoolMedTime) {
        this.workCoolMedTime = workCoolMedTime;
    }

    public String getWorkCoolLowTime() {
        return workCoolLowTime;
    }

    public void setWorkCoolLowTime(String workCoolLowTime) {
        this.workCoolLowTime = workCoolLowTime;
    }

    public String getWorkHeatHighTime() {
        return workHeatHighTime;
    }

    public void setWorkHeatHighTime(String workHeatHighTime) {
        this.workHeatHighTime = workHeatHighTime;
    }

    public String getWorkHeatMedTime() {
        return workHeatMedTime;
    }

    public void setWorkHeatMedTime(String workHeatMedTime) {
        this.workHeatMedTime = workHeatMedTime;
    }

    public String getWorkHeatLowTime() {
        return workHeatLowTime;
    }

    public void setWorkHeatLowTime(String workHeatLowTime) {
        this.workHeatLowTime = workHeatLowTime;
    }

    public String getOffCoolHighTime() {
        return offCoolHighTime;
    }

    public void setOffCoolHighTime(String offCoolHighTime) {
        this.offCoolHighTime = offCoolHighTime;
    }

    public String getOffCoolMedTime() {
        return offCoolMedTime;
    }

    public void setOffCoolMedTime(String offCoolMedTime) {
        this.offCoolMedTime = offCoolMedTime;
    }

    public String getOffCoolLowTime() {
        return offCoolLowTime;
    }

    public void setOffCoolLowTime(String offCoolLowTime) {
        this.offCoolLowTime = offCoolLowTime;
    }

    public String getOffHeatHighTime() {
        return offHeatHighTime;
    }

    public void setOffHeatHighTime(String offHeatHighTime) {
        this.offHeatHighTime = offHeatHighTime;
    }

    public String getOffHeatMedTime() {
        return offHeatMedTime;
    }

    public void setOffHeatMedTime(String offHeatMedTime) {
        this.offHeatMedTime = offHeatMedTime;
    }

    public String getOffHeatLowTime() {
        return offHeatLowTime;
    }

    public void setOffHeatLowTime(String offHeatLowTime) {
        this.offHeatLowTime = offHeatLowTime;
    }

    /**
     * 上次上班时段制冷低速读数
     */
    private String lastWorkCoolLowValue;

    /**
     * 本日上班时段制冷低速读数
     */
    private String nowWorkCoolLowValue;

    /**
     * 上次上班时段制热高速读数
     */
    private String lastWorkHeatHighValue;

    /**
     * 本日上班时段制热高速读数
     */
    private String nowWorkHeatHighValue;

    /**
     * 上次上班时段制热中速读数
     */
    private String lastWorkHeatMedValue;

    /**
     * 本日上班时段制热中速读数
     */
    private String nowWorkHeatMedValue;

    /**
     * 上次上班时段制热低速读数
     */
    private String lastWorkHeatLowValue;

    /**
     * 本日上班时段制热低速读数
     */
    private String nowWorkHeatLowValue;

    /**
     * 上次下班时段制冷高速读数
     */
    private String lastOffCoolHighValue;

    /**
     * 本日下班时段制冷高速读数
     */
    private String nowOffCoolHighValue;

    /**
     * 上次下班时段制冷中速读数
     */
    private String lastOffCoolMedValue;

    /**
     * 本日下班时段制冷中速读数
     */
    private String nowOffCoolMedValue;

    /**
     * 上次下班时段制冷低速读数
     */
    private String lastOffCoolLowValue;

    /**
     * 本日下班时段制冷低速读数
     */
    private String nowOffCoolLowValue;

    /**
     * 上次下班时段制热高速读数
     */
    private String lastOffHeatHighValue;

    /**
     * 本日下班时段制热高速读数
     */
    private String nowOffHeatHighValue;

    /**
     * 上次下班时段制热中速读数
     */
    private String lastOffHeatMedValue;

    /**
     * 本日下班时段制热中速读数
     */
    private String nowOffHeatMedValue;

    /**
     * 上次下班时段制热低速读数
     */
    private String lastOffHeatLowValue;

    /**
     * 本日下班时段制热低速读数
     */
    private String nowOffHeatLowValue;

    /**
     * 上班时段制冷高速时间：16位整形，单位小时 非分时段计费使用
     */
    private String workCoolHighTime;

    /**
     * 上班时段制冷中速时间：16位整形，单位小时 非分时段计费使用
     */
    private String workCoolMedTime;

    /**
     * 上班时段制冷低速时间：16位整形，单位小时 非分时段计费使用
     */
    private String workCoolLowTime;

    /**
     * 上班时段制热高速时间：16位整形，单位小时 非分时段计费使用
     */
    private String workHeatHighTime;

    /**
     * 上班时段制热中速时间：16位整形，单位小时 非分时段计费使用
     */
    private String workHeatMedTime;

    /**
     * 上班时段制热低速时间：16位整形，单位小时 非分时段计费使用
     */
    private String workHeatLowTime;

    /**
     * 下班时段制冷高速时间：16位整形，单位小时 非分时段计费使用
     */
    private String offCoolHighTime;

    /**
     * 下班时段制冷中速时间：16位整形，单位小时 非分时段计费使用
     */
    private String offCoolMedTime;

    /**
     * 下班时段制冷低速时间：16位整形，单位小时 非分时段计费使用
     */
    private String offCoolLowTime;

    /**
     * 下班时段制热高速时间：16位整形，单位小时 非分时段计费使用
     */
    private String offHeatHighTime;

    /**
     * 下班时段制热中速时间：16位整形，单位小时 非分时段计费使用
     */
    private String offHeatMedTime;

    /**
     * 下班时段制热低速时间：16位整形，单位小时 非分时段计费使用
     */
    private String offHeatLowTime;

}
