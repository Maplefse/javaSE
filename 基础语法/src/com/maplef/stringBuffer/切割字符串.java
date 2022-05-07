package com.maplef.stringBuffer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/10/12/20:05
 */
public class 切割字符串 {

    public static void main(String[] args) {
        String str = "93437";

        System.out.println(str.length());
        System.out.println(str.substring(str.length() - 4)); // yanggb
        System.out.println(getProject4Num(str));
    }


    public static  String getProject4Num(String no) {
        String str1 = no;
        System.out.println(no);
        if (str1!=null&&str1.length()>=4){
            System.out.println(str1.length());
            return str1.substring(str1.length()-4,str1.length());
        }
        return null;
        };

}
