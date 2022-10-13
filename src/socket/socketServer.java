package socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class socketServer {

	
	public static void main(String[] args) throws Exception{
		BufferedReader ba = new BufferedReader(new InputStreamReader(System.in));
		File  ff = new File("src/source/test.txt");
		if(!ff.exists()) {
			ff.createNewFile();
		}
		OutputStream out = new FileOutputStream(ff);
//		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(out));
//		String s = "";
//		while(!(s=ba.readLine()).equals("bye")) {
//			System.out.println(s);
//			br.write(s);
//			br.newLine();
//			br.flush();
//		}
//		ba.close();
		
		BufferedOutputStream bos = new BufferedOutputStream(out);
		int len;
		byte[] bt = new byte[1024];
		String s = "";
		while(!(s=ba.readLine()).equals("bye")) {
			s = s+"\n";
			bos.write(s.getBytes());
			bos.flush();
		}
		bos.close();
	}
	
	
	

}
