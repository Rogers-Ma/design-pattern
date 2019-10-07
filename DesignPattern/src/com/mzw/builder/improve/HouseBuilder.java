package com.mzw.builder.improve;

// 抽象的建造者
public abstract class HouseBuilder {

	protected House house = new House();

	// 将建造者的流程写好
	public abstract void buildBasic();

	public abstract void buildWalls();

	public abstract void roofed();

	// 建造房子
	public House buildHouse() {
		return house;
	}

}
