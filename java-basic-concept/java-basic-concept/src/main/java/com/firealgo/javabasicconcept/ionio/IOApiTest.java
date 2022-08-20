package com.firealgo.javabasicconcept.ionio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOApiTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		createFile();
//		 readWriteFile();
		fileSearch();

	}

	private static void createFile() throws IOException {
		File file = new File("resource\\io\\file3.txt");
		boolean newFile = false;
		System.out.println(file.exists()); // look for a real file
		newFile = file.createNewFile(); // maybe create a file!
		System.out.println(newFile); // already there?
		System.out.println(file.exists());

		// create directory:
		File myDir = new File("resource\\io\\mydir"); // create an object
		myDir.mkdir(); // create an actual directory
		file = new File(myDir, "file9.txt");
		file.createNewFile();

	}

	private static void readWriteFile() throws IOException {
		char[] in = new char[50]; // to store input
		int size = 0;
		try {
			File file = new File("resource\\io\\file5.txt");
			FileWriter fw = new FileWriter(file); // create an actual file
			// & a FileWriter obj
			fw.write("dog  hai\nfolks\n"); // write characters to
			// the file
			fw.flush(); // flush before closing
			fw.close(); // close file when done
			FileReader fr = new FileReader(file); // create a FileReader
			// object
			size = fr.read(in); // read the whole file!
			System.out.print(size + " "); // how many bytes read
			for (char c : in) // print the array
				System.out.print(c);
			fr.close(); // again, always close
		} catch (IOException e) {
			throw e;
		}
	}

	private static void fileSearch() {
		String[] files = new String[100];
		File search = new File("resource");
		files = search.list(); // create the list
		for (String fn : files) // iterate through it
			System.out.println("found " + fn);
	}

}
