package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// ����һ����������
		int[] intArray;
		//����һ���ַ������͵�����
		String strArray[];
		//��������
		intArray=new int[5];
		strArray=new String[10];
		//���������ͬʱ���д���
		float[] floatArray=new float[4];
		//��ʼ������
		char[] ch={'a','b','c','d'};
		System.out.println("ch����ĳ���Ϊ��"+ch.length);
		System.out.println("intArray����ĵ�2��Ԫ��Ϊ��"+intArray[1]);
		System.out.println("strArray����ĵ�5��Ԫ��Ϊ��"+strArray[4]);
		System.out.println("floatArray��������һ��Ԫ��Ϊ��"+floatArray[floatArray.length-1]);
		//ѭ��Ϊ�������鸳ֵ
		for(int i=0;i<5;i++){
			intArray[i]=i+1;
		}
		//ѭ��������������е�Ԫ��
		System.out.println("��������intArray��Ԫ��Ϊ��");
		for(int i=0;i<5;i++){
			System.out.print(intArray[i]+"     ");
		}
	}

}
