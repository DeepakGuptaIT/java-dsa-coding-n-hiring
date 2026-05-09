package com.firelago.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNewApiTest {

	public static void main(String[] args) throws Exception {
		
//		writeStringT();
		readStringT();

	}
	private static void readStringT() throws IOException {
		
		Path path = Paths.get("resource", "nio", "test.txt");
		String output = Files.readString(path);
		System.out.println(output);
	}
	/**
	 * This method is used to write the contents to a file. Characters are encoded into bytes using the specified charset, 
	 * and the default value is a UTF-8 charset.
	 * @throws Exception 
	 */
	private static void writeStringT() throws Exception {
		
		Path path = Paths.get("resource", "nio", "test.txt");
		String s = "jay mata di";
		s += "\n jor se bole";
		s += "\n kya baat ahai444";
		Files.writeString(path, s);
	}

}
