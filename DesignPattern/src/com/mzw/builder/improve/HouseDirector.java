package com.mzw.builder.improve;

//指定制作流程，返回产品
public class HouseDirector {

	HouseBuilder houseBuilder = null;

	// 构造器传入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	// setter方法传入
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	// 如何处理建造房子的流程
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}
