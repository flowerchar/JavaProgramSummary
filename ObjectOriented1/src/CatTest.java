//��һְ��ԭ��
public class CatTest {
	public static void main(String[] args) {
		// ����ʵ����

//		Cat one = new Cat("����",2,1000,"Ӣ����ëè");
		Cat one=new Cat();
	    // ����
		one.name = "����";
		one.month = 2;
		one.weight = 1000;
		one.species = "Ӣ����ëè";
		
		System.out.println("�ǳƣ�" + one.name);
		System.out.println("���䣺" + one.month);
		System.out.println("���أ�" + one.weight);
		System.out.println("Ʒ�֣�" + one.species);
		one.run();
		one.Cat();

		Cat two = new Cat();
		Cat three = two;
		System.out.println(two.name);
	}
}
