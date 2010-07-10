package com.todesking.sandbox;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyYearTest {
	@Test
	public void test_toString() throws Exception {
		// 「保持した値を文字列として返す」という仕様に困惑するが、
		// まあコンストラクタで渡した数値を文字列として返せばいいのだろう
		assertThat(new MyYear(1999).toString(), is("1999"));
		assertThat(new MyYear(10).toString(), is("10"));
	}

	@Test
	public void test_isLeap() throws Exception {
		// 以下の条件にしたがってうるう年かどうかを返す
		// 1. 4の倍数ならうるう年
		// 2. 100の倍数ならうるう年でない
		// 3. 400の倍数はうるう年
		// 4. それ以外はうるう年でない
		// 条件2.および3.は明らかに矛盾しているが、これは3.の優先順位が2.より高いんだろうと
		// 好意的に解釈しておく。
		// ついでに1.と2.も矛盾している…… 評価順序は3,2,1か

		assertLeapYear(4);
		assertNotLeapYear(100);
		assertLeapYear(400);
		assertNotLeapYear(101);
		assertLeapYear(400 * 100);
		assertLeapYear(400 * 4);
		assertLeapYear(4 * 10);
		assertNotLeapYear(100 * 2);
	}

	private void assertLeapYear(int year) {
		assertThat(new MyYear(year).isLeap(), is(true));
	}

	private void assertNotLeapYear(int year) {
		assertThat(new MyYear(year).isLeap(), is(false));
	}
}
