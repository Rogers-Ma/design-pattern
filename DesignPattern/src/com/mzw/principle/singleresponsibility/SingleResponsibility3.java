package com.mzw.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("摩托车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船007");
    }
}

// 方案3
//1. 这种方法对原来的类没有做大的修改，只是增加方法
//2. 这里虽然没有在类这个级别上没有遵守单一职责原则，但是在方法级别上仍然遵守了单一职责原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle+" 在公路上跑");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle+" 在公路上跑");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle+" 在公路上跑");
    }
}
