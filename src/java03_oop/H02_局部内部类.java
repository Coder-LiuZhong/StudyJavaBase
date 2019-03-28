package java03_oop;

/*
 * 局部内部类;
 * 		在方法内(局部)，出了方法就不能使用了；		使用的场景比较少，了解即可；一般内部类都是在类成员位置
 * */
public class H02_局部内部类 {
	
	public static void main(String[] args){
		Outer2 o = new Outer2();
		o.method();
	}

}

class Outer2{
	public void method(){
		int num = 10;
		
		class Inner{						// 这里就不能被private等修饰了，因为它是在局部不是在成员，所以不能被成员修饰符修饰；
			public void function(){
				System.out.println(num);
			}
		}
		
		Inner i = new Inner();				// 注意顺序
		i.function();
	}
	
	public void test(){
		// Inner i = new Inner();			// 调用不到
		// System.out.println(num);
	}
	
	
}
