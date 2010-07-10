package com.todesking.sandbox;

public class MyYear {
	public MyYear(int year) {
		this.year = year;
	}

	private final int year;

	@Override
	public String toString() {
		return Integer.toString(year);
	}

	public boolean isLeap() {
		return false;
	}
}
