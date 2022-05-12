package lambda.step1;

public class LambdaSample {

    public static void main(String[] args) {
        //1.��׼Lambdaʹ�÷�ʽ
        //Լ������:Lambda���ʽֻ��ʵ������ֻ��һ�����󷽷��Ľӿ�,Java��Ϊ"����ʽ�ӿ�"
        MathOperation addition = (Integer a,Integer b)->{
            System.out.println("�ӷ�����");
            return a+b+0f;
        };
        System.out.println(addition.operate(5,3));
        /*�ȼ۴���
        class Addition implements MathOperation{
            @Override
            public Float operate(Integer a, Integer b) {
                System.out.println("�ӷ�����");
                return a+b+0f;
            }
        }
        Addition addition = new Addition();
        System.out.println(addition.operate(5,3));
        */
        MathOperation a1 = (a, b) -> a+b+0.f;
        //2.Lambda������Բ�������
        MathOperation substraction = (a,b)->{
            return a-b+0f;
        };
        System.out.println(substraction.operate(5,3));

        //3.����ʵ�ִ������ʡ�Դ����ź�return
        MathOperation multiplication = (a,b)->a*b+0f;
        System.out.println(multiplication.operate(5,3));

    }
}
