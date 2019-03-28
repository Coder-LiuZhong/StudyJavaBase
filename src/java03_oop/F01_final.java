package java03_oop;
/*	final
 * 		内部类只能访问被final修饰的局部变量；
 *		
 *		final修饰类，不能被继承
 *		final修饰方法，不能被覆写
 *		final修饰变量，只能赋值一次，是一个常量，常量名称所有字母大写；
 *		内部类在局部时，只可以访问被final修饰的局部变量
 */
public class F01_final {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		System.out.println(s.X);
		SubClass s1 = new SubClass(5);		
		System.out.println(s1.X);		
		s1.show();							//	父类有方法，子类就算没有重写，也可以直接调用；
	}
}
class SupClass{								//	final修饰类，不能被继承
	final void show(){						//	final修饰方法，不能被覆写
		System.out.println("p");
	};		
}

class SubClass extends SupClass{
	final int X;	 						//	final修饰变量，只能赋值一次；（锁内存，固定变量）,被final修饰的变量大写 
	//static final int y;		
	static final int Y = 10;				//	static的变量在共享区域里面，没有值的话是不能用的，因为没人能给他赋值；有静态就必须有值；
	SubClass(){								//	final int x如果在类中没有被赋值，即初始化，那就可以在构造函数里面给他初始化；
		X = 10;
	}
	SubClass(int x){						//	初始化的时候可以给final的x赋值，赋值完后这个对象的x就不能变了；
		this.X = x;
	}
}