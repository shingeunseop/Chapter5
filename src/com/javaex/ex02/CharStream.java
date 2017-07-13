package com.javaex.ex02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStream {

	public static void main(String[] args) throws IOException {
		
		Reader fr=new FileReader("D:\\javaStudy\\파일\\char.txt");
		int data;
		while(true) {
			data=fr.read();
			if(data==-1) {
				break;
			}
			
			System.out.print((char)data);
		}
		
		
		
		fr.close();
		
		
		/*Writer fw=new FileWriter("D:\\javaStudy\\파일\\char.txt");
		fw.write("비트컴퓨터");
		fw.write("java");
		
		fw.close();
		*/

	}

}
