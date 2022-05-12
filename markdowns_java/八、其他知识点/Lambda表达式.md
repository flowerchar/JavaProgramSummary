# Lambda表达式

## 1.什么是Lambda表达式

- JDK开始支持Lambda表达式，用来让程序编写更加优雅

- 利用Lambda可以简洁的实现**匿名内部类**与函数声明与调用

- 基于Lambda提供stream流式处理极大简化对集合的操作

- 传统代码

  ```java
  List<String> names = Arrays.asList("peter", "anna", "mike","xenia");
  Collections.sort(names, new Comparator<String>(){
      @Override
      public int compare(String a, String b){
          return b.compareTo(a);
      }
  })
  ```

- 使用Lambda表达式

  ```java
  List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
  Collections.sort(names, (a, b) -> b.compareTo(a))
  ```

## 2.Lambda表达式语法

- （参数列表）-> 实现语句
- 约束条件：Lambda表达式只能实现**有且只有一个抽象方法的接口**，Java称该接口为**函数式接口**
- 简写流程

## 3.函数式编程

- 函数式接口

  - 是有且只有一个抽象方法的接口
  - 例如，java.lang.Runnable
  - JDK8后提供了一系列新的函数式接口，位于Java.util.function

- 函数式编程是基于函数式接口并使用Lambda表达的编程方式

- 函数式编程理念是将代码作为可重用数据代入到程序中运行

- 函数式编程强调**想做什么**，而不是**想怎么做**

- 函数式接口Predicate

  - 用于测试传入的数据是否满足判断要求
  - 需要实现test（）方法进行逻辑判断

- 函数式接口Consumer、

  - 对应有一个输入参数且无输出的功能代码

- 函数式接口Function

  - 对应有一个输入参数且需要返回数据的功能代码

- @FunctionalInterface注解用于对函数式接口的校验

- 函数式编程与面向对象编程比较

  |          | 面向对象编程             | 函数式编程           |
  | -------- | ------------------------ | -------------------- |
  | 设计思路 | 面向对象                 | 面向过程             |
  | 开发侧重 | 侧重过程，重分析，重设计 | 侧重结果，快速实现   |
  | 可读性   | 结构复杂，相对较差       | 更适合人类阅读       |
  | 代码量   | 多                       | 少                   |
  | 并发问题 | 设计不当会出现线程安全   | 不会出现线程安全问题 |
  | 健壮性   | 好                       | 差                   |
  | 使用场景 | 中大型项目，多人协作     | 小型应用，快速实现   |

## 4.Stream流式处理

- Stream流式处理是建立在Lambda基础上的多数据处理技术

- Stream对集合数据处理进行高度抽象，极大简化代码量

- Stream可对集合进行迭代，去重，筛选，排序，聚合一系列处理

- Stream实例

  ```java
  //获取List集合中最大的偶数
  Arrays.asList(1,2,3,4,5,6).stream()
      .filter(x -> x%2==0)
      .sorted((a, b) -> b-a)
      .findFirst();
  ```

- Stream常用方法

  | 接口       | 用途                         |
  | ---------- | ---------------------------- |
  | forEach    | 循环遍历                     |
  | map        | 映射每个元素到对应结果       |
  | filter     | 通过设置的条件过滤出元素     |
  | limit      | 获取指定数量的流             |
  | sorted     | 对流进行排序                 |
  | Collectors | 实现将流转换成集合和聚合元素 |

- Stream流的五种创建方式

  - 基于数组
  - 基于集合
  - generate无限长度流
  - 迭代器创建流
  - 字符序列创建流

- Stream常用方法案例

  - 提取集合中所有偶数并求和
  - 所有名字首字母大写
  - 将所有奇数从小到大排序，且不许出现重复
  - 