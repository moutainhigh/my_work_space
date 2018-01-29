package com.ooteco.common;

import java.util.ResourceBundle;

/**
 * Created by zhoukang on 2016/03/16.
 */
public class BundleUtils {

    /**
     * @param file 资源文件
     * @param key  字段键值
     * @return 值
     * @date 2013-4-16
     */
    public static String getStringValue(String file, String key) {
        return ResourceBundle.getBundle(file).getString(key);
    }

    /**
     * @param file 资源文件
     * @param key  字段键值
     * @return 值
     * @date 2013-4-16
     */
    public static int getIntValue(String file, String key) {
        return Integer.parseInt(getStringValue(file, key));
    }

    /**
     * @param file 资源文件
     * @param key  字段键值
     * @return 值
     * @date 2013-4-16
     */
    public static long getLongValue(String file, String key) {
        return Long.parseLong(getStringValue(file, key));
    }

    /**
     * @param file 资源文件
     * @param key  字段键值
     * @return 值
     * @date 2013-4-16
     */
    public static float getFloatValue(String file, String key) {
        return Float.parseFloat(getStringValue(file, key));
    }

    /**
     * @param file 资源文件
     * @param key  字段键值
     * @return 值
     * @date 2013-4-16
     */
    public static double getDoubleValue(String file, String key) {
        return Double.parseDouble(getStringValue(file, key));
    }

    /**
     * @param file 资源文件
     * @param key  字段键值
     * @return 值
     * @date 2013-10-18
     */
    public static boolean getBooleanValue(String file, String key) {
        return Boolean.parseBoolean(getStringValue(file, key));
    }
}
