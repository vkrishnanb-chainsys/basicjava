package edu.lessons.day60.oops.abstractclass;

public class DemoAChild extends AbsDemoA {
	public DemoAChild() {
		System.out.println("DemoAChild Object Created " + hashCode());
	}

	@Override
	public void echo() {
		System.out.println("DemoAChild echo " + hashCode());
	}
}
