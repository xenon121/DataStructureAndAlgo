package algorithems.simple;

import java.util.Date;

public class IncreaseDateByNumbers {

	public static Date getAdditionDate(Date currentDate, int daysInNumber){

		System.out.println(currentDate);
		
		if(daysInNumber == 0) return currentDate;

		long currentDateTime = new Date().getTime();

		currentDateTime = currentDateTime + (1000 * 60 * 60 * (24 * daysInNumber));
		
		return new Date(currentDateTime);
	}
	
	public static void main(String[] args) {
		
		System.out.println(getAdditionDate(new Date(), 24));
	}

}
