/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: MyComparator.java </p> 
 */
package com.spark;

import java.util.List;

/**
 * @author Sun Chuankun on 2020/10/13
 */
@FunctionalInterface
public interface MyListFactory {
    List get();
}
