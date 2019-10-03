package com.mzw.builder.improve;

public class HighBuilding extends HouseBuilder {
	@Override
	public void buildBasic() {
		System.out.println("高楼地基100m");
	}

	@Override
	public void buildWalls() {
		System.out.println("高楼墙壁20m");
	}

	@Override
	public void roofed() {
		System.out.println("高楼楼顶透明");
	}

}
