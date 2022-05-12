package com.flowerchar.test;

public interface IFather {
	void say();
	
	default void connection(){
		System.out.println("IFather中的connection");
	}
}
