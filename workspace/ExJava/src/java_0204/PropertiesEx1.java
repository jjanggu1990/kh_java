package java_0204;

import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.put("UserName","Michael");
		prop.setProperty("dbDRV", "oracle.jdbc.driver.OracleDriver");
		
		String user = prop.getProperty("UserName");
		String love = prop.getProperty("lovely");
		String db_drv = prop.getProperty("dbDRV");
		
		System.out.println(user);
		System.out.println(love);
		System.out.println(db_drv);

		System.out.println("------------keys------------------");

		Enumeration keys = prop.propertyNames();

		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
		
		prop.list(System.out); //속성 목록 출력하기

	}

}