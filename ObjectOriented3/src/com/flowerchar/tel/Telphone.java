package com.flowerchar.tel;
/**
 * 原始手机
 * @author flowerchar
 *
 */
public class Telphone {
	private String brand;
	private int price;
	
	public Telphone(){
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//打电话
	public void call(){
		System.out.println("手机可以打电话");
	}
}
