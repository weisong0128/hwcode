package com.java.huawei.test1;

import java.util.Objects;
import java.util.Scanner;

/**
 * description: 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，
 * 然后输出输入字符串中含有该字符的个数，不分区大小写
 * author: ws
 * time: 2020/3/23 16:07
 */

public class demo2 {

    public static void main(String[] args) {
        System.out.println("输入如下：");
        //第一次输入
        Scanner input1 = new Scanner(System.in);
        String str1 = input1.nextLine().toLowerCase();
//        String str1 = Objects.toString(input1.nextLine(), "字符串不能为空");
        String str2 = input1.nextLine().toLowerCase();
//        String str2 = Objects.toString(input2.nextLine(), "字符串不能为空");
        int count = getCount(str1, str2);
        System.out.println(count);
    }

    private static int getCount(String str1, String str2) {
        char c = str2.charAt(0);
        int num = 0;
        if(!str1.isEmpty() && !str2.isEmpty()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == c)  {
                    ++num;
                }

            }
            return num;
        }  else {
            return 0;
        }
    }

}
