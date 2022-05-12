package ThreadProj.priority;

class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=2;i++){
			System.out.println("�߳�"+name+"��������"+i);
		}
	}
}
public class PriorityDemo {

	public static void main(String[] args) {
		//��ȡ���̵߳����ȼ�
		int mainPriority=Thread.currentThread().getPriority();
		System.out.println("���̵߳����ȼ�Ϊ��"+mainPriority);
		MyThread mt1=new MyThread("�߳�1");
		MyThread mt2=new MyThread("�߳�2");
		//mt1.setPriority(10);
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.MIN_PRIORITY);
		mt1.start();
		mt2.start();
		System.out.println("�߳�1�����ȼ�Ϊ��"+mt1.getPriority());
	}

}