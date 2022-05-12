- 面向对象

  - 三大好处

    - 稳定性
    - 可扩展性
    - 可重用性

  - 三大特征

    - 封装
    - 多态
    - 继承

  - 类与对象

    - 类是一个模板，是一个蓝图，不具有各种属性和能力
    - 对象是类的具体化表现，是一个实例化的
    - 对象是特定类型的数据
    - 属性：对象的静态特征  “有什么”
    - 方法：对象的动态行为  “能做什么”

  - 定义类

    - Cat

    - this代表自身的引用

    - 构造器：名字与类同名，并且没有返回值。构造器是一个用于外界向类注入属性的方法，不能被对象调用

      1. 没有指定构造方法时，系统会自动添加无参构造方法
      2. 但凡指明了有构造方法（无论有参无参），都**不会再自动添加**无参构造方法
      3. 一个类可以有多个构造方法
      4. 如果想在一个构造器里面执行另一个构造器，需要放在第一行

    - 为什么不把主方法定义在Cat中？因为Java里的最小执行单位是类，每一个类应该履行**单一职责原则**，Cat类负责创建猫，CatTest类用于测试猫类，每个类承担责任不同，进而可以更好地实现解耦合，避免因为一个类的错误影响全局

    - new：类似于malloc，用于在堆里申请一片空间（基本数据类型的变量放在栈里，引用类型的变量也在栈里，但是可以根据这个变量存放的地址找到放在堆里的对象）

    - 实例化对象分为两部分：声明（Cat one）+实例化（new cat() ）

    - 成员属性初始值

      | 基本类型 | 默认值   |
      | -------- | -------- |
      | byte     | 0        |
      | short    | 0        |
      | int      | 0        |
      | long     | 0L       |
      | float    | 0.0f     |
      | double   | 0.0d     |
      | char     | '\u0000' |
      | boolean  | false    |

      





- 封装：隐藏对象的信息（不允许外部程序直接访问），留出访问的接口（该类提供的接口实现对隐藏信息的操作和访问），例如ATM

- 实现步骤：

  1. 修改属性可见性：设为private
  2. 创建gettter和setter：设为public
  3. 在方法中加入控制语句：对属性合法值进行判断

  ```java
  
  //static+类--》不存在
  public class Cat {
  	// 成员属性：昵称、年龄、体重、品种
  	// 修改属性的可见性---private 限定只能在当前类内访问
  	private String name;// 昵称 String类型默认值null
  	private int month;// 年龄 int类型默认值0
  	private double weight;// 体重 double类型默认值0.0
  	private String species;// 品种
  
  	//static: 静态 静态成员、类成员
  	//static+属性--》静态属性、类属性
  	public static int price;//售价
  	
  	
  	static{
  		System.out.println("我是静态代码块1");
  	}//静态代码块
  	
  	//构造方法
  	public Cat() {
  		//static+方法内的局部变量--》不存在
  //		static int temp=14;
  		System.out.println("我是宠物猫~~");
  	}
  
  	public Cat(int month) {
  		// this.month=month;
  		this.setMonth(month);
  	}
  
  //	{
  //		name="妞妞";
  //		price=130;
  //		System.out.println("我是构造代码块1");
  //	}//构造代码块
  //	
  	
  	static{
  		price=290;
  		Cat temp=new Cat();
  		temp.name="小胖";
  		System.out.println("我是静态代码块2");
  	}//静态代码块
  	
  	// 创建get/set方法
  	// 在get/set方法中添加对属性的限定
  	public void setName(String name) {
  		this.name = name;
  	}
  
  	public String getName() {
  		return "我是一只名叫：" + this.name + "的宠物猫";
  	}
  
  	public int getMonth() {
  		return month;
  	}
  
  	public void setMonth(int month) {
  		if (month <= 0)
  			System.out.println("输入信息错误，宠物猫的年龄必须大于0");
  		else
  			this.month = month;
  	}
  
  	public double getWeight() {
  		return weight;
  	}
  
  	public void setWeight(double weight) {
  		this.weight = weight;
  	}
  
  	public String getSpecies() {
  		return species;
  	}
  
  	public void setSpecies(String species) {
  		this.species = species;
  	}
  
  	// 成员方法：跑动、吃东西
  	// 跑动的方法
  	//在成员方法中，可以直接访问类中静态成员
  	public void run() {
  		eat();
  		this.name="妞妞";
  		this.price=20;
  		System.out.println("售价是"+Cat.price+"的"+this.name+"快跑");
  	}
  
  	public void run(String name) {
  		
  		int temp=14;
  		{
  //			int temp=12;
  			System.out.println("我是普通代码块1，temp="+temp);
  		}//普通代码块
  		
  
  		System.out.println(name + "快跑,temp="+temp);
  		
  		{
  //			int temp=13;
  			System.out.println("我是普通代码块2，temp="+temp);
  		}//普通代码块
  	}
  
  	// 吃东西的方法
  	//static+方法--》类方法、静态方法
  	public static void eat() {
  		//静态方法中不能直接访问同一个类中的非静态成员，只能直接调用同一个类中的静态成员
  		//只能通过对象实例化后，对象.成员方法的方式访问非静态成员
  		Cat temp=new Cat();
  		temp.run();
  		temp.name="小胖";//静态方法中不能使用this
  //		temp.name="小胖";
  		price=1500;
  		System.out.println("小猫吃鱼");
  	}
  }
  
  ```

  ```java
  
  //单一职责原则
  public class CatTest {
  	public static void main(String[] args) {
  		// 对象实例化
  		Cat one = new Cat(3);
  		// 测试
  		// one.setName("凡凡");
  		// one.setMonth(0); //=-3;
  		// one.weight = 1200;
  		// one.species = "中华田园猫";
  
  		// System.out.println("昵称：" + one.getName());
  		if (one.getMonth() == 0)
  			return;
  		System.out.println("年龄：" + one.getMonth());
  		// System.out.println("体重：" + one.weight);
  		// System.out.println("品种：" + one.species);
  
  	}
  }
  
  ```

- package: 命名空间，用于区别不同文件

  - 必须放在源文件第一行
  - 包名为公司域名逆序且小写

- import：导入某种指定的命名空间

- static：类创建便产生，销毁即结束

  - 修饰属性：类属性，对象之间共享
  - 修饰方法：类方法
  - 修饰代码块：
    1. 静态代码块：类加载调用，优先级最高，只执行一次
    2. 构造代码块：创建对象调用，创建多少次执行多少次，优先于构造器
    3. 普通代码块：顺序执行（块级作用域）

- 需求：

  - 有个专业叫做计算机科学与应用

    - 专业编号：J0001
    - 学制年限：4年

  - 学生信息

    | 姓名 | 学号 | 性别 | 年龄 |
    | ---- | ---- | ---- | ---- |
    | 张三 | S01  | 男   | 18   |
    | 李四 | S02  | 女   | 17   |
    | 王五 | S03  | 男   | 18   |

  - 三种方案：

    - 直接传入字符串（硬编码）
    - 将对象作为参数传入方法（方法独享）
    - 将对象作为成员属性传入类（类共享）