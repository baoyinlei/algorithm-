package com.baoyinlei.algorithm.chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Template {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j],a[i])) {
                    exch(a,j,i);
                }
            }
        }
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[j];
        a[j] = a[i];
        a[i] = t;
    }
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("C:\\project\\algorithm\\algs4-data\\tiny.txt");
        System.setIn(input);
        String[] a = In.readStrings();
        show(a);
        sort(a);
        assert  isSorted(a);
        show(a);
    }
}
