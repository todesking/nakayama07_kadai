package com.todesking.sandbox;

import java.io.IOException;
import java.io.Writer;

public class MyDataWriter {
	public MyDataWriter(Writer writer) {
		this.writer = writer;
	}

	private final Writer writer;

	public void writeData(String name, String value) {
		if (name == null || "".equals(name))
			return;
		try {
			writer.write(name + ":" + value + "\n");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
