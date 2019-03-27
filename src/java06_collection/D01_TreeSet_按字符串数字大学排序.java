package java06_collection;

import java.util.Iterator;
import java.util.TreeSet;

/* 
 * 	TreeSet的特点就是给Set增加了一个自动排序的功能        (欧浦项目里面没看到用，但是可以过一遍，理解一下排序的原理)
 * */
public class D01_TreeSet_按字符串数字大学排序 {

	public static void main(String[] args) {
		String s = "23,0,-1,99,100,4";
		String[] strs = s.split(",");
		
		TreeSet ts = new TreeSet();
		for (int j = 0; j < strs.length; j++) {
			//ts.add(strs[j]);					// 字符串类型的数字对象排序结果不是我们想要的那样
			ts.add(Integer.parseInt(strs[j]));	// 将字符串类型的整数转换成基本数字类型；然后自动装箱作为Integer对象加入集合；
		}										// Integer实现了comparable接口
		
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		// 打印发现自动排序了
		}
	}

}
