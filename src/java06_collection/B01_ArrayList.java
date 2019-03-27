package java06_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class B01_ArrayList {
	public static void main(String[] args) {
	/*------------------------------------------
	 * 		ArrayList��	Ԫ��Ϊ�ַ�������ļ���Ӧ��
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
			ArrayList al = new ArrayList();
			al.add("abc");									//	��������3��������ʵ����������ã�
			al.add("liuzhong");		
			al.add("tracy");
			for (int i = 0; i < al.size(); i++) {			//	al.size()��������Ķ��������	ע�⣬����length,�������飻
				System.out.println("get:" + al.get(i));		//	al.get(i)�����б���ָ���Ǳ��Ԫ�أ�
			}
			al.set(2, "Mcgrady");							//	�޸�2�Ǳ��ϵĶ���ΪMcGrady������
			al.remove(1);									//	�Ƴ�1�Ǳ��ϵĶ���
			
			Iterator it = al.iterator();					//	1.��������ĵ���������ÿ����������
			while(it.hasNext()){							//	2.���Ƿ�����һ������
				System.out.println("iterator:" + it.next());//	3.ȡ�����ص�������һ�����󣻵���һ�Σ�ָ��������һλ���ʼ�ڵ�һ��ǰ�棻
			}
			
			for (Iterator it2 = al.iterator();it2.hasNext();) {	//	for��while�ô���Iterator������ѭ���ѭ���������û�У�������ʡ�ڴ棬���ڴ����Ż���
				System.out.println("for:" + it2.next());
			}
			
			System.out.println("----------------------------------------------------------------------------------------------------------------");
	
	/*-----------------------------------
	 * 		ArrayList:	Ԫ��Ϊ���󼯺�Ӧ��
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
			ArrayList al2 = new ArrayList();
			al2.add(new Person("zhangsan",21));									
			al2.add(new Person("lisi",31));		
			al2.add(new Person("zhaoliu",51));
			
			for (int i = 0; i < al2.size(); i++) {
				System.out.println("Person:" + al2.get(i));		//	get()���ص��Ƕ���object�������Գ����Ķ��ǹ�ϣֵ��˵������ǵ�ַ����������print���Զ�������toString
			}
			
			Iterator it2 = al2.iterator();
			while (it2.hasNext()) {
				Person p = (Person)it2.next();					//	next()���ص���Object��ǿתΪPerson
				System.out.println(p.getName() + "," + p.getAge());
			}
			
			System.out.println("----------------------------------------------------------------------------------------------------------------");	
	}
}

class Person{
	private String name ;
	private int age ;
	Person(String n,int a){
		this.name = n;
		this.age = a;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}