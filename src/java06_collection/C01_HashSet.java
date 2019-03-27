package java06_collection;

import java.util.HashSet;
import java.util.Iterator;
/*	HashSet主要特点是不能重复；
 * 		那怎么判断两个set里面的两个对象是否重复呢？
 * 		首先，每个类里面都会继承到Object里面的hashCode()、equals()两个方法；要判断两个对象是否重复，就得根据这两个方法来；
 * 		然后，在我们每次往Set里面add对象的时候，都会默认依次调用对象的hashCode()、equals()两个方法来判断是否跟Set里面的东东重复；
 * 		然后呢，不同的对象这两个方法都可以按照自己的标准和需求来重写
 * 		hashCode()主要是为了返回对象的哈希码，重写后就重新定义了返回的哈希码的内容标准，如果不同就是不重复，相同就再调用equals()
 * 		equals()是为了判断两个对象是否相同；如果相同，那就在同一个哈希码上存在了两个不同的对象；如果不同那就是不重复，可以add进集合；
 * 		
 * 
 * 		每次add往set里面加一个对象，就会默认调用一下这个对象的hashCode()，返回的东东可以重写定义，如果不同就表明不重复；
 * 		如果相同，那就再调用equals()，返回的东东也可以重写，看是否满足我们相同的设计；
		
	Object类中
		hashcode()返回某个对象的hashcode编码，不同的对象编码不一样；equals()判断两个变量是否是指向同一个对象（判断是否同一个对象）；
	在HashSet中
		因为要有不可重复性，首先你得要晓得，相等对象必须具有相等的哈希码，这个规则是不能改的；
		为了让分别new出的，但是对象内容组成相同的两个对象（分别new两个 Boy("hszhangsan",21)）看成是重复的，那就得重写上面两个方法；
		
 */
public class C01_HashSet {
	public static void main(String[] args) {
	/*----------------------------
	 * 		HashSet 字符对象，可以直接看字面是否一样判断重复性
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
		HashSet hs = new HashSet();
		hs.add("hashset..1");
		hs.add("hashset..2");
		hs.add("hashset..1");							//	重复了呦；其实只加了两个元素；

		Iterator itH = hs.iterator();
		while (itH.hasNext()) {
			System.out.println(itH.next());
		}		
	/*----------------------------
	 * 		HashSet 一般对象；演示重复元素底层原理；
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
		HashSet hs2 = new HashSet();
		hs2.add(new Boy("hszhangsan",21));			//	add之后就会调用Boy的hashCode()返回该对象的哈希码值；
		hs2.add(new Boy("hslisi",31));				//	add后也调用hashCode()，如果返回的东东跟上边的不一样，那么它就可以在集合中占据一个位置；
		hs2.add(new Boy("hszhangsan",21));			//	这跟第一个其实是两个对象，哈希值其实不一样（哈希值是根据地址来形成的）；
													//	但是我们可以重写hashCode返回值让系统认为他们是一样的；再调用equals来判断他们是否是同一个，返回true，那就不让它进入集合；
		Iterator itH2 = hs2.iterator();
		while (itH2.hasNext()) {
			System.out.println(itH2.next());		//	因为toString()被重写了，不会打印出哈希值
		}
	}
}

class Boy{
	private String name ;
	private int age ;
	Boy(String n,int a){
		this.name = n;
		this.age = a;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	
	public String toString(){					//Object的toString()返回的是对象名+@+此对象哈希码的无符号十六进制；
		return "name:"+name+",age:"+age;		//这里其实是重写object的toString(),Boy对象就此可以直接打印；
	}											//碰到print的时候就会自动调用toString();
	
	public int hashCode(){											//	Object类的hashCode()返回的是该对象的哈希码值
		System.out.println(this.name + "------------hashCode()");	//	用来测试啥时候调用此方法；(每add一次就调用，返回哈希值，然后如果有跟它哈希值相同的对象，那么HashSet就调用equals进行第二次判断)
		return name.hashCode()+age;									//	这里重写hashCode()，让名字相同Boy对象hashcode返回的东东一样;
	}
	
	public boolean equals(Object obj){								//	这个也是重写Object的方法；与某个对象比较是否相等；
		System.out.println(this.name + "-----------equals()");
		Boy p = (Boy)obj;											//	传进来的先强转为Boy
		return this.name.equals(p.name) && this.age == p.age;		//	如果两个对象调用hashCode()后返回的东东不一样，那么在集合里面会有两个不同的地址给他们存放；
																	//	如果一样，那么就会比较equals，如果相同，那第二个就不让进集合，第一个有个地址给他；
																	//	如果不同，那就都放在同一个地址值的位置，只是这些相同哈希值的对象依次在同一个位置排列；
	}
}