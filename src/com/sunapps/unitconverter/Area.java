package com.sunapps.unitconverter;

public class Area {
	
	//"Hectare (ha)", "Square centimeter (cm²)", "Square foot (ft²)", "Square inch (in²)",
	//"Square kilometer (km²)", "Square meter (m²)", "Square mile", "Square millimeter (mm²)", "Square rod", "Square yard (yd²)
	
	public static double area(String subOption1, String subOption2,
			double subOption1EditText) {
		
		double areaResult = 0.00, hectare = 0.00, squareCentimeter = 0.00, squareFoot = 0.00, squareInch = 0.00,
				squareKilometer = 0.00, squareMeter = 0.00, squareMile = 0.00, squareMillimeter = 0.00, squareRoot = 0.00,
				squareYard = 0.00;
		
		
		// Calculation Block
		if (subOption1 == "Hectare") {
			hectare = subOption1EditText;
			squareCentimeter = subOption1EditText * 100000000.00;
			squareFoot = subOption1EditText * 107639.1041671;
			squareInch = subOption1EditText * 15500031.00006;
			squareKilometer = subOption1EditText * 0.01;
			squareMeter = subOption1EditText * 10000.00;
			squareMile = subOption1EditText * (double) 0.003861021585424;
			squareMillimeter = subOption1EditText * 10000000000.00;
			squareRoot = subOption1EditText * 395.3686103475;
			squareYard = subOption1EditText * 11959.90046301;
		} 
		
		else if (subOption1 == "Square centimeter") {
			hectare = subOption1EditText * (double) 1E-8;
			squareCentimeter = subOption1EditText;
			squareFoot = subOption1EditText * (double) 0.001076391041671;
			squareInch = subOption1EditText * (double) 0.1550003100006;
			squareKilometer = subOption1EditText * (double) 1E-10;
			squareMeter = subOption1EditText * 0.0001;
			squareMile = subOption1EditText * (double) 3.861021585424E-11;
			squareMillimeter = subOption1EditText * 100.00;
			squareRoot = subOption1EditText * (double) 0.000003953686103475;
			squareYard = subOption1EditText * (double) 0.0001195990046301;
		} 
		
		else if (subOption1 == "Square foot") {
			hectare = subOption1EditText * (double) 0.000009290304;
			squareCentimeter = subOption1EditText * 929.0304;
			squareFoot = subOption1EditText;
			squareInch = subOption1EditText * 144.00;
			squareKilometer = subOption1EditText * (double) 9.290304E-8;
			squareMeter = subOption1EditText * 0.09290304;
			squareMile = subOption1EditText * (double) 3.587006427915E-8 ;
			squareMillimeter = subOption1EditText * 92903.04;
			squareRoot = subOption1EditText * (double) 0.003673094582185;
			squareYard = subOption1EditText * (double) 0.1111111111111;
		} 
		
		else if (subOption1 == "Square inch") {
			hectare = subOption1EditText * (double) 6.4516E-8;
			squareCentimeter = subOption1EditText * 6.4516;
			squareFoot = subOption1EditText * (double) 0.006944444444445;
			squareInch = subOption1EditText;
			squareKilometer = subOption1EditText * (double) 6.4516E-10;
			squareMeter = subOption1EditText * 0.00064516;
			squareMile = subOption1EditText * (double) 2.490976686052E-10;
			squareMillimeter = subOption1EditText * 645.16;
			squareRoot = subOption1EditText * (double) 0.00002550760126518;
			squareYard = subOption1EditText * (double) 0.0007716049382716;
		} 
		
		else if (subOption1 == "Square kilometer") {
			hectare = subOption1EditText * 100.00;
			squareCentimeter = subOption1EditText * 10000000000.00;
			squareFoot = subOption1EditText * 10763910.41671;
			squareInch = subOption1EditText * 1550003100.006;
			squareKilometer = subOption1EditText;
			squareMeter = subOption1EditText * 1000000.00;
			squareMile = subOption1EditText * 0.3861021585425;
			squareMillimeter = subOption1EditText * 1000000000000.00;
			squareRoot = subOption1EditText * 39536.86103475;
			squareYard = subOption1EditText * 1195990.046301;
		} 
		
		else if (subOption1 == "Square meter") {
			hectare = subOption1EditText * 0.0001 ;
			squareCentimeter = subOption1EditText * 10000.00;
			squareFoot = subOption1EditText * 10.76391041671;
			squareInch = subOption1EditText * 1550.003100006;
			squareKilometer = subOption1EditText * 0.000001;
			squareMeter = subOption1EditText;
			squareMile = subOption1EditText * (double) 3.861021585425E-7;
			squareMillimeter = subOption1EditText * 1000000.00;
			squareRoot = subOption1EditText * 0.03953686103475;
			squareYard = subOption1EditText * 1.195990046301;
		} 
		
		else if (subOption1 == "Square mile") {
			hectare = subOption1EditText * 258.9988110336;
			squareCentimeter = subOption1EditText * 25899881103.36;
			squareFoot = subOption1EditText * 27878400.00;
			squareInch = subOption1EditText * 4014489600.00;
			squareKilometer = subOption1EditText * 2.589988110336;
			squareMeter = subOption1EditText * 2589988.110336;
			squareMile = subOption1EditText;
			squareMillimeter = subOption1EditText * 2589988110336.00;
			squareRoot = subOption1EditText * 102400.00;
			squareYard = subOption1EditText * 3097600.00;
		} 
		
		else if (subOption1 == "Square millimeter") {
			hectare = subOption1EditText * (double) 1E-10;
			squareCentimeter = subOption1EditText * 0.01;
			squareFoot = subOption1EditText * (double) 0.00001076391041671;
			squareInch = subOption1EditText * (double) 0.001550003100006;
			squareKilometer = subOption1EditText * (double) 1E-12;
			squareMeter = subOption1EditText * 0.000001;
			squareMile = subOption1EditText * (double) 3.861021585425E-13;
			squareMillimeter = subOption1EditText;
			squareRoot = subOption1EditText * (double) 3.953686103475E-8;
			squareYard = subOption1EditText * (double) 0.000001195990046301;
		} 
		
		else if (subOption1 == "Square rod") {
			hectare = subOption1EditText * 0.002529285264;
			squareCentimeter = subOption1EditText * 252928.5264;
			squareFoot = subOption1EditText * 272.25;
			squareInch = subOption1EditText * 39204.00;
			squareKilometer = subOption1EditText * 0.00002529285264;
			squareMeter = subOption1EditText * 25.29285264;
			squareMile = subOption1EditText * 0.000009765625;
			squareMillimeter = subOption1EditText * 25292852.64;
			squareRoot = subOption1EditText;
			squareYard = subOption1EditText * 30.25;
		} 
		
		else if (subOption1 == "Square yard") {
			hectare = subOption1EditText * 0.000083612736;
			squareCentimeter = subOption1EditText * 8361.2736;
			squareFoot = subOption1EditText * 9.00;
			squareInch = subOption1EditText * 1296.00;
			squareKilometer = subOption1EditText * (double) 8.3612736E-7;
			squareMeter = subOption1EditText * 0.83612736;
			squareMile = subOption1EditText * (double) 3.228305785124E-7;
			squareMillimeter = subOption1EditText * 836127.36;
			squareRoot = subOption1EditText * 0.03305785123967;
			squareYard = subOption1EditText;
		} 
		
		// Output Initial block
		if (subOption2 == "Hectare") 
			areaResult = hectare;
		
		else if (subOption2 == "Square centimeter") 
			areaResult = squareCentimeter;
		
		else if (subOption2 == "Square foot") 
			areaResult = squareFoot;
		
		else if (subOption2 == "Square inch") 
			areaResult = squareInch;
		
		else if (subOption2 == "Square kilometer") 
			areaResult = squareKilometer;
		
		else if (subOption2 == "Square meter") 
			areaResult = squareMeter;
		
		else if (subOption2 == "Square mile") 
			areaResult = squareMile;
		
		else if (subOption2 == "Square millimeter") 
			areaResult = squareMillimeter;
		
		else if (subOption2 == "Square rod") 
			areaResult = squareRoot;
		
		else if (subOption2 == "Square yard")
			areaResult = squareYard;
		
		
		
		return areaResult;
	}

}
