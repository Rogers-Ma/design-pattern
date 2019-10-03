package com.mzw.adapter.objectadapter;


public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V; // 持有
	
	
	//构造器初始化持有的资源
	public VoltageAdapter(Voltage220V voltage220v) {
		
		this.voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		
		int dst = 0;
		if(voltage220V != null) {
			int src = voltage220V.output220V();
			dst = src / 44;
			System.out.println("电压 = " + dst);
		}
		return dst;		
	}
}
