package com.flowerchar.people;

/**
 * @apiNote 静态内部类
 */
/*
 * 1、静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
 * 2、静态内部类对象实例时，可以不依赖于外部类对象
 * 3、可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员
 * 4、当内部类属性与外部类属性同名时，默认直接调用内部类中的成员；
 * 如果需要访问外部类中的静态属性，则可以通过 外部类.属性 的方式；
 * 如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性的方式；
 */
public class Person2 {
    public int age;

    public Heart2 getHeart(){
        return new Heart2();
    }

    public void eat(){
        System.out.println("人会吃东西");
    }
    public static class Heart2 {
        static int age=13;
        int temp=22;
        public String beat(){
            new Person2().eat();
            return new Person2().age+"心脏在跳动";
        }
        public static void say(){
            System.out.println("hello");
        }
    }
}
