package ascii;

import java.util.LinkedList;

public class AscIITT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=(int)'a';i<=(int)'z';i++) {
//			System.out.print((char)i +"对应的ASCII值==" +i);
//		}
//		System.out.println("*****");
//		for(int i=(int)'A';i<=(int)'Z';i++) {
//			System.out.print((char)i +"对应的ASCII值==" +i);
//		}
//		System.out.println();
//		Integer a = 99;
//		Integer x = Integer.valueOf(99);
//		int i = x;
//		if(a==x){
//			System.out.println("a==x");
//		}
//		if(x==i) {
//			System.out.println("i==x");
//		}
//		
//		Integer aa = 199;
//		Integer xx = Integer.valueOf(199);
//		int ii = xx;
//	
//		if(aa==xx){
//			System.out.println("aa==xx");
//		}
//		if(xx==ii) {
//			System.out.println("ii==xx");
//		}
//		
//		
//		Integer ss = new Integer(111);
//		Integer sss = 111;
//		Integer k = 111;
//		if(k==sss) {
//			System.out.println("k==sss");
//		}
//		if(ss==sss) {
//			System.out.println("ss==sss");
//		}
		
		int a = 9;
		int b = 5;
		String s = "999";
		String ss = "999";
		String bbb = new String("999");
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		System.out.println(bbb.hashCode());
		a = a^b;
		System.out.println(a);
		b=a^b;
		System.out.println(b);
		a=a^b;
		System.out.println(a);
		
		String m = "book";
		System.out.println(m.hashCode());
		String n = " ";
		
		LinkedList<String> link = new LinkedList();
		link.add("s");
		
		final String abc = "abc";
		String sm = "abc";
		String sq = abc;
		System.out.println(sm==sq);
		System.out.println(sm==abc);
		
		final A xx = new A("ss");
		xx.a = "s";
		System.out.println(xx.a);
		B bb = new B("ss");
		
		X x = new X("xx");
		System.out.println(x.getString(""));
		
		xx m1= new xx();
		xx m2= new xx();
		
		String ssss = null;
		System.out.println("".equals(ssss));
		System.out.println(ssss.equals(""));
	}

}


class A{
	String a;
	public A(String s) {
		a =s;
	};
}

class B{
	private String a;
	public B(String s) {
		a =s;
	};
	
	private final String getString1(String s) {
		return s;
	}
}

class X extends B{

	public X(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	public String getString(String s) {
		return s+"abc";
	}
}

final class  M{
	String x = "999";
	public String getString(String s) {
		return s+"abc";
	}
}

//class m1 extends M{}

class xx{
	static {
		System.out.println("123");
	}
	
	public static void main(String[] args) {
		xx m1= new xx();
		xx m2= new xx();
		
		String s = null;
		System.out.println(s.equals(""));
	}
}
