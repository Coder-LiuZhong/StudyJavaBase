package java06_collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class D02_TreeSet_按字符串长度来排序 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(
				new Comparator() {			//	匿名对象
					public int compare(Object o1,Object o2){
						String s1 = (String)o1;
						String s2 = (String)o2;
						if (s1.length()>s2.length()) 
							return 1;
						if (s1.length()==s2.length()) 
							return s1.compareTo(s2);				//	长度一样就自己比较；
						return -1;
					}
				});
		
		t.add("abd");
		t.add("gbd");
		t.add("edsaf");
		t.add("esd");
		t.add("sdsd");
		
		Iterator it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

