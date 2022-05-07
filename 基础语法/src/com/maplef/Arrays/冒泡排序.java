package com.maplef.Arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/11/17/0:53
 */
public class 冒泡排序 {

    //冒泡排序
    //比较数组中两个相邻的元素,如果第一个数比第二个数大或小,就交换他们的位置
    //每一轮比较,就会产出一个最大或者最小的数组
    //下一轮循环就减少一次排序次数
    //依次循环知道结束

    public static void main(String[] args) {

        //外层循环,判断循环需要进行多少次
        int[] array = {5,2,6,1,4,6,2,8,9};
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {

            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]>array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }


}
