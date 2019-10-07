package com.mzw.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		DeepProtoType p = new DeepProtoType();
		p.name = "Monkey·D·LuFu";
		p.deepCloneableTarget = new DeepCloneableTarget("黑无常", "白无常");

		DeepProtoType p2 = (DeepProtoType) p.clone();
		System.out.println("p.name=" + p.name + "\tp.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "\tp2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

//		DeepProtoType p2 = (DeepProtoType) p.deepClone();
//		System.out.println("p.name=" + p.name + "\tp.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "\tp2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

	}

}
