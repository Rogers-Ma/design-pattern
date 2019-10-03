package com.mzw.principle.singleresponsibility;

public class SingleResponsibility2 {
	public static void main(String[] args) {
		RoadVehicle rvehicle = new RoadVehicle();
		AirVehicle avehicle = new AirVehicle();
		WaterVehicle wvehicle = new WaterVehicle();
		rvehicle.run("摩托车");
		avehicle.run("飞机");
		wvehicle.run("轮船");

	}
}

//方案2分析
//1. 遵守了单一职责原则
//2. 但是这样做的改动很大，即将类修改，同时修改客户端
//3. 改进：直接修改Vehical类，改动的的代码会比较少 =》 方案3

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 公路运行");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 天空运行");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 水上运行");
	}
}
