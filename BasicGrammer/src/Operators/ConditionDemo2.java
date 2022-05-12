package Operators;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// 判断一个整数是奇数还是偶数，并将结果打印输出。
		//定义一个变量存放数据
		//int n=11;
		//从键盘接收数据
		System.out.println("请输入一个整数：");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n+"是偶数！");
		}else{
			System.out.println(n+"是奇数！");
		}

	}

}
