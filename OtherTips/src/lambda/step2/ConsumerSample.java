package lambda.step2;

import java.util.function.Consumer;

/**
 * Consumer�ӿڵ�ʹ��
 */
public class ConsumerSample {
    public static void main(String[] args) {
        output(s-> System.out.println("�����̨��ӡ:" + s));
        output(s->{
            System.out.println("��XXX��վ�������ݰ�:" + s);
        });
    }
    public static void output(Consumer<String> consumer){
        String text = "�콫������������Ҳ�����ȿ�����־�������ǣ�����������շ������з�������Ϊ��";
        consumer.accept(text);
    }
}
