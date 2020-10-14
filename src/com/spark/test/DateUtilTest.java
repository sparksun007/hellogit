/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: DateUtilTest.java </p> 
 */
package com.spark.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

/**
 * @author Sun Chuankun on 2020/10/14
 */
public class DateUtilTest {
    @Test
    public void dateParse() {
        final String dateStr = "2020-10-14 12:12:12";
        DateTime dateTime = DateUtil.parse(dateStr);
        
        Calendar instance = Calendar.getInstance();
        instance.setTime(dateTime);
        
        Date time = instance.getTime();
        
        System.out.println(instance);
        System.out.println(time);
    }
}
