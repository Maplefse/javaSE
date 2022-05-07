package com.maplef.循环;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/10/24/2:14
 */
public class for打印三角形 {

    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {

            for (int j = 5; j>=i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                if (j == 1){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                //System.out.print("*");
            }

            for (int j = 1; j < i; j++){
                if (j+1 == i){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                //System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--){
                if (j == 5){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                //System.out.print("*");
            }

            for (int j = 5; j > i;j -- ){
                if (j-1 == i){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                //System.out.print("*");
            }
            System.out.println();

        }*/

        for (int i = 1; i <= 10; i++) {

            for (int z = 10; z <= 20+i; z++) {

                if (z == 20-i){
                    System.out.print("*");
                }else if(i>1 && z == 17+i){
                    System.out.print("*");
                }
                if(z >= 20-i && z < 17+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();

        }

    }

}
