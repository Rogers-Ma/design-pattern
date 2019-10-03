package com.mzw.builder.improve;

public class Client {
	public static void main(String[] args) {
		//普通房子
		CommonHouse commonHouse = new CommonHouse();
		//准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//完成盖房子，返回产品（房子）
		House house = houseDirector.constructHouse();	
	}
}
