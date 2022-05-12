package lambda.step2;

/**
 * 四则运算接口
 */
@FunctionalInterface//通知编译器这是函数式接口,进行抽象方法检查
public interface MathOperation {
    public Float operate(Integer a ,Integer b);
}
