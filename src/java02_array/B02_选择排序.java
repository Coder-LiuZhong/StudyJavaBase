package java02_array;
/*
 * ����ѡ������ķ���. 
 * 		��С�ŵ���
 * 		��һλ���θ�����λ�Ƚϣ��������λ�бȵ�һλ�����С�ľͽ���λ�ã�
 * 		Ȼ��ڶ�λ���θ���������```�Ƚϣ�������ѭ���Ǵ�Ȧ��СȦ˼�룩
 * 	       ��ѭ����һ�ν�������ֵ��������ͽǱ�λ��
 */
public class B02_ѡ������ {

	public static void main(String[] args) {
		int[] y = new int[] { 0, 8, 3, 4 };
		print(y);
		sort(y);
		print(y);
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	} 
	
	//	����ı�����ʾ����
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
}
