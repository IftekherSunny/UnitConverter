package com.sunapps.unitconverter;

public class Temperature {

	public static double temperature(String subOption1, String subOption2,
			double subOption1EditText) {

		// Variable
		double temperatureResult = 0.00, K = 0.0, F = 0.0, C = 0.0;

		// Calculation Block
		if (subOption1 == "Fahrenheit") {
			F = subOption1EditText;
			C = (subOption1EditText - 32.00) / 1.8;
			K = C + 273.15;
		} else if (subOption1 == "Celsius") {
			C = subOption1EditText;
			F = (C * 1.8) + 32.00;
			K = C + 273.15;
		} else if (subOption1 == "Kelvin") {
			K = subOption1EditText;
			C = K - 273.15;
			F = 1.8 * (K - 273.15) + 32.00;
		}

		
		// Output Initial block
		if (subOption2 == "Celsius")
			temperatureResult = C;

		else if (subOption2 == "Fahrenheit")
			temperatureResult = F;

		else if (subOption2 == "Kelvin")
			temperatureResult = K;

		
		// Output Return
		return temperatureResult;
	}
}