package PackageClass.wrap;

public class WrapperTest {

	public static void main(String[] args) {

		Integer one=new Integer(100);
		Integer two=new Integer(100);
		System.out.println("one==two�Ľ����"+(one==two));//1
		
		Integer three=100;//�Զ�װ��
		//Integer three=Integer.valueOf(100);
		System.out.println("three==100�Ľ����"+(three==100));//2 �Զ�����
		
		Integer four=100; //��û��ֱ�Ӵ���һ��Integer���󣬶��ǵ���������ķ���
//		Integer four=Integer.valueOf(100);    ��ѯ�����
		System.out.println("three==four�Ľ����"+(three==four));//3
		
		Integer five=200;
		System.out.println("five==200�Ľ����"+(five==200));//4
		
		Integer six=200;
		System.out.println("five==six�Ľ����"+(five==six));//5
		
		Double d1=Double.valueOf(100);
		System.out.println("d1==100�Ľ����"+(d1==100));
		
		Double d2=Double.valueOf(100);
		System.out.println("d1==d2�Ľ����"+(d1==d2));
	}

}
