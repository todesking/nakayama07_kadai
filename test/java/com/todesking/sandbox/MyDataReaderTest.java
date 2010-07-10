package com.todesking.sandbox;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.Test;

public class MyDataReaderTest {
	@Test
	public void test_readData() throws Exception {
		final StringReader stub = new StringReader("test:value");
		final MyDataReader reader = new MyDataReader(stub);

		assertThat(reader.readData("test"), is("value"));
	}

	@Test
	public void test_readData_emptyString() throws Exception {
		final StringReader stub = new StringReader("");
		final MyDataReader reader = new MyDataReader(stub);

		assertThat(reader.readData("test"), is(nullValue()));
	}

	@Test
	public void test_readData_multipleData() throws Exception {
		final StringReader stub = new StringReader("test:value\nsample:example");
		final MyDataReader reader = new MyDataReader(stub);

		assertThat(reader.readData("sample"), is("example"));
	}

	@Test
	public void test_readData_nameNotFound() throws Exception {
		final StringReader stub = new StringReader("test:value");
		final MyDataReader reader = new MyDataReader(stub);

		assertThat(reader.readData("sample"), is(nullValue()));
	}
}
