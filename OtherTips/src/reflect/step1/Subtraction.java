package reflect.step1;

/**
 * ��������
 */
public class Subtraction implements MathOperation {
    @Override
    public float operate(int a, int b) {
        System.out.println("ִ�м�������");
        return a - b;
    }
}
