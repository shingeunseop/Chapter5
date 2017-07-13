package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharBuffedStream {
	public static void main(String[] args) throws IOException {
		
		Reader fr=new FileReader("D:\\javaStudy\\파일\\song.txt");
		BufferedReader br=new BufferedReader(fr);//한줄씩 읽음
		String str;
		
		while(true) {
			str=br.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		
		
		br.close();
		
		/*Writer fw=new FileWriter("D:\\javaStudy\\파일\\song.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("가나다라마자배ㅐ");
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("자카차타파라");
		bw.newLine();
		bw.write("z");
		
		bw.close();*/
	}

}
