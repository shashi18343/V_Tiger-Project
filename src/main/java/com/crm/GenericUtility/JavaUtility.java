package com.crm.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandom()
	{
		Random r=new Random();
		int random = r.nextInt(200);
		return random;
	}
	/**
	 * 
	 * @return
	 */
	public String getSystemDate()
	{
		Date dt=new Date();
		String date = dt.toString();
		return date;
	}

	public String getSystemDateAndTimeFormat()
	{
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date systemDate=new Date();
		String getDateAndTime=dateFormat.format(systemDate);
		System.out.println(getDateAndTime);
		return getDateAndTime.replace(":","-");
	}
}
