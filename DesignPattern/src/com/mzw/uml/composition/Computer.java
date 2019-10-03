package com.mzw.uml.composition;

public class Computer {
	private Mouse mouse = new Mouse();
	private Moniter moniter = new Moniter();

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}

}
