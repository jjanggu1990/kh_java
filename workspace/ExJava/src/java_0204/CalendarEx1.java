package java_0204;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

class CalendarEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("2016년중 ");
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
		sb.append("주째인 ");
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일");

		System.out.println(sb.toString());

	}

}
