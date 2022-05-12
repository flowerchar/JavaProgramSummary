package Operators;

import java.text.DecimalFormat;

public class AssignDemo {

	public static void main(String[] args) {
		// 定义变量，并初始化价格为杯子的原价
		float price=19.8F;
		System.out.println("杯子的原价为："+price);
		//price=price*((float)0.8);
		price*=0.8;
		System.out.println("杯子打折之后的价格为："+price);
		
		//价格保留一位小数
		DecimalFormat df=new DecimalFormat("0.0");//#.#
		//String s=df.format(price);
		//System.out.println("保留一位小数后的价格："+s);
		System.out.println("保留一位小数后的价格为："+df.format(price));
	}

}
