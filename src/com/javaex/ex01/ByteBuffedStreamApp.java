package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBuffedStreamApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in=new FileInputStream("D:\\javaStudy\\파일\\img.jpg");
		
		BufferedInputStream bin=new BufferedInputStream(in);//두 명령어가 연결됨
		OutputStream out=new FileOutputStream("D:\\javaStudy\\파일\\buffing.jpg");
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int data;
		while(true) {
			data=bin.read();
			if(data==-1) {
				System.out.println("버퍼드 스트림 복사완료");
				break;
			}
			bout.write(data);
		}
		
		
		bout.close();
		bin.close();//buff를  닫음으로서 in,out도 같이 닫힘
		

	}

}
