package java03_oop;

/*
 * ��������е�����class�ļ����������ⲿ���������$����
 * 
 * ��Ա�ڲ���;
 * 		�����Ա��������Ա������һ��λ�ã�	�͵����Ǳ����ͷ���һ�����Դ�
 * 		���ɣ������������
 * */
public class H01_��Ա�ڲ��� {

	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();				// 1. �����ڲ��ࣺ���������д�����Ա�ڲ�������ȵô����ⲿ�����
		i.function();						
		
		Outer.InnerStatic is = new Outer.InnerStatic();
		is.function();
		
		Outer.InnerStatic.functionStatic();			
	}

}

class Outer{
	private int num = 10;
	
	public void method(){
		Inner i = new Inner();              				  // 2. �����ڲ��ࣺ�ⲿ��ķ����д�������ֱ��new
		i.function();
		
		InnerPrivate ip = new InnerPrivate();
		ip.functionPrivate();
	}
	
	class Inner{
		public void function(){
			System.out.println(num);   // ����ֱ�ӷ����ⲿ��ĳ�Ա������˽�г�Ա��
		}
	}
	
	private class InnerPrivate{					
		public void functionPrivate(){
			System.out.println("functionPrivate");		
		}
	}
	
	static class InnerStatic{    // static���γ�Ա�ڲ���
		public void function(){
			System.out.println("static");		
		}
		
		public static void functionStatic(){			     
			System.out.println("functionStatic");		
		}
	}
}