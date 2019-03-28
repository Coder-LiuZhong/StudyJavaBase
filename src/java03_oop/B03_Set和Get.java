package java03_oop;
/*
 * 为什么要有set、get方法？
 *     当Person对象被建立之后，因为age是int型的，所以给他-20也不会报错，但是跟我们实际要它作为年龄来的话就不太合适;
 *	        这属于有安全隐患，age直接被访问造成的，为了避免这些属性被外界随意修改，必须私有化private；
 *	        私有变量，只能被类中有效，在其他类中建立对象也访问不到；
 *
 *	        按照规范，每个成员变量都会对应set、get方法；
 *	    （在set方法中我们就可以对-20这种情况进行判断,规范和限制外界的操作）
*/

public class B03_Set和Get {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "liuzhong";		//	age是private的，只能自己类里面使用，不能如此调用；
		p.setAge(157);
		p.speak();
	}	
}

class Person{
	private int age ;				// 在类里面的就是成员变量，成员变量跟着对象存在和消失；
	String name ;					// 实际开发中，描叙类，成员变量一般都要私有化private；
	
	void setAge(int a){				// 通过get、set方法来规范访问成员变量；				
		if(a>0 && a<150)							
			age = a;
	}
	
	int getAge(){
		return age;
	}
	
	void speak(){					//	方法也可以私有化，因为很多方法是实现一个方法而存在的，只需要提供那个方法的实现就行；
		System.out.println(name + "," + age + "岁");
	}
}