/**
 * ����è��
 *
 */
public class Cat {
    //��Ա���ԣ��ǳơ����䡢���ء�Ʒ��
	String name;//�ǳ� String����Ĭ��ֵnull
	int month;//���� int����Ĭ��ֵ0
	double weight;//���� double����Ĭ��ֵ0.0
	String species;//Ʒ��

	public Cat(){
		System.out.println("�����޲ι��췽��");
	}
	public Cat(String name){
		System.out.println("���Ǵ��ι��췽��");
		this.name=name;
	}
	public Cat(String name,int month,double weight,String species){
		this("lwl");
		this.name=name;
		this.month=month;
		this.weight=weight;
		this.species=species;
	}

	public void Cat(){
		System.out.println("��ֻ��һ����ͨ�ķ�����ǡ�÷�������Cat");
	}

	//��Ա�������ܶ����Զ���
	//�ܶ��ķ���
	public void run(){
		Cat();
		this.Cat();
		eat();
		System.out.println("Сè����");
	}
	public void run(String name){
		System.out.println(name+"����");
	}
	//�Զ����ķ���
	public void eat(){
		System.out.println("Сè����");
	}

}
