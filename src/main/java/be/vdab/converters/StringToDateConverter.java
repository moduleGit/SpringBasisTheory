package be.vdab.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import be.vdab.Converter;

public class StringToDateConverter implements Converter<String, Date> {
	private static final String DATUM_FORMAAT = "yyyy-MM-dd";

	@Override
	public Date convert(String string) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATUM_FORMAAT);
		try {
			return dateFormat.parse(string);
		} catch (ParseException ex) {
			throw new IllegalArgumentException();
		}
	}
}
