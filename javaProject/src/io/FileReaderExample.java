package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		int data = 0;
		char[] cbuf = new char[100];
		
		FileReader fr = new FileReader("c:/Dev/git/javaProject/javaProject/src/io/FileReaderExample.java");
		FileWriter fw = new FileWriter("C:/Temp/file4.txt");

	
		while ((data = fr.read(cbuf)) != -1) {
			String readLines = new String(cbuf, 0, data);
			//String readLines = new String(cbuf);
			//System.out.print(new String(cbuf));
			fw.write(readLines);
			//fw.write(data);
		}
		fw = new FileWriter("C:/Temp/emp.txt");
		fw.write("Hello World");
		
		fw.flush();
		fw.close();
		fr.close();
		
			
		System.out.println("...end...");
	}

}
