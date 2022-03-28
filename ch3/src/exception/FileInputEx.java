package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try{} : 단독사용 불가
 * 
 * 사용가능 
 * try{}catch{}  
 * try{}finally{}
 * try{}catch{}finally{}
 * 
 * */


public class FileInputEx {

	public static void main(String[] args) {
//		FileInputStream fis =null;
//		try {
//			fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		//자동으로 리소스 닫기 
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
