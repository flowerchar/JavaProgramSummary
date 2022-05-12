package string.string;

public class StringDemo5 {

	public static void main(String[] args) {
		// ==和equals方法的区别
		//定义三个字符串，内容都是
		String str1="flowerchar";
		String str2="flowerchar";
		String str3=new String("flowerchar");
		System.out.println("str1和str2的内容相同？"+(str1.equals(str2)));
		System.out.println("str1和str3的内容相同？"+(str1.equals(str3)));
		
		System.out.println("str1和str2的地址相同？"+(str1==str2));
		System.out.println("str1和str3的地址相同？"+(str1==str3));
		
	}

}
