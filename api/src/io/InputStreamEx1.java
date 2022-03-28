package io;

import java.io.IOException;
import java.io.InputStream;


public class InputStreamEx1 {

	public static void main(String[] args) {
		// 입럭 : 키보드
//		InputStream in = System.in;
//		
//		try {
//			int input =in.read();	//read() : 한 바이트만 읽어옴 
//			System.out.println((char)input);	//본래는 ascii값으로 반환 ex) abc : a값 97(char) : 형변환 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		//try-with-resources 형태로 변경 : AutoCloseable()
		try(InputStream in = System.in) {
			int input =in.read();	//read() : 한 바이트만 읽어옴 
			System.out.println((char)input);	//본래는 ascii값으로 반환 ex) abc : a값 97(char) : 형변환 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
