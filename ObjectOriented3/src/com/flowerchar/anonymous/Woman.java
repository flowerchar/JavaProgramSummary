package com.flowerchar.anonymous;

public class Woman extends Person {

	@Override
	public void read() {
		System.out.println("Ů��ϲ��������С˵");
	}

	public static void main(String[] args) {
		Person person1 = new Woman();
		Person person2 = new Man();
		person1.read();
		person2.read();

	}
}
