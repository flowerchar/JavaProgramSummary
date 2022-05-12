package Method;

public class ExchangeDemo1 {
	public void add(int n){
		n++;
		System.out.println("方法中n="+n);
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println("方法调用前n的值："+n);
		ExchangeDemo1 ed1=new ExchangeDemo1();
		ed1.add(n);
		System.out.println("方法调用后n的值："+n);
	}

}
