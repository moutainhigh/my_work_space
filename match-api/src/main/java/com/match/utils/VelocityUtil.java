package com.match.utils;

import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



/**
 * 日期时间工具类
 * @author qyou
 * @since 2012-06-18
 */
public class VelocityUtil {


    private static final SimpleDateFormat HTTP_FORMAT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z",
            new DateFormatSymbols(Locale.US));

    /**
     * 判断HTTP缓存
     * @param time1
     * @param time2
     * @return
     */
    public static boolean isHttpCache(long time1, long time2) {
        return HTTP_FORMAT.format(new Date(time1)).equals(HTTP_FORMAT.format(new Date(time2)));
    }

    /**
     * 格式化日期
     * @param date
     * @param format
     * @return
     */
    public static String dateFormat(Date date, String format) {
        if (date != null && format != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }
        return null;
    }

    /**
     * 格式化显示当前日期
     * @param format
     * @return
     */
    public static String dateFormat(String format) {
        if (format != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(getServerDate());
        }
        return null;
    }

    public static String dateFormat(long time) {
        return dateFormat(new Date(time), "yyyy-MM-dd HH:mm:ss");
    }

	public static String dateFormatForMin(long time) {
		return dateFormat(new Date(time), "yyyy/MM/dd HH:mm");
	}

	public static String dateFormat(String format, long time) {
		return dateFormat(format, new Date(time));
	}

	public static String dateFormat(String format, Date date) {
        if (date == null) return "";
        if (format != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }
        return null;
    }

    public static String dividePercent(int x, int y){
    	String res = "0";
        try {
            if(x ==0 || y ==0) {
                return res;
            }
            BigDecimal i = new BigDecimal(x*100);
            BigDecimal j = new BigDecimal(y);
            res = i.divide(j, 1, BigDecimal.ROUND_FLOOR).toString();
        } catch (Exception e) {
			System.out.println("计算除法异常:"+e);
        }
        return res.replace(".0", "");
    }
    // 获取文件MD5值
    public static String fileMD5(String path) {
        try {
            InputStream fis = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            int numRead = 0;
            while ((numRead = fis.read(buffer)) > 0) {
                md5.update(buffer, 0, numRead);
            }
            fis.close();
            return new BigInteger(1, md5.digest()).toString(16).toUpperCase();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获得文件大小
     * @param size
     * @return B/KB/MB/GB/TB
     */
    public static String fileSize(long size) {
        try {
            if (size >= 0 && size < 1024L) {
                return size + "B";
            } else if (size >= 1024L && size < 1024L * 1024L) {
                return size / 1024L + "KB";
            } else if (size >= 1024L * 1024L && size < 1024L * 1024L * 1024L) {
                return size / 1024L / 1024L + "MB";
            } else if (size >= 1024L * 1024L * 1024L && size < 1024L * 1024L * 1024L * 1024L) {
                BigDecimal longs = new BigDecimal(String.valueOf(size));
                BigDecimal sizeMB = new BigDecimal(1024L * 1024L * 1024L);
                return longs.divide(sizeMB, 2, BigDecimal.ROUND_HALF_UP).toString() + "GB";
            } else {
                BigDecimal longs = new BigDecimal(String.valueOf(size));
                BigDecimal sizeGB = new BigDecimal(1024L * 1024L * 1024L * 1024L);
                return longs.divide(sizeGB, 2, BigDecimal.ROUND_HALF_UP).toString() + "TB";
            }
        } catch (Exception e) {
            return "0B";
        }
    }

    /**
     * 服务器当前日期
     * @return
     */
    public static Date getServerDate() {
        return new Date();
    }

    public static boolean canDiff(File file1, File file2) {
        if (file1 == null || file2 == null || !file1.exists() || !file2.exists()) {
            return false;
        }
        return canDiff(file1.getName(), file2.getName());
    }

    public static boolean canDiff(String file1, String file2) {
        if (file1 == null || file2 == null) {
            return false;
        }
        if (file1.indexOf(".") < 0 || file2.indexOf(".") < 0) {
            return false;
        }
        List<String> ext = Arrays.asList(".txt", ".xml", ".js", ".css", ".vm", ".jsp", ".html", ".java", ".properties",
                ".sh", ".bak");
        String leftSuffix = file1.substring(file1.lastIndexOf("."));
        String rightSuffix = file2.substring(file2.lastIndexOf("."));
        return ext.contains(leftSuffix) && ext.contains(rightSuffix);
    }

    /**
     * 服务器运行时间，从启动到目前的运行时间
     * @return
     */
    public static String getRunningTime(Date date) {
        if(date == null) {
            return null;
        }
        long mss = System.currentTimeMillis() - date.getTime();
        long days = mss / (1000 * 60 * 60 * 24);
        long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (mss % (1000 * 60)) / 1000;
        StringBuffer str = new StringBuffer();
        if (days > 0) {
            str.append(days).append("天,");
        }
        if (hours < 10) {
            str.append("0");
        }
        str.append(hours).append(":");
        if (minutes < 10) {
            str.append("0");
        }
        str.append(minutes).append(":");
        if (seconds < 10) {
            str.append("0");
        }
        return str.append(seconds).toString();
    }

    /**
     * 返回字符串位置
     * @param str:目标串 
     * @param reg:匹配串
     * @return
     */
    public static int indexOf(String str, String reg){
    	if(str == null || reg == null){
    		//如果匹配串或者目标串为空，则返回-1
    		return -1;
    	}
    	if(str.indexOf(reg) < 0)
    		//如果在目标串中找不到匹配串，则返回0
    		return 0;
    	else
    		//如果在目标串中找到了匹配串，则返回匹配串的位置，从1开始
    		return str.indexOf(reg) + 1;
    }
    
    /**
     * 
    * @Description: 按指定长度截取字符串
    * @param  str
    * @param  length
    * @return 
     */
    public static String cutOffString(String str, Integer length) {
    	if (StringUtils.isEmpty(str)) {
    		return null;
    	} else {
    		if (str.length() < length.intValue()) {
    			return str;
    		} else {
    			return str.substring(0, length-1);
    		}
    	}
    }
    
    /**
     * 
    * @Description: 去除字符串中指定字符
    * @param  str
    * @param  cutStr
    * @return 
     */
    public static String replaceString(String str, String cutStr) {
    	if (StringUtils.isEmpty(str) || StringUtils.isEmpty(cutStr)) {
    		return str;
    	} else {
			return str.replaceAll(cutStr, "");
    	}
    }
    
    private final static String pattern1 = "EEE MMM dd HH:mm:ss yyyy Z";
	private final static String pattern2 = "yyyy-MM-dd";
	
	
   /**
	* @Description: git时间字符串转化为Date
	* @param gitTimeString "Mon Mar 25 16:28:52 2013 +0800"
	* @return 
	*/
	public static Date formateGitTimeToDate(String gitTimeString, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern, new DateFormatSymbols(Locale.US));
        try {
            return df.parse(gitTimeString);          
        } catch (ParseException e) {
           return null;
        }
	}
	
	/**
	* @Description: git Date转化为字符串
	* @param  date
	* @param  pattern
	 */
	public static String formateDateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern, new DateFormatSymbols(Locale.US));
        return df.format(date);          
	}
	
	/**
	 * 以友好的方式显示时间
	 * @param sdate
	 * @return
	 */
	public static String friendly_time (String sdate, String pattern) {
		String str = null;
		if(StringUtils.isEmpty(pattern)) {
			pattern = pattern1;
		}
		if (sdate.startsWith("'") && sdate.endsWith("'")) {
			str = sdate.substring(1, sdate.length()-1);
		} else {
			str = sdate;
		}
		Date time = formateGitTimeToDate(str, pattern);
		if (time == null) {
			return "Unknown";
		}
		String ftime = "";
		Calendar cal = Calendar.getInstance();
		//判断是否是同一天
		String curDate = formateDateToString(cal.getTime(), pattern2);
		String paramDate = formateDateToString(time, pattern2);
		if (curDate.equals(paramDate)) {
			int hour = (int)((cal.getTimeInMillis() - time.getTime())/3600000);
			if(hour == 0) {
				ftime = Math.max((cal.getTimeInMillis() - time.getTime()) / 60000,1)+"分钟前";
			} else { 
				ftime = hour+"小时前";
			}
			return ftime;
		}
		
		long lt = time.getTime()/86400000;
		long ct = cal.getTimeInMillis()/86400000;
		int days = (int)(ct - lt);		
		if (days == 0) {
			int hour = (int)((cal.getTimeInMillis() - time.getTime())/3600000);
			if (hour == 0) {
				ftime = Math.max((cal.getTimeInMillis() - time.getTime()) / 60000,1)+"分钟前";
			} else {
				ftime = hour+"小时前";
			}
		}
		else if(days == 1){
			ftime = "昨天";
		}
		else if(days == 2){
			ftime = "前天";
		}
		else if(days > 2 && days <= 10){ 
			ftime = days+"天前";			
		}
		else if(days > 10){			
			ftime = formateDateToString(time, pattern2);
		}
		return ftime;
	}
	
	public static String friendly_time (Date time) {
		if (time == null) {
			return "Unknown";
		}
		String ftime = "";
		Calendar cal = Calendar.getInstance();
		//判断是否是同一天
		String curDate = formateDateToString(cal.getTime(), pattern2);
		String paramDate = formateDateToString(time, pattern2);
		if (curDate.equals(paramDate)) {
			int hour = (int)((cal.getTimeInMillis() - time.getTime())/3600000);
			if(hour == 0) {
				ftime = Math.max((cal.getTimeInMillis() - time.getTime()) / 60000,1)+"分钟前";
			} else { 
				ftime = hour+"小时前";
			}
			return ftime;
		}
		
		long lt = time.getTime()/86400000;
		long ct = cal.getTimeInMillis()/86400000;
		int days = (int)(ct - lt);		
		if (days == 0) {
			int hour = (int)((cal.getTimeInMillis() - time.getTime())/3600000);
			if (hour == 0) {
				ftime = Math.max((cal.getTimeInMillis() - time.getTime()) / 60000,1)+"分钟前";
			} else {
				ftime = hour+"小时前";
			}
		}
		else if(days == 1){
			ftime = "昨天";
		}
		else if(days == 2){
			ftime = "前天";
		}
		else if(days > 2 && days <= 10){ 
			ftime = days+"天前";			
		}
		else if(days > 10){			
			ftime = formateDateToString(time, pattern2);
		}
		return ftime;
	}
	
	public static String subStringDescription(String str, Integer length){
		if(str==null||str==""||length==null||length<=0){
			return "";
		}
		if(str.length()<=length){
			return str;
		}
		return str.substring(0,length)+"...";
	}

	/**
	 * 判断一个字符是Ascill字符还是其它字符（如汉，日，韩文字符）
	 * 
	 * @param c, 需要判断的字符
	 * @return boolean, 返回true,Ascill字符
	 */
	public static boolean isLetter(char c) {
		int k = 0x80;
		return c / k == 0 ? true : false;
	}

	/**
	 * @param
	 *            s ,需要得到长度的字符串
	 * @return int, 得到的字符串长度
	 */
	public static int length(String s) {
		if (s == null)
			return 0;
		return s.length();
	}

	/**
	 * 截取一段字符的长度,不区分中英文,如果数字不正好，则少取一个字符位
	 * 
	 * @author patriotlml
	 * @param
	 *            origin, 原始字符串
	 * @param len, 截取长度(一个汉字长度按2算的)
	 * @return String, 返回的字符串
	 */
	public static String substring(String origin, int len) {
		int len1=len;
		if (origin == null || origin.equals("") || len < 1)
			return "";
		// 取得该字符串的字节长度
		int length = origin.getBytes().length;
		if(length < 4){
			return origin;
		}
		// 不包含特殊中文字符
		if (origin.length() == length) {
			// 如果截取长度是字符串长度以内,就substring,否则就取这个字符串
			if (len < origin.length()) {
				return origin.substring(0, len-3) + "...";
			} else {
				return origin;
			}
			// 含有汉字
		} else {
			StringBuffer sb = new StringBuffer();
			// 截取算法 遍历字符串,并且监测a值
			for (int i = 0; i < origin.length() && len > 0; i++) {
				// 如果是汉字算2个长度。
				if (origin.charAt(i) >= '\u4E00' && origin.charAt(i) <= '\u9FA5') {
					// 如果是汉字且不是最后一个字符，就加上，否则不加
					if (len > 1) {
						sb.append(origin.charAt(i));
						len -= 2;
					}
					// 不是汉字只算一个长度
				} else {
					sb.append(origin.charAt(i));
					len--;
				}
				if(len1 < origin.length() && 4 > len){
					break;
				}
			}
			if (len1 < origin.length()) {
				return sb.toString() + "...";
			} else {
				return origin;
			}
		}
	}
	
