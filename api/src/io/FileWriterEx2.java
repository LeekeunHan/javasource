package io;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		//output1.txt 파일 생성 		
		File file1 = new File("d:\\javatemp\\output1.txt");
		
		try {
			if(!file1.exists()) {
				file1.createNewFile();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		// 사용자로부터 데이터 입력받기 :Scanner 
		try(Scanner sc =new Scanner (System.in);
				Writer writer = new FileWriter(file1)) {
		// 입력받은 데이터를 파일출력 : output1.txt 
			System.out.println("데이터입력(q를 입력하면 종료)>>");
			
			String input = "";
			while(!(input=sc.nextLine()).equals("q")) {
				writer.write(input+"\r\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
