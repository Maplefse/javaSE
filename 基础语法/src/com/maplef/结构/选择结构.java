package com.maplef.结构;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/09/19/0:22
 */
public class 选择结构 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.equals("hello")){
            System.out.println(s);
        }else{
            System.out.println("结束");
        }
        scanner.close();

    }

}
