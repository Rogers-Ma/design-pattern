package com.mzw.bridge;

//扩充实现类
public class Red implements Color {
	public void bepaint(String penType, String name) {
		System.out.println(penType + "红色的" + name + ".");
	}
}
