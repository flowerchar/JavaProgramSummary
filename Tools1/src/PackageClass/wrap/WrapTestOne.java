package PackageClass.wrap;

public class WrapTestOne {

	public static void main(String[] args) {

		//装箱：把基本数据类型转换成包装类
		//1、自动装箱
		int t1=2;
		Integer t2=t1;
		//2、手动装箱
		Integer t3=new Integer(t1);
		
		//测试
		System.out.println("int类型变量t1="+t1);
		System.out.println("Integer类型对象t2="+t2);
		System.out.println("Integer类型对象t3="+t3);
		System.out.println("*************************");
		//拆箱：把包装类转换成基本数据类型
		//1、自动拆箱
		int t4=t2;
		//2、手动拆箱
		int t5=t2.intValue();
		//测试
		System.out.println("Integer类型对象t2="+t2);
		System.out.println("自动拆箱后，int类型变量t4="+t4);
		System.out.println("手动拆箱后，int类型变量t5="+t5);
		double t6=t2.doubleValue();
		System.out.println("手动拆箱后，double类型变量t6="+t6);
		
	}

}
