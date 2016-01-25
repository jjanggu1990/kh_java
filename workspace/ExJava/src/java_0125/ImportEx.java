package java_0125;

import java.util.Date;
import java.text.*;

class ImportEx {

	public static void main(String[] args) {
		Date da = new Date();
		System.out.println(da);

		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		String date = sdf.format(da);
		System.out.println(date);
		
	}

}