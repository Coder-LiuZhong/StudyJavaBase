package java02_array;
/*		
 * ��ά���飺	�����е�����(���͸�˾͹���)
 *				�൱�ڼ������Ӽ�����һ��ÿ�����������м���С���ӣ�
 * 				һά���������������ݣ���ά����������������ĵ�ַ��
 * 
 * java.lang.system.arraycopy()
 * 			���鸳ֵ��������һ��������
 */
public class A02_��ά���� {
	public static void main(String[] args) {

		int[][] arr1 = new int[3][2];			//	����arr1������3��һά���飬ÿ��һά����������Ԫ�أ�����
		System.out.println(arr1[1]);			//	arr1�еڶ��������ֵ������Ǹ���ϣֵ��������ĵ�ֵַ��		
		System.out.println(arr1[0].length);		//	arr1�����1��һά����ĳ���Ϊ2
		arr1[1][0] = 87; 						//	�ڶ�����ά��������ĵ�һλ��ֵΪ87��
		
		int[][] arr2 = new int[3][];			//	����arr2������3��һά���飬һά�����������Էֱ��ʼ�������£�
		System.out.println(arr2[0]);			//	null	��ַΪ�գ�
		arr2[0] = new int[3];					//	��ά���������3��һά����ֱ��壻	��һ��һά��������3��Ԫ�أ�
		arr2[1] = new int[1];
		arr2[2] = new int[2];					//	��Ҫ�����ֱ�Ӹ�ֵһ�����֣�����һԪ����ķ�ʽ��ע�������и�new��

		int[] arr;								//	һά����
		arr = new int[5];						//	һά��������治һ��Ŷ����ʽ��������࣬���ǲ�Ҫ�����ˣ�
		arr[0] = 100;

		int[][] arr3 = {{1,2,3},{10},{88,96}};	//	��Ȧ��СȦ˼�룻��ӡ��
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		int[] arr4 = {1,2,3,4,5,6};
		System.arraycopy(arr4, 2, arr, 1, 3);				//java.lang.system.arraycopy():	������arr4�ĽǱ�Ϊ2��Ԫ����ȡ3�����ݷŵ�����arr�Ǳ�Ϊ1��ʼ�ĵط���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arraycopy" + arr[i]);
		}

//		int n,m[];
//		n=m[0];									//	������ⲻ����һά�Ͷ�ά���飻
	}
}
