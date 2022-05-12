package AnimalProj.test;

public class TestFour {
    public void test1(AAA aaa){
        System.out.println("132");
    }
    public void test1(BBB bbb){
        System.out.println("321");
    }
    public static void main(String[] args) {
        TestFour testFour = new TestFour();
        testFour.test1(new AAA());
    }
}
class AAA {}
class BBB extends AAA{}