//	/**
//	 * @Description: 获取用户头像地址(加上前缀和后缀)
//	 * @return 
//	 */
//	public static String  userAvatarPath(String passportImagePath) {
//		if (StringUtils.isEmpty(passportImagePath))
//			return "";
//		return Constant.IMG_PREFIX + passportImagePath + Constant.IMG_SUFFIX;
//	}
	
//	/**
//	 * @Description: 获取项目头像地址(加上前缀和后缀)
//	 * @return 
//	 */
//	public static String  projectAvatarPath(String basePath,String projectImg, String picSize) {
//		if (StringUtils.isEmpty(projectImg)){
//			return basePath + Constant.PIC_DEF;
//		}
//		String regex = "^[\\u0391-\\uFFE5\\w\\-\\.]+$";
//		if(!projectImg.matches(regex)){
//			return basePath + Constant.PIC_DEF;
//		}
//		if(projectImg.endsWith("gif")){
//    		return Constant.PIC_SERVICE + projectImg;
//    	}else{
//    		return Constant.PIC_SERVICE + picSize + projectImg;
//    	}
//	}
//	
	/**
	 * @Description: 获取工单TAGS连接动态参数
	 * @return 
	 */
	public static String tagsHref(String ot, String ct) {
		ot = ot.replaceAll("'", "");
		ct = ct.replaceAll("'", "");
		//点击的tag没有传入
		if (StringUtils.isEmpty(ct)){
			return ot;
		}
		//未点击任何tag
		if (StringUtils.isEmpty(ot)){
			return ct;
		}
		//同时存在多个tag
		if(ot.length() > 1){
			//当前点击tag排在第一位
			if(ot.indexOf(ct) == 0){
				ot = ot.replace(ct+",", "");
			}
			//当前点击tag不是排在第一位
			else if(ot.indexOf(ct)>0){
				ot = ot.replace(","+ct, "");
			}
			//当前点击tag不存在
			else{
				ot = ot + "," + ct;
			}
		}
		//只有一个tag
		else{
			//当前点击tag与存在tag相同
			if(ot.equals(ct)){
				ot = "";
			}
			//当前点击tag与存在tag不同
			else{
				ot = ot + "," + ct;
			}
		}
		return ot;
	}
	
	/**
	 * @Description: 判断当前tag是否被选中
	 * @return 
	 */
	public static boolean tagsFlag(String ot, String ct) {
		ot = ot.replaceAll("'", "");
		ct = ct.replaceAll("'", "");
		//未点击任何tag
		if (StringUtils.isEmpty(ot)){
			return false;
		}
		//同时存在多个tag
		if(ot.length() > 1){
			//当前点击tag排在第一位
			if(ot.indexOf(ct) == 0){
				return true;
			}
			//当前点击tag不是排在第一位
			else if(ot.indexOf(ct)>0){
				return true;
			}
			//当前点击tag不存在
			else{
				return false;
			}
		}
		//只有一个tag
		else{
			//当前点击tag与存在tag相同
			if(ot.equals(ct)){
				return true;
			}
			//当前点击tag与存在tag不同
			else{
				return false;
			}
		}
	}
	
//	//对HTML描述进行转译
//	public static String htmlEscape(String html){
//		return HtmlUtils.htmlEscape(html);
//	}
//
//	/**
//	 * @author author
//	 *
//	 */
//	public static String getTimeDifferenceDesc(Date date) {
//        final DateTime s = new DateTime(date);
//		final DateTime e = new DateTime(new Date());
//		Interval interval = new Interval(s, e);
//
//		final Period p = interval.toPeriod(PeriodType.yearMonthDayTime());
//		for (DurationFieldType dft : p.getFieldTypes()) {
//			final int unit = p.get(dft);
//			if (unit > 0) {
//				String name = dft.getName();
//				if (unit == 1) {
//					name = dft.getName().substring(0,
//							dft.getName().length() - 1);
//				}
//
//				return String.format("%d %s", unit, name);
//			}
//		}
//		return "";
//	}
}
