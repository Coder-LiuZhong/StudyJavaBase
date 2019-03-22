package java01_base;
/*
 * 	帮助文档(说明书)
 * 		程序的注释形成文档，方便阅读程序提供了哪些功能；
 * 		Javadoc工具可以解析文档工具里面的@参数生成帮助文档
 *	
 * 	javadoc -d doc[说明书要存放的目录，点是当前目录，不要当前目录下] -author[作者，选填] -version(版本，选填) ArrayTool.java
 *  	javadoc -d doc -liuzhong -1.0 A2_帮助文档.java	
 *  	生成后，点击doc文件夹下的java01_base文件夹下的A2_帮助文档.html即可；
 * 		报错：找不到可以文档化的公共或受保护的类。
 * 		这个类必须权限最大，所以加上public在class ArrayTool前面;
 * 
 *  MyEclipse直接选中项目右键，导出，Javadoc就可以在项目下生成一个doc文档
 * 
 *  必须是public
 *  	public权限是最大的，别人都能用到；
 *  	javac生成class文件之后，只要带着class走就能直接用里面定义的方法；
 *  	java帮助文档生成为了给其他人用class里面的类和方法的时候看起来方便；
 * 		真实开发的时候，只要有public方法或者public类，上面都得加上文档注释；
 * 
 * 	查阅API的时候，先看该继承体系的父类或者顶层接口，了解体系的基本功能应用；通过直接建立最子类的对象即可使用该体系；
 * 	（我们一般看API的时候，只需看最高的父类的方法和属性就可以了，子类就差不多了）
 * 
 * */

/**
 * 	这是一个对数组操作的工具类
 * 	@author liuzhong
 * 	@version v1.1
 */
public class B2_帮助文档 {
	/**
	 * 获取整形数组最大值的方法。
	 * @param arr 接收一个整形数组。
	 * @return 返回改数组的最大值
	 * */
	public int getMax(int[] arr){					//	方法内容在生成的文档里面看不到
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 获取整形数组最小值的方法。
	 * @param arr 接收一个整形数组。
	 * @return 返回改数组的最小值
	 * */
	public int getMin(int[] arr){					//	不是对外提供的public，就不会生成，加上文档注释也没用；
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 将整形数组变成字符串，通过','进行分隔。
	 * @param arr 接收一个整形数组。
	 * @return 返回数组元素的字符串表现形式。
	 */
	public String toString(int[] arr){
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length - 1) {
				s += arr[i] + ",";
			}else{
				s += arr[i];
			}
		}
		return s;
	}
}