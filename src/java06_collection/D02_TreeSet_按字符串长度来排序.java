package java06_collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class D02_TreeSet_���ַ������������� {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(
				new Comparator() {			//	��������
					public int compare(Object o1,Object o2){
						String s1 = (String)o1;
						String s2 = (String)o2;
						if (s1.length()>s2.length()) 
							return 1;
						if (s1.length()==s2.length()) 
							return s1.compareTo(s2);				//	����һ�����Լ��Ƚϣ�
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

