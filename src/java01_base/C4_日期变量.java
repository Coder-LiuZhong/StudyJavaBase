package java01_base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C4_���ڱ��� {
	public static void main(String[] args) {	
		Date dt = new Date();												//��ǰ����
		System.out.println(dt);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//��ʽ
		
		Calendar calendar = Calendar.getInstance();							//��������
		calendar.setTime(dt);												//���õ�ǰ����
		calendar.add(Calendar.MONTH, -1);									//�·ݼ�һ
		
		System.out.println(sf.format(calendar.getTime()));					//�����ʽ��������
	}
}
