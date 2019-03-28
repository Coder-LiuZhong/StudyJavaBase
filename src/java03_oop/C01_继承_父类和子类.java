package java03_oop;
/*		
 * 	继承提供了代码的重用行，子类不用定义可以直接用父类的属性和方法；
 * 	也可以实现在不修改类的情况下给现存的类添加新特性。
 * 
	总结
		1.	父亲有的儿子都默认有，儿子还会有自己特有的；儿子要调用父亲有的，那就得先初始化（构造函数）父类才能调用；
			父类的方法(属性)，子类没有，直接调用；			
			父类的方法，子类也有，重写后使用自己的；
				子类必须大于或等于父类的权限才能重写覆盖;
				静态只能重写覆盖静态；
		2.	super
			子类构造函数里会有默认super();
		
 * 继承
		继承的出现让类与类之间产生了关系，这就产生了多态；
		只支持单继承，不支持多继承，就是只能继承一个父类；
		不同的类里面有很多重复因素，代码就有重复性，我们把这些相同的部分抽取归为父类；

 * 	子类的实例化过程：
		子类中所有的构造函数(无论有无参数的)的第一行都会默认有一个隐式的super();访问父类中的空参数函数；
		所以当子类new的时候，会先父类的构造方法运行；
		当父类中没有空参数构造函数的时候，子类的构造函数中必须通过super语句或者this语句指定要访问的父类中的构造函数；
	为什么呢？
		因为子类一定都要访问父类中的成员，例如可以直接用父类的方法，所以要先明确父类初始化动作。
		
 * 	super代表父类对象，this代表本类的对象；
		this和super都是初始化的过程；不能同时出现的，都得出现在第一行；
		
	object类是所有类的父类；所以，所有类都有super()；		
*/
public class C01_继承_父类和子类 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "liuzhong";
		s.age = 27;
		s.study();
		s.show();									// 虽然父类有show(),但是自己也有，用自己的；
		
		System.out.println("----------------------------------------------------------------------");
		Worker w = new Worker();						
		w.show();									// 自己没有show()，但是父类有，继承，也可以调用；
	}
}
/*---------------------------------------------------------------------------------------------------------------------------------------------- */
class Person2{
	String name ;														
	int age ;
	
	Person2(){
		System.out.println("----父子类构造方法");
	}
	Person2(int x){
		System.out.println("----f(x)");
	}
	
	public void show(){									//	2. 子类必须大于或等于父类的权限才能覆盖；public>private>protected>无
		System.out.println("----父");
	}
}

class Student extends Person2{
	//String name ;										//  属性也是自动继承父类，父亲有的当然会遗传给你
	//int age ;
	void study(){										//	子类自己的特有方法，父类没有的；
		System.out.println(name + "," + age);
	}
	public void show(){									//	1.	子类和父类有一样的方法，叫覆盖(一般出现在函数上)；返回值不一样就算是自己独有的方法；只是里面内容不一样而已；
		super.show();									//	3.	super,这里调用父类的show方法；
		System.out.println("----子");
	}
}

class Worker extends Person2{
	//String name ;
	//int age ;
	void work(){										//	子类自己的特有方法
		System.out.println(name + "," + age);
	}
	Worker(){
		//super()										//	子类构造方法里面第一行其实有个隐式的super();所以当子类new的时候，会先父类的构造方法运行；
		System.out.println("----子类构造方法");			//	如果父类中没有定义Person()，那这里得指定一个有参数的，如super(6)
	}
	Worker(int x){										//	带参数的构造函数第一行也有个隐式的super();
		//this()										//	如果有this()，还有默认的super()在第一行吗？那this()和super()都必须放在第一行啊，怎么办？
		System.out.println("----z(x)");					//	super()没有了，但是this()对应的那个构造方法里面会有；
	}
}