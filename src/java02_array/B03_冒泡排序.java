package java02_array;

/* 数组冒泡排序的方法；	
 		第一位和第二位比，大(小)就互换位子；第二位再和第三位比，大(小)互换位置；依次；最后，最值出现在最高角标；
 		然后，第二次循环，依然是第一位和第二位比```最后一位就不需要参加比较了；第三次，最后两位都不需要参加了；
 		相邻两个元素进行比较，内循环结束一次，最值出现在最后角标位；
 		
 	import java.util.*;		Arrays.sort(arr);	直接就是冒泡排序了，java里面自带有了，我们下面写那些方法只是为了学习这些算法和应对面试；
 */
public class B03_冒泡排序 {

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
	
	//	数组的遍历显示方法
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
