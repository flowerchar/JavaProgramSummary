package AnimalProj.animal;



public class Cat extends Animal {
	private double weight;//����
	//public int temp=300;
	public static int st3=44;
	
	static{
		System.out.println("��������ľ�̬�����");
	}
	
	{
		System.out.println("��������Ĺ�������");
	}
	
	public Cat(){
//		Animal temp=new Animal();
//		temp.name;
//		this.temp=12;
//		this.month=23;
//		this.species="";
		System.out.println("����������޲ι��췽��");
	}
	
	public Cat(String name,int month){
		/* ���๹��Ĭ�ϵ��ø����޲ι��췽��
		 * ����ͨ��super()���ø����������ʵ��������췽��
		 * super()����������๹�췽����Ч�����һ��
		 */
		super(name,month); //this
		System.out.println("��������Ĵ��ι��췽��");
	}
	
	public static void say(){
//		this.weight=20;
//		super.name="aa";
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//�ܶ��ķ���
	public void run(){
//		super();
//		eat();
//		Animal();
		System.out.println(this.getName()+"��һֻ"+this.getSpecies()+",���ڿ��ֵı���");
	}
}
