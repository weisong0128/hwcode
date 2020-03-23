package com.java.huawei.test1;

import org.junit.Test;

import java.util.Scanner;

/**
 * description: 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述：一行字符串，非空，长度小于5000。
 * 输出描述：整数N，最后一个单词的长度。
 * 例子：输入：hello world    输出：5
 * author: ws
 * time: 2020/3/23 14:43
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println("请输入一段英文");
        Scanner input = new Scanner(System.in);
        //获取字符串形式的输入内容
        String nextLine = input.nextLine();
        if (nextLine.length() > 5000) {
            System.out.println("输入的字符串长度大于5000，请重新输入");
        } else if(nextLine.length() == 0) {
            System.out.println("请输入字符串");
        } else {
            System.out.println("获取到的字符串长度为：" + nextLine.length());
            //将字符串按照指定的分隔符存到String数组中
            // \\s表示  空格,回车,换行等空白符,  +号表示一个或多个的意思
            String[] strArray = nextLine.split("\\s+");
            System.out.println("获取到的单词总数为：" + strArray.length);
            //获取最后一个单词
            String lastWord = strArray[strArray.length - 1];
            System.out.println("最后一个单词长度为：" + lastWord.length());
        }

    }

    @Test
    public void test() {
        String nextLine = "ws ai xunbaobao     zhongguo    haha  wangyanqiu";
        String[] strArray = nextLine.split("\\s+");
        String lastWord = strArray[strArray.length - 1];
        System.out.println(lastWord.length());
    }

}

/**
 * 通过的答案 如下
 */

/*import java.util.*;
public class Main {
    public  static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] strArray = str.split("\\s+");
        String  lastStr = strArray[strArray.length-1];
        System.out.println(lastStr.length());
    }
}*/
