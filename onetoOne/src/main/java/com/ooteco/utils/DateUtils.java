package com.ooteco.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static String formatDateToTimestamp(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(date);
    }

    public static Date addOneMonth(Date date){
        return addMonthCount(date,1);
    }

    public static Date addOneDay(Date date){
        return addDays(date, 1);
    }

    public static Date addDays(Date date, int dayCount){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, dayCount);
        return calendar.getTime();
    }

    public static Date addMonthCount(Date date, int mouthCount){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, mouthCount);
        return calendar.getTime();
    }

    public static int getDiffDays(Date date1, Date date2){
       long time1 = date1.getTime();
       long time2 = date2.getTime();
       return Integer.parseInt(String.valueOf(Math.abs(time1-time2)/(1000*3600*24)));
    }

    public static String getTimeStamp(){
        DateFormat timeStampDateFormat = new SimpleDateFormat("yyyyMMddHHssmm");
        return timeStampDateFormat.format(new Date());
    }

    public static String getDate(){
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        return df.format(new Date());
    }

    /**
     * 获取指定日期的凌晨时间
     */
    public static final Date getBeginTime(Date date) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();
    }

    /**
     * 获取指定日期的最后一毫秒时间
     */
    public static final Date getEndTime(Date date) {
        if (date == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);

        return calendar.getTime();
    }

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date date1 = df.parse("20170101");
        Date date2 = df.parse("20170102");
        System.out.println(getDiffDays(date1,date2));
    }
}
