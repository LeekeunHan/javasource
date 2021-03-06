package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		
		File temp = new File("d:\\javatemp");
		File dir = new File("d:\\javatemp\\dir");
		File file1 = new File("d:\\javatemp\\file1.txt");
		File file2 = new File("d:\\javatemp\\file2.txt");
		File file3 = new File(temp,"file3.txt");
		File file4 = new File(dir,"file4.txt");
		
		//디렉토리 생성 
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		//파일 생성
			try {
				if(!file1.exists()) {
				file1.createNewFile();
				}
				if(!file2.exists()) {
					file2.createNewFile();
				}
				if(!file3.exists()) {
					file3.createNewFile();
				}
				if(!file4.exists()) {
					file4.createNewFile();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//파일속성 확인(형태,시간) 
			
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println("  날짜       시간          형태               크기       이름  ");
			System.out.println("----------------------------------------------------------");
			
			
			File[] files = temp.listFiles();
			for(File f:files) {
				System.out.print(sdf.format(new Date(f.lastModified())));  //new Date(1647483431336)
				if(f.isDirectory()) {
					System.out.print("\t<DIR>\t\t\t"+f.getName());
				}else {
					System.out.println("\t\t\t"+f.length()+"\t"+f.getName());
				}
				System.out.println();
			}
		

	}

}
