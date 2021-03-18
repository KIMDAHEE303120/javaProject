package io;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Writer;

public class NameListInput {
	public static void main(String[] args) throws Exception {
		int data = 0;
		byte[] cbuf = new byte[100];
		InputStream is = System.in;

//		FileInputStream fis = new FileInputStream("C:/Temp/Dir/NameList.txt");
//		FileReader fr = new FileReader("C:/Temp/dir/nameList.txt");
//		FileWriter fw = new FileWriter("C:/Temp/dir/nameList.txt");

		File nameList = new File("C:/Temp/dir/nameList.txt");
		if (nameList.exists() == false) {	nameList.createNewFile();	}

		System.out.print("이름입력: ");
		int nameBytes = is.read(cbuf);
		String name = new String(cbuf, 0, nameBytes - 2);

		System.out.print("전화번호: ");
		int phoneBytes = is.read(cbuf);
		String phoneNo = new String(cbuf, 0, phoneBytes - 2);
	

	} // end of main

}
