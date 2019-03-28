package java03_oop;
/*
 * 	总之，static修饰的东西就是在作用在类上的，并且优先于对象存在。
 *  类加载的时候(第一次new对象的时候加载)，对象还没产生，但是静态部分已经存在了；
 *  从而静态部分能被所有对象调用，静态的部分只能调用静态的部分；
 * 
 *	static 	
 * 		被static修饰的成员变量和成员方法独立于该类的任何对象。 也就是说，它不依赖类特定的实例，被类的所有实例共享。
 * 		只要这个类被加载，Java虚拟机就能根据类名在运行时数据区的方法区内定找到他们。
 * 		因此，static对象可以在它的任何对象创建之前访问，无需引用任何对象。
 * 
 * 静态代码块、实例代码块
 * 		当Java虚拟机（JVM）加载类时，就会执行静态代码块
 * 		随着类的执行而执行，只执行一次；比主函数还优先执行；
 * 		作用：	给类进行初始化。类要做什么动作可以在静态代码块里面执行；
 * 
 * 		实例代码块，随着对象的建立而执行；
 * 
 * 四大特点：
 * 		随着类的加载而加载；
 * 				当类加载进内存的时候，静态的部分就已经在开辟空间了；
 * 				类消失才消失，被修饰的属性和方法不占用堆内存空间，而是存在于一个"共享的区域"，是对象们共有的区域；
 * 				但是这些变量不像堆中对象的变量，对象消失，变量就会被垃圾回收释放空间;
 *				而static的随着类消失才消失，周期太长，占空间；类什么时候消失？
 * 		优先于对象存在；
 * 				类加载的时候，对象还没产生，但是静态部分已经存在了；
 * 		被所有对象所共享；
 * 				 后面new出来的对象都能直接访问，因为他都先于对象存在了；	类变量：被static修饰的变量
 * 		可以直接被类名调用;
 * 				类名.静态成员	Person.age
 * 
 * 注意事项：
 * 		1、静态方法只能访问静态变量；	因为对象都没有，非静态都还没产生；		非静态方法可以访问静态成员和非静态成员
 *		2. 静态方法中不可以出现this、super；同理，对象都还没出现；
 *
 * 
 * 共享区域：
 * 		静态的变量都放在里面；
 * 		栈里面的自动释放了，堆里的有垃圾回收；
 * 
 * main方法解析
		动态做测试，写了一个类，里面有很多方法，那就在类里面写个main方法，测试这些方法功能是否有问题，没问题就删掉；
 * */

public class E01_static {
	static {									//	静态代码块1，优先于主函数执行，只执行一次;
		System.out.println("----1");			//  作用：给类进行初始化。类要做什么动作可以在静态代码块里面执行;
	}	
	
	{											//	实例代码块，随着对象的建立而执行；
		System.out.println("-----4");
	}
	
	public static void main(String[] args) {	//	相当于 String[] args = new String[0];
		StaticD sd = new StaticD();
		sd.show();
		new E01_static().test();				//	主函数也是static的，所以调用test()得用对象，不能直接调用；	
		
		//System.out.println(args[0]);			//	解析主函数；	这会报错，角标越界，就是说args[]里面根本就没有值；	在cmd中java StaticDemo hehe haha；这样就有值了，输出hehe，中间空格会分开hehe跟haha；
		System.out.println(args.length);
		System.out.println(args);
		
		new StaticCode();						//	调用有静态代码块的类；
		new StaticCode();						//	类加载就会执行静态代码块，第二次new的时候，类已经加载过了，就不会调用了；
		System.out.println("----c");
	}
	
	public void test(){
		System.out.println("----5");						
	}
	
	static {									//	静态代码块2，优先于主函数执行
		System.out.println("----2");
	}	
}

class StaticD {
	static String guoji = "cn--3";				//	如果所有对象共享一个值(国籍)，就不需要每一次new都新建一个x空间，直接给个static；它不在堆中，在外面一个共享区域里面；
	String name ;								//	随着类消失才消失，生存周期太长，浪费空间了，不加static的对象消失就被垃圾回收了；
	
	static void show(){							//	类加载的时候，对象还没产生，但是静态部分已经存在了；所以静态部分能被所有对象调用，静态的部分只能调用静态的部分；
		System.out.println(guoji);
		//System.out.println(name);
	}
}

class StaticCode{
	static {									//	随着类的执行而执行，只执行一次；
		System.out.println("----a");
	}	
}



