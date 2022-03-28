package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	/*
	 * inputStreamReader : 문자 변환 보조 스트림 
	 * 바이트스트림 => 문자스트림
	 * 
	 * */

	public static void main(String[] args) {
		
		
		
		try(InputStream in = new FileInputStream("d:\\javatemp\\file1.txt");
				InputStreamReader reader = new InputStreamReader(in)) {
			
				
				char cbuf[]=new char[100];
				while(reader.read(cbuf)!= -1) {
					System.out.println(cbuf);
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
