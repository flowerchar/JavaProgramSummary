package com.flowerchar.people;

/*
 * 1、定义在方法内部，作用范围也在方法内
 * 2、和方法内部成员使用规则一样，class前面不可以添加public、private、protected、static
 * 3、类中不能包含静态成员
 * 4、类中可以包含final、abstract修饰的成员
 */
public class Person3 {
    public static int age;

    public Object getHeart(){
        class Heart3 {
            public int age=13;
            int temp=22;
            public String beat(){
                return Person3.age+"心脏在跳动";
            }
            public  void say(){
                System.out.println("hello");
            }
        }
        return new Heart3().beat();
    }

    public void eat(){
        System.out.println("人会吃东西");
    }

}
