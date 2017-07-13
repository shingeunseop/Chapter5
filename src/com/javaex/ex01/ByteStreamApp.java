package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {//하지만 이것으로는 용량이 너무 적으므로 더 많은 값을 쓰게 더퍼 사용

	public static void main(String[] args) throws IOException{
		
		InputStream in =new FileInputStream("D:\\javaStudy\\파일\\img.jpg");
		OutputStream out=new FileOutputStream("D:\\javaStudy\\파일\\bytebuff.jpg");
		
		byte[] buff=new byte[1024];//1024개의 바이트 방이 있는 값
		//buff==배열이름
		int data;
		while(true) {
			data=in.read(buff);//buff는 주머니
			if(data==-1) {
				System.out.println("복사완료");
				break;
			}
			out.write(buff);
		}
		
		in.close();
		out.close();
		
		/*InputStream in=new FileInputStream("D:\\javaStudy\\파일\\img.jpg");//.파일을 똑같이 폭사하여 넣는 문법
		OutputStream out=new FileOutputStream("D:\\javaStudy\\파일\\byte.jpg");
		
		int data;//정수를 받을 그릇
		
		while(true) {
			data=in.read();//파일을 조금씩 이용해서 복사중
			if(data==-1) {//-1일때 아웃되게 메소드가 되어있음
				System.out.println("끝");
				break;}
			out.write(data);//파일이 나가는 곳
		}
		
		
		
		out.close();//output닫기
		in.close();//input 닫기*/

	}

}
