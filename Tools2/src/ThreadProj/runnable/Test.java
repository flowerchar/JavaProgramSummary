package ThreadProj.runnable;

class PrintRunnable implements Runnable {
	int i = 1;//����ɆT׃��������ֻ��ʮ��
	@Override
	public void run() {
		//�ŵ�����������ֲ�׃��
		//int i = 1;
		while (i <= 10)
			System.out.println(Thread.currentThread().getName() + "��������" + (i++));
	}

}

public class Test {

	public static void main(String[] args) {
		PrintRunnable pr = new PrintRunnable();
		Thread t1 = new Thread(pr);
		t1.start();
		PrintRunnable pr1 = new PrintRunnable();
		Thread t2 = new Thread(pr1);
//		�ژ���������벻ͬ��Runnable����Ϳ��Ծ��a�����YԴ
		//Thread t2 = new Thread(pr);
		t2.start();

	}

}
