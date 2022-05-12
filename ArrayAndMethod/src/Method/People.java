package Method;

public class People {
    private String name;
    public int age;
    public static String height = "170";

    public void speakWords(){
        System.out.println("I am "+this.name+" and I "+age);
    }

    public People(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("这是一个构造器");
    }

    public static void main(String[] args) {
//        People lwl = new People("lwl",21);
//        People aa =new People("asda",30);
        System.out.println(People.height);
    }
}

