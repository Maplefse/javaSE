package com.maplef.变量与运算符;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/09/16/0:05
 */
public class 变量 {

    //变量的基本声明方法
    String  s   = "演示";
    //类型 变量名 =   值 ;
    static String s1 = "演示2";
    public static void main(String[] args) {

        变量 变量 = new 变量();
        变量.test();
    }
    public void test(){
        //局部变量
        int i;
        i = 1;
        System.out.println(i);
        System.out.println(s1);
    }

}
