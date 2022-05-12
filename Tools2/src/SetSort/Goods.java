package SetSort;

public class Goods implements Comparable<Goods> {
	private String id;//��Ʒ���
	private String name;//��Ʒ����
	private double price;//��Ʒ�۸�
	//���췽��
	public Goods(String id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}


	//getter��setter����
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString(){
		return "��Ʒ��ţ�"+id+",��Ʒ���ƣ�"+name+"����Ʒ�۸�"+price;
	}
	@Override
	public int compareTo(Goods o) {
		// ȡ����Ʒ�۸�
		double price1=this.getPrice();
		double price2=o.getPrice();
		int n=new Double(price2-price1).intValue();
		return -n;
	}

}
