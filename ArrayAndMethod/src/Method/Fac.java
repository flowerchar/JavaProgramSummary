package Method;

public class Fac {
	public int n;
	public Fac(int n){
		this.n=n;
	}
    //求阶乘的方法
	public int fac(){
		int s=1;
		for(int i=1;i<=n;i++){
			s*=i;//s=s*i;
		}
		return s;
	}

	public static void main(String[] args) {
		Fac method=new Fac(3);
		int s=method.fac();

		Fac fac=new Fac(4);
		int s1=method.fac();
		System.out.println("3!="+s);

	}

}
