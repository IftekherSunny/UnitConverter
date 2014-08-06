package com.sunapps.unitconverter;

//"Gram", "Kilogram",  "Metric Ton" , "Milligram", "Pound"
public class Mass {

	public static double mass(String subOption1, String subOption2,
			double subOption1EditText) {
		
		// Variable
		double massResult=0.00,gram=0.00,kilogram=0.00,
				metricTon = 0.00, milligram=0.00,pound=0.00;

		// Calculation Block
		if (subOption1 == "Gram") {
			gram = subOption1EditText;
			kilogram = subOption1EditText/1000.00;
			metricTon = subOption1EditText/1000000.00;
			milligram = subOption1EditText/0.0010000;
			pound = subOption1EditText * 0.0022046;
		}

		else if (subOption1 == "Kilogram") {
			gram = subOption1EditText/0.0010000;
			kilogram = subOption1EditText;
			metricTon = subOption1EditText/1000.00;
			milligram = subOption1EditText/1000000.00;
			pound =  subOption1EditText* 2.2046;
		}

		else if (subOption1 == "Metric Ton") {
			gram = subOption1EditText*1000000;
			kilogram =  subOption1EditText/0.0010000;
			metricTon = subOption1EditText;
			milligram = subOption1EditText/1000000000.00;
			pound = subOption1EditText*2204.60;
		}

		else if (subOption1 == "Milligram") {
			gram = subOption1EditText/1000.0 ;
			kilogram = subOption1EditText/1000000.0;
			metricTon = subOption1EditText/1000000000.00;
			milligram = subOption1EditText;
			pound = subOption1EditText*0.0000022;
		}

		else if (subOption1 == "Pound") {
			gram = subOption1EditText/0.0022046;
			kilogram = subOption1EditText/2.2046;
			metricTon = subOption1EditText/2204.60;
			milligram = subOption1EditText/0.0000022;
			pound = subOption1EditText;
		}
		
		
		// Output Initial block
		if (subOption2 == "Gram")
			massResult = gram;
		
		else if (subOption2 == "Kilogram")
			massResult = kilogram;
		
		else if (subOption2 == "Metric Ton")
			massResult = metricTon;
		
		else if (subOption2 == "Milligram")
			massResult = milligram;
		
		else if (subOption2 == "Pound")
			massResult = pound;
		
		

		// Output Return
		return massResult;
	}

}
