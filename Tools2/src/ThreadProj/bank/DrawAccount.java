package ThreadProj.bank;
//取款
public class DrawAccount implements Runnable{
	Bank bank;
	public DrawAccount(Bank bank){
		this.bank=bank;
	}
	@Override
	public void run() {
		bank.drawAccount();
	}
	
}
