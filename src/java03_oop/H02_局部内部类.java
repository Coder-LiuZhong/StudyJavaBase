package java03_oop;

/*
 * �ֲ��ڲ���;
 * 		�ڷ�����(�ֲ�)�����˷����Ͳ���ʹ���ˣ�		ʹ�õĳ����Ƚ��٣��˽⼴�ɣ�һ���ڲ��඼�������Աλ��
 * */
public class H02_�ֲ��ڲ��� {
	
	public static void main(String[] args){
		Outer2 o = new Outer2();
		o.method();
	}

}

class Outer2{
	public void method(){
		int num = 10;
		
		class Inner{						// ����Ͳ��ܱ�private�������ˣ���Ϊ�����ھֲ������ڳ�Ա�����Բ��ܱ���Ա���η����Σ�
			public void function(){
				System.out.println(num);
			}
		}
		
		Inner i = new Inner();				// ע��˳��
		i.function();
	}
	
	public void test(){
		// Inner i = new Inner();			// ���ò���
		// System.out.println(num);
	}
	
	
}
