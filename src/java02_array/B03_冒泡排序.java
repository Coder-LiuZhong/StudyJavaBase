package java02_array;

/* ����ð������ķ�����	
 		��һλ�͵ڶ�λ�ȣ���(С)�ͻ���λ�ӣ��ڶ�λ�ٺ͵���λ�ȣ���(С)����λ�ã����Σ������ֵ��������߽Ǳꣻ
 		Ȼ�󣬵ڶ���ѭ������Ȼ�ǵ�һλ�͵ڶ�λ��```���һλ�Ͳ���Ҫ�μӱȽ��ˣ������Σ������λ������Ҫ�μ��ˣ�
 		��������Ԫ�ؽ��бȽϣ���ѭ������һ�Σ���ֵ���������Ǳ�λ��
 		
 	import java.util.*;		Arrays.sort(arr);	ֱ�Ӿ���ð�������ˣ�java�����Դ����ˣ���������д��Щ����ֻ��Ϊ��ѧϰ��Щ�㷨��Ӧ�����ԣ�
 */
public class B03_ð������ {

	public static void main(String[] args) {
		int[] y = new int[] { 0, 8, 4, 3 };
		print(y);
		bubbleSort(y);
		print(y);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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
