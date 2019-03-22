package java01_base;
/*
 * 	�����ĵ�(˵����)
 * 		�����ע���γ��ĵ��������Ķ������ṩ����Щ���ܣ�
 * 		Javadoc���߿��Խ����ĵ����������@�������ɰ����ĵ�
 *	
 * 	javadoc -d doc[˵����Ҫ��ŵ�Ŀ¼�����ǵ�ǰĿ¼����Ҫ��ǰĿ¼��] -author[���ߣ�ѡ��] -version(�汾��ѡ��) ArrayTool.java
 *  	javadoc -d doc -liuzhong -1.0 A2_�����ĵ�.java	
 *  	���ɺ󣬵��doc�ļ����µ�java01_base�ļ����µ�A2_�����ĵ�.html���ɣ�
 * 		�����Ҳ��������ĵ����Ĺ������ܱ������ࡣ
 * 		��������Ȩ��������Լ���public��class ArrayToolǰ��;
 * 
 *  MyEclipseֱ��ѡ����Ŀ�Ҽ���������Javadoc�Ϳ�������Ŀ������һ��doc�ĵ�
 * 
 *  ������public
 *  	publicȨ�������ģ����˶����õ���
 *  	javac����class�ļ�֮��ֻҪ����class�߾���ֱ�������涨��ķ�����
 *  	java�����ĵ�����Ϊ�˸���������class�������ͷ�����ʱ���������㣻
 * 		��ʵ������ʱ��ֻҪ��public��������public�࣬���涼�ü����ĵ�ע�ͣ�
 * 
 * 	����API��ʱ���ȿ��ü̳���ϵ�ĸ�����߶���ӿڣ��˽���ϵ�Ļ�������Ӧ�ã�ͨ��ֱ�ӽ���������Ķ��󼴿�ʹ�ø���ϵ��
 * 	������һ�㿴API��ʱ��ֻ�迴��ߵĸ���ķ��������ԾͿ����ˣ�����Ͳ���ˣ�
 * 
 * */

/**
 * 	����һ������������Ĺ�����
 * 	@author liuzhong
 * 	@version v1.1
 */
public class B2_�����ĵ� {
	/**
	 * ��ȡ�����������ֵ�ķ�����
	 * @param arr ����һ���������顣
	 * @return ���ظ���������ֵ
	 * */
	public int getMax(int[] arr){					//	�������������ɵ��ĵ����濴����
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * ��ȡ����������Сֵ�ķ�����
	 * @param arr ����һ���������顣
	 * @return ���ظ��������Сֵ
	 * */
	public int getMin(int[] arr){					//	���Ƕ����ṩ��public���Ͳ������ɣ������ĵ�ע��Ҳû�ã�
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * �������������ַ�����ͨ��','���зָ���
	 * @param arr ����һ���������顣
	 * @return ��������Ԫ�ص��ַ���������ʽ��
	 */
	public String toString(int[] arr){
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length - 1) {
				s += arr[i] + ",";
			}else{
				s += arr[i];
			}
		}
		return s;
	}
}