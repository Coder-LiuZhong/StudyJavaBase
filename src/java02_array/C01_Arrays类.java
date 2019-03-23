package java02_array;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * java.util.Arrays ���ܷ���ز������飬���ṩ�����з������Ǿ�̬�ġ�
 * 
 * */

public class C01_Arrays�� {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("3");
        list.add("4");
        list.add("2");
        list.add("5");
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);		// Arrays.sort()����ײ�ð������
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        System.out.println(sb.toString());
	}

}
