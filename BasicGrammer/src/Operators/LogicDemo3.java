package Operators;

import java.util.Scanner;

public class LogicDemo3 {

	public static void main(String[] args) {
		// ����һ������
		System.out.println("������һ��������");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(!(n%3==0)){
			System.out.println(n+"���ܱ�3������");
		}else{
			System.out.println(n+"�ܱ�3������");
		}
	}

}
