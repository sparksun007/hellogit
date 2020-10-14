/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: UserTest.java </p> 
 */
package com.spark.pojo;

/**
 * @author Sun Chuankun on 2020/10/13
 */
public class UserTest {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "UserTest [id=" + id + ", name=" + name + "]";
    }
    
}
