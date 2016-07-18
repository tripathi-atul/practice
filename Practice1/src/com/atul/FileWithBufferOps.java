package com.atul;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileWithBufferOps {

	public static void main(String[] args) {
		// Through BufferReader
		File newFile = new File("D:\\Workspace\\practice\\newfile.txt");
		try {
			System.out.println(newFile.exists());
			FileWriter fw = new FileWriter(newFile);
			System.out.println(newFile.exists());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hey Doode its Atul here");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File newFile2 = new File("D:\\Workspace\\practice\\newFile2.txt");
		try{
			System.out.println(newFile2.exists());
			PrintWriter ps = new PrintWriter(newFile2);
			System.out.println(newFile2.exists());
			ps.println("My name is atul");
			
			
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		String[] list = new String[20];
		File newFile3 = new File("D:\\Workspace\\practice\\newDirectory");
		boolean flag = newFile3.mkdir();
		File myFile1 = new File(newFile3,"netext5.txt");
		File myFile2 = new File(newFile3,"newtext6.txt");
		System.out.println(myFile1.exists());
		System.out.println(myFile2.exists());
		try {
			myFile1.createNewFile();
			myFile2.createNewFile();
			list = newFile3.list();
			for(String s: list){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
