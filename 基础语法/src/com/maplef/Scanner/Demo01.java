package com.maplef.Scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/09/18/0:39
 */
public class Demo01 {

    public static void main(String[] args) {
        //创建一个扫描器对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用Scanner接收用户输入内容:");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(str);

        }

        //凡是属于IO流的类,如果不关闭就会一直占用空间!
        scanner.close();

    }





}
