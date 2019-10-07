package com.mzw.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	public String name; // String 属性
	public DeepCloneableTarget deepCloneableTarget; // 引用类型

	public DeepProtoType() {
		super();
	}

	// 深拷贝 - 方式1 使用clone 方法
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object deep = null;
		deep = super.clone();

		DeepProtoType deepProtoType = (DeepProtoType) deep;
		deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
		return deepProtoType;
	}

	/// 深拷贝 - 方式2 通过对象的序列化实现（推荐使用）
	public Object deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {

			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType) ois.readObject();
			return copyObj;

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {
			try {

				bos.close();
				oos.close();
				bis.close();
				ois.close();

			} catch (Exception e2) {

				System.out.println(e2.getMessage());

			}
		}
	}
}
