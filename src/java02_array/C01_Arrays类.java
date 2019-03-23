package java02_array;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。
 * 
 * */

public class C01_Arrays类 {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("3");
        list.add("4");
        list.add("2");
        list.add("5");
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);		// Arrays.sort()代码底层冒泡升序。
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        System.out.println(sb.toString());
	}

}
