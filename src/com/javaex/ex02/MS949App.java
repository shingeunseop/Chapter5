package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MS949App {

	public static void main(String[] args) throws IOException {
		
		InputStream in= new FileInputStream("D:\\javaStudy\\파일\\MS949.txt");
		InputStreamReader isr=new InputStreamReader(in,"MS949");
		BufferedReader br=new BufferedReader(isr);
		String line=br.readLine();
		
		String str="";
		while(true) {
			str=br.readLine();
			if(str==null) {
				System.out.println("번역완료");
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		
		/*// TODO Auto-generated method stub
		Reader fr=new FileReader("D:\\javaStudy\\파일\\MS949.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		while(true) {
			str=br.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		br.close();*/
	}

}
