package ThreadProj.thread;
class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println(getName()+"���߳�����ִ�У�");
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("���߳�1");
		MyThread mt=new MyThread();
		mt.start();//�����߳�
//		mt.start();
		System.out.println("���߳�2");

	}

}
