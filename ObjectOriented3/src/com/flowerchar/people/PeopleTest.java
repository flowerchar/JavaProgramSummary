package com.flowerchar.people;

//import com.flowerchar.people.Person.Heart;

public class PeopleTest {

	public static void main(String[] args) {

//		Person1 lili=new Person1();
//		lili.age=12;
		

//		//获取成员内部类对象实例，方式1：new 外部类.new 内部类
//		Person1.Heart1 myHeart=new Person1().new Heart1();
//		System.out.println(myHeart.beat());
////
////		//获取成员内部类对象实例，方式2：外部类对象.new 内部类
//		myHeart=lili.new Heart1();
//		System.out.println(myHeart.beat());
//
//		//获取成员内部类对象实例，方式3：外部类对象.获取方法
//		myHeart=lili.getHeart();
//		System.out.println(myHeart.beat());

		

		//获取静态内部类对象实例
//		Person2.Heart2 myHeart=new Person2.Heart2();
//		System.out.println(myHeart.beat());
//
//		Person2.Heart2.say();


//		System.out.println(lili.getHeart());

//		方法內部類
		Person3 person3 = new Person3();
		System.out.println(person3.getHeart());
	}

}
