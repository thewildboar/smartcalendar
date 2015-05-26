package com.wildboar.smartcalendar;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar implements Serializable {

	private static final long serialVersionUID = 2952758394371718524L;

	private static Date instanceTime;
	
	public Calendar() {
		instanceTime = new Date();
	}

	/**
	 * @return the instanceTime
	 */
	public static Date getInstanceTime() {
		return instanceTime;
	}
	
	/**
	 * @return the instanceTime
	 */
	public static String getNow() {

		Date now = new Date();
		Format formatter = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		return formatter.format(now);
	}

}
