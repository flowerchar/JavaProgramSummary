package string.string;

import java.util.ArrayList;
import java.util.List;

public class StringDemo1 {

	public static void main(String[] args) {
		//定义一个字符串"JAVA 编程 基础"
		String str="AJVA 编程 基础";
		//打印输出字符串的长度
		System.out.println("字符串的长度是："+str.length());

		//取出字符'程'并输出
		System.out.println(str.charAt(6));
		
		//取出子串"编程 基础"并输出
		System.out.println(str.substring(5));
		
		//取出子串"编程"并输出
		System.out.println(str.substring(5, 7));
		

		
	}

}
