package java03_oop;
/*	构造函数
 *	1.	和类名相同；
 *	2.	无返回值和return；
 *	3.	唯一作用：给对象的属性什么的进行初始化;
 *	4.	类中没写构造函数，也会有一个默认的无参数的无内容的构造函数Person(){};
 *		当类中有自定义构造函数(函数名一样，参数不一样)，则自带的默认的隐式的就没有了；
 *		上面是说隐式，但是你同时写无参数和有参数的构造函数存在，也是可以的；
 *	5.	对象一建立就会调用与之对应的构造函数；
 *	6.	类有public，默认构造函数也会有public(小知识)
 *
 *	何时用构造函数
 *		分析事物时，该事物的实体，是否出现时就具有一些默认的属性值和行为；
 *
 *	与一般函数；
 *		一般方法是被对象调用的;
 *		和构造方法的区别是，这个可以多次重复调用，构造方法每次调用意义不一样；
 *
 *	内存分析
 *		new对象 == 堆中开辟一个空间；里面有两个变量name，age；		空间的地址0x0100赋给栈内存中的变量p；
 *
 *	this：	1.	哪个对象调用了this所在的函数，this就代表这个对象；
 *			2.	在构造函数里面指向另外一个有参数的构造函数形式this();
 */
public class B02_封装_构造函数_this {
	public static void main(String[] args) {
		Person1 p = new Person1("liuzhong",27);
		Person1 p1 = new Person1("xiong",27); 
		Person1 p2 = new Person1();
		System.out.println(p.compare(p1));
	}
}
/*-----------------------------------------------------------------------------------------------------------------------*/
class Person1 {
	private String name;
	private int age;
	
	Person1() {
		this("noname", 20);			 // this第二种应用：代表构造函数，而不是指对象，因为对象还没出来；这种this只能放到构造函数的第一行；因为初始化动作要先执行；
	}
	
	Person1(String name,int age) {
		this.name = name;			 // 初始化属性		这里的this其实就是指上面新new的对象p，可以不写；
		this.age = age;
		this.show();				 // 行为				一般很少在构造方法里面调用类的方法吧，这里应该只是为了测试打印初始化结果；
	}
	
	public void show() {
		System.out.println("name=" + name + ",age=" + age);
	}
	
	// --定义一个判断是否同龄人的功能--
	public boolean compare(Person1 pp) {
		return this.age == pp.age;
	}
}
