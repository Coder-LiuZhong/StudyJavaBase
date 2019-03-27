package java06_collection;

import java.util.Iterator;
import java.util.TreeSet;
/*	
 * Set���ص�������TreeSet����Ϊ���ֲ����ȱ�ݣ�������һ�����������Set��
 * 	
 * ���򷽷�һ����Ԫ������߱��Ƚ��ԣ�
 * 			     Ԫ����ҪԪ��ʵ��comparable�ӿڣ��˽ӿ���ǿ�ж�ʵ������ÿ����Ķ���ͨ��compareTo�������Զ�����
 * 			     ����compareTo()������ͨ��Ԫ������ıȽ��ų�ѭ�� ��ͨ��return 0�ķ�ʽ�ж�Ԫ���Ƿ���ͬ����֤Ԫ�ص�Ψһ�ԣ�
 * 
 * String�ࡢInteger��ȵ���Щ��ʵ����Comparable�ӿ�
 */
public class D03_TreeSet_Comparable {

	public static void main(String[] args) {
		//String��Ԫ�أ��Զ�����-----------------------------------------
		TreeSet ts = new TreeSet();
		ts.add("d");
		ts.add("b");							// String����ʵ����Comparable�ӿڣ��������Լ���compareTo()����ʵ��
		ts.add("c");							// �����ĵ����Կ������ñȽϻ����ַ����и����ַ��� Unicode ֵ����������0������
		ts.add("a");									
		Iterator itT = ts.iterator();
		while (itT.hasNext()) {
			System.out.println(itT.next());		
		}
		
		//����Ԫ�أ�����ʵ��Comparable�ӿ����Զ�������--------------------
		TreeSet ts2 = new TreeSet();
		ts2.add(new Worker("zs",51));			// Worker����ʵ����Comparable�ӿڣ��ͻ��Զ�����compareTo���бȽ�
		ts2.add(new Worker("ls",31));			// ִ�з���add()��ʱ��
		ts2.add(new Worker("ww",41));			// ���û��Comparable�ӿھͻᱨ��
		ts2.add(new Worker("zl",31));			// com.liuzhong.java.Worker cannot be cast to java.lang.Comparable
		
		Iterator itT2 = ts2.iterator();
		while (itT2.hasNext()) {
			System.out.println(itT2.next());					
		}
	}
}

/*
 * Comparable�ӿ�ǿ�ж�ʵ������ÿ����Ķ��������������,���ڰ���ʲô������Ը�дcompareTo()����ֵ��
 * �����дcompareTo����������ͨ���������Ƚϣ�
 * �������Ҳ��ͬ���͵���String��compareTo()�Ƚϣ�
 * */
class Worker implements Comparable{			
	private String name ;					
	private int age ;			
	
	Worker(String n,int a){
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
	
	public int compareTo(Object obj){			//	��������Ԫ�رȽϣ���д������������������ǰ����ȱ���ʹ�Щ������0������ȣ����ظ�������СЩ
		Worker w = (Worker)obj;					//	����Ҫ��������ͬ���͵Ķ���
		if (this.age > w.age) {
			System.out.println(this.name + ":" + this.age + ">>>" + w.name + "." + w.age);
			return 1;
		}else if(this.age == w.age){
			System.out.println(this.name + ":" + this.age + "===" + w.name + "." + w.age);
			return this.name.compareTo(w.name);	//	���������ͬ���ٸ�������������������String��so����String��compareTo()������Ҳ����������
		}else{
			System.out.println(this.name + ":" + this.age + "<<<" + w.name + "." + w.age);
			return -1;							//	TreeSet��ͨ��ʵ����Comparable�ӿڵ����compareTo()�������صĽ�����Զ�����
		}
	}
}
