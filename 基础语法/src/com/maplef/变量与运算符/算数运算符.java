package com.maplef.变量与运算符;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/09/16/0:54
 */
public class 算数运算符 {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        int i3 = 33;
        int i4 = 44;

        System.out.println(i1+i2); //结果为30
        System.out.println(i1-i2); //结果为-10
        System.out.println(i1*i3); //结果为300
        System.out.println(i1/i2); //结果为0
        System.out.println(i3%i1); //结果为
        System.out.println(i3++);  //结果为33
        System.out.println(i4--);  //结果为44

        int i5 = 11;
        int i6 = 22;

        System.out.println(++i5);   //结果伟12
        System.out.println(--i6);   //结果伟21




        //逻辑运算符
        boolean t = false;
        boolean f = false;

        System.out.println("a && b :"+ (t && f) );  //输出:a && b :false
        System.out.println("a || b :"+ (t || f) );  //输出:a || b :true
        System.out.println("!(a && b) :"+ !(t && f) ); //输出!(a && b) :true


    }

}
