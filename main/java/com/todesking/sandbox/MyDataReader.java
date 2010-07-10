package com.todesking.sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class MyDataReader {
	public MyDataReader(Reader reader) {
		this.reader = new BufferedReader(reader);
	}

	private final BufferedReader reader;

	public String readData(String name) {
		try {
			for (String line = reader.readLine(); line != null; line = reader
					.readLine()) {
				final String[] cols = line.split(":");
				final String key = cols[0];
				final String value = cols[1];
				if (key.equals(name))
					return value;
			}
			return null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
