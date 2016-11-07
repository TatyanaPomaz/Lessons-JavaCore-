package two;

import one.B;

public class BB extends B {
	String str = "";
	public static final String CONSTANT_STRING = "1";
	public final String CONSTANT_STRING2;
	
	public BB() {
		CONSTANT_STRING2 = buzz();
	}
	
	public void foo() {
		System.out.println("BB");
	}
	
	private String buzz() {
		return "2";
	}
}