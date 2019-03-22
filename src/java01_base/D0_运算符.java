package java01_base;

/*
* 运算符
* 		算术运算符
* 			+ 	- 	* 	除 	%取余  	++    --
* 
* 		比较运算符：		
* 			==、!=、<、>、<=、>=、instanceof(检查是否是类的对象)	
* 			运算结果都是Boolean型	4==3(false)
* 
* 		逻辑运算符：		
* 			&与、|或、!非、^异或、&&短路与、||短路或；
* 			异或：两边一样为假，不一样为真
* 			短路：如果x为2，x>3&&x<6，左边已经是假了，x<6就不用管是否真假了，这样效率些；
* 				  java不这么表示3<x<6， 用逻辑运算符x>3 & x<6；
* 
* 		位运算符：		
* 			其实就是二进制运算；	左移<<	右移>>	无符号右移>>>	
* 			例子：3>>1:	
* 				十进制转二进制：十进制除以2除以2除以2……	每次除以2的时候如果能整除则是0，不能则是1，从右到左按顺序排好得到二进制数；
* 				3右移一位，3是int类型，4个八位，00000000 00000000 00000000 00000011；右移一位，最右边那位的1消失，最左边加个0；
* 			如果是两个的>>,看这二进制的最高位是啥，是0就加0，是1就加1,最高位是1一般都是负数嘛，所以移动后就加啥子。
* 			而无符号右移>>>,就是为了解决这个的，无论最高位是啥，就是说无论正负，都不管，都是加0.
* 
* 			左移3位相当于乘以2的3次方，右移3位相当于除以2的3次方
* 
* 			&和^ 也是位运算。如6^3=?	6的二进制110,3的二进制位011，然后上下排好，每个位子对应好，1代表真，0代表假，进行异或运算，得到101，就是5
*/

public class D0_运算符 {
	public static void main(String[] args) {
		// 运送符
		boolean bl2 = true;
		System.out.println("异或：" + (bl2 ^ bl2));		//	(false)		异或^：	两边一样为假，不一样为真
		System.out.println("取模：" + (8 % 3));			//	(2)
		int a1 = 5;
		int a2 = 5;
		System.out.println("++a1:" + (++a1));			//	++i		先自增再运算；	(6)	
		System.out.println("a2++:" + (a2++));			//	i++		先运算再自增；	(5)
	}
}
