package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		//BufferedInputStream bis= new FileInputStream("d:\\javatemp\file1.txt");
		try(Reader in = new FileReader("d:\\javatemp\\file1.txt");
				BufferedReader bis = new BufferedReader(in);
				Writer out  = new FileWriter("d:\\javatemp\\output2.txt");
				BufferedWriter bos = new BufferedWriter(out);) {
			
			String str = null;
			 while((str=bis.readLine())!=null) {
				 bos.write(str);
				 bos.newLine();  		// 엔터 
			 }
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
