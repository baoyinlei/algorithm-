package com.baoyinlei.algorithm.chapter1;

import com.baoyinlei.algorithm.utils.CommonUtils;

/**
 * @Describe: 插入排序
 * @Author: baoyinlei
 * @Date: 2020/6/10
 */
public class Exemple1_1 {
    public static void main(String[] args) {
        Integer[] source = {7,6,3,1,4,5};
        CommonUtils.show(source);
        sort(source);
        CommonUtils.show(source);
    }

    public static void sort(Comparable[] source) {
        for (int i = 1; i < source.length; i++) {
            for (int j = i; j > 0 && CommonUtils.less(source[j], source[j-1]); j--) {
                CommonUtils.exch(source, j, j-1);
            }
        }
    }
}
