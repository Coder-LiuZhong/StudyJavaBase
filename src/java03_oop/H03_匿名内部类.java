package java03_oop;

/*
 * �����ڲ���
 * 	   Ӧ�ó�����  ���Ƕ����Centre�࣬��ʵֻ��һ�Σ����ǵ����������ݣ���û��Ҫר�Ŷ���һ���ࣻ
 * 				 �������ڲ��� ����
 * 				 ǰ�᣺�ڲ������̳л���ʵ���ⲿ���ӿڣ������Ϳ����������������������ö�̬��ʽ
 * 			        
 * */
public class H03_�����ڲ��� {

	public static void method(Play a){
		a.score();
	}
	
	public static void main(String[] args) {
		method(new Centre());		
		
		method(
			new Play(){
				@Override
				public void score() {
					System.out.println("�����ڲ��ࣺ�з�����÷�");
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
		System.out.println("�з�����÷�");
	}
}
