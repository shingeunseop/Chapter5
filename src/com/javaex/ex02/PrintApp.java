package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PrintApp {

	public static void main(String[] args) throws IOException {
		
		OutputStream out=System.out;
		Writer osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);
		
		bw.write("hello world!!");
		
		bw.close();

	}

}
