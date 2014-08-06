package com.sunapps.unitconverter;


public class Length {
	
	public static double length(String subOption1, String subOption2,
			double subOption1EditText) {
		
		
		// Variable
		double lengthResult = 0.00,centimeter=0.00,foot=0.00,
				inch=0.00, kilometer=0.00,meter=0.00,mile=0.00;

		
		// Calculation Block
		if (subOption1 == "Centimeter") {
			centimeter = subOption1EditText;
			foot = subOption1EditText/30.48;
			inch = subOption1EditText*0.394;
			kilometer =  (subOption1EditText/(double)100000.00);
			meter = subOption1EditText/100.00;
			mile= subOption1EditText* (double) 6.21371e-6;
		}
		
				
		else if (subOption1 == "Foot") {
			centimeter = subOption1EditText*30.48;
			foot = subOption1EditText;
			inch = subOption1EditText * 12.00;
			kilometer =  subOption1EditText/3280.8;
			meter = subOption1EditText/3.2808;
			mile= subOption1EditText * 0.00018939;
		}
				
				
		else if (subOption1 == "Inch") {			
			centimeter = subOption1EditText*2.54;
			foot = subOption1EditText* 0.083333;
			inch =  subOption1EditText;
			kilometer = subOption1EditText /39370.00;
			meter = subOption1EditText/39.370;
			mile= subOption1EditText/ 63360.00;
		}
		
		else if (subOption1 == "Kilometer") {
			centimeter = subOption1EditText*100000;
			foot = subOption1EditText*3280.8;
			inch = subOption1EditText* 39370.00;
			kilometer =   subOption1EditText;
			meter = subOption1EditText/0.0010000;
			mile= subOption1EditText * 0.62137;
		}
		
		
		else if (subOption1 == "Meter") {
			centimeter = subOption1EditText*100.00;
			foot =  subOption1EditText*3.2808;
			inch = subOption1EditText * 39.370;
			kilometer = subOption1EditText/1000.0;
			meter = subOption1EditText;
			mile= subOption1EditText* 0.00062137;
		}
		
		
		else if (subOption1 == "Mile") {
			centimeter = Math.round(subOption1EditText / (double) 6.21371e-6);
			foot = subOption1EditText* 5280.0;
			inch = subOption1EditText*63360.00;
			kilometer = subOption1EditText/0.62137;
			meter = subOption1EditText/0.00062137;
			mile= subOption1EditText;
		}
		
		// Output Initial block
		if (subOption2 == "Centimeter")
			lengthResult = centimeter;	
		
		else if (subOption2 == "Foot")
			lengthResult = foot;
		
		else if (subOption2 == "Inch")
			lengthResult = inch;
		
		else if (subOption2 == "Kilometer") 
			lengthResult = kilometer;
		
		else if (subOption2 == "Meter") 
			lengthResult = meter;
		
		else if (subOption2 == "Mile")
			lengthResult = mile;
		
		// Output Return
		return lengthResult;
	}

}
