package java06_collection;

import java.util.Iterator;
import java.util.TreeSet;

/* 
 * 	TreeSet���ص���Ǹ�Set������һ���Զ�����Ĺ���        (ŷ����Ŀ����û�����ã����ǿ��Թ�һ�飬���һ�������ԭ��)
 * */
public class D01_TreeSet_���ַ������ִ�ѧ���� {

	public static void main(String[] args) {
		String s = "23,0,-1,99,100,4";
		String[] strs = s.split(",");
		
		TreeSet ts = new TreeSet();
		for (int j = 0; j < strs.length; j++) {
			//ts.add(strs[j]);					// �ַ������͵����ֶ�������������������Ҫ������
			ts.add(Integer.parseInt(strs[j]));	// ���ַ������͵�����ת���ɻ����������ͣ�Ȼ���Զ�װ����ΪInteger������뼯�ϣ�
		}										// Integerʵ����comparable�ӿ�
		
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		// ��ӡ�����Զ�������
		}
	}

}
