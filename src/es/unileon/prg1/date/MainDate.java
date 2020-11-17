package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		
		try {
			today = new Date(11,11,2020);
			tomorrow = new Date(17,11,2020);

			if(today.isSameYear(tomorrow)){
				System.out.println("Son el mismo year");
			}else{
				System.out.println("Son years distintos");
			}

			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}
