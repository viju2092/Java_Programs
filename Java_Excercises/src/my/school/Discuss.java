package my.school;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Discuss {

	public static void main(String[] args) {
        /*
		Float gf = 6.0f;
		//int num = "124";
		Double r = 5D;
		float h = 6;
		StringBuilder csv = new StringBuilder('7');
		System.out.println(csv);
		csv.append("Bigil");
		System.out.println(csv);
		System.out.println(csv.capacity());
		System.out.println(csv.length() + csv.capacity());
		
		int prim = Integer.parseInt("123");
		Integer parsee = Integer.valueOf("544");
		System.out.println(prim + " and " + parsee);
		
		//int wrong = Integer.parseInt("data");
		//int acc = Integer.parseInt("k");
		//Integer val = Integer.valueOf("1233.455");
		//System.out.println(wrong + "," + val);
		String find = String.valueOf("23445");
		System.out.println(find);
		int b = 111;
		String haa = new Integer(233).toString();
		*/
		
		LocalDate ld = LocalDate.of(2014, Month.APRIL, 06);
		LocalTime tim = LocalTime.of(07, 45);
		System.out.println(ld);
		ld.getChronology();
		ld.plusDays(07);
		System.out.println(ld);
        ld = ld.plusMonths(02); 
		System.out.println(ld);
		LocalDateTime ldt = LocalDateTime.of(ld, tim);
		System.out.println(ldt);
		ldt = ldt.minusDays(17);
		System.out.println(ldt);
		ldt = ldt.minusHours(8).minusMinutes(34).minusNanos(2333);
		System.out.println(ldt);
		
		
		LocalDate care1 = LocalDate.of(2020, Month.JUNE, 23);
		LocalTime care2 = LocalTime.of(22, 12);
		LocalDateTime care1care2 = LocalDateTime.of(care1,care2);
		System.out.println(care1care2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(care1care2.format(dtf1));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d-M-y, hh:mm");
		System.out.println(care1care2.format(dtf2));
	
		DateTimeFormatter med = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(med.format(care1care2));
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("h:m");
		System.out.println(ff.format(care1care2));
		//ff.format(care1);
		System.out.println(ff.format(care2));
		
		LocalDate boat = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		boat = boat.plusDays(2);
	    System.out.println(boat.getYear() + " " + " " + boat.getMonth() + " " 
		+ boat.getDayOfMonth());
		
		LocalDateTime chart = LocalDateTime.of(2015, 5, 10, 11, 22, 33,44);
		Period pp = Period.of(1, 2, 3);
		chart = chart.minus(pp);
		chart = chart.plus(pp);
		DateTimeFormatter fd = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(chart);
		System.out.println(chart.format(fd));
		System.out.println(fd.format(chart));

		LocalDateTime chart1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period pp1 = Period.ofYears(2);
		chart1 = chart1.minus(pp1);
		//chart = chart.plus(pp);
		DateTimeFormatter fd1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(chart1);
		//System.out.println(chart.format(fd));
		System.out.println(fd1.format(chart1));
    
	}
	

}
