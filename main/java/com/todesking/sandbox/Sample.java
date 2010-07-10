package com.todesking.sandbox;

public class Sample {

	public String getHello(String str) {
		if (str == null)
			throw new IllegalArgumentException("str is null");
		return "Hello " + str;
	}

	public int divide(int x, int y) {
		return x / y;
	}

}
