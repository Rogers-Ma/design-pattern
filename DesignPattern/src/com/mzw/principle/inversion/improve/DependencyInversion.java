package com.mzw.principle.inversion.improve;

public class DependencyInversion {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		person.receive(new Wechat());
	}
}

//接口
interface IReceiver {
	String getInfo();
}

class Email implements IReceiver {
	public String getInfo() {
		return "电子邮件：Hello World";
	}
}

class Wechat implements IReceiver {

	@Override
	public String getInfo() {
		return "微信消息：你好，世界";
	}
}

//完成person接收消息的功能
//方式2
class Person {
	// 对接口的依赖
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}

}
