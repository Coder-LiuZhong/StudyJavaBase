package java03_oop;

/*
 * 编译后还是有单独的class文件；但冠以外部类的类名和$符号
 * 
 * 成员内部类;
 * 		类跟成员变量、成员方法是一个位置；	就当做是变量和方法一样来对待
 * 		看成：人类的心脏类
 * */
public class H01_成员内部类 {

	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();				// 1. 创建内部类：在其他类中创建成员内部类对象，先得创建外部类对象
		i.function();						
		
		Outer.InnerStatic is = new Outer.InnerStatic();
		is.function();
		
		Outer.InnerStatic.functionStatic();			
	}

}

class Outer{
	private int num = 10;
	
	public void method(){
		Inner i = new Inner();              				  // 2. 创建内部类：外部类的方法中创建对象，直接new
		i.function();
		
		InnerPrivate ip = new InnerPrivate();
		ip.functionPrivate();
	}
	
	class Inner{
		public void function(){
			System.out.println(num);   // 可以直接访问外部类的成员；包括私有成员；
		}
	}
	
	private class InnerPrivate{					
		public void functionPrivate(){
			System.out.println("functionPrivate");		
		}
	}
	
	static class InnerStatic{    // static修饰成员内部类
		public void function(){
			System.out.println("static");		
		}
		
		public static void functionStatic(){			     
			System.out.println("functionStatic");		
		}
	}
}