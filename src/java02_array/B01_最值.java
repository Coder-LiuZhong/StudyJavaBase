package java02_array;
/*
 * 得到数组中的最大值方法:
 * 		设置一个中间变量max，依次跟数组里面的元素比较，谁比它大就赋值给max；
 * 
 * 数组里的最大值
 *		1.	定义一个变量,记录每一次比较后较大的那个值;
 *		2.	该变量改如何初始化?初始化为数据中的任意一个元素；
 *		3.	通过循环陆续让数据中的元素和这个变量进行比较；
 *		4.	限制条件，如果陆续出现的元素比该变量大，那么用改变量记录住较大的值；
 */

public class B01_最值 {
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
