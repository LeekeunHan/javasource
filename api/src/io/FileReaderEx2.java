package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReaderEx2 {

	public static void main(String[] args) {
		// 입력 : 파일 , 출력 : 화면 
		//== inputStream (모든파일을 다읽을수 있다) , reader(문자만 읽을수 있다)
		try(Reader reader = new FileReader("d:\\javatemp\\file1.txt",
				Charset.forName("ms949"));) {
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
		
	}

}
