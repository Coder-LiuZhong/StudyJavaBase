package java03_oop;

/*		������������������	��̬
 * 			ĳһ������Ķ��ִ�����̬������������ˡ�Ů�ˣ�
 * 
 * 		���ã�	��̬�Ĵ�������˳������չ�Ժͺ��ڿ�ά���ԣ�
 * 
 * 		��̬ʱ��
 * 			����ָ���������ʱ�����ڳ�Ա������
 * 				����ʱ�ڣ�	����ʱ�������������ͱ��������������Ƿ��б����õķ�����
 * 				����ʱ�ڣ�	����ʱ�������Ƕ��������������Ƿ��б����õķ�����
 * 			��һ�仰�����ں��������뿴��ߣ����п��ұߣ�
 * 	
 * 		�����е����֣�	��������ָ���Լ���������󣬻��ߣ��������ý����Լ����������(����)��
 * 		ǰ�᣺		������֮���й�ϵ��	ͨ���и��ǲ�����
 * 		�����ԣ�		������ʹ�����������еķ�����
 * 		��̬�ĳ�����ǿ�˳������չ�ԣ�
 * 
 * 		instanceof:		�����ж϶����Ƿ�������ָ������߽ӿڣ�
 * */		
public class D08_��̬ {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.run();
		c.shout();
		c.catchMouse();

		Animal a = new Cat();						//	��������ָ���Լ����������èҲ�Ƕ������è��������̬��
		a.run();
		//a.catchMouse();							//	�����ʱ�򣬶���ûnew��������û��cat��������ᱨ����Ϊ��ֻ����a����û��catchMouse������
		//Cat c = (Cat)a; c.catchMouse()			//	�����Ϳ���~
		
		show(new Dog());		
/*------------------------------------------------------------------------------------------------------------------------------*/
		Man m = new Man();
		m.chiFan();									//	���˶���Է���
		Woman w = new Woman();
		w.chiFan();		
		
		ChiFan cf = new ChiFan();					//	�򻯴��룻������򵥻�����Ȼ���඼Ҫȥ�Է������ö�̬��ͳһָ�ӳԷ��Ķ�����
		cf.kaiChi(m);									
		cf.kaiChi(w);
	}
/*------------------------------------------------------------------------------------------------------------------------------*/
	
	public static void show(Animal a){				//	�������ý����Լ����������
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
		System.out.println("����");
	}
}
class Woman extends Person3{
	void chiFan(){
		System.out.println("ţ��");
	}
}
class ChiFan{							//	��Ȼ���гԷ��ķ������Ǿͳ�ȡ��Ϊһ���������ö�̬�򻯴��룻����Ҫÿ���������Ҫnewһ��
	void kaiChi(Person3 p){
		p.chiFan();
	}
}
/*------------------------------------------------------------------------------------------------------------------------------*/
