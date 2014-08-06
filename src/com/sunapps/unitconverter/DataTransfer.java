package com.sunapps.unitconverter;

public class DataTransfer {
	
	public static double dataTransfer(String subOption1, String subOption2,
			double subOption1EditText) {
		
		double dataTransferResult = 0.00, bit = 0.00, Byte = 0.00, kilobit = 0.00, kilobyte = 0.00,
				megabit = 0.00, megabyte = 0.00, gigabit = 0.00, gigabyte = 0.00, terabit = 0.00, terabyte = 0.00;
		
		
		// Calculation Block
		if (subOption1 == "Bit (bit)") {
			bit = subOption1EditText;
			Byte = subOption1EditText * 0.125;
			kilobit = subOption1EditText * 0.0009765625  ;
			kilobyte = subOption1EditText * 0.0001220703125;
			megabit = subOption1EditText * (double) 9.536743164063E-7 ;
			megabyte = subOption1EditText * (double) 1.192092895508E-7  ;
			gigabit = subOption1EditText * (double)9.313225746155E-10  ;
			gigabyte = subOption1EditText * (double) 1.164153218269E-10 ;
			terabit = subOption1EditText * (double) 9.094947017729E-13 ;
			terabyte = subOption1EditText * (double) 1.136912032962E-13 ;
		} 
		
		else if (subOption1 == "Byte (B)") {
			bit = subOption1EditText * 8.00;
			Byte = subOption1EditText;
			kilobit = subOption1EditText * 0.0078125;
			kilobyte = subOption1EditText * 0.0009765625;
			megabit = subOption1EditText * 0.00000762939453125;
			megabyte = subOption1EditText * (double) 9.536743164063E-7;
			gigabit = subOption1EditText * (double) 7.450580596924E-9;
			gigabyte = subOption1EditText * (double) 9.313225746155E-10;
			terabit = subOption1EditText * (double) 7.275957614183E-12;
			terabyte = subOption1EditText * (double) 9.095296263695E-13;
		} 
		
		else if (subOption1 == "Kilobit (Kbit)") {
			bit = subOption1EditText * 1024.00;
			Byte = subOption1EditText * 128.00;
			kilobit = subOption1EditText;
			kilobyte = subOption1EditText * 0.125  ;
			megabit = subOption1EditText * 0.0009765625  ;
			megabyte = subOption1EditText * 0.0001220703125 ;
			gigabit = subOption1EditText * (double) 9.536743164063E-7 ;
			gigabyte = subOption1EditText * (double) 1.192092895508E-7 ;
			terabit = subOption1EditText * (double) 9.313225746155E-10 ;
			terabyte = subOption1EditText * (double) 1.164197921753E-10 ;
		} 
		
		else if (subOption1 == "Kilobyte (KB)") {
			bit = subOption1EditText * 8192.00;
			Byte = subOption1EditText * 1024.00;
			kilobit = subOption1EditText * 8.00;
			kilobyte = subOption1EditText;
			megabit = subOption1EditText * 0.0078125;
			megabyte = subOption1EditText * 0.0009765625;
			gigabit = subOption1EditText * 0.00000762939453125;
			gigabyte = subOption1EditText * (double) 9.536743164063E-7;
			terabit = subOption1EditText * (double) 7.450580596924E-9;
			terabyte = subOption1EditText * (double) 9.313583374023E-10;
		} 
		
		else if (subOption1 == "Megabit (Mbit)") {
			bit = subOption1EditText * 1048576.00;
			Byte = subOption1EditText * 131072.00;
			kilobit = subOption1EditText * 1024.00;
			kilobyte = subOption1EditText * 128.00;
			megabit = subOption1EditText;
			megabyte = subOption1EditText * 0.125;
			gigabit = subOption1EditText * 0.0009765625;
			gigabyte = subOption1EditText * 0.0001220703125 ;
			terabit = subOption1EditText * (double) 9.536743164063E-7;
			terabyte = subOption1EditText * (double) 1.192138671875E-7;
		} 
		
		else if (subOption1 == "Megabyte (MB)") {
			bit = subOption1EditText * 8388608.00;
			Byte = subOption1EditText * 1048576.00;
			kilobit = subOption1EditText *  8192.00;
			kilobyte = subOption1EditText * 1024.00;
			megabit = subOption1EditText * 8.00;
			megabyte = subOption1EditText;
			gigabit = subOption1EditText * 0.0078125;
			gigabyte = subOption1EditText * 0.0009765625;
			terabit = subOption1EditText * (double) 0.00000762939453125;
			terabyte = subOption1EditText * (double) 9.537109375E-7;
		} 
		
		else if (subOption1 == "Gigabit (Gbit)") {
			bit = subOption1EditText * 1073741824.00;
			Byte = subOption1EditText * 134217728.00;
			kilobit = subOption1EditText * 1048576.00;
			kilobyte = subOption1EditText * 131072.00;
			megabit = subOption1EditText * 1024.00;
			megabyte = subOption1EditText * 128.00;
			gigabit = subOption1EditText;
			gigabyte = subOption1EditText * 0.125;
			terabit = subOption1EditText * 0.0009765625;
			terabyte = subOption1EditText * 0.000122075;
		} 
		
		else if (subOption1 == "Gigabyte (GB)") {
			bit = subOption1EditText * 8589934592.00;
			Byte = subOption1EditText * 1073741824.00;
			kilobit = subOption1EditText * 8388608.00;
			kilobyte = subOption1EditText * 1048576.00;
			megabit = subOption1EditText * 8192.00;
			megabyte = subOption1EditText * 1024.00;
			gigabit = subOption1EditText * 8.00;
			gigabyte = subOption1EditText;
			terabit = subOption1EditText * 0.0078125;
			terabyte = subOption1EditText * 0.0009766;
		} 
		
		else if (subOption1 == "Terabit (Tbit)") {
			bit = subOption1EditText * 1099511627776.00;
			Byte = subOption1EditText * 137438953472.00;
			kilobit = subOption1EditText * 1073741824.00;
			kilobyte = subOption1EditText * 134217728.00;
			megabit = subOption1EditText * 1048576.00;
			megabyte = subOption1EditText * 131072.00;
			gigabit = subOption1EditText * 1024.00;
			gigabyte = subOption1EditText * 128.00;
			terabit = subOption1EditText;
			terabyte = subOption1EditText * 0.1250048 ;
		} 
		
		else if (subOption1 == "Terabyte (TB)") {
			bit = subOption1EditText * 8795755265206.00;
			Byte = subOption1EditText * 1099469408151.00;
			kilobit = subOption1EditText * 8589604751.178;
			kilobyte = subOption1EditText * 1073700593.897;
			megabit = subOption1EditText * 8388285.889822;
			megabyte = subOption1EditText * 1048535.736228;
			gigabit = subOption1EditText * 8191.685439279;
			gigabyte = subOption1EditText * 1023.96067991;
			terabit = subOption1EditText * 7.999692811796;
			terabyte = subOption1EditText;
		} 
		
		
		
		// Output Initial block
		if (subOption2 == "Bit (bit)")
			dataTransferResult = bit;
		
		else if (subOption2 == "Byte (B)")
			dataTransferResult = Byte;

		else if (subOption2 == "Kilobit (Kbit)")
			dataTransferResult = kilobit;
		
		else if (subOption2 == "Kilobyte (KB)")
			dataTransferResult = kilobyte;
		
		else if (subOption2 == "Megabit (Mbit)")
			dataTransferResult = megabit;
		
		else if (subOption2 == "Megabyte (MB)")
			dataTransferResult = megabyte;
		
		else if (subOption2 == "Gigabit (Gbit)")
			dataTransferResult = gigabit;
		
		else if (subOption2 == "Gigabyte (GB)")
			dataTransferResult = gigabyte;
		
		else if (subOption2 == "Terabit (Tbit)")
			dataTransferResult = terabit;
		
		else if (subOption2 == "Terabyte (TB)")
			dataTransferResult = terabyte;
		
		
		
		
		return dataTransferResult;
	}

}
