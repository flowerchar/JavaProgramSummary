package ToolException.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {

		int result=test();
		System.out.println("one��two�����ǣ�"+ result);
		
	}

	public static int test(){
		Scanner input=new Scanner(System.in);
		System.out.println("=====���㿪ʼ=====");
		try{
			System.out.print("�������һ��������");
			int one=input.nextInt();
			System.out.print("������ڶ���������");
			int two=input.nextInt();
			return one/two;
		}catch(ArithmeticException e){
			System.out.println("����������Ϊ��");
			return 0;
		}finally{
			System.out.println("=====�������=====");
			return -100000;
		}
	}
}
