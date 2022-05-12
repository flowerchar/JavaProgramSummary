package ThreadProj.bank;
//存款
public class SaveAccount implements Runnable{
	Bank bank;
	public SaveAccount(Bank bank){
		this.bank=bank;
	}
	public void run(){
		bank.saveAccount();
	}
}
