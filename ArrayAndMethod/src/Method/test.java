package Method;

public class test {
    public static void main(String[] args) {
        int a = 1;
        test.exchange(a);
        System.out.println(a);
        Person person = new Person();
        exchangePerson(person);
        System.out.println(person.name);
        int[] arr = {1,2};
        test.exchangeArr(arr);
        for (int i:
             arr) {
            System.out.println(i);
        }

    }
    public static void exchange(int a){
        a = 5;
    }
    public static void exchangePerson(Person person){
        person.name = "lwl";
    }
    public static void exchangeArr(int[] a){
        a[0]=999;
    }
}
