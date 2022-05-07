package com.maplef.循环;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/10/26/1:06
 */
public class 递归 {

    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        if (n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }

}
