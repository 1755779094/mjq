package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestList {
	

	
	public static void testSet() {
		HashSet st = new HashSet();//输出 无序
//		ArrayList st = new ArrayList();//有序输出
		for(int i=0;i<100000;i++) {
			st.add(i);
		}
		Iterator it = st.iterator();
		int j=0;
		while(it.hasNext()) {
			if(j%10 != 0) {
				System.out.print(it.next() +"  *");
			}else {
				System.out.println(it.next());
			}
			j++;
		}
	}
	
	@SuppressWarnings("all")
	public static void testArrayList() {
		
		Collection cl = new ArrayList();
		cl.add("1");cl.add("2");cl.add("2");cl.add("3");
		System.out.println(cl);
		Iterator it = cl.iterator();
		
		
		ArrayList ls = new ArrayList();
		ls.add("1");ls.add("2");ls.add("2");ls.add("3");ls.add("4");
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).equals("2")) {
//				ls.remove(ls.get(i));
				//删除 下标直接后移  被删除下一个元素 丢失业务处理
			}
		}
		Iterator a = ls.iterator();
		while(a.hasNext()) {
			if(a.next().equals("2"))
				a.remove();
		}
		System.out.println(ls);
		Iterator ii = ls.iterator();
		while(ii.hasNext()) 
			System.out.print(ii.next());
		Set set = new HashSet();
		set.add("1");set.add("2");set.add("2");set.add("3");
		System.out.println("\n"+set.size() + set);
		
		LinkedList list = new LinkedList();
		list.addFirst("a");list.addLast("z");
		list.add("b");list.add("c");
		System.out.println(list);
		System.out.println(list.peek()); 
		
	}
	
	public static void testSet1() {
		HashSet st = new HashSet(10);
		st.add("1");st.add("2");
		for(int i=0;i<st.size();i++) {
//			System.out.println(new ArrayList(st.toArray())); //报错了 
		}
		System.out.println(st.size());
		for(Iterator it=st.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		testSet1();
	}

}
