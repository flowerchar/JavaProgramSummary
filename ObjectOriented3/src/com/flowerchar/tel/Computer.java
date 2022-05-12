package com.flowerchar.tel;

public abstract class Computer implements INet{
//	public void network(){
//		System.out.println("电脑可以上网");
//	}
	public void game(){
		System.out.println("电脑可以玩游戏");
	}
	public void vedio(){
		System.out.println("电脑可以看视频");
	}
	public void music(){
		System.out.println("电脑可以听音乐");
	}
	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("电脑可以上网");
	}
}
