package AnimalProj.animal;

public class Dog extends Animal {
	private String sex;//�Ա�
	
	public Dog(){
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	//˯���ķ���
	 public void sleep(){
		 super.eat();//���õ��ĸ�eat();
		 this.species="Ȯ��";
		 System.out.println("����������" + getSpecies());
		 System.out.println(this.getName()+"����"+this.getMonth()+"���´�����˯��~~");
	 }
	 
	 /*
	  * �������أ�
	  * 1��ͬһ������
	  * 2����������ͬ�������б�ͬ������˳�򡢸��������ͣ�
	  * 3����������ֵ���������η�����
	  * 4���뷽���Ĳ������޹�
	  * 
	  * ������д
	  * 1���м̳й�ϵ��������
	  * 2����������ͬ�������б���ͬ������˳�򡢸��������ͣ�����������ֵ��ͬ
	  * 3���������η������ʷ�Χ��Ҫ���ڵ��ڸ���ķ��ʷ�Χ
	  * 4���뷽���Ĳ������޹�
      * 5������������ֵ��void�������������ʱ��������ͬ��������ֵ����������ʱ�������Ǹ����������
	  * */
	 
//	 private String sleep(String name){
//		 return "";
//	 }
//	 public void sleep(String name,int month){
//		 
//	 }
//	 public void sleep(int month,String name){
//		 
//	 }
//	 public void sleep(int name,String month){
//		 
//	 }
	 
	 //������д����Զ�������
//	 public void eat(){
//		 System.out.println(this.getName()+"���û��ʳ��~~");
//	 }
	 
	 public void eat(String month){
		 System.out.println(month+"���û��ʳ��~~");
	 }


     public Cat jump() {
        System.out.println("����������ʽ��Ծ~");
        return new Cat();
     }

	 @Override
	 public void eat() {
		 System.out.println("�����ҹ�����еĳԶ�������");
	 }
}
