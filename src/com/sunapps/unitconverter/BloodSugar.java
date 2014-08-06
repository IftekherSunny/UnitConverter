package com.sunapps.unitconverter;

public class BloodSugar {
	
	public static double bloodSugar(String subOption1, String subOption2,
			double subOption1EditText) {
		
		double bloodSugarResult = 0.00, mmolPerL = 0.00,
				mgPerdl = 0.00;
		
		// Calculation Block
		if (subOption1 == "mmol/l") {
			mmolPerL = subOption1EditText;
			mgPerdl = subOption1EditText * 18;
		} 
		
		else if (subOption1 == "mg/dl") {
			mmolPerL = subOption1EditText * 0.05555555555556 ;
			mgPerdl = subOption1EditText;
		} 
		
		
		// Output Initial block
		if (subOption2 == "mmol/l")
			bloodSugarResult = mmolPerL;

		else if (subOption2 == "mg/dl")
			bloodSugarResult = mgPerdl;
		
		
		return bloodSugarResult;
		
	}

}
