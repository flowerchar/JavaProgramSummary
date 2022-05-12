package ThreadProj.runnable;

class PrintRunnable implements Runnable {
	int i = 1;//作為成員變量被共享，只有十次
	@Override
	public void run() {
		//放到方法里作為局部變量
		//int i = 1;
		while (i <= 10)
			System.out.println(Thread.currentThread().getName() + "正在运行" + (i++));
	}

}

public class Test {

	public static void main(String[] args) {
		PrintRunnable pr = new PrintRunnable();
		Thread t1 = new Thread(pr);
		t1.start();
		PrintRunnable pr1 = new PrintRunnable();
		Thread t2 = new Thread(pr1);
//		在構造器里傳入不同的Runnable對象就可以編碼共享資源
		//Thread t2 = new Thread(pr);
		t2.start();

	}

}
