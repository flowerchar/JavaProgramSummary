package Method;

/**
 * �ɱ������������Ȩ������
 * @author lwl
 * @version 1.0
 */
public class ArgsDemo3 {
	//�ɱ�����б����ڵķ�������󱻷��ʵġ�
	public int plus(int... a){
		int sum=0;
		for(int n:a){
			sum=sum+n;
		}
		System.out.println("���ɱ�����ķ��������ã�");
		return sum;
	}
	public int plus(int a,int b){
		System.out.println("�����ɱ�����ķ��������ã�");
		return a+b;
	}

	public static void main(String[] args) {
		ArgsDemo3 ad=new ArgsDemo3();
		System.out.println("��Ϊ��"+ad.plus(1,2));

	}

}
