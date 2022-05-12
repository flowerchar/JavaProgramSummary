package genetic;

public class NumGeneric<T> {
	private T num;
	public T getNum(){
		return num;
	}
	public void setNum(T num){
		this.num=num;
	}
	//测试
	public static void main(String[] args){
		NumGeneric<Integer> intNum=new NumGeneric<>();
		intNum.setNum(10);
		System.out.println("Integer:"+intNum.getNum());
		
		NumGeneric<Float> floatNum=new NumGeneric<>();
		floatNum.setNum(5.0f);
		System.out.println("Float:"+floatNum.getNum());

		NumGeneric<String> StrNum=new NumGeneric<>();
		System.out.println(StrNum.getNum());
//		StrNum.setNum(100);
	}

}
