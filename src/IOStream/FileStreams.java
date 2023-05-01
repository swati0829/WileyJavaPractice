package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreams {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\swati\\eclipse-workspace\\WileyJavaPractice\\src\\data2.txt");
//		
//		String str = "Wiley fullstack project";
//		
//		byte[] b = str.getBytes();
//		
//		fout.write(b);
//		
//		fout.flush();
//		fout.close();
		
		FileInputStream fin = new FileInputStream("C:\\Users\\swati\\eclipse-workspace\\WileyJavaPractice\\src\\data2.txt");
		
		int i = 0;
		
		while((i = fin.read())!=-1) {
			System.out.println((char)i);
		}
		fin.close();
	}
}