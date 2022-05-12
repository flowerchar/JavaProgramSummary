package ConstantAndVariable;

public class StringDemo {

	public static void main(String[] args) {
		// 定义一个空字符串
		String s1="";
		System.out.println("s1="+s1);
		//定义一个字符串，内容是Hello
		String s2="Hello"; 
		System.out.println("s2="+s2);
		//定义一个包含unicode字符的字符串
		String s3="A\u109d\u005fB";
		System.out.println("s3="+s3);
		//定义一个包含空格的字符串
		String s4="Hello   qaa!";
		System.out.println("s4="+s4);
	}

}
