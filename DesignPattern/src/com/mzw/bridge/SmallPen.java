package com.mzw.bridge;

//扩充抽象类
public class SmallPen extends Pen {
	public void draw(String name) {
		String penType = "小号毛笔绘制";
		this.color.bepaint(penType, name);
	}
}
