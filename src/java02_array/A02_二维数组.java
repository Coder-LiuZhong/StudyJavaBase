package java02_array;
/*		
 * 二维数组：	数组中的数组(理解透了就够了)
 *				相当于几个箱子集合在一起，每个箱子里面有几个小格子；
 * 				一维数组里面存的是数据，二维数组里面存的是数组的地址；
 * 
 * java.lang.system.arraycopy()
 * 			数组赋值赋予另外一个数组里
 */
public class A02_二维数组 {
	public static void main(String[] args) {

		int[][] arr1 = new int[3][2];			//	定义arr1里面有3个一维数组，每个一维数组有两个元素；矩形
		System.out.println(arr1[1]);			//	arr1中第二个数组的值；结果是个哈希值，是数组的地址值；		
		System.out.println(arr1[0].length);		//	arr1里面第1个一维数组的长度为2
		arr1[1][0] = 87; 						//	第二个二维数组里面的第一位赋值为87；
		
		int[][] arr2 = new int[3][];			//	定义arr2里面有3个一维数组，一维数组的情况可以分别初始化，如下；
		System.out.println(arr2[0]);			//	null	地址为空；
		arr2[0] = new int[3];					//	二维数组里面的3个一维数组分别定义；	第一个一维数组里有3个元素；
		arr2[1] = new int[1];
		arr2[2] = new int[2];					//	不要搞混了直接赋值一个数字，那是一元数组的方式，注意这里有个new；

		int[] arr;								//	一维数组
		arr = new int[5];						//	一维数组跟上面不一样哦，格式看起来差不多，但是不要混淆了；
		arr[0] = 100;

		int[][] arr3 = {{1,2,3},{10},{88,96}};	//	大圈套小圈思想；打印出
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		int[] arr4 = {1,2,3,4,5,6};
		System.arraycopy(arr4, 2, arr, 1, 3);				//java.lang.system.arraycopy():	从数组arr4的角标为2的元素起取3个数据放到数组arr角标为1开始的地方；
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arraycopy" + arr[i]);
		}

//		int n,m[];
//		n=m[0];									//	帮助理解不混淆一维和二维数组；
	}
}
