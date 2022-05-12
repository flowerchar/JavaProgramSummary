package PackageClass.wrap;

public class WrapperTest {

	public static void main(String[] args) {

		Integer one=new Integer(100);
		Integer two=new Integer(100);
		System.out.println("one==two的结果："+(one==two));//1
		
		Integer three=100;//自动装箱
		//Integer three=Integer.valueOf(100);
		System.out.println("three==100的结果："+(three==100));//2 自动拆箱
		
		Integer four=100; //并没有直接创建一个Integer对象，而是调用了下面的方法
//		Integer four=Integer.valueOf(100);    查询缓存池
		System.out.println("three==four的结果："+(three==four));//3
		
		Integer five=200;
		System.out.println("five==200的结果："+(five==200));//4
		
		Integer six=200;
		System.out.println("five==six的结果："+(five==six));//5
		
		Double d1=Double.valueOf(100);
		System.out.println("d1==100的结果："+(d1==100));
		
		Double d2=Double.valueOf(100);
		System.out.println("d1==d2的结果："+(d1==d2));
	}

}
