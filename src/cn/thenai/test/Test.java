package cn.thenai.test;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println("年:" + instance.get(Calendar.YEAR));
        System.out.println("月:" + instance.get(Calendar.MONTH) + 1);
        System.out.println("日:" + instance.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + instance.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + instance.get(Calendar.MINUTE));
        System.out.println("秒:" + instance.get(Calendar.SECOND));
    }
}