package Method;

/**
 * 可变参数方法访问权限问题
 * @author lwl
 * @version 1.0
 */
public class ArgsDemo3 {
	//可变参数列表所在的方法是最后被访问的。
	public int plus(int... a){
		int sum=0;
		for(int n:a){
			sum=sum+n;
		}
		System.out.println("带可变参数的方法被调用！");
		return sum;
	}
	public int plus(int a,int b){
		System.out.println("不带可变参数的方法被调用！");
		return a+b;
	}

	public static void main(String[] args) {
		ArgsDemo3 ad=new ArgsDemo3();
		System.out.println("和为："+ad.plus(1,2));

	}

}
