package com.terry.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz = Class.forName("java.lang.String");

        // 获得类的方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        System.out.println("--------------------");

        // 获得类的属性
        Field[] fields = clazz.getFields();
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
