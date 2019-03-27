package java06_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class B01_ArrayList {
	public static void main(String[] args) {
	/*------------------------------------------
	 * 		ArrayList：	元素为字符串对象的集合应用
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
			ArrayList al = new ArrayList();
			al.add("abc");									//	集合增加3个对象，其实存入的是引用；
			al.add("liuzhong");		
			al.add("tracy");
			for (int i = 0; i < al.size(); i++) {			//	al.size()集合里面的对象个数；	注意，不是length,那是数组；
				System.out.println("get:" + al.get(i));		//	al.get(i)返回列表中指定角标的元素；
			}
			al.set(2, "Mcgrady");							//	修改2角标上的对象为McGrady的引用
			al.remove(1);									//	移除1角标上的对象；
			
			Iterator it = al.iterator();					//	1.获得容器的迭代器对象，每个容器都有
			while(it.hasNext()){							//	2.断是否还有下一个对象
				System.out.println("iterator:" + it.next());//	3.取出返回迭代的下一个对象；调用一次，指针往后移一位，最开始在第一个前面；
			}
			
			for (Iterator it2 = al.iterator();it2.hasNext();) {	//	for比while好处：Iterator定义在循环里，循环结束后就没有，这样节省内存，属于代码优化；
				System.out.println("for:" + it2.next());
			}
			
			System.out.println("----------------------------------------------------------------------------------------------------------------");
	
	/*-----------------------------------
	 * 		ArrayList:	元素为对象集合应用
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
			ArrayList al2 = new ArrayList();
			al2.add(new Person("zhangsan",21));									
			al2.add(new Person("lisi",31));		
			al2.add(new Person("zhaoliu",51));
			
			for (int i = 0; i < al2.size(); i++) {
				System.out.println("Person:" + al2.get(i));		//	get()返回的是对象（object），所以出来的都是哈希值；说明存的是地址；对象碰到print就自动调用了toString
			}
			
			Iterator it2 = al2.iterator();
			while (it2.hasNext()) {
				Person p = (Person)it2.next();					//	next()返回的是Object，强转为Person
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