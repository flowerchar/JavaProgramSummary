package lambda.step2;

import java.util.function.Consumer;

/**
 * Consumer接口的使用
 */
public class ConsumerSample {
    public static void main(String[] args) {
        output(s-> System.out.println("向控制台打印:" + s));
        output(s->{
            System.out.println("向XXX网站发送数据包:" + s);
        });
    }
    public static void output(Consumer<String> consumer){
        String text = "天将降大任于是人也，必先苦其心志，劳其筋骨，饿其体肤，空乏其身，行拂乱其所为。";
        consumer.accept(text);
    }
}
