package com.mzw.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				System.out.println("");
			}
		};

		absAdapter.m1();
	}
}
