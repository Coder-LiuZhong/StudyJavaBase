package java03_oop;
/* 
 * 封装：	隐藏实现细节；提高安全性（隐藏对象的属性来保护对象内部的状态，别人也不知道你的方法如何实现）；
 * 			提高了代码的可用性和可维护性，禁止了对象之间不良交互提高了模块化；	
 * 			函数是最小的一个封装体
 * 			以后我们开发需要什么功能，直接去网上找了下载相关代码就行了，节省时间；这也是封装性的好处；
 * 
 * 定义一个函数，先要设计想好要实现的功能
 * 
 * 		如何定义一个功能，并通过函数体现出来：
 *  		1. 返回值：	明确该功能运算后的结果，即确定函数的返回值类型； 
 *  		2. 参数：  	明确在实现该功能的过程中是否有未知内容参与运算，即确定参数的个数和类型；
 *  
 *  	定义函数需要注意的問題
 *  		1.	函数内，代码不要过多；
 *  		2.	尽量将功能都分别用函数进行封装；
 *  		3.	定义函数只负责功能实现。就是不要定义过多的功能，多余的；
 *
 *		写一个函数之前，先要想好思路，在注释或者草稿上面先写好思路在去敲代码；
 *  	反正函数就是在完成一个个的功能；想好这个功能的结构；
 *  
 *  
 *  函数重载： 	同一个类里面，可以函数名字一样，参数列表不一样；
 * 				和返回类型没关系，否则系统不知道接受哪一个类型；
 * 				好处：	函数功能一致，名字可以不用改变；
 */
public class B01_封装_函数和重载 {
	
	public static void main(String[] args) {		// 主函数，程序入口，调用其他函数
		int x = getSum(4, 7);
		System.out.println("x=" + x);
	}

	// 函数是一个功能，传入参数返回结果，完成一个功能；
	public static int getSum(int x, int y) { 		// int是函数返回类型
		return x + y; 								// 每个函数都有return；返回类型是void的时候，return ； 可以不写。写了的好处：可以直接结束程序，不下去了；
	}
}
