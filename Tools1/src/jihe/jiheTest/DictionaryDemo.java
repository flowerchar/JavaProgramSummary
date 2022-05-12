package jihe.jiheTest;

import java.util.*;
import java.util.Map.Entry;

public class DictionaryDemo {

	public static void main(String[] args) {
		Map<String,String> animal=new HashMap<String,String>();
		System.out.println("���������鵥�ʶ�Ӧ��ע�ͣ�����ŵ�HashMap��");
		Scanner console=new Scanner(System.in);
		//�������
		int i=0;
		while(i<3){
			System.out.println("������keyֵ�����ʣ���");
			String key=console.next();
			System.out.println("������valueֵ��ע�ͣ���");
			String value=console.next();
			animal.put(key, value);
			i++;
		}
		//��ӡ���value��ֵ��ֱ��ʹ�õ�������
		System.out.println("*****************************************");
		System.out.println("ʹ�õ�����������е�value��");
		Iterator<String> it=animal.values().iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"    ");
		}
		System.out.println();
		System.out.println("*****************************************");
		//��ӡ���key��value��ֵ
		//ͨ��entrySet����
		System.out.println("ͨ��entrySet�����õ�key��value��");
		Set<Entry<String, String>> entrySet=animal.entrySet();
		for(Entry<String, String> entry:entrySet){
			System.out.print(entry.getKey()+"-");;
			System.out.println(entry.getValue());
		}
		System.out.println();
		System.out.println("*****************************************");
		
		//ͨ�������ҵ�ע�Ͳ����
		//ʹ��keySet����
		System.out.println("������Ҫ���ҵĵ��ʣ�");
		String strSearch=console.next();
		//1.ȡ��keySet
		Set<String> keySet=animal.keySet();
		//2.����keySet
		for(String key:keySet){
			if(strSearch.equals(key)){
				System.out.println("�ҵ��ˣ�"+"��ֵ��Ϊ��"+key+"-"+animal.get(key));
				break;
			}
		}
	}

}
