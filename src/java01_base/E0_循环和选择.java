package java01_base;

/* -----------------------------------------------------------------------------------------------------------------------------------------
 * 四大语句(if switch while for)：	
 * 		选择：if、switch、	循环：for、while（do while）；	判断：if、while		
 * 
 * IF和switch选择语句：
 * 		根据判断条件的范围
 * 		IF:		     当对数值区间进行判断(x>1)，以及对运算后的结果只要是Boolean型(true)的，;
 * 		switch：     当对有限几个值进行判断的时候；		switch比if效率稍好些
 * 		while其实也可以当做判断条件，if还只能判断一次，while可以判断多次，这是个好办法；（String那节学的）
 * 
 * For和while的选择；
 * 		当一个变量被循环操作后，只为循环而存在就用for，如果是还要继续参与循环下面的运算时，就用while；
 * 
 * break和continue
 *		continue	结束本次循环开始下一次循环；作用于循环语句
 *		break		跳出（结束）选择语句或循环语句；作用于选择和循环语句
 *		一个是结束单次循环，一个是整个循环都不来了；
 *
 * 循环注意两点：	
 * 		1.	明确循环条件；	
 * 		2.	明确需要参与多次循环的语句；
 * 
 *[	无限循环的两种：while(true)、for(;;)	 ]
 * -----------------------------------------------------------------------------------------------------------------------------------------
 */
public class E0_循环和选择 {

	public static void main(String[] args) {
		//--------------------------------IF-------------------------------- 
		int x = 1;
		if (x > 1) { 								// 条件判断是按顺序走下去的;结果要么是ture要么是false；
			System.out.println("yes");		
		} else if (x > 3) {
			System.out.println("hehe!");
		} else 
			System.out.println("Hello World!");	    // 括号里面如果只有1条语句，可以不写括号；
	
		//--------------------------------Switch-------------------------------- 
		int x2 = 3;
		switch(x2)									// x2只能是byte、short、int、char；(因为这些最终都能转为int，实际上只能用int)
		{											// 从1.5版开始，Java中引入了枚举类型（enum），so也可以是枚举；从JDK 1.7版开始，还可是字符串（String）
			case 1:				
				System.out.println("a!");
				break;								// break是switch里的固定搭配，作用是跳出case代码块；
			case 3:									// 这里x2=3匹配进入	
				System.out.println("b!");
				break;								// 这儿匹配进来后，如果没有break，程序会继续往下走，这个时候，就不会管是否匹配了，只认break才停，下面就会输出'c',要是后面一直没有break，那就一直走到最后,把“c”“no”都输出来了
			case 5:				
				System.out.println("c!");
				break;
			default:								// 所有case走完才来这里；如果x=2,没有匹配，来这里;case与default之间没有顺序，都是先匹配有case的再来这;
				System.out.println("no!");
				break;								// switch语句里面最后这个break可以不写
		}
		
		//--------------------------------While--------------------------------
		int x3 = 1;
		while(x3<3){								// 程序读到while，开始转圈了
			System.out.println("x="+x3);
			x3++;									// x3要是不变化，那老是转圈循环。所以要让它变化,控制循环的次数;这个要注意别漏了；
		}
		
		int y = 1;
		do{
			System.out.println("x="+x3);
		}while (y<1);								// 这里后面才判断条件，所以循环体至少执行一次;
		
		//--------------------------------For--------------------------------
		for (int x4 = 0; x4 < 3; x4++) {			// 两点：	循环条件；需要参与多次循环的语句；
			System.out.println("x=" + x4);
		}
		
	    double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };   
	    for (double num : nums) {  
	    	System.out.println(num);
	    }   
		//--------------------------------break和continue--------------------------------
		for (int i = 1; i < 3; i++) {
			System.out.println("i");
			break;									// 跳出循环代码，不能直接放到for下面第一行，那syso就会报错，因为循环没开始就结束了；但可以像下面那样；
		}
		
		for (int i = 0; i < 7; i++) {
			if (i == 5) {
				break;	
			}
			System.out.println("*");
		}
		
		for (int i = 1; i < 5; i++) {
			if(i%2==0){
				continue;							//	跳出本次循环，但是继续下一个循环；他也不能放for下面；
			}
			System.out.println("i="+i);
		}
		
		haha:for (int i = 0; i < 4; i++) {		//	haha: 这尼玛竟然是标号；多重循环跳出就可以用到这个标记；指定用break跳出哪个循环；
			for (int j = 0; j < 4; j++) {
				System.out.println("里");
				break haha;						//	break；跳出当前循环语句，但是外面的循环继续；加上haha就是跳出外面的；
			}
			System.out.println("外");
		}
		
		//---------------------------------三元运算符---------------------------- 
		int b = (x>1)?(x+100):(x-100);				// if、else只有两个条件的可以用三元运算符表示
		System.out.println(b);
		
		String type = "";
		int btype = type.equals("out")?2:type.equals("cin")?3:type.equals("cout")?4:type.equals("sf")?5:type.equals("work")?6:1;
	}
}