package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BOStream {
	public static void main(String[] args) throws IOException {

//		FileOutputStream fout = new FileOutputStream("C:\\Users\\swati\\eclipse-workspace\\WileyJavaPractice\\src\\data1.txt");
//		BufferedOutputStream bof = new BufferedOutputStream(fout);
//		
//		String str= "I am a Programmer";
//		
//		byte[] b = str.getBytes();  
//		
//		//System.out.println(b);
//		
//		try {
//			bof.write(b);
//			bof.flush();
//			bof.close();
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}

		FileInputStream fin = new FileInputStream(
				"C:\\Users\\swati\\eclipse-workspace\\WileyJavaPractice\\src\\data1.txt");
		BufferedInputStream bis = new BufferedInputStream(fin);

		int i;

		while ((i = bis.read()) != -1) {
			System.out.println((char) i);
		}

		bis.close();
		fin.close();

	}
}