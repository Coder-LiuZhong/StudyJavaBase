package java02_array;
/*
 * �õ������е����ֵ����:
 * 		����һ���м����max�����θ����������Ԫ�رȽϣ�˭������͸�ֵ��max��
 * 
 * ����������ֵ
 *		1.	����һ������,��¼ÿһ�αȽϺ�ϴ���Ǹ�ֵ;
 *		2.	�ñ�������γ�ʼ��?��ʼ��Ϊ�����е�����һ��Ԫ�أ�
 *		3.	ͨ��ѭ��½���������е�Ԫ�غ�����������бȽϣ�
 *		4.	�������������½�����ֵ�Ԫ�رȸñ�������ô�øı�����¼ס�ϴ��ֵ��
 */

public class B01_��ֵ {
	public static void main(String[] args) {
		int[] a = new int[]{ 4, 1, 2, 5, 8 };
		int max = getMax(a);
		System.out.println(max);
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
