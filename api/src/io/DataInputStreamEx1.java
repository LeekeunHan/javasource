package io;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream / DataoutputStream : 메모리에 저장된 0,1 상태 읽기 , 쓰기 
// 4 => Writeint(4) 


public class DataInputStreamEx1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("d:\\javatemp\\data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("d:\\javatemp\\data.txt");
			DataInputStream dis = new DataInputStream(fis)) {
			
			//자료형에 맞게 자료 작성 
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(5);
			
			dos.writeUTF("김자바");
			dos.writeDouble(96.5);
			dos.writeInt(6);
			
			//읽어오기 
			for (int i=0; i<2; i++) {
				String name = dis.readUTF();	//String 타입 
				double jumsu = dis.readDouble(); //double 타입 
				int num = dis.readInt();
				System.out.println(num+" : "+name+" ( "+jumsu+" )");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
