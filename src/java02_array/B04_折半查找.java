package java02_array;
/*
 * 一般查找 
 * 		一般我们查找数组中某一个数据的位置的方法 遍历数组，找到那个数的角标；
 * 
 * 折半查找： 
 * 		也叫二分查找，必须有序；
 * 		这比上面提高了效率； 折半，首先数组应该是有序的数组；以从小到大排列的数组为例；
 * 		先找到数组中最中间角标mid上的值，跟要查找的值比较，如果大些，那么要查找的值肯定在中间值的左边，反之肯定在右边；
 * 		然后，再从中间值左边(或者右边)这些数据中查找；依旧用折半的方法查，找到这些值的中间值````
 */
public class B04_折半查找 {

	public static void main(String[] args) {
		int[] arr = {5,8,9,10,17};
		System.out.println(getIndex(arr,4));     // 一般查找
		System.out.println(helfSearch(arr,10));  // 折半查找
	}

	public static int getIndex(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;		 // 如果arr中没有找到4这个元素，那么总得有个返回值啊，-1不是数组的角标，所以可以返回，不冲突；
	}

	public static int helfSearch(int[] arr, int key) { // 如果这里传进来的key很大，100，那mid+-100那就越界max或者min了
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
