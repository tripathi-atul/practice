package com.atul;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

public class Serialization implements Serializable {
	int a;
	transient Serializableclass2 s2;
	int check;
	
	String s;
	public Serialization() {
		a = 50;
		s = "atul";
		// TODO Auto-generated constructor stub
	}
	
	void methodFoorS2(){
		s2 = new Serializableclass2();
	}
	
	private void writeObject(ObjectOutputStream osw){
		try {
			osw.defaultWriteObject();
			osw.writeInt(s2.number);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream isw){
		try {
			try {

				isw.defaultReadObject();
				check = isw.readInt();
				System.out.println("check:"+check);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
	try {
	    
		Serialization newSerialization = new Serialization();
		newSerialization.methodFoorS2();
		FileOutputStream fos = new FileOutputStream("serial.txt");
		ObjectOutputStream osw = new ObjectOutputStream(fos);
		osw.writeObject(newSerialization);
		osw.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try{
		FileInputStream fis = new FileInputStream("serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serialization s =(Serialization)ois.readObject();
		System.out.println(s.a + s.s + s.s2);
	}
	catch(Exception e){
		
	}
	}


}
