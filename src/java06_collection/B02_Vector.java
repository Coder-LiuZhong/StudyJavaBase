package java06_collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class B02_Vector {

	public static void main(String[] args) {
/*-------------------------------
 * 		Vector	ŷ�ֵ���Ŀ��û�õ�����Ҫ���ˣ�
 *---------------------------------------------------------------------------------------------------------------------------------------------- */
		Vector v = new Vector();
		v.addElement("Vector1");				
		v.addElement("Vector2");
		v.addElement("Vector3");
		
		for (int x = 0; x < v.size(); x++) {
			System.out.println("vector:" + v.elementAt(x));
		}
	
		Iterator itV = v.iterator();	
		while (itV.hasNext()){
			System.out.println("iterator:" + itV.next());
		}
		
		System.out.println("use Enumeration=------------------");
		Enumeration en = v.elements();						//	ö�٣��������������ظ���������ˣ�
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");

	}

}
