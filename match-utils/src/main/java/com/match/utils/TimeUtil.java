package com.match.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 时间处理工具类
 * 
 * @author gaoxiang 2013-7-16
 */
public class TimeUtil {
    
    /** 1分钟的毫秒数 */
    public final static int ONE_MINUTE_MILLISECOND = 60000;
    
    /** 1小时的毫秒数 */
    public final static int ONE_HOUR_MILLISECOND = 60 * ONE_MINUTE_MILLISECOND;
    
    /** 1天的毫秒数 */
    public final static int ONE_DAY_MILLISECOND = 24 * ONE_HOUR_MILLISECOND;
    
    private static TimeUtil instance = new TimeUtil();
    
    /**
     * key=时间戳格式，value=SimpleDateFormat实例
     */
    private static ThreadLocal<Map<String, SimpleDateFormat>> dateFormatMap = new ThreadLocal<Map<String, SimpleDateFormat>>() {
        
        protected synchronized Map<String, SimpleDateFormat> initialValue() {
            return new HashMap<String, SimpleDateFormat>();
        }
    };
    
    private TimeUtil() {
    }
    
    public static TimeUtil getInstance() {
        return instance;
    }
    
    /**
     * 获取当前时间戳，线程安全
     * 
     * @param format
     * @return
     */
    public String getCurrentTimeStamp(String format) {
        SimpleDateFormat sdf = dateFormatMap.get().get(format);
        String result = null;
        if (null != sdf) {
            result = sdf.format(new Date());
        }
        else {
            sdf = new SimpleDateFormat(format);
            result = sdf.format(new Date());
            dateFormatMap.get().put(format, sdf);
        }
        
        return result;
    }
    
    /**
     * 将字符串转化为时间
     * 
     * @param dateString
     * @param format
     * @return
     */
    public Date getDateFromString(String dateString, String format) {
        if (StringUtil.isEmpty(dateString)) {
            return null;
        }
        
        SimpleDateFormat sdf = dateFormatMap.get().get(format);
        Date result = null;
        if (null != sdf) {
            try {
                result = sdf.parse(dateString);
            }
            catch (ParseException e) {
                return null;
            }
        }
        else {
            sdf = new SimpleDateFormat(format);
            try {
                result = sdf.parse(dateString);
            }
            catch (ParseException e) {
                return null;
            }
            
            dateFormatMap.get().put(format, sdf);
        }
        
        return result;
    }
    
    /**
     * 将时间转化为字符串
     * 
     * @param dateString
     * @param format
     * @return
     */
    public String getStringFromDate(Date date, String format) {
        if (null == date) {
            return null;
        }
        
        SimpleDateFormat sdf = dateFormatMap.get().get(format);
        String result = "";
        if (null != sdf) {
            result = sdf.format(date);
        }
        else {
            sdf = new SimpleDateFormat(format);
            result = sdf.format(date);
            dateFormatMap.get().put(format, sdf);
        }
        
        return result;
    }
    
