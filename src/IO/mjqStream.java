package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.jasper.tagplugins.jstl.core.Url;

public class mjqStream {


	
	public static void writeString(String ss) throws IOException {
		File file = new File("D:/mjqTest");
		file.delete();
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(ss.getBytes());
		fos.close();
		
	}
	
	public static void readString() throws IOException {
		File file = new File("D:/xxx.txt");
//		file.delete();
//		if(!file.exists()) {
//			file.createNewFile();
//		}
		//字节流读取中文乱码
//		FileInputStream fin = new FileInputStream(file);
//		BufferedReader buf = new BufferedReader(new InputStreamReader(fin));
//		String line;
//		while((line=buf.readLine())!=null) {
//			System.out.println(line);
//		}
//		buf.close();
//		FileReader fin = new FileReader(file);
//		byte[] bb = new byte[3*9999];
//		int read = fin.read(bb);
//		
//		while(read!=-1) {
////			System.out.print((char)read);
//			System.out.print(new String(bb));
//			read = fin.read(bb);
//		}
//		fin.close();
		
//		int n=12;
//		byte buff[] = new byte[n];
//		while(fin.read(buff,0,3)!=-1) {
//			System.out.println(buff.length);
//			System.out.println(new String(buff));
//		}
//		fin.close();
//		FileWriter fit = new FileWriter(file);
//		BufferedWriter wrt = new BufferedWriter(fit);
//		for(int i=0;i<10000;i++) {
//			wrt.write("谁说太阳不是燃烧的呢"+i+"\n");
//		}
//		wrt.close();
//		BufferedReader buf = new BufferedReader(fin);
//		while(buf.readLine()!=null) {
//			System.out.println(buf.readLine());
//		}
//		buf.close();
		FileInputStream f = new FileInputStream(file);
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
//		BufferedOutputStream ou = new BufferedOutputStream(new FileOutputStream("D:/xxx.txt"));
//		String s = "abcdefg,higklmn,opq,rst,uvw,xyz";
//		for(int i=0;i<3000000;i++) {
//			ou.write(s.getBytes());
//		}
//		ou.close();
		
		byte[] bb = new byte[1024];
		int n=0;
		long start = System.currentTimeMillis();
		while((n=f.read(bb))!=-1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("非缓冲流"+(end-start)+"ms");
		
		//		int n;
//		while((n=in.read())!=-1) {
//			ou.write(n);
//		}
//		ou.close();
		
		start = System.currentTimeMillis();
		while(in.read()!=-1) {
//			System.out.print(new String(bb));
		}
		end = System.currentTimeMillis();
		System.out.println("缓冲流"+(end-start)+"ms");
	}
	
	private static void readProperties(String name) throws Exception{
		//properties 文件读取。。
		//1 inputStream 流获取
		Properties pr = new Properties();
		FileInputStream fin = new FileInputStream(name);
		pr.load(fin);
		String mjqname = pr.getProperty("name");
		System.out.println(mjqname+"\r"+pr.getProperty("pwd")+"\r"+pr.getProperty("wife"));
	//2. classloader 加载转换流 但是只能读取类路径下文件
		pr.load(mjqStream.class.getClassLoader().getResourceAsStream("source/test.properties"));
		//3、resourceBundle
		
		ResourceBundle bundle = ResourceBundle.getBundle("source/test"); 
		String name1 = bundle.getString("name");
		System.out.println(name1);
	
	}
	
	public static void main(String[] args) {
//		String str = "src/source/test.properties";
		File f = new File("");
		System.out.println(f.getAbsolutePath());
		String ul= Thread.currentThread().getContextClassLoader().getResource("").getPath();
		System.out.println(ul);
		String str = f.getAbsolutePath()+"/pp/mjq.properties";
		try {
			readProperties(str);
//			writeString(str);
//			readString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
