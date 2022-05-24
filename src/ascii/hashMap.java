package ascii;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>(19);
		
		//进制位运算?
		int a = 128;
		deside(a);
		String s = "abcdf";
		reverse(s);
		String ss = "10100011";
		System.out.println(convertToten(ss));
	}
	
	public static void deside(int a){
		if(a/2==0 && a%2==1) {
			System.out.print(a%2);
			return ;
		}else{
			System.out.print(a%2);
			deside(a/2);
		}
	}
	
	public static String reverse(String s) {
		if(s.length()==1) {
			System.out.print(s);
			return s;
		}else {
			System.out.print(s.substring(s.length()-1,s.length()));
			return reverse(s.substring(0,s.length()-1));
		}
		
	}
	
	public static int convertToten(String s) {
		int ret = 0;
		for(int i=0;i<s.length();i++) {
			if(i+1 <= s.length()) {
				int x = Integer.parseInt(s.substring(i, i+1));
				ret += (int) (x * Math.pow(2, i));
			}
		}
		
		return ret;
	}

}
