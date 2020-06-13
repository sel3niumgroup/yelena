package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utils {
	
	public static String dateFormatConverter(String inputDate, String fromFormat, String toFormat) {
		SimpleDateFormat from = new SimpleDateFormat(fromFormat);
		SimpleDateFormat to  = new SimpleDateFormat(toFormat);
		String date = null;
		try {
			date = to.format(from.parse(inputDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
