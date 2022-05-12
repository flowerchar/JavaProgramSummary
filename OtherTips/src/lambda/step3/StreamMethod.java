package lambda.step3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
    //��ȡ����������ż�������
    public void case1(){
        List<String> list = Arrays.asList("1", "2", "3", "4", "5" , "6");
        int sum = list.stream() //��ȡstream����
            .mapToInt(s->Integer.parseInt(s)) //mapToInt������ÿһ������תΪ����
            .filter(n->n%2==0) //filter�������ݽ��й���
            .sum();//���
        System.out.println(sum);
    }

    //������������ĸ��д

    public void case2(){
        List<String> list = Arrays.asList("lily","smith","jackson");
        List newList = list.stream()
                //�������ÿһ�������ݽ���ת��
                .map(s->s.substring(0,1).toUpperCase() + s.substring(1))
                //.forEach(s-> System.out.println(s));
                //collect�������ݽ����ռ�,�����µ�List/Set
                .collect(Collectors.toList());
        System.out.println(newList);
    }

    //�����������Ӵ�С��������,�Ҳ�������ظ�

    public void case3(){
        List<Integer> list = Arrays.asList(1,60,38,21,51,60,51,73);
        List newList = list.stream().distinct()//ȥ���ظ���������
            .filter(n->n%2==1)
            .sorted((a,b)->b-a) //����������
            .collect(Collectors.toList());
        System.out.println(newList);

    }
    public static void main(String[] args) {
        StreamMethod streamMethod = new StreamMethod();
        streamMethod.case3();
    }

}
