package com.pengfei.joinedinheritence;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by zhaopen on 5/9/2017.
 */
public class DateTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH , -1);
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
        String payMonth = sdf.format(c.getTime());
        System.out.println(payMonth);
    }
}
