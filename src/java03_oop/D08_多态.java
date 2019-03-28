package java03_oop;

/*		面向对象第三个特征：	多态
 * 			某一类事务的多种存在形态，入人类分男人、女人；
 * 
 * 		作用：	多态的存在提高了程序的扩展性和后期可维护性；
 * 
 * 		多态时：
 * 			父类指向子类对象时，对于成员方法：
 * 				编译时期：	编译时，看的是引用型变量所属的类中是否有被调用的方法。
 * 				运行时期：	运行时，看的是对象所属的类中是否有被调用的方法；
 * 			简单一句话：对于函数，编译看左边，运行看右边；
 * 	
 * 		程序中的体现：	父类引用指向自己的子类对象，或者，父类引用接收自己的子类对象(参数)；
 * 		前提：		类与类之间有关系；	通常有覆盖操作；
 * 		局限性：		不可以使用子类中特有的方法；
 * 		多态的出现增强了程序的扩展性；
 * 
 * 		instanceof:		用于判断对象是否所属于指定类或者接口；
 * */		
public class D08_多态 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.run();
		c.shout();
		c.catchMouse();

		Animal a = new Cat();						//	父类引用指向自己的子类对象；猫也是动物类嘛；猫的两种形态；
		a.run();
		//a.catchMouse();							//	编译的时候，对象还没new出来，还没有cat所以这里会报错；因为它只晓得a里面没有catchMouse方法；
		//Cat c = (Cat)a; c.catchMouse()			//	这样就可以~
		
		show(new Dog());		
/*------------------------------------------------------------------------------------------------------------------------------*/
		Man m = new Man();
		m.chiFan();									//	男人对象吃饭；
		Woman w = new Woman();
		w.chiFan();		
		
		ChiFan cf = new ChiFan();					//	简化代码；将事情简单化；既然人类都要去吃饭，就用多态，统一指挥吃饭的动作；
		cf.kaiChi(m);									
		cf.kaiChi(w);
	}
/*------------------------------------------------------------------------------------------------------------------------------*/
	
	public static void show(Animal a){				//	父类引用接收自己的子类对象
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.run();
			c.shout();
			c.catchMouse();
		}else if(a instanceof Dog){
			Dog d = (Dog)a;
			d.run();
			d.shout();
			d.yaoRen();
		}else{
			a.run();
			a.shout();
		}
		a.run();
		a.shout();
	}
}
/*------------------------------------------------------------------------------------------------------------------------------*/
class Animal{
	void run(){
		System.out.println("animal run");
	}
	void shout(){
		System.out.println("animal shout");
	}
}
class Cat extends Animal{
	void run(){
		System.out.println("cat run");
	}
	void shout(){
		System.out.println("cat shout");
	}
	void catchMouse(){
		System.out.println("catchMouse");
	}
}
class Dog extends Animal{
	void run(){
		System.out.println("Dog run");
	}
	void shout(){
		System.out.println("Dog shout");
	}
	void yaoRen(){
		System.out.println("yaoRen");
	}
}
/*------------------------------------------------------------------------------------------------------------------------------*/
class Person3{
	void chiFan(){
		System.out.println("chiFan");
	}
}
class Man extends Person3{
	void chiFan(){
		System.out.println("豆浆");
	}
}
class Woman extends Person3{
	void chiFan(){
		System.out.println("牛奶");
	}
}
class ChiFan{							//	既然都有吃饭的方法，那就抽取成为一个对象，利用多态简化代码；不需要每个子类对象都要new一次
	void kaiChi(Person3 p){
		p.chiFan();
	}
}
/*------------------------------------------------------------------------------------------------------------------------------*/
