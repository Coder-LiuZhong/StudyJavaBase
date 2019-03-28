package java03_oop;
/*
 * ΪʲôҪ��set��get������
 *     ��Person���󱻽���֮����Ϊage��int�͵ģ����Ը���-20Ҳ���ᱨ�����Ǹ�����ʵ��Ҫ����Ϊ�������Ļ��Ͳ�̫����;
 *	        �������а�ȫ������ageֱ�ӱ�������ɵģ�Ϊ�˱�����Щ���Ա���������޸ģ�����˽�л�private��
 *	        ˽�б�����ֻ�ܱ�������Ч�����������н�������Ҳ���ʲ�����
 *
 *	        ���չ淶��ÿ����Ա���������Ӧset��get������
 *	    ����set���������ǾͿ��Զ�-20������������ж�,�淶���������Ĳ�����
*/

public class B03_Set��Get {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "liuzhong";		//	age��private�ģ�ֻ���Լ�������ʹ�ã�������˵��ã�
		p.setAge(157);
		p.speak();
	}	
}

class Person{
	private int age ;				// ��������ľ��ǳ�Ա��������Ա�������Ŷ�����ں���ʧ��
	String name ;					// ʵ�ʿ����У������࣬��Ա����һ�㶼Ҫ˽�л�private��
	
	void setAge(int a){				// ͨ��get��set�������淶���ʳ�Ա������				
		if(a>0 && a<150)							
			age = a;
	}
	
	int getAge(){
		return age;
	}
	
	void speak(){					//	����Ҳ����˽�л�����Ϊ�ܶ෽����ʵ��һ�����������ڵģ�ֻ��Ҫ�ṩ�Ǹ�������ʵ�־��У�
		System.out.println(name + "," + age + "��");
	}
}