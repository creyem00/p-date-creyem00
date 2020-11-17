package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) throws DateException {
		//this.month = month;
		this.setMonth(month);
		//this.day = day;
		this.setDay(day);
		//this.year = year;
		this.setYear(year);
	}
	
	public void setDay(int day) throws DateException {
		if ( day < 1 || day > this.getDaysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
		this.day = day;
	}
	
	public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
	
	private int getDaysOfMonth() {
		int numDays;
		
		numDays = 0;
		switch (this.month) {
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;			
		}
		
		return numDays;
	}
	private void getNameOfMonth() {
	
		
		switch (this.month) {
		case 1: //next
				System.out.println("Enero");
				break;
		case 2: //next
				System.out.println("Febrero");
				break;
		case 3: //next
				System.out.println("Marzo");
				break;
		case 4: //next
				System.out.println("Abril");
				break;
		case 5: //next
				System.out.println("Mayo");
				break;
		case 6: //next
				System.out.println("Junio");
				break;
		case 7: //next
				System.out.println("Julio");
				break;
		case 8: //next
				System.out.println("Agosto");
				break;
		case 9: //next
				System.out.println("Septiembre");
				break;
		case 10: //next
				 System.out.println("Octubre");
				 break;
		case 11: //next
				 System.out.println("Noviembre");
			     break;
		case 12: //next
				 System.out.println("Diciembre");
				 break;	
						
		}
		
	}
	
	public int getDay() {
	return day;
	}
	public int getMonth() {
	return month;
	}
	public int getYear() {
	return year;
	}

	public boolean isSameYear(Date miDate){
		boolean esIgual = false;
		if (this.year == miDate.getYear()){
			esIgual = true;
		}
		return esIgual;
	}	
	public boolean isSameYearWiththoutif(Date miDate){
		
		return(this.year == miDate.getYear());
			
	}

	public boolean isSameMonth(Date miDate){
		boolean esIgual = false;
		if(this.month == miDate.getMonth()){
			esIgual = true;
		}
		return esIgual;
	}	
	public boolean isSameMonthwithoutif(Date miDate){

		return(this.month == miDate.getMonth());

	}

	public boolean isSameDay(Date miDate){
		boolean esIgual = false;
		if(this.day == miDate.getDay()){
			esIgual = true;
		}
	    return esIgual;
	}
	public boolean isSameDaywithoutif(Date miDate){
		return(this.day == miDate.getDay());
	}




	public String toString() {
		getNameOfMonth();
		return this.day + "/" + this.month + "/" + this.year;
	}
}
