package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileRead_Test {

	public static void main(String[] args) throws IOException 
	{
		String str;
		String strRootpath =  System.getProperty("user.dir"); // Project path
		String strFilePath = strRootpath + "\\files\\Data.txt";
		
		FileReader fr = new FileReader(strFilePath);
		BufferedReader br = new BufferedReader(fr);
	
		//Read line from the file till it reaches null
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();

		
	}

}
