/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: ConditionalOperatorTest.java </p> 
 */
package com.spark.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @param 
 *
 * @author Sun Chuankun
 * @date 2020/10/12
 * @description
 */
public class ConditionalOperatorTest {
    @Test
    public void test1() {
        boolean flag = true; //设置成true，保证条件表达式的表达式二一定可以执行
        boolean simpleBoolean = false; //定义一个基本数据类型的boolean变量
        Boolean nullBoolean = null;//定义一个包装类对象类型的Boolean变量，值为null 
        //使用三目运算符并给x变量赋值
//        boolean result = flag ? nullBoolean : simpleBoolean; 
        Boolean result = flag ? nullBoolean : simpleBoolean; 
        System.out.println(result);
    }
    
    @Test 
    public void test2() {
        Map<String,Boolean> map =  new HashMap<String, Boolean>();
        Boolean b = (map!=null ? map.get("Hollis") : false);
        System.out.println(b);
    }
    
    @Test
    public void test3() {
        Integer i = null;
        Double d = 3.8;
        Object obj = true ? i : d;
        System.out.println(obj);
    }
    
    @Test
    public void test4() {
        Integer i = 3;
        Double d = null;
        Object obj = true ? i : d;
        System.out.println(obj);
    }
}
