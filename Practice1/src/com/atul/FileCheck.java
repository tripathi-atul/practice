package com.atul;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] in = new char[50];
		int size = 0;
		File f = new File("FileWrite.txt");
        try {
        	System.out.println(f.exists());
			FileWriter fw = new FileWriter(f);
			fw.append("howdy\nfolks\n");
			fw.flush();
			fw.close();
			System.out.println(f.exists());
			FileReader fr = new FileReader(f);
			size = fr.read(in);
			System.out.println(size + " ");
			for(char c : in){
				System.out.println(c);
				fr.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
