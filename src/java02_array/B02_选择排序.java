package java02_array;
/*
 * 数组选择排序的方法. 
 * 		从小排到大
 * 		第一位依次跟其他位比较，如果其他位有比第一位大或者小的就交换位置；
 * 		然后第二位依次跟第三、四```比较；（这里循环是大圈套小圈思想）
 * 	       内循环第一次结束，最值出现在最低角标位；
 */
public class B02_选择排序 {

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
	
	//	数组的遍历显示方法
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
}
