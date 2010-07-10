package com.todesking.sandbox;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.StringWriter;

import org.junit.Test;

public class MyDataWriterTest {
	@Test
	public void test_writeData() throws Exception {
		final StringWriter stub = new StringWriter();
		final MyDataWriter writer = new MyDataWriter(stub);

		writer.writeData("test", "value");

		assertThat(stub.toString(), is("test:value\n"));
	}

	@Test
	public void test_writeData_nameIsEmpty() throws Exception {
		final StringWriter stub = new StringWriter();
		final MyDataWriter writer = new MyDataWriter(stub);

		writer.writeData("", "anyData");

		assertThat(stub.toString(), is(""));
	}

	@Test
	public void test_writeData_nameIsNull() throws Exception {
		final StringWriter stub = new StringWriter();
		final MyDataWriter writer = new MyDataWriter(stub);

		writer.writeData(null, "anyData");

		assertThat(stub.toString(), is(""));
	}

	@Test
	public void test_writeData_multipleData() throws Exception {
		// 初期状態が""じゃない場合の挙動とか書いてないので適当に妄想で実装しときますね
		final StringWriter stub = new StringWriter();
		final MyDataWriter writer = new MyDataWriter(stub);

		writer.writeData("key1", "value1");
		writer.writeData("key2", "value2");

		assertThat(stub.toString(), is("key1:value1\nkey2:value2\n"));
	}

	@Test
	public void test_writeData_keyConfrict() throws Exception {
		// キーの値が重複した場合、気にせず追記する
		final StringWriter stub = new StringWriter();
		final MyDataWriter writer = new MyDataWriter(stub);

		writer.writeData("key1", "value1");
		writer.writeData("key1", "value2");

		assertThat(stub.toString(), is("key1:value1\nkey1:value2\n"));
	}

}
