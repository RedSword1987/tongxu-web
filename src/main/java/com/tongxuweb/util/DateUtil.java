package com.tongxuweb.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * Created by zhangxinglin on 2016/10/20.
 *
 * @author zhangxinglin
 */
public class DateUtil {
    /**
     * The constant ONEWEEKMILLSECONDS.
     */
    public static final long ONEWEEKMILLSECONDS = 604800000;
    /**
     * The constant ONEDAYMILLSECONDS.
     */
    public static final long ONEDAYMILLSECONDS = 86400000;
    /**
     * The constant HALFDAYMILLSECONDS.
     */
    public static final long HALFDAYMILLSECONDS = 43200000;
    /**
     * The constant ONEHOURMILLSECONDS.
     */
    public static final long ONEHOURMILLSECONDS = 3600000;
    /**
     * The constant DEFAULT_DATE_PATTERN.
     */
    public static final String DEFAULT_DATE_PATTERN = "EEE MMM dd HH:mm:ss zzz yyyy";
    /**
     * The constant DATE_PATTERN_YYYY_MM.
     */
    public static final String DATE_PATTERN_YYYY_MM = "yyyy-MM";
    /**
     * The constant DATE_PATTERN_YYYY_MM_DD.
     */
    public static final String DATE_PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
    /**
     * The constant DATE_PATTERN_YYYY_MM_DD_HH.
     */
    public static final String DATE_PATTERN_YYYY_MM_DD_HH = "yyyy-MM-dd HH";
    /**
     * The constant DATE_PATTERN_YYYY_MM_DD_HH_SS.
     */
    public static final String DATE_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    /**
     * The constant ISO_8601.
     */
    public static final String ISO_8601 = "yyyy-MM-dd'T'HH:mm:ssXXX";
    /**
     * The constant SYSBEGINDATE.
     */
    //1970年的最开始时间
    public static final Date SYSBEGINDATE = new Date(0L);
    /**
     * The constant SYSENDDATE.
     */
    //2099年的最大时间
    public static final Date SYSENDDATE = new Date(4102415999000L);

    private static final String SEPARATOR = "~";

    /**
     * Gets time stamp.
     *
     * @param date the date
     * @return the time stamp
     */
    public static long getTimeStamp(Date date) {
        if (null == date) {
            return 0;
        }
        return date.getTime() / 1000;
    }

    /**
     * Time stamp to date date.
     *
     * @param timestamp the timestamp
     * @return the date
     */
    public static Date timeStampToDate(long timestamp) {
        if (timestamp <= 0) {
            return null;
        }

        Date date = new Date(timestamp);
        return date;
    }

    /**
     * Convert string to long long.
     *
     * @param time       the time
     * @param dateFormat the date format
     * @return the long
     */
    public static Long convertStringToLong(String time, String dateFormat) {
        Long result = null;
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            Date date = simpleDateFormat.parse(time);
            result = date.getTime() / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Convert long to string string.
     *
     * @param time       the time
     * @param dateFormat the date format
     * @return the string
     */
    public static String convertLongToString(Long time, String dateFormat) {
        if (time == null) {
            return "";
        }
        DateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Date date = new Date();
        date.setTime(time * 1000);
        return simpleDateFormat.format(date);
    }

    /**
     * get now time.
     *
     * @return the time long now
     */
    public static long getTimeLongNow() {
        return System.currentTimeMillis() / 1000;
    }

    /**
     * 获取今天的最早时间.
     *
     * @return the time long today begin
     */
    public static long getTimeLongTodayBegin() {
        return convertStringToLong(getTimeStringNow("yyyy-MM-dd") + " 00:00:00", "yyyy-MM-dd "
                + "HH:mm:ss");
    }

    /**
     * get today last second time.
     *
     * @return the time long today end
     */
    public static long getTimeLongTodayEnd() {
        return convertStringToLong(getTimeStringNow("yyyy-MM-dd") + " 23:59:59", "yyyy-MM-dd "
                + "HH:mm:ss");
    }


    /**
     * get now time String.
     *
     * @param dateFormat the date format
     * @return the time string now
     */
    public static String getTimeStringNow(String dateFormat) {
        DateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Date date = new Date();
        return simpleDateFormat.format(date);
    }

    /**
     * Gets week begin.
     *
     * @param date the date
     * @return the week begin
     */
    public static Date getWeekBegin(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0,
                0, 0);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }

