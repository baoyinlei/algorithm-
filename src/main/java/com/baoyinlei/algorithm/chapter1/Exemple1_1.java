package com.baoyinlei.algorithm.chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Describe: 插入排序
 * @Author: baoyinlei
 * @Date: 2020/6/10
 */
public class Exemple1_1 {
    public static void sort(Comparable[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (less(source[i],source[j])) {
                    exch(source,i,j);
                }
            }
        }
    }

    /* compare support method */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入: ");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] ss = str.split("\\s+");
            ArrayList<Integer> list = new ArrayList<>();
            for (String s : ss) {
                list.add(Integer.parseInt(s));
            }
            Integer[] a = new Integer[list.size()];
            Integer[] integers = list.toArray(a);
            sort(list.toArray(integers));
            assert (isSorted(integers));
            System.out.print("排序结果: ");
            show(integers);
            System.out.println();
            System.out.print("请输入: ");
        }
    }
}
