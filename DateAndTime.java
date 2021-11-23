/*import java.time.LocalDateTime;

public class DateAndTime{
	public static void main(String[] args){
		LocalDateTime myTime = LocalDateTime.now();
		System.out.println(myTime);
	}
}*/


import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime{
	public static void main(String[] args){
		LocalDateTime myTime = LocalDateTime.now();
		System.out.println("Default Format:  "+myTime);

		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		String formattedTime=myTime.format(myFormat);
		System.out.println("Custom Format:  "+formattedTime);

		DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedTime2=myTime.format(myFormat2);
		System.out.println("Custom Format 2:  "+formattedTime2);
	}
}