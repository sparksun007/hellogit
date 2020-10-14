/**
 * <p>项目名称: Test </p> 
 * <p>文件名称: GenericTest.java </p> 
 */
package com.spark.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @param 
 *
 * @author Sun Chuankun
 * @date 2020/10/12
 * @description
 */
public class GenericTest {
    static List<BlackDog> blackDog = new ArrayList<BlackDog>();
//    static List<BlackDog> blackDog2 = new ArrayList<Animal>();
    
    static List<Dog> dog = new ArrayList<>();
    
    static List<Animal> animal = new ArrayList<Animal>();
//    static List<Animal> animal2 = blackDog;
//    static List<Animal> animal3 = new ArrayList<BlackDog>();
    
    static void writeExactAnimal(List<Animal> list, Animal item) {
        list.add(item);
    }
    
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static void f1() {
        writeExact(blackDog, new BlackDog());
        writeExact(animal, new Animal());
        
        writeExact(animal, new BlackDog());
//        writeExact(blackDog, new Dog());
    }
    
    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }
    static void f2() {
        writeWithWildcard(blackDog, new BlackDog());
        writeWithWildcard(animal, new BlackDog());
//        writeWithWildcard(blackDog, new Animal());
    }
    public static void main(String[] args) {
        f1(); 
        f2();
//        writeExactAnimal(blackDog, new BlackDog());
        System.out.println(blackDog);
        System.out.println(animal);
    }   
}
class Animal {
    protected String type;
    public Animal() {
        this.type = "Animal";
    }
    @Override
    public String toString() {
        return "Animal [type=" + type + "]";
    }
}
class Dog extends Animal {
    public Dog() {
        this.type = "Dog";
    }
    @Override
    public String toString() {
        return "Dog [type=" + type + "]";
    }
}
class BlackDog extends Dog {
    public BlackDog() {
        this.type = "BlackDog";
    }
    @Override
    public String toString() {
        return "BlackDog [type=" + type + "]";
    }
}


