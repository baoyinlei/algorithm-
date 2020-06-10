package com.baoyinlei.algorithm.utils;

/**
 * @Author: baoyinlei
 * @Date: 2020/6/10
 * @Version: 1.0
 */
public class CommonUtils {

    public static void show(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            System.out.print(comparables[i] + " ");
        }
        System.out.println();
    }

    public static void show2(Comparable[][] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = 0; j < comparables[i].length; j++) {
                System.out.print(comparables[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exch(Comparable[] a, int i , int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
