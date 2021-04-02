package demo.d1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {

	private String flightNumber;
	private String airliner;
	
	private String source;
	private LocalDateTime flyDateTime;
	
	private String destination;
	private LocalDateTime arrivalDateTime;
	
	private Hault[] hault; // can be null;
	
	private boolean flyType; // domestic (false) or international(true)
	private int internationFlyTax; 
	
	private int baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	private int finalCost;// based on Airliner calendar and other criteria's 
	
	
	public int calculateCost()
	{
		/*
		 * Cost of the flight will be decided by 
		 * 1. arrival date. :-
		 * 		1.a)  If 10 to 2 days prior to the AirlinerCalendar Date	 :- 20% extra
		 * 		1.b)  If 1 to 0 day prior to the AirlinerCalendar Date 	:-  50% extra	
		 * 2. arrival time.
		 * 		2.a) If flight land time is 2 hr +/- to 12:00 Noon (Any Date)	:- 10% extra
		 * 3. Non free travel countries (List of FriendlyCountry.java)
		 * 		3.a) If destination belongs to non free travel, friendly country :- 30% extra
		 * */
		
		return finalCost;
	}
	
}
