package PackageClass.wrap;

public class WrapTestOne {

	public static void main(String[] args) {

		//װ�䣺�ѻ�����������ת���ɰ�װ��
		//1���Զ�װ��
		int t1=2;
		Integer t2=t1;
		//2���ֶ�װ��
		Integer t3=new Integer(t1);
		
		//����
		System.out.println("int���ͱ���t1="+t1);
		System.out.println("Integer���Ͷ���t2="+t2);
		System.out.println("Integer���Ͷ���t3="+t3);
		System.out.println("*************************");
		//���䣺�Ѱ�װ��ת���ɻ�����������
		//1���Զ�����
		int t4=t2;
		//2���ֶ�����
		int t5=t2.intValue();
		//����
		System.out.println("Integer���Ͷ���t2="+t2);
		System.out.println("�Զ������int���ͱ���t4="+t4);
		System.out.println("�ֶ������int���ͱ���t5="+t5);
		double t6=t2.doubleValue();
		System.out.println("�ֶ������double���ͱ���t6="+t6);
		
	}

}
