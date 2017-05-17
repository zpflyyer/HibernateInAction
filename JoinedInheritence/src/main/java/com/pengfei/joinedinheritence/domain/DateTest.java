package com.pengfei.joinedinheritence.domain;

import lombok.Data;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaopen on 5/17/2017.
 */
public class DateTest {

    @SneakyThrows
    public static void main(String[] args) {
        Date start = new SimpleDateFormat("yyyy-mm-dd").parse("2017-05-17");
        Date end = new SimpleDateFormat("yyyy-mm-dd").parse("2017-05-23");
//        List<Date> dateList = new DateTest().getBetweenDates(start,end);
//        for (Date date:
//             dateList) {
//            System.out.println(new SimpleDateFormat("yyyy-mm-dd").format(date));
//        }
        List<String> dateStrList = getBetweenDates("2017-05-17","2017-05-23");
        for (String dateStr:
                dateStrList) {
            System.out.println(dateStr);
        }
     }

    /**
     * 获取两个日期之间的日期
     * @param start 开始日期
     * @param end 结束日期
     * @return 日期集合
     */
    private List<Date> getBetweenDates(Date start, Date end) {
        List<Date> result = new ArrayList<Date>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (tempStart.before(tempEnd)) {
            if (tempStart.getTime().getDay()!=6 && tempStart.getTime().getDay()!=5){
                result.add(tempStart.getTime());
            }
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }

    /**
     * 获取两个日期之间的日期
     * @param from 开始日期
     * @param to 结束日期
     * @return 日期集合
     */
    @SneakyThrows
    private static List<String> getBetweenDates(String from, String to) {
        Date start = new SimpleDateFormat("yyyy-mm-dd").parse(from);
        Date end = new SimpleDateFormat("yyyy-mm-dd").parse(to);
        List<String> result = new ArrayList<String>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (tempStart.before(tempEnd)) {
            if (tempStart.getTime().getDay()!=6 && tempStart.getTime().getDay()!=5){
                result.add(new SimpleDateFormat("yyyy-mm-dd").format(tempStart.getTime()));
            }
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }
}
