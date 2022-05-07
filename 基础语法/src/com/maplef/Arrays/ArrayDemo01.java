package com.maplef.Arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/11/17/0:37
 */
public class ArrayDemo01 {

    public static void main(String[] args) {
        int [] a = {1,2,6,7,3,4,5};
        System.out.println(a);//输出内存地址

        System.out.println(Arrays.toString(a));//打印数组元素Arrays.toString()

        Arrays.sort(a); //对数组进行排序
        System.out.println(Arrays.toString(a));
    }
}
