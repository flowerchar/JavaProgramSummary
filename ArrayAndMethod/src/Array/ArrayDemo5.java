package Array;

public class ArrayDemo5 {
	public static void main(String[] args){
		//��ά���������
		//������ʽ
		//����int���͵Ķ�ά����
		int[][] intArray;
		//����float���͵Ķ�ά����
		float floatArray[][];
		//����double���͵Ķ�ά����
		double[] doubleArray[];
		//����һ���������е�int���͵�����
		intArray=new int[3][3];
		System.out.println("intArray����ĵ�3�е�2�е�Ԫ��Ϊ��"+intArray[2][1]);
		//Ϊ��2�е�3��Ԫ�ظ�ֵΪ9
		intArray[1][2]=9;
		System.out.println("intArray�����2�е�3�е�Ԫ��Ϊ:"+intArray[1][2]);
		//���������ͬʱ���д���
		char[][] ch=new char[3][5];
		//����float���͵�����ʱ��ָֻ������
		floatArray=new float[3][];
//		System.out.println(floatArray[0][0]);
		//ÿ���൱��һ��һά���飬��Ҫ����
		floatArray[0]=new float[3];//��һ��������
		floatArray[1]=new float[4];//�ڶ���������
		floatArray[2]=new float[5];//��������5��
		System.out.println(floatArray[0][0]);
//		System.out.println(floatArray[0][3]);//�����±�Խ��
		//��ά����ĳ�ʼ��
		int[][] num={{1,2,3},{4,5,6,10},{7,8,9}};
		System.out.println("num�����1�е�2�е�Ԫ��Ϊ��"+num[0][1]);
		System.out.println("num���������Ϊ��"+num.length);
		System.out.println("num���������Ϊ:"+num[0].length);
		int[][] num1={{78,98},{65,75,63},{98}};
		System.out.println("num1����ĵ�1�е�����Ϊ:"+num1[0].length);
		//ѭ�������ά���������
		for(int i=0;i<num1.length;i++){
			for(int j=0;j<num1[i].length;j++){
				System.out.print(num1[i][j]+"     ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for (int[] i:num1) {
			for (int j:i) {
				System.out.print(j+"     ");
			}
			System.out.println();
		}
	}
}
