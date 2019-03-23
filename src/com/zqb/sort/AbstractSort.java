package com.zqb.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by root on 2019/3/13.
 */
public abstract class AbstractSort {

    public static final int[] ARRAY = { 8, 34, 64, 51, 33, 22, 44, 55, 88, 1, 0, 2, 2 };

    // 有序数组
    public static final int[] ARRAY2 = { 0, 1, 2, 2, 8, 22, 33, 34, 44, 51, 55, 64, 88 };

    public abstract int[] sort(int[] array);

    public static void printResult(int[] array) throws Exception {
        if (array == null || array.length == 0)
            throw new Exception("no element or invalid element in ARRAY");
        for(int item : array)
        {
            System.out.print(item+",");
        }
    }
}
