package com;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TEST {
	


	public static void main(String[] args) {
		
		
		//System.out.println(new BigDecimal("1060.00").divideAndRemainder(new BigDecimal("100"))[1].compareTo(new BigDecimal(0)) > 0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar calendar = new GregorianCalendar(); 
		calendar.setTime(new Date()); 
	    calendar.add(calendar.DATE,1);
	    System.out.println(sdf.format(calendar.getTime()));
		/*SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddhhmmss");  
		try {
			String str1 = "20161220193211";
			if(str1.length()==14){
				str1 = str1.concat("00");
			}
			Date date = (Date) sdf1.parse(str1);
			System.out.println(date.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */
		
	}

}
