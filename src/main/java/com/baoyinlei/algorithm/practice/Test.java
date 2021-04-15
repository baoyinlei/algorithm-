package com.baoyinlei.algorithm.practice;

import cn.hutool.core.io.FileUtil;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> strings = FileUtil.readLines("C:\\Users\\baoyinlei\\Desktop\\data.txt", "UTF-8");
        StringBuilder total = new StringBuilder();
        Map<String,List<String>> map = new HashMap<>();
        for (String str: strings) {
            String[] split = str.split(",");
            if (map.containsKey(split[0])) {
                List<String> strings1 = map.get(split[0]);
                strings1.add(change(split[1], split[2]));
            } else {
                List<String> list = new ArrayList<>();
                list.add(change(split[1], split[2]));
                map.put(split[0], list);
            }
        }
        Set<String> set= new HashSet<>();
        for (String str: strings) {
            String[] split = str.split(",");
            if (set.contains(split[0])) {
                continue;
            }
            StringBuilder sql = new StringBuilder();
            sql.append("insert into sys_rules_setting (company_code, company_name, rule_code, rule_name, label, label_value, date_created, created_by) values ('");

            sql.append(split[0]).append("','");
            sql.append(split[1]).append("'");
            sql.append(",'9','渠道','channel','").append(String.join(",",map.get(split[0]))).append("',now(),'admin');\n");
            total.append(sql.toString());
            set.add(split[0]);
        }
        System.out.println(total.toString());
    }

    private static String change(String name, String type) {
        if (name.contains("大东")) {
            if (type.equals("1")) {
                return "p0";
            }
            return "p2";
        } else if (name.contains("达巴")) {
            if (type.equals("1")) {
                return "p1";
            }
            return "p3";
        } else if (name.contains("达仕图")) {
            if (type.equals("1")) {
                return "p4";
            }
            return "p5";
        }
        return "";
    }
}
