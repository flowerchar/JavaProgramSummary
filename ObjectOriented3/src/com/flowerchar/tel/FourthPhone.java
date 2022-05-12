package com.flowerchar.tel;

public class FourthPhone extends ThirdPhone implements IPhoto,INet{
//	public void photo(){
//		System.out.println("手机可以拍照");
//	}
//	public void network(){
//		System.out.println("手机可以上网");
//	}
	public void game(){
		System.out.println("手机可以玩游戏");
	}
	@Override
	public void photo() {

		System.out.println("手机可以拍照");
	}
	@Override
	public void network() {
		System.out.println("手机可以上网");
	}
	
	@Override
	public void connection() {
		System.out.println("我是FourthPhone中的connection");
	}
}
