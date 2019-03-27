package java06_collection;

import java.util.Iterator;
import java.util.TreeSet;
/*	
 * Set的特点是无序，TreeSet就是为了弥补这点缺陷，让它是一个可以排序的Set；
 * 	
 * 排序方法一：让元素自身具备比较性；
 * 			     元素需要元素实现comparable接口，此接口能强行对实现它的每个类的对象通过compareTo方法进自动排序；
 * 			     覆盖compareTo()，集合通过元素自身的比较排出循序； 可通过return 0的方式判断元素是否相同，保证元素的唯一性；
 * 
 * String类、Integer类等等这些都实现了Comparable接口
 */
public class D03_TreeSet_Comparable {

	public static void main(String[] args) {
		//String类元素：自动排序-----------------------------------------
		TreeSet ts = new TreeSet();
		ts.add("d");
		ts.add("b");							// String类是实现了Comparable接口，并有它自己的compareTo()方法实现
		ts.add("c");							// 帮助文档可以看到，该比较基于字符串中各个字符的 Unicode 值，返回正数0负数；
		ts.add("a");									
		Iterator itT = ts.iterator();
		while (itT.hasNext()) {
			System.out.println(itT.next());		
		}
		
		//对象元素：对象实现Comparable接口来自定义排序--------------------
		TreeSet ts2 = new TreeSet();
		ts2.add(new Worker("zs",51));			// Worker对象实现了Comparable接口，就会自动调用compareTo进行比较
		ts2.add(new Worker("ls",31));			// 执行方法add()的时候
		ts2.add(new Worker("ww",41));			// 如果没有Comparable接口就会报错：
		ts2.add(new Worker("zl",31));			// com.liuzhong.java.Worker cannot be cast to java.lang.Comparable
		
		Iterator itT2 = ts2.iterator();
		while (itT2.hasNext()) {
			System.out.println(itT2.next());					
		}
	}
}

/*
 * Comparable接口强行对实现它的每个类的对象进行整体排序,至于按照什么规则可以改写compareTo()返回值。
 * 这里改写compareTo方法，让其通过年龄来比较；
 * 如果年龄也相同，就调用String的compareTo()比较；
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
	
	public int compareTo(Object obj){			//	两个对象元素比较；重写方法；返回正数，当前对象比别个就大些，返回0就是相等，返回负数就是小些
		Worker w = (Worker)obj;					//	首先要是两个相同类型的对象；
		if (this.age > w.age) {
			System.out.println(this.name + ":" + this.age + ">>>" + w.name + "." + w.age);
			return 1;
		}else if(this.age == w.age){
			System.out.println(this.name + ":" + this.age + "===" + w.name + "." + w.age);
			return this.name.compareTo(w.name);	//	如果年龄相同，再根据姓名排序，姓名都是String，so调用String的compareTo()，返回也是正负数；
		}else{
			System.out.println(this.name + ":" + this.age + "<<<" + w.name + "." + w.age);
			return -1;							//	TreeSet是通过实现了Comparable接口的类的compareTo()方法返回的结果来自动排序；
		}
	}
}
