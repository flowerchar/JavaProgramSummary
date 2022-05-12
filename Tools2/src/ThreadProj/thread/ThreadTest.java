package ThreadProj.thread;
class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println(getName()+"该线程正在执行！");
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("主线程1");
		MyThread mt=new MyThread();
		mt.start();//启动线程
//		mt.start();
		System.out.println("主线程2");

	}

}
