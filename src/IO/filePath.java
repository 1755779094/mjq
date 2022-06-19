package IO;

import java.io.File;
import java.net.URL;

/**
 * 路径问题
 * @author z'l'm'j'q
 * @date 2022年6月19日
 */
public class filePath {
	
	public static void main(String[] args) {
		String relativelyPath=System.getProperty("user.dir");
		System.out.println("根目录："+relativelyPath);
		URL ur = Thread.currentThread().getContextClassLoader().getResource("");//.getPath();
		System.out.println("tomcat 类路径："+ur);
		String thisPath = filePath.class.getResource("").getPath();
		System.out.println(thisPath);
		//filePath.class.getResourceAsStream(thisPath);
		File file = new File("");
		System.out.println("项目路径："+file.getAbsolutePath());
		File fileRoot = new File("/");
		System.out.println("磁盘路径："+fileRoot.getAbsolutePath());
		File relativeRoot = new File("./");
		System.out.println("相对路径："+relativeRoot.getAbsolutePath());
	}
}
