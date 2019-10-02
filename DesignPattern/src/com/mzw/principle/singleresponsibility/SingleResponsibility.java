package com.mzw.principle.singleresponsibility;

public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("皮卡");
    }
}

//交通工具
//方式1
//1. 方式1 run() 违反了了单一职责原则
//2. 解决的方案非常简单，根据交通工具运行方式的不同，分解成不同的类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+" 在公路上跑");
    }
}
