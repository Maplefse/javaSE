package com.maplef.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: fxiao
 * @Version: 2021/10/12/14:43
 */
public class demo1 {

    public static void main(String[] args) {
        /*Calendar calendar = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取上月24号
        calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        String firstday = format.format(calendar.getTime());

        //获取本月24号
        calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        String lastday = format.format(calendar.getTime());*/


        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,-2);//获取昨天的日期
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String yesterday = formatter.format(date);
        Date todayDate=new Date();//获取今天日期
        String today = formatter.format(todayDate);

        System.out.println(yesterday);
        System.out.println(today);



    }

    public void 相差天数比较()
    {

        String d1="2020-10-02";
        LocalDate nowDate= LocalDate.now();
        LocalDate updateDate= LocalDate.parse(d1);
        long between = ChronoUnit.DAYS.between(updateDate,nowDate);	//判断与现在时间相差多少
        System.out.println("天数相差为:"+between);

        //git测试

    }
}
