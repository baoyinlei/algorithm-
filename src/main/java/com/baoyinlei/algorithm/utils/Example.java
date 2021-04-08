package com.baoyinlei.algorithm.utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int tiny = 0;
            for (int j = i; j < a.length; j++) {

            }
        }
    }

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
            List<Integer> list = new ArrayList<>();
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
