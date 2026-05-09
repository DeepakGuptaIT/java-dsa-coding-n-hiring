package com.firelago.java.ionio;

import java.io.IOException;
import java.nio.file.*;

public class NIOApiTest {
	
	public static void main(String[] args) throws IOException {
		createPath();
//		createDirPath();
	}
	
	private static void createPath() throws IOException {
		Path path = Paths.get("resource", "nio", "test.txt");// it's only an object
		System.out.println(Files.exists(path)); // look for a real file
		Files.createFile(path); // create a file!
		System.out.println(Files.exists(path)); // look again
		
	}
	
	private static void createDirPath() throws IOException {
		Path dir = Paths.get("resource","nio","one","two","three");
		Files.createDirectories(dir);
		Files.createFile(Paths.get("resource","nio","one","two","three",".four"));
	}

}
