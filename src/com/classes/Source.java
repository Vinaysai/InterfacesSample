package com.classes;

public class Source {

	String a;

	@Override
	public String toString() {
		return "Source [a=" + a + ", b=" + b + "]";
	}



	public String getA() {
		return a;
	}



	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	String b;

}
