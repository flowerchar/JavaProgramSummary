package genetic;

public class Book extends Goods {

	@Override
	public void sell() {
		System.out.println("sell books");

	}

	public void say(){
		System.out.println("我还是一本书");
	}
}
