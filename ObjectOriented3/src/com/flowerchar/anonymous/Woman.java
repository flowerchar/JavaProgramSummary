package com.flowerchar.anonymous;

public class Woman extends Person {

	@Override
	public void read() {
		System.out.println("女生喜欢读言情小说");
	}

	public static void main(String[] args) {
		Person person1 = new Woman();
		Person person2 = new Man();
		person1.read();
		person2.read();

	}
}
