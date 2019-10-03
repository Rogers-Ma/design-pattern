package com.mzw.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("普通房子地基3m");
	}

	@Override
	public void buildWalls() {
		System.out.println("普通房子砌墙5m");
	}

	@Override
	public void roofed() {
		System.out.println("普通房子屋顶瓦");
	}
}
