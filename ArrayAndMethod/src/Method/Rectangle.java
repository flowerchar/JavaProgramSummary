package Method;

public class Rectangle {

	//�󳤷�������ķ���
	public int area(){
		int length=10;
		int width=5;
		int getArea=length*width;
		return getArea;//�������
	}
	public static void main(String[] args) {
		Rectangle rc=new Rectangle();
		int area=rc.area();
		System.out.println("�����ε����Ϊ��"+area);
	}
}
