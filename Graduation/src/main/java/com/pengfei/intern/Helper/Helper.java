package com.pengfei.intern.Helper;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * Created by zhaopen on 5/17/2017.
 */
public class Helper {
    /**
     * 获取两个日期之间的日期
     * @param from 开始日期
     * @param to 结束日期
     * @return 日期集合
     */
    @SneakyThrows
    public static List<String> getBetweenDates(String from, String to) {
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
