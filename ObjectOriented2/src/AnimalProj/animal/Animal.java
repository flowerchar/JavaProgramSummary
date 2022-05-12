package AnimalProj.animal;

/* final class:����û������  public final class \ final public class
 * final �������÷���������������д,���ǿ�������������̳�ʹ��
 * final �����ھֲ�������ֻҪ�ھ��屻ʹ��֮ǰ���и�ֵ���ɣ�һ����ֵ�������޸�
 *       ���г�Ա���ԣ���ֵ���̣�1������ֱ�ӳ�ʼ��  2�����췽��  3����������
 */
public class Animal {
	/*
	 * private:ֻ�����ڱ����н��з��� public:����������λ�÷���
	 * protected:�����ڵ�ǰ�ࡢͬ������/�����ࡢ���������ã���������಻����
	 * Ĭ�ϣ������ڵ�ǰ�ࡢͬ������/��������ã��������/�����಻�������
	 */
	private String name = "����";// �ǳ�
	protected int month;// �·�
	String species = "����";// Ʒ��
	public  final static int temp=12;
	public static final int aa = 1;
	public int a = 1;

	public static int sts = 1;
	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}

	public static int st2 = 23;
	private static int st1 = 22;

	{
		a=2;
		System.out.println("���Ǹ���Ĺ�������");
	}

	// ����Ĺ��첻�����̳С���������д�����ǻ�Ӱ����������ʵ����
	 public Animal() {
		month = 2;
//		temp=20;
		System.out.println("���Ǹ�����޲ι��췽��");
	}

	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
		System.out.println("���Ǹ���Ĵ��ι��췽��");
	}

	public String getName() {
//		this.temp=22;
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	// �Զ���
	public void eat() {
		System.out.println(this.getName() + "�ڳԶ���");
	}

	public void eat(String name) {
		System.out.println(name + "�ڳԶ���");
	}
	
    public Animal jump() {
        System.out.println("������Ծ��һ�ֱ���");
        return new Animal();
    }
    
	public boolean equals(Object obj){
//		if(obj==null)
//			return false;
		Animal temp=(Animal)obj;
		if(this.getName().equals(temp.getName()) && (this.getMonth()==temp.getMonth()))
				return true;
		else
			return false;
	}

	public boolean equals(Animal obj){
		if(obj==null)
			return false;
		if(this.getName().equals(obj.getName()) && (this.getMonth()==obj.getMonth()))
				return true;
		else
			return false;
	}

	public static void AA(){
		System.out.println("AA");
	}
}