package com.maplef.循环;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/10/23/1:17
 */
public class for循环 {

    public static void main(String[] args) {

/*        for(;;){
            System.out.println("死循环");
        }*/

/*        for (int i = 1; i <= 9; i++) {
            int b = i;
            for (;b <= 9; b++) {
                if (b==9){
                    System.out.println(i+"*"+b);
                }else{
                    System.out.print(i+"*"+b+" ");
                }

            }
        }*/



        //从1到9 99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int c = 1; c <= i; c++) {
                    System.out.print(c+"*"+i+" ");
            }
            System.out.println();
        }

        //从9到1 99乘法表
        for (int i = 9,z=1; i >= 1; i--,z++) {
            for (int c = 1; c <= z; c++) {
                    System.out.print(c+"*"+(i+c-1)+" ");
            }
            System.out.println();
        }


    }


}
