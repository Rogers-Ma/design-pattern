package com.mzw.adapter.classadapter;

public class Phone {
	
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("电压5v，可以充电");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println(iVoltage5V.output5V()+" V电压,"+"电压过高，无法充电");
		}
	}
	
}