    /**
     * 获取date后hours小时的日期，if(hours<0)，则获取date前hours小时的时间
     * 
     * @param date
     * @param hours
     * @return
     */
    public Date addHours(Date date, int hours) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        calender.add(Calendar.HOUR_OF_DAY, hours);
        return calender.getTime();
    }
    
    /**
     * 获取date后days天的日期，if(days<0)，则获取date前days天的时间
     * 
     * @param date
     * @param days
     * @return
     */
    public Date addDays(Date date, int days) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        calender.add(Calendar.DATE, days);
        
        return calender.getTime();
    }
    
    /**
     * 获取两个日期相差了多少天,参数顺序不重要
     * 
     * @param date1
     * @param date2
     * @return
     */
    public int intervalDays(Date date1, Date date2) {
        long intervalTime = date1.getTime() - date2.getTime();
        int intervalDays = (int) (intervalTime / ONE_DAY_MILLISECOND);
        return intervalDays < 0 ? 0 - intervalDays : intervalDays;
    }
    
    /**
     * 获取两个日期相差了多少小时,参数顺序不重要
     * 
     * @param date1
     * @param date2
     * @return
     */
    public int intervalHours(Date date1, Date date2) {
        long intervalTime = date1.getTime() - date2.getTime();
        int intervalHours = (int) (intervalTime / ONE_HOUR_MILLISECOND);
        return intervalHours < 0 ? 0 - intervalHours : intervalHours;
    }
    
    /**
     * 获取两个日期相差了多少分钟,参数顺序不重要
     * 
     * @param date1
     * @param date2
     * @return
     */
    public int intervalMinutes(Date date1, Date date2) {
        long intervalTime = date1.getTime() - date2.getTime();
        int intervalMinutes = (int) (intervalTime / ONE_MINUTE_MILLISECOND);
        return intervalMinutes < 0 ? 0 - intervalMinutes : intervalMinutes;
    }
    
    /**
     * 判断两个时间(东8区时间)是否同一天(57600000为历元到1970 年 1 月 2日的时间（北京时间），86400000为一天的毫秒数)
     * 先计算两个时间减去57600000，结果为该时间到1970 年 1 月 2日0点0分0秒0毫秒（北京时间）的毫秒数，再将毫秒数除以一天的毫秒数86400000，判断两个结果是否相等
     * 
     * @param d1
     * @param d2
     * @return 如果两个都是空，或者两个时间非空且是同一天，返回true，否则返回false
     */
    public boolean isSameDay(Date d1, Date d2) {
        if (null == d1 && null == d2) {
            return true;
        }
        else if (null != d1 && null != d2) {
            long ex1 = d1.getTime() - 57600000;
            long ex2 = d2.getTime() - 57600000;
            return ex1 / ONE_DAY_MILLISECOND == ex2 / ONE_DAY_MILLISECOND;
        }
        else {
            return false;
        }
    }
    
    /**
     * 获取当天的开始时间(57600000为历元到1970 年 1 月 2日的时间（北京时间），86400000为一天的毫秒数)
     * 先计算时间减去57600000，结果为该时间到1970 年 1 月 2日0点0分0秒0毫秒（北京时间）的毫秒数，
     * 再将毫秒数除以一天的毫秒数86400000，求余，相减，再加回57600000即可
     * 
     * @param date
     * @return
     */
    public Date getDayStart(Date date) {
        long time = date.getTime();
        time = time - 57600000;
        long mod = time % 86400000;
        
        return new Date(time - mod + 57600000);
    }
    
    /**
     * 时间比较大小
     * 参数传入格式为“2011-10-07 15:50:35”
     * 返回值为1:大于，0等于，-1小于
     * 
     * @param first
     * @param sec
     * @return
     * @throws ParseException
     */
    public int compareToTime(String first, String sec, String format) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(format);
        int i = 0;
        Date dateTime1 = dateFormat.parse(first);
        Date dateTime2 = dateFormat.parse(sec);
        i = dateTime1.compareTo(dateTime2);
        return i;
    }
    
    /**
     * 获取月末最后一天
     * 
     * @param date
     * @return
     */
    public Date getMonthEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (-index));
        return calendar.getTime();
    }
    
    /**
     * 获取月初第一天
     * 
     * @param date
     * @return
     */
    public Date getMonthStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (1 - index));
        return calendar.getTime();
    }
    
    /**
     * 根据传入的日期获取所在月份所有日期
     * 
     * @param d
     * @return
     */
    public List<Date> getAllDaysMonth(Date d) {
        List<Date> list = new ArrayList<Date>();
        Date date = getMonthStart(d);
        Date monthEnd = getMonthEnd(d);
        while (!date.after(monthEnd)) {
            list.add(date);
            date = getNextDay(date);
        }
        return list;
    }
    
    /**
     * 获取传入Date的下一天
     * 
     * @param date
     * @return
     */
    public Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }
}
