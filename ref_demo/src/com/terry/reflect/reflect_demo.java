package com.terry.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflect_demo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");

        Person p = new Person();
        // test(p);

        test();
    }

    public static void test(Object obj) {
        Class<?> clazz = obj.getClass();

        // 获得类的方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        System.out.println("--------------------");

        // 获得类的属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field f: fields) {
            System.out.println(f);
        }
        System.out.println("--------------------");

        // 获得类的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println(constructor);
        }
    }


    public static void test() {
        Class<?> clazz = Person.class;

        // 获得类的方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        System.out.println("--------------------");

        // 获得类的属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field f: fields) {
            System.out.println(f);
        }
        System.out.println("--------------------");

        // 获得类的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println(constructor);
        }
    }
}
