package ToolException.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static void main(String[] args) {
		try{
			int result = test();
			System.out.println("one��two�����ǣ�" + result);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
			e.printStackTrace();
		}catch(InputMismatchException e){
			System.out.println("���벻ƥ��");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("�����쳣");
			e.printStackTrace();
		}
		int result2=test();
//		test();
//		test1();
	}

	/*ͨ��throws�׳��쳣ʱ����Կ��ܳ��ֵĶ����쳣��������������
	 * 1��throws����Ӷ���쳣���ͣ��м��ö��ŷָ�
	 * 2��throws�����Exception
	 * */

	/**
	 *
	 * @return asdas
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
	public static int test() throws ArithmeticException,InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.println("=====���㿪ʼ=====");
		System.out.print("�������һ��������");
		int one = input.nextInt();
		System.out.print("������ڶ���������");
		int two = input.nextInt();
		System.out.println("=====�������=====");
		return one / two;
	}

	public static int test1() throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("=====���㿪ʼ=====");
		System.out.print("�������һ��������");
		int one = input.nextInt();
		System.out.print("������ڶ���������");
		int two = input.nextInt();
		System.out.println("=====�������=====");
		return one / two;
	}

}
