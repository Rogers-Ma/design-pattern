package com.mzw.interpreter;

import java.util.HashMap;

import java.util.HashMap;

/**
 * 加法解释器
 * 
 * @author mzw
 *
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	// 处理相加
	// var 仍然是 {a=10,b=20}..
	// 一会我们debug 源码,就ok
	public int interpreter(HashMap var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}