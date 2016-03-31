package chap15;

import java.text.*;
import java.util.*;
public class DateUtil {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String format(Date date){
		return formatter.format(date);
	}
}
