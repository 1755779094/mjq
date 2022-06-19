package reflact;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class reflactInfo {
	
	public static void main(String[] args) {
		try {
			readConstructors();
		} catch (ClassNotFoundException e) {
			System.out.println("类未找到@"+e.getMessage());
//			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public static void readConstructors() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//		Class cl = Class.forName("reflact.reflactTest");
		Class cl = Class.forName("reflact.reflactTest");
		Constructor[] ct = cl.getConstructors();
		for(Constructor c:ct) {
			System.out.println(c + "*"+c.getName());
		}
		Field[] field = cl.getDeclaredFields();
		for(Field fl:field) {
			System.out.println(fl+"*"+fl.getName());
		}
		
		Object obj = cl.newInstance();
	}

}
