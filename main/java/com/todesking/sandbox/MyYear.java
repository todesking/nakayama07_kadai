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
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}
}
