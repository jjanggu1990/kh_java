package java_0204;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

class CalendarEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("2016���� ");
		Calendar now = Calendar.getInstance();

		System.out.println(now);
		System.out.println(new Date());
		System.out.println(System.currentTimeMillis());
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		int week_yy = now.get(Calendar.WEEK_OF_YEAR);
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH) + 1;
		int dd = now.get(Calendar.DAY_OF_MONTH);

		sb.append(week_yy);
		sb.append("��°�� ");
		sb.append(yy);
		sb.append("�� ");
		sb.append(mm);
		sb.append("�� ");
		sb.append(dd);
		sb.append("��");

		System.out.println(sb.toString());

	}

}