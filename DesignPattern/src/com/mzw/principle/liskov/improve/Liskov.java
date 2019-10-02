package com.mzw.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11+3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        System.out.println("====================");
        B b = new B();
        System.out.println("11-3="+b.func3(11,3));
        System.out.println("1-8="+b.func3(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

//创建一个创建一个更基础的基类
class Base{
    ///把更基础的方法和成员写到Base类

}


//A
class A extends Base{
    //返回两个数的差
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B extends Base{
    private A a = new A();
    public int func1(int num1, int num2) {
        return num1+num2;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
