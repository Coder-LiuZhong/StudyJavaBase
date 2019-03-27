package java06_collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*
 * ���򷽷�������TreeSet�߱��Ƚ��ԣ�
 * 			    �����Ƚ���Comparator����дcompare����������TreeSet�Ĺ��캯���У�
 * 
 * 			    ��Ԫ�������߱��Ƚ��ԣ���һ�ֵľ����ԣ�
 *			    ����Ԫ������߱��ıȽ��Բ�������������Ҫ�ģ�����String��ıȽ��Կ������ǲ���Ҫ����String����final�Ĳ��ܼ̳�ȥ��д��
 *			    ���ʱ�����Ҫ�ڶ��ֱȽϷ�ʽ��
 * 			  	    ֱ���ü�������߱���������һ��ʼ���;߱��Ƚ��ԣ� 
 * */
public class D04_TreeSet_Comparator {
	public static void main(String[] args) {
		//ͨ��TreeSet(Comparator comparator)---------------------------------------------
		TreeSet ts3 = new TreeSet(new DocCompare());	//	TreeSet�и����캯�� TreeSet(Comparator<? super E> comparator)����Ҫ����һ��ָ���ıȽ���Comparator��������
		ts3.add(new Doctor("d1",51));					//	new TreeSet(new DocCompare()) ʹTreeSet�������Զ��ȽϵĹ��ܣ�
		ts3.add(new Doctor("d2",31));					//  add���Զ�����compare������
		ts3.add(new Doctor("d3",41));						
		ts3.add(new Doctor("d4",31));
		Iterator itT3 = ts3.iterator();
		while (itT3.hasNext()) {
			System.out.println(itT3.next());					
		}
	}
}

/*
 * �����Ƚ���Comparator����дcompare������
 * �Ƚ�����������������������ݵ�һ������С�ڡ����ڻ���ڵڶ��������ֱ𷵻ظ������������������
 * */
class DocCompare implements Comparator{				// ʵ��Comparator�Ƚ����ӿ�
	public int compare(Object o1,Object o2){		// ��дcompare������ע�⣬����compareTo;
		System.out.println("ɶʱ������ģ�");
		Doctor d1 = (Doctor)o1;
		Doctor d2 = (Doctor)o2;
		if (d1.getAge()>d2.getAge())
			return 1;
		if(d1.getAge()==d2.getAge())				// ����Ϊʲô��дelse if����Ϊ������return������߽������if������֮���ֱ���˳��ˣ�������������߽����if��
			return d1.getName().compareTo(d2.getName());	//	��ȵ�������Ǿ�����һ���Ͳ�����뼯�ϣ���Ϊ�����ǲ��ظ��ģ�
		return -1;
	}
}

class Doctor {
	private String name ;
	private int age ;
	
	Doctor(String n,int a){
		this.name = n;
		this.age = a;
	}
	
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	
	public String toString() {				 		
		return "name:" + name + ",age:" + age;		
	}
}