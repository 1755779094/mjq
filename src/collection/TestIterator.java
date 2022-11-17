package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestIterator {
	
	static final String a = "����";
	
	private void testList() {
		int[] intarg = new int[]{1,2,3};
		List list = Arrays.asList(intarg);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		Integer[] itarg = new Integer[]{1,2,3};
		List list1 = Arrays.asList(itarg);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		int x = Math.max(1, 10);
		System.out.println(x);
		int[] mList = new int[]{1,2,3};
		int i = mList.length;
		int[] nList = Arrays.copyOf(mList, 2);
		
		List<String>  sa = new ArrayList();
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE +"***"+Integer.MAX_VALUE);
		
		TestIterator t = new TestIterator();
		t.testList();
		String s = "abc";
		s.length();
		String s1 = new String("abc");
		String s2 = "abc".toString();
		System.out.println(s.equals(s1));
		System.out.println(1);
		System.out.println(s==s1 + " ** " +s.equals(s1));
		System.out.println(s==s2 + " ** " +s.equals(s2));
		System.out.println(s1==s2 + " ** " +s1.equals(s1));
	}

}

class Person {
	
	
}

