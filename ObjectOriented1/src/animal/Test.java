package animal;

public class Test {
    static {
        System.out.println(new Test());
    }
    protected static int a = 1;
    public static void main(String[] args) {
        new Test();
    }
}
