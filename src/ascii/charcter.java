package ascii;

public class charcter {

	public static void main(String[] args) {
		testStringbuilder();
		test();
	}
	
	public static void testStringbuilder() {
		StringBuffer bf = new StringBuffer();
		StringBuilder bd = new StringBuilder();
		System.out.println(bd.length());
		String s = null;
		bd.append(s);
		System.out.println(bd.length()+"**"+bd.toString());
	}
	
	public static void test() {
		//操作字符
		char A = 'a';
		char b= '1';
		
		String s = "中国123abc";//"abc123ABc";
		char[] cc = s.toCharArray();
		for(char x:cc) {
			if(Character.isLetter(x)) {System.out.println("字母"+x);}
			if(Character.isDigit(x)) {System.out.println("数字"+x);}
		}
		Character C = 'c';
		System.out.println(C.charValue()+"**"+Character.isDigit(b) );
		
	}
}
