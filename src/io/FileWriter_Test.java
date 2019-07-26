package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter_Test {

	public static void main(String[] args) throws IOException {
		
		String str;
		String strRootpath =  System.getProperty("user.dir"); // Project path
		String strFilePath = strRootpath + "\\files\\Results.txt";
		
		FileWriter fr = new FileWriter(strFilePath);
		BufferedWriter bw = new BufferedWriter(fr);
		
		//Write data into the notepad
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("this is the data written into the notepad via buffered writer");
		bw.newLine();
		bw.close();
		
	}

}
