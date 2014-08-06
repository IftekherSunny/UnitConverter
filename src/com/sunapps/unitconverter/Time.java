package com.sunapps.unitconverter;

import android.app.Activity;

public class Time extends Activity {

	public static double time(String subOption1, String subOption2,
			double subOption1EditText) {

		double timeResult = 0.00, second = 0.00, minute = 0.00, hour = 0.00, day = 0.00, week = 0.00, month = 0.00, year = 0.00, century = 0.00;

		
		// Calculation Block
		if (subOption1 == "Second") {
			second = subOption1EditText;
			minute = subOption1EditText * 0.0166667;
			hour = subOption1EditText * 0.000277778;
			day = subOption1EditText * (double) 1.1574e-5;
			week = subOption1EditText * (double) 1.6534e-6;
			month = subOption1EditText * (double) 3.8027e-7;
			year = subOption1EditText * (double) 3.1689e-8;
			century = subOption1EditText * (double) 3.1689e-10;

		}

		else if (subOption1 == "Minute") {
			second = subOption1EditText * 60.00;
			minute = subOption1EditText;
			hour = subOption1EditText * 0.0166667;
			day = subOption1EditText * 0.000694444;
			week = subOption1EditText * (double) 9.9206e-5;
			month = subOption1EditText * (double) 2.2816e-5;
			year = subOption1EditText * (double) 1.9013e-6;
			century = subOption1EditText * (double) 1.9013e-8;
		}
		
		else if (subOption1 == "Hour") {
			second = subOption1EditText * 3600.00;
			minute = subOption1EditText * 60.00;
			hour = subOption1EditText;
			day = subOption1EditText * 0.0416667;
			week = subOption1EditText * 0.00595238;
			month = subOption1EditText * 0.00136895;
			year = subOption1EditText * 0.00011408;
			century = subOption1EditText * (double) 1.1408e-6;
		}
		
		else if (subOption1 == "Day") {
			second = subOption1EditText * 86400.00;
			minute = subOption1EditText * 1440.00;
			hour = subOption1EditText * 24.00;
			day = subOption1EditText;
			week = subOption1EditText * 0.142857;
			month = subOption1EditText * 0.0328549;
			year = subOption1EditText * 0.00273791;
			century = subOption1EditText * (double) 2.7379e-5;
		}
		
		else if (subOption1 == "Week") {
			second = subOption1EditText * 604800.00;
			minute = subOption1EditText * 10080.00;
			hour =  subOption1EditText * 168.00;
			day = subOption1EditText * 7.00;
			week = subOption1EditText;
			month = subOption1EditText * 0.229984;
			year = subOption1EditText * 0.0191654;
			century = subOption1EditText * 0.000191654;
		}
		
		else if (subOption1 == "Month") {
			second = subOption1EditText * (double) 2.63e+6;
			minute = subOption1EditText * 43829.1;
			hour = subOption1EditText * 730.484;
			day = subOption1EditText * 30.4368;
			week = subOption1EditText * 4.34812;
			month = subOption1EditText;
			year = subOption1EditText * 0.0833333;
			century = subOption1EditText * 0.000833333;
		}
		
		
		else if (subOption1 == "Year") {
			second = subOption1EditText * (double) 3.156e+7;
			minute = subOption1EditText * 525949.0;
			hour = subOption1EditText * 8765.81;
			day = subOption1EditText * 365.242;
			week = subOption1EditText * 52.1775;
			month = subOption1EditText * 12.00;
			year = subOption1EditText;
			century = subOption1EditText * 0.01;
		}
		
		else if (subOption1 == "Century") {
			second = subOption1EditText * (double) 3.156e+9; 
			minute = subOption1EditText * (double) 5.259e+7;
			hour = subOption1EditText * 876581;
			day = subOption1EditText * 36524.2;
			week = subOption1EditText * 5217.75;
			month = subOption1EditText * 1200.00;
			year = subOption1EditText * 100.00;
			century = subOption1EditText;
		}
		
		
		// Output Initial block
		if (subOption2 == "Second") 
			timeResult = second;
		
		else if (subOption2 == "Minute")
			timeResult = minute;
		
		else if (subOption2 == "Hour")
			timeResult = hour;
		
		else if (subOption2 == "Day") 
			timeResult = day;
		
		else if (subOption2 == "Week") 
			timeResult = week;
		
		else if (subOption2 == "Month")
			timeResult = month;
		
		else if (subOption2 == "Year") 
			timeResult = year;
		
		else if (subOption2 == "Century") 
			timeResult = century;
			
			
			
		return timeResult;
	}

}
