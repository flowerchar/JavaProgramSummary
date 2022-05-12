# 1.知识脉络
## 1.1基础语法

  - 变量
  - 运算符
  - 流程控制
  - 数组
  - 方法

## 1.2面向对象

  - 继承
  - 封装
  - 多态
  - 类与对象
  - 单例模式

## 1.3常用工具类

- 异常
- 包装字符串
- 集合与泛型
- I/O流
- 多线程

-----



# 2.Java简介

## 2.1基本概念

- Java是一门面向对象语言
- 1995年由sun公司开发（程序员喝咖啡）
- 2010年被sun公司被Oracle公司收购

## 2.2JVM

- JVM（Java Virtual Machine），Java虚拟机

- JVM是Java平台无关性实现的关键

### 2.2.1Java程序执行过程

1. 源文件.java被compiler编译为源文件.class
2. 源文件.class被interpreter解释为程序

- 一次编译，到处运行

## 2.3JDK

- JDK（Java Development Kit） ，Java语言的软件开发工具包

### 2.3.1两个主要组件：

- javac：编译器，将源程序转成字节码
- java：运行编译后的java程序（.class后缀）
## 2.4JRE

- JRE（Java Runtime Environment）
- 包括Java虚拟机（JVM），Java核心类库和支持文件
- 需要运行java程序，下载安装JRE
- 需要开发java程序，下载安装JDK
- JDK中附带有JRE，JRE包含JVM

## 2.5三者关系

- JRE=JVM+JavaSE标准类库
- JDK=JRE+开发工具集

## 2.6Java平台

- JavaSE 桌面程序
- JavaEE Web程序
- JavaME 移动设备

----



# 3.JDK下载

- 地址：https://www.oracle.com/java/technologies/downloads/#java8

- JDK8: https://www.oracle.com/java/technologies/downloads/#license-lightbox

## 3.1第一行java代码

- ```java
  public class HelloWorld{
  	public static void main(String[] args){
  		System.out.println("Hello, World!");
  	}
  }
  ```

## 3.2环境变量

- 此电脑-》属性-》高级环境设置
- 用户变量-》Path-》新建-》把JDK的安装环境（bin目录写下来）
- JAVA_HOME：JDK安装路径
- Path: %JAVA_HOME%\bin

## 3.3执行过程

- javac firstJavaProgram.java 编译
- java firstJavaProgram 解释

---

# 4.IDE选择

- IDEA ：[下载链接](https://www.jetbrains.com/idea/download/#section=windows)

