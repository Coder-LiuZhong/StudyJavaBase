package java06_collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*
 * 排序方法二：让TreeSet具备比较性；
 * 			    创建比较器Comparator，复写compare方法；传入TreeSet的构造函数中；
 * 
 * 			    当元素自身不具备比较性（第一种的局限性）
 *			    或者元素自身具备的比较性并不是我们所需要的（例如String类的比较性可能我们不需要，但String类是final的不能继承去复写）
 *			    这个时候就需要第二种比较方式；
 * 			  	    直接让集合自身具备；让容器一初始化就具备比较性； 
 * */
public class D04_TreeSet_Comparator {
	public static void main(String[] args) {
		//通过TreeSet(Comparator comparator)---------------------------------------------
		TreeSet ts3 = new TreeSet(new DocCompare());	//	TreeSet有个构造函数 TreeSet(Comparator<? super E> comparator)，需要传入一个指定的比较器Comparator进行排序。
		ts3.add(new Doctor("d1",51));					//	new TreeSet(new DocCompare()) 使TreeSet具有了自动比较的功能；
		ts3.add(new Doctor("d2",31));					//  add后将自动调用compare方法；
		ts3.add(new Doctor("d3",41));						
		ts3.add(new Doctor("d4",31));
		Iterator itT3 = ts3.iterator();
		while (itT3.hasNext()) {
			System.out.println(itT3.next());					
		}
	}
}

/*
 * 创建比较器Comparator，复写compare方法；
 * 比较用来排序的两个参数。根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
 * */
class DocCompare implements Comparator{				// 实现Comparator比较器接口
	public int compare(Object o1,Object o2){		// 重写compare方法，注意，不是compareTo;
		System.out.println("啥时候进来的？");
		Doctor d1 = (Doctor)o1;
		Doctor d2 = (Doctor)o2;
		if (d1.getAge()>d2.getAge())
			return 1;
		if(d1.getAge()==d2.getAge())				// 这里为什么不写else if：因为上面有return，如果走进上面的if，完了之后就直接退出了，不怕它会继续走进这个if；
			return d1.getName().compareTo(d2.getName());	//	相等的情况，那就其中一个就不会加入集合，因为集合是不重复的；
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