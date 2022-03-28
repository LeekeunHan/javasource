package io;

import java.io.IOException;
import java.io.InputStream;


public class InputStreamEx2 {

	public static void main(String[] args) {
		// 입럭 : 키보드
		InputStream in = System.in;
		int input = 0; 
		try {
			// 더이상 읽어들일 바이트가 없으면 -1을 반환한다  
			while((input = in.read())!= -1){ //read() : 한 바이트만 읽어옴 
				System.out.println((char)input);	//본래는 ascii값으로 반환 ex) abc : a값 97(char) : 형변환
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
