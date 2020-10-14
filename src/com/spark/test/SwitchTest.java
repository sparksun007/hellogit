/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: SwitchTest.java </p> 
 */
package com.spark.test;

/**
 * @param
 *
 * @author Sun Chuankun
 * @date 2020/10/12
 * @description
 */
public class SwitchTest {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(String param) {
        if (null != param) {
            switch (param) {
            // 肯定不是进入这里
            case "sth":
                System.out.println("it's sth");
                break;
            // 也不是进入这里
            case "null":
                System.out.println("it's null");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
            }
        }
    }
}
