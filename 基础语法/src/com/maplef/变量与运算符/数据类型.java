package com.maplef.变量与运算符;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/09/10/0:11
 */
public class 数据类型 {
    public static void main(String[] args) {
        //String a = "";

        //浮点数精数丢失

        float f = 0.1f;
        double d = 0.1;

        System.out.println(f==d);       //因为精度不同，==得到false
        System.out.println(f);
        System.out.println(d);

        float d1 = 648641357465132f;
        float d2 = d1+1;

        System.out.println(d1 == d2);
        //浮点数是有限的离散数,
        //double与float的精度不同,接近,但不等于
        //所以,最好避免使用浮点数进行比较


        //字符类型强制转换
        char c1 = 'a';
        char c2 = 'A';
        char c3 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //将字符类型强制进行转换
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((int)c3);


        int money = 10_0000_0000;
        int year = 18;
        int sum = money*18;
        //数据在计算之前,会先进行转型操作再开始计算
        //在这里,两个int相乘,已经超过21e造成了内存溢出问题,即使转换为long也是内存溢出后的数字
        long sum2 = money * year;
        long sum3 = money * ((long)year);

        System.out.println(money);
        System.out.println(sum);    //输出结果820130816
        System.out.println(sum2);   //输出结果820130816
        System.out.println(sum3);

    }

}
