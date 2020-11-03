package pkg1;

import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class SampleDate1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current Date: "+today);
		
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specified Date: "+firstDay_2014);
		LocalDate tenthFeb_2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
		System.out.println("10th Feb: "+tenthFeb_2014);
		LocalDate firstAug_2014 = LocalDate.of(2014, 8, 1);
		System.out.println("Aug 1st: "+firstAug_2014);
		
		LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);
		System.out.println("65th day of 2010: "+sixtyFifthDayOf2010);
		
//		LocalDate n = LocalDate.of(2014, Month.FEBRUARY, 30);
//		System.out.println("10th Feb: "+n);
		
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST: "+todayKolkata);
		
		//getting date from base date=01/01/1970
		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th dat from base date: "+dateFromBase);
		
		LocalDate hundredDay2019 = LocalDate.ofYearDay(2019, 100);
		System.out.println("100th day of 2014: "+hundredDay2019);
//		LocalTime currentTime = LocalTime.now();
//		LocalTime midday = LocalTime.of(12, 0);//12:00
//		LocalTime afterMidday = LocalTime.of(13, 30, 15);//13:30:15
		
		//LocalDateTime
	}

}
