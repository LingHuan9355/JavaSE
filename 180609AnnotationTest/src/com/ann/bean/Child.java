package com.ann.bean;

@Description("I am class annotation")
public class Child extends Person {

	@Override
	@Description("I am method annotation")
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

}
