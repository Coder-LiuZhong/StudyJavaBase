package java06_collection;

import java.util.HashSet;
import java.util.Iterator;
/*	HashSet��Ҫ�ص��ǲ����ظ���
 * 		����ô�ж�����set��������������Ƿ��ظ��أ�
 * 		���ȣ�ÿ�������涼��̳е�Object�����hashCode()��equals()����������Ҫ�ж����������Ƿ��ظ����͵ø�����������������
 * 		Ȼ��������ÿ����Set����add�����ʱ�򣬶���Ĭ�����ε��ö����hashCode()��equals()�����������ж��Ƿ��Set����Ķ����ظ���
 * 		Ȼ���أ���ͬ�Ķ������������������԰����Լ��ı�׼����������д
 * 		hashCode()��Ҫ��Ϊ�˷��ض���Ĺ�ϣ�룬��д������¶����˷��صĹ�ϣ������ݱ�׼�������ͬ���ǲ��ظ�����ͬ���ٵ���equals()
 * 		equals()��Ϊ���ж����������Ƿ���ͬ�������ͬ���Ǿ���ͬһ����ϣ���ϴ�����������ͬ�Ķ��������ͬ�Ǿ��ǲ��ظ�������add�����ϣ�
 * 		
 * 
 * 		ÿ��add��set�����һ�����󣬾ͻ�Ĭ�ϵ���һ����������hashCode()�����صĶ���������д���壬�����ͬ�ͱ������ظ���
 * 		�����ͬ���Ǿ��ٵ���equals()�����صĶ���Ҳ������д�����Ƿ�����������ͬ����ƣ�
		
	Object����
		hashcode()����ĳ�������hashcode���룬��ͬ�Ķ�����벻һ����equals()�ж����������Ƿ���ָ��ͬһ�������ж��Ƿ�ͬһ�����󣩣�
	��HashSet��
		��ΪҪ�в����ظ��ԣ��������Ҫ���ã���ȶ�����������ȵĹ�ϣ�룬��������ǲ��ܸĵģ�
		Ϊ���÷ֱ�new���ģ����Ƕ������������ͬ���������󣨷ֱ�new���� Boy("hszhangsan",21)���������ظ��ģ��Ǿ͵���д��������������
		
 */
public class C01_HashSet {
	public static void main(String[] args) {
	/*----------------------------
	 * 		HashSet �ַ����󣬿���ֱ�ӿ������Ƿ�һ���ж��ظ���
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
		HashSet hs = new HashSet();
		hs.add("hashset..1");
		hs.add("hashset..2");
		hs.add("hashset..1");							//	�ظ����ϣ���ʵֻ��������Ԫ�أ�

		Iterator itH = hs.iterator();
		while (itH.hasNext()) {
			System.out.println(itH.next());
		}		
	/*----------------------------
	 * 		HashSet һ�������ʾ�ظ�Ԫ�صײ�ԭ��
	 *---------------------------------------------------------------------------------------------------------------------------------------------- */
		HashSet hs2 = new HashSet();
		hs2.add(new Boy("hszhangsan",21));			//	add֮��ͻ����Boy��hashCode()���ظö���Ĺ�ϣ��ֵ��
		hs2.add(new Boy("hslisi",31));				//	add��Ҳ����hashCode()��������صĶ������ϱߵĲ�һ������ô���Ϳ����ڼ�����ռ��һ��λ�ã�
		hs2.add(new Boy("hszhangsan",21));			//	�����һ����ʵ���������󣬹�ϣֵ��ʵ��һ������ϣֵ�Ǹ��ݵ�ַ���γɵģ���
													//	�������ǿ�����дhashCode����ֵ��ϵͳ��Ϊ������һ���ģ��ٵ���equals���ж������Ƿ���ͬһ��������true���ǾͲ��������뼯�ϣ�
		Iterator itH2 = hs2.iterator();
		while (itH2.hasNext()) {
			System.out.println(itH2.next());		//	��ΪtoString()����д�ˣ������ӡ����ϣֵ
		}
	}
}

class Boy{
	private String name ;
	private int age ;
	Boy(String n,int a){
		this.name = n;
		this.age = a;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	
	public String toString(){					//Object��toString()���ص��Ƕ�����+@+�˶����ϣ����޷���ʮ�����ƣ�
		return "name:"+name+",age:"+age;		//������ʵ����дobject��toString(),Boy����ʹ˿���ֱ�Ӵ�ӡ��
	}											//����print��ʱ��ͻ��Զ�����toString();
	
	public int hashCode(){											//	Object���hashCode()���ص��Ǹö���Ĺ�ϣ��ֵ
		System.out.println(this.name + "------------hashCode()");	//	��������ɶʱ����ô˷�����(ÿaddһ�ξ͵��ã����ع�ϣֵ��Ȼ������и�����ϣֵ��ͬ�Ķ�����ôHashSet�͵���equals���еڶ����ж�)
		return name.hashCode()+age;									//	������дhashCode()����������ͬBoy����hashcode���صĶ���һ��;
	}
	
	public boolean equals(Object obj){								//	���Ҳ����дObject�ķ�������ĳ������Ƚ��Ƿ���ȣ�
		System.out.println(this.name + "-----------equals()");
		Boy p = (Boy)obj;											//	����������ǿתΪBoy
		return this.name.equals(p.name) && this.age == p.age;		//	��������������hashCode()�󷵻صĶ�����һ������ô�ڼ����������������ͬ�ĵ�ַ�����Ǵ�ţ�
																	//	���һ������ô�ͻ�Ƚ�equals�������ͬ���ǵڶ����Ͳ��ý����ϣ���һ���и���ַ������
																	//	�����ͬ���ǾͶ�����ͬһ����ֵַ��λ�ã�ֻ����Щ��ͬ��ϣֵ�Ķ���������ͬһ��λ�����У�
	}
}