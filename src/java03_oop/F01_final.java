package java03_oop;
/*	final
 * 		�ڲ���ֻ�ܷ��ʱ�final���εľֲ�������
 *		
 *		final�����࣬���ܱ��̳�
 *		final���η��������ܱ���д
 *		final���α�����ֻ�ܸ�ֵһ�Σ���һ����������������������ĸ��д��
 *		�ڲ����ھֲ�ʱ��ֻ���Է��ʱ�final���εľֲ�����
 */
public class F01_final {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		System.out.println(s.X);
		SubClass s1 = new SubClass(5);		
		System.out.println(s1.X);		
		s1.show();							//	�����з������������û����д��Ҳ����ֱ�ӵ��ã�
	}
}
class SupClass{								//	final�����࣬���ܱ��̳�
	final void show(){						//	final���η��������ܱ���д
		System.out.println("p");
	};		
}

class SubClass extends SupClass{
	final int X;	 						//	final���α�����ֻ�ܸ�ֵһ�Σ������ڴ棬�̶�������,��final���εı�����д 
	//static final int y;		
	static final int Y = 10;				//	static�ı����ڹ����������棬û��ֵ�Ļ��ǲ����õģ���Ϊû���ܸ�����ֵ���о�̬�ͱ�����ֵ��
	SubClass(){								//	final int x���������û�б���ֵ������ʼ�����ǾͿ����ڹ��캯�����������ʼ����
		X = 10;
	}
	SubClass(int x){						//	��ʼ����ʱ����Ը�final��x��ֵ����ֵ�����������x�Ͳ��ܱ��ˣ�
		this.X = x;
	}
}