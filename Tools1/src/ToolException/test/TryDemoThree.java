package ToolException.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static void main(String[] args) {
		try{
			int result = test();
			System.out.println("one和two的商是：" + result);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
			e.printStackTrace();
		}catch(InputMismatchException e){
			System.out.println("输入不匹配");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("出现异常");
			e.printStackTrace();
		}
		int result2=test();
//		test();
//		test1();
	}

	/*通过throws抛出异常时，针对可能出现的多种异常情况，解决方案：
	 * 1、throws后面接多个异常类型，中间用逗号分隔
	 * 2、throws后面接Exception
	 * */

	/**
	 *
	 * @return asdas
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
	public static int test() throws ArithmeticException,InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.println("=====运算开始=====");
		System.out.print("请输入第一个整数：");
		int one = input.nextInt();
		System.out.print("请输入第二个整数：");
		int two = input.nextInt();
		System.out.println("=====运算结束=====");
		return one / two;
	}

	public static int test1() throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("=====运算开始=====");
		System.out.print("请输入第一个整数：");
		int one = input.nextInt();
		System.out.print("请输入第二个整数：");
		int two = input.nextInt();
		System.out.println("=====运算结束=====");
		return one / two;
	}

}
