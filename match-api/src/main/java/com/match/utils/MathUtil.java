package com.match.utils;

import java.util.Random;

/**
 * 数字相关的工具类
 * 
 * @author Gaoxiang Date: 2017-4-22 上午12:07:07
 */
public class MathUtil {
    
    /**
     * 返回0-i以内的随机整数
     * 
     * @param i
     * @return
     */
    public static int randomInt(int i) {
        return new Random().nextInt(i);
    }
    
    /**
     * 返回count个不重复的随机整数
     * 
     * @param min(包括)
     * @param max(包括)
     * @param count
     * @return
     */
    public static int[] randomNoRepeatArrayInt(int min, int max, int count) {
        int len = max - min + 1;
        
        if (max < min || count > len) {
            return null;
        }
        
        // 初始化给定范围的待选数组
        int[] source = new int[len];
        for (int i = min; i < min + len; i++) {
            source[i - min] = i;
        }
        
        int[] result = new int[count];
        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            // 待选数组0到(len-2)随机一个下标
            index = Math.abs(rd.nextInt() % len--);
            // 将随机到的数放入结果集
            result[i] = source[index];
            // 将待选数组中被随机到的数，用待选数组(len-1)下标对应的数替换
            source[index] = source[len];
        }
        
        return result;
    }
    
    /**
     * 返回count个随机整数
     * 
     * @param min(包括)
     * @param max(包括)
     * @param count
     * @return
     */
    public static int[] randomArrayInt(int min, int max, int count) {
        int len = max - min + 1;
        int[] result = new int[count];
        Random rd = new Random();
        for (int i = 0; i < count; i++) {
            result[i] = rd.nextInt(len) + min;
        }
        
        return result;
    }
}
