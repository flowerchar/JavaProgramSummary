package ThreadProj.bank;

public class Bank {
	private String account;// �˺�
	private int balance;// �˻����

	public Bank(String account, int balance) {
		this.account = account;
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [�˺ţ�" + account + ", ��" + balance + "]";
	}
	//
	// ���
	public synchronized void saveAccount() {

		// ��ȡ��ǰ���˺����
		int balance = getBalance();
		//ģ����Ϸ���
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// �޸�����100Ԫ
		balance += 100;
		// �޸��˻����
		setBalance(balance);
		// ���������˻����
		System.out.println("������˻����Ϊ��" + balance);
	}

	public synchronized void drawAccount() {
//		synchronized (this) {
			// �ڲ�ͬ��λ�ô����sleep����

			// ��õ�ǰ���ʻ����
			int balance = getBalance();
			// �޸���ȡ200
			balance = balance - 200;
			//ģ����Ϸ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// �޸��ʻ����
			setBalance(balance);
			System.out.println("ȡ�����ʻ���" + balance);
//		}

	}
}
