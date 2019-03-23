package java02_array;
/*
 * һ����� 
 * 		һ�����ǲ���������ĳһ�����ݵ�λ�õķ��� �������飬�ҵ��Ǹ����ĽǱꣻ
 * 
 * �۰���ң� 
 * 		Ҳ�ж��ֲ��ң���������
 * 		������������Ч�ʣ� �۰룬��������Ӧ������������飻�Դ�С�������е�����Ϊ����
 * 		���ҵ����������м�Ǳ�mid�ϵ�ֵ����Ҫ���ҵ�ֵ�Ƚϣ������Щ����ôҪ���ҵ�ֵ�϶����м�ֵ����ߣ���֮�϶����ұߣ�
 * 		Ȼ���ٴ��м�ֵ���(�����ұ�)��Щ�����в��ң��������۰�ķ����飬�ҵ���Щֵ���м�ֵ````
 */
public class B04_�۰���� {

	public static void main(String[] args) {
		int[] arr = {5,8,9,10,17};
		System.out.println(getIndex(arr,4));     // һ�����
		System.out.println(helfSearch(arr,10));  // �۰����
	}

	public static int getIndex(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;		 // ���arr��û���ҵ�4���Ԫ�أ���ô�ܵ��и�����ֵ����-1��������ĽǱ꣬���Կ��Է��أ�����ͻ��
	}

	public static int helfSearch(int[] arr, int key) { // ������ﴫ������key�ܴ�100����mid+-100�Ǿ�Խ��max����min��
		int min = 0;
		int max = arr.length - 1;
		int mid;
		while (min <= max) {
			mid = (min + max) / 2;
			if (key < arr[mid]) {
				max = mid - 1;
			} else if (key > arr[mid]) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
