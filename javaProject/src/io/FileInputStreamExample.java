
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		
//		FileInputStream fis = new FileInputStream(
//				"C:/JavaProgramming/source/")
		
		InputStream is = new FileInputStream("c:/Dev/git/javaProject/javaProject/src/io/FileExample.java");
		
		int data = 0, cnt = 0;
		byte[] readBytes = new byte[100];
		while((data = is.read(readBytes)) != -1) {
			System.out.print(data + " ");
			cnt++;
		}
		is.close();
		System.out.println();
		System.out.println(cnt + "반복");
		System.out.println((char)100);
		System.out.println("=======end=======");
		
				
		
	}

}
