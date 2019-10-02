package com.mzw.principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


class Email{
    public String getInfo(){
        return "电子邮件：Hello World";
    }
}

//完成person接收消息的功能
//方式1
//1. 简单，容易想到
//2. 如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接受方法
//3. 引入一个抽象的接口，IReceiver，表示接收者，这样Person与这个接口发生依赖
//   因为Email，微信，都属于接收者的范畴，他们各自实现Ireceiver这个接口，这样就符合了依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }

}
