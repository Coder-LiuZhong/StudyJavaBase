package java03_oop;

/*
 * 匿名内部类
 * 	   应用场景：  我们定义的Centre类，其实只用一次，还是当做参数传递，那没必要专门定义一个类；
 * 				 用匿名内部类 即可
 * 				 前提：内部类必须继承或者实现外部类或接口；这样就可以用它们来当参数，利用多态形式
 * 			        
 * */
public class H03_匿名内部类 {

	public static void method(Play a){
		a.score();
	}
	
	public static void main(String[] args) {
		method(new Centre());		
		
		method(
			new Play(){
				@Override
				public void score() {
					System.out.println("匿名内部类：中锋扣篮得分");
				}
			}
		);
	}
}

interface Play{
	public void score();
}

class Centre implements Play{
	public void score(){
		System.out.println("中锋扣篮得分");
	}
}
