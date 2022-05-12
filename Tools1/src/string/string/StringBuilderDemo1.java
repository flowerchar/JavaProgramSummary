package string.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// 定义一个字符串"你好"
		StringBuilder str=new StringBuilder("你好");
		//在"你好"后面添加内容，将字符串变成"你好，flowerchar!"
	    str.append(',');
	    str.append("flowerchar!");
	    System.out.println("str="+str);
		System.out.println("str="+str.append(',').append("flowerchar!"));

		//将字符串变成"你好,flowerchar！"
		//两种方式：
		//1、使用delete方法删除mooc，然后在插入MOOC
		System.out.println("替换后："+str.delete(4, 8).insert(4, "MOOC"));
		//2、使用replace方法直接替换
		System.out.println("替换后："+str.replace(4, 8, "MOOC"));
		
		//在字符串"你好，flowerchar"中取出"你好"并输出
		System.out.println(str.substring(0,2));


	}

}
