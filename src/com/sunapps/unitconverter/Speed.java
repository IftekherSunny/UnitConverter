package com.sunapps.unitconverter;

public class Speed {
	
	public static double speed(String subOption1, String subOption2,
			double subOption1EditText) {
		
		double speedResult = 0.00, feetPerSec = 0.00,
				kmPerHour = 0.00, metersPerSec = 0.00,
				milesPerHour = 0.00;
		
		// Calculation Block
		if (subOption1 == "Feet/sec") {
			feetPerSec = subOption1EditText;
			kmPerHour = subOption1EditText * 1.09728 ;
			metersPerSec = subOption1EditText * 0.3048 ;
			milesPerHour = subOption1EditText * 0.6818181818182  ;
		} 
		
		else if (subOption1 == "Km/hour") {
			feetPerSec = subOption1EditText * 0.9113444152814  ;
			kmPerHour = subOption1EditText;
			metersPerSec = subOption1EditText * 0.2777777777778 ;
			milesPerHour = subOption1EditText * 0.6213711922373  ;
		} 
		
		else if (subOption1 == "Meters/sec") {
			feetPerSec = subOption1EditText * 3.280839895013 ;
			kmPerHour = subOption1EditText * 3.6 ;
			metersPerSec = subOption1EditText;
			milesPerHour = subOption1EditText * 2.236936292054 ;
		} 
		
		else if (subOption1 == "Miles/hour") {
			feetPerSec = subOption1EditText * 1.466666666667 ;
			kmPerHour = subOption1EditText * 1.609344 ;
			metersPerSec = subOption1EditText * 0.44704  ;
			milesPerHour = subOption1EditText;
		}
		
		
		// Output Initial block
		if (subOption2 == "Feet/sec")
			speedResult = feetPerSec;

		else if (subOption2 == "Km/hour")
			speedResult = kmPerHour;

		else if (subOption2 == "Meters/sec")
			speedResult = metersPerSec;
		
		else if (subOption2 == "Miles/hour")
			speedResult = milesPerHour;
				
		return speedResult;
	}

}