    /**
     * Gets week end.
     *
     * @param date the date
     * @return the week end
     */
    public static Date getWeekEnd(Date date) {
        Date begin = getWeekBegin(date);
        Date end = new Date(begin.getTime() + ONEWEEKMILLSECONDS - 1000);
        return end;
    }

    /**
     * Gets this week begin.
     *
     * @return the this week begin
     */
    // 本周的开始时间(周一 00:00:00)
    public static Date getThisWeekBegin() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0,
                0, 0);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }

    /**
     * Gets this week end.
     *
     * @return the this week end
     */
    // 本周的结束时间(周日 23:59:59)
    public static Date getThisWeekEnd() {
        Date begin = getThisWeekBegin();
        Date end = new Date(begin.getTime() + ONEWEEKMILLSECONDS - 1000);
        return end;
    }


    /**
     * Gets last week begin.
     *
     * @return the last week begin
     */
    // 上周的开始时间(周一 00:00:00)
    public static Date getLastWeekBegin() {
        Date begin = getThisWeekBegin();
        Date result = new Date(begin.getTime() - ONEWEEKMILLSECONDS);
        return result;
    }

    /**
     * Gets last week end.
     *
     * @return the last week end
     */
    // 上周的结束时间(周日 23:59:59)
    public static Date getLastWeekEnd() {
        Date begin = getThisWeekBegin();
        Date result = new Date(begin.getTime() - 1000);
        return result;
    }

    /**
     * Gets last last week end.
     *
     * @return the last last week end
     */
    // 上上周的结束时间
    public static Date getLastLastWeekEnd() {
        Date begin = getThisWeekBegin();
        Date result = new Date(begin.getTime() - ONEWEEKMILLSECONDS - 1000);
        return result;
    }

    /**
     * Gets next week begin.
     *
     * @return the next week begin
     */
    // 下周的开始时间
    public static Date getNextWeekBegin() {
        Date begin = getThisWeekBegin();
        Date result = new Date(begin.getTime() + ONEWEEKMILLSECONDS);
        return result;
    }

    /**
     * Gets next week end.
     *
     * @return the next week end
     */
    // 下周的结束时间
    public static Date getNextWeekEnd() {
        Date begin = getThisWeekBegin();
        Date result = new Date(begin.getTime() + 2 * ONEWEEKMILLSECONDS - 1000);
        return result;
    }

    /**
     * Gets next next week begin.
     *
     * @return the next next week begin
     */
    // 下下周的开始时间
    public static Date getNextNextWeekBegin() {
        Date begin = getThisWeekBegin();
        Date result = new Date(begin.getTime() + 2 * ONEWEEKMILLSECONDS);
        return result;
    }


    /**
     * Gets today of week.
     *
     * @return the today of week
     */
    //获取今天是周几  1-7
    public static int getTodayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return w;
    }

    /**
     * get time move.
     *
     * @param begin      the begin
     * @param end        the end
     * @param dateFormat the date format
     * @return the day formet between
     */
    public static List<String> getDayFormetBetween(long begin, long end, String dateFormat) {
        List<String> arrList = new ArrayList<String>();
        long index = begin;
        do {
            String dayString = convertLongToString(index, dateFormat);
            arrList.add(dayString);
            index += 24 * 60 * 60;
        }
        while (index <= end);
        return arrList;
    }

    /**
     * 获取时间当天日期.
     *
     * @param source the source
     * @return the day
     */
    public static String getDay(Date source) {
        DateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN_YYYY_MM_DD);
        return simpleDateFormat.format(source);
    }

    /**
     * Gets date.
     *
     * @param source the source
     * @return the date
     */
    public static Date getDate(Date source) {
        Date date = null;
        try {
            DateFormat sdf = new SimpleDateFormat(DATE_PATTERN_YYYY_MM_DD);
            date = sdf.parse(sdf.format(source));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 转换标准时间.
     *
     * @param source the source
     * @return the day time
     */
    public static String getDayTime(Date source) {
        DateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN_YYYY_MM_DD_HH_MM_SS);
        return simpleDateFormat.format(source);
    }


    /**
     * Gets last day of month.
     *
     * @param source the source
     * @return the last day of month
     */
    public static Date getLastDayOfMonth(Date source) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(source);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }


    /**
     * 用first减last.
     * j   * 1min内显示单位为s
     * 1小时内显示单位为min
     * 1天内显示单位为h
     * 1月内显示单位为d
     * 1年内显示单位为m
     * 超过1年的显示单位为y
     *
     * @param first the first
     * @param last  the last
     * @return the date between desc
     */
    public static String getDateBetweenDesc(Date first, Date last) {
        String result = "";
        if (first != null && last != null) {

            Long firstLong = first.getTime() / 1000;
            Long lastLong = last.getTime() / 1000;
            //秒差
            Long minus = firstLong - lastLong;
            if (minus < 0) {
                minus = minus * -1;
            }
            if (minus < 60) {
                result = minus + "s";
            } else if (minus < 3600) {
                result = minus / 60 + "min";
            } else if (minus < 86400) {
                result = minus / 3600 + "h";
            } else if (minus < 2592000) {
                result = minus / 86400 + "d";
            } else if (minus < 31536000) {
                result = minus / 2592000 + "m";
            } else {
                result = minus / 31536000 + "y";
            }
        }
        return result;
    }

    /**
     * Parse iso 8601 date.
     *
     * @param dateStr the date str
     * @return the date
     */
    @SuppressWarnings({"unchecked", "IllegalType"})
    public static Date parseISO_8601(String dateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_8601);
        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Parse date.
     *
     * @param dateStr the date str
     * @param pattern the pattern
     * @return the date
     */
    @SuppressWarnings({"unchecked", "IllegalType"})
    public static Date parse(String dateStr, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException ex) {
            return null;
        }
    }

    /**
     * Format iso 8601 string.
     *
     * @param date the date
     * @return the string
     */
    public static String formatISO_8601(Date date) {
        return new SimpleDateFormat(ISO_8601).format(date);
    }

    /**
     * Is time included whole today boolean.
     *
     * @param start  the start
     * @param finish the finish
     * @return the boolean
     */
    public static boolean isTimeIncludedWholeToday(Date start, Date finish) {

        if (start == null || finish == null) {
            return false;
        }

        Long startTime = start.getTime() / 1000;
        Long finishTime = finish.getTime() / 1000;
        if (startTime <= getTimeLongTodayBegin() && finishTime >= getTimeLongTodayEnd()) {
            return true;
        }

        return false;
    }

    public static Integer getAge(Date birthday) {
        if (birthday == null) {
            return null;
        }

        LocalDate start = birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return Period.between(start, end).getYears();
    }

    public static Integer getSeniority(Date startedWorkAt) {
        if (startedWorkAt == null) {
            return null;
        }

        LocalDate start = startedWorkAt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int years = Period.between(start, end).getYears();
        int months = Period.between(start, end).getMonths() + years * 12;

        return BigDecimal.valueOf(months).divide(BigDecimal.valueOf(12), 0, RoundingMode.HALF_UP).intValue();
    }

    public static Integer getMonthInteger() {
        String month = DateUtil.getTimeStringNow("MM");
        if (month.startsWith("0")) {
            month = month.substring(1);
        }
        Integer monthI = Integer.valueOf(month);
        return monthI;
    }
}
