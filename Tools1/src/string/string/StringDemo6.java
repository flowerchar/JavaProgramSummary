package string.string;

public class StringDemo6 {

	public static void main(String[] args) {
		//String的不可变性
		//String对象一旦被创建，则不能修改，是不可变的
		//所谓的修改其实是创建了新的对象，所指向的内存空间不变
		String s1="flowerchar";
		String s2="hello,"+s1;
		//s1不再指向flowerchar所在的内存空间，而是指向了"hello,flowerchar"
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		String s3=new String("hello,flowerchar!");
		System.out.println("子串:"+s3.substring(0,5));
		System.out.println("s3="+s3);
	}

}
