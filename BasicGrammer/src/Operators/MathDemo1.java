package Operators;

public class MathDemo1 {

	public static void main(String[] args) {
		// x++
		int x=4;
		int y=(x++)+5;
		System.out.println("x="+x+",y="+y);
		//++x的形式
		x=4;
		y=(++x)+5;
		System.out.println("x="+x+",y="+y);
		//x--的形式
		x=4;
		y=(x--)+5;
		System.out.println("x="+x+",y="+y);
		//--x的形式
		x=4;
		y=(--x)+5;
		System.out.println("x="+x+",y="+y);

	}

}
