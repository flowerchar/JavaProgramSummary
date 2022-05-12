package Method;

public class Rectangle {

	//求长方形面积的方法
	public int area(){
		int length=10;
		int width=5;
		int getArea=length*width;
		return getArea;//返回语句
	}
	public static void main(String[] args) {
		Rectangle rc=new Rectangle();
		int area=rc.area();
		System.out.println("长方形的面积为："+area);
	}
}
