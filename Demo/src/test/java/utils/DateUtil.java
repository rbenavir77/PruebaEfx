package utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	
	public static String fecha() {
		LocalDateTime hora = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("ddMMYYYY_HHmmss");
		return hora.format(f);
	}
	
	public static String fechaReporte() {
		LocalDateTime hora = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		return hora.format(f);
	}
	
}

