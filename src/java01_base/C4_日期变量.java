package java01_base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C4_日期变量 {
	public static void main(String[] args) {	
		Date dt = new Date();												//当前日期
		System.out.println(dt);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//格式
		
		Calendar calendar = Calendar.getInstance();							//日历对象
		calendar.setTime(dt);												//设置当前日期
		calendar.add(Calendar.MONTH, -1);									//月份减一
		
		System.out.println(sf.format(calendar.getTime()));					//输出格式化的日期
	}
}
