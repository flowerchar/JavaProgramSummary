package SelectStructure;

public class IntCompare {

	public static void main(String[] args) {
		// �����������ͱ�������ʼ��
		int x=5,y=15;
		//�ж�x��y�Ƿ����
		if(x!=y){
			if(x>y){
				System.out.println(x+"����"+y);
			}else{
				System.out.println(x+"С��"+y);
			}
		}else{
			System.out.println(x+"��"+y+"���");
		}
		
		if(x!=y)
			if(x>y)
				System.out.println(x+"����"+y);
		else
			System.out.println(x+"��"+y+"���");
		

	}

}
