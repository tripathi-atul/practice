package com.atul;

import java.io.Console;
/** Run it on Console */
public class ConsoleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c= System.console();
		char[] pw;
		pw = c.readPassword("%s", "pw: ");
		for(char ch: pw){
			c.format("%c", ch);
			c.format("\n");
		}

	}

}
