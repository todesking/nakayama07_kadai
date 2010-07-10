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
}
