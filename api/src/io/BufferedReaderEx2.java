package io;

import java.io.BufferedReader;
import java.io.FileReader;



public class BufferedReaderEx2 {

	public static void main(String[] args) {
		// 자바 소스파일을 읽어서 화면에 출력 
		// src/io/performanceEx2.java
		// 출력문 앞에 번호를 붙여서 화면에 보여주기 
		
		try(FileReader fr = new FileReader("src\\io\\PerformanceEx2.java");
			BufferedReader	bis = new BufferedReader(fr);) {
			
			String str = null;
			int i =1 ;
			
			while((str=bis.readLine())!=null) {
				System.out.println(i+""+str);
				i++;
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
