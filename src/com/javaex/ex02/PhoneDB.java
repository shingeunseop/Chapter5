package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class PhoneDB {

	public static void main(String[] args) throws IOException {



	Reader fr = new FileReader("D:\\javaStudy\\파일\\phoneDB.txt");
	Writer fw = new FileWriter("D:\\javaStudy\\파일\\phoneDB.txt");
	BufferedWriter bw = new BufferedWriter(fw) {};
	
	
	while(true)
	{
		Object str = bw.write(null);
		if (str == null) {

			break;
		}

		fw.write("신근섭,010-3162-8416,비트");

		/*
		 * Reader fr=new FileReader("D:\\javaStudy\\파일\\phoneDB.txt"); BufferedReader
		 * br=new BufferedReader(fr);
		 * 
		 * String str=""; while(true) { str=br.readLine(); if(str==null) {
		 * 
		 * break; } String div[]=str.split(","); System.out.println("이름: "+div[0]);
		 * System.out.println("핸드폰: "+div[1]); System.out.println("회사: "+div[2]);
		 * System.out.println("");
		 * 
		 * } br.close();
		 */

	}

}
}
	