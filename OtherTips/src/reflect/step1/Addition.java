package reflect.step1;

/**
 * �ӷ�
 */
public class Addition implements MathOperation {
    @Override
    public float operate(int a , int b) {
        System.out.println("ִ�мӷ�����");
        return a + b;
    }
}
