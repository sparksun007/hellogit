/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: LambdaTest.java </p> 
 */
package com.spark.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.spark.MyListFactory;
import com.spark.pojo.UserTest;

/**
 * @author Sun Chuankun on 2020/10/13
 */
public class LambdaTest {
    private final String[] userNames = { "spark",
            "cherry",
            "sun",
            "Liu",
            "Baby",
            "Tom",
            "Jerry",
            "mom",
            "dad",
            "haha" };
    private List<UserTest> users = new ArrayList<>(16);
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass在执行");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass在执行");
    }
    @Before
    public void init() {
        for (int i = 0; i < userNames.length; ++i) {
            UserTest user = new UserTest();
            user.setId(i);
            user.setName(userNames[i]);
            users.add(user);
        }
        System.out.println("before在执行");
    }
    @After
    public void after() {
        System.out.println("after在执行");
    }
    @Test
    public void orderByName() {
        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        for (UserTest user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void get() {
        List list = LambdaTest.get(ArrayList::new);
        Assert.assertEquals(list.getClass().getSimpleName(), "ArrayList");
        Assert.assertEquals(list, new ArrayList<>());
        //调用其他test方法，也是只执行了一次@before和@after
//        orderByName();
    }
    public static List get(MyListFactory c) {
        return c.get();
    }
    public static void print(List list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
