package com.sunapps.unitconverter;



import java.text.DecimalFormat;

import com.sunapps.unitconverter.R;

import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.app.Activity;
import android.content.Intent;


public class Main extends Activity {
	
	/* for add menu into action bar *********************************/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/* Popup about menu item  *********************************/
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_about:
	        	Intent intent = new Intent(Main.this, About.class);
	        	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        	startActivity(intent);	
	        	return true;
	        
	        case R.id.action_createShortcut:
	        	  createShortcut();
	              return true;	      
	        
	        case R.id.action_exit:
	        	  finish();
	        	  System.exit(0);
	        	  return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	
	
	/* Define xml  *********************************/
	EditText subOption1eText, subOption2eText;
	Button calculateButton, clearButton;

	/* Define data sources *********************************/
	private static String[] mainOption = { "Temperature", "Length", "Mass", "Speed","Blood Sugar","Data Transfer", "Area","Time" };
	
	private static String[] temperature = { "Celsius", "Fahrenheit", "Kelvin" };
	private static String[] length = { "Centimeter", "Foot", "Inch",
			"Kilometer", "Meter", "Mile" };
	private static String[] mass = { "Gram", "Kilogram", "Metric Ton",
			"Milligram", "Pound" };
	private static String[] speed = { "Feet/sec", "Km/hour", "Meters/sec",
		"Miles/hour"};
	private static String[] bloodSugar = { "mmol/l", "mg/dl" };
	private static String[] dataTransfer = { "Bit (bit)", "Byte (B)", "Kilobit (Kbit)",
	"Kilobyte (KB)", "Megabit (Mbit)", "Megabyte (MB)", "Gigabit (Gbit)", "Gigabyte (GB)", "Terabit (Tbit)",
	"Terabyte (TB)"};
	private static String[] area = { "Hectare", "Square centimeter", "Square foot", "Square inch",
		"Square kilometer", "Square meter", "Square mile", "Square millimeter", "Square rod", "Square yard"};
	
	private static String[] time = { "Second", "Minute", "Hour", "Day",
		"Week", "Month", "Year", "Century"};
	
	
	
	
	/* Define view objects *********************************/
	private Spinner mainOptionSpinner;
	private Spinner subOption1Spinner;
	private Spinner subOption2Spinner;
	
	

	/* Define adapter *********************************/
	ArrayAdapter<String> mainOptionAdapter;
	ArrayAdapter<String> subOption1Adapter;
	ArrayAdapter<String> subOption2Adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// initialize view
		mainOptionSpinner = (Spinner) findViewById(R.id.mainOptionspn);
		// initialize adapter
		mainOptionAdapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,mainOption);
		mainOptionAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
		// bind adapter and view
		mainOptionSpinner.setAdapter(mainOptionAdapter);
		mainOptionSpinner.setOnItemSelectedListener(mainOptionListener);

		// Initialization xml component
		subOption1eText = (EditText) findViewById(R.id.subOption1txt);
		subOption1eText.setInputType(InputType.TYPE_CLASS_NUMBER
				| InputType.TYPE_NUMBER_FLAG_SIGNED
				| InputType.TYPE_NUMBER_FLAG_DECIMAL);
		subOption2eText = (EditText) findViewById(R.id.subOption2txt);
		subOption2eText.setInputType(InputType.TYPE_CLASS_NUMBER
				| InputType.TYPE_NUMBER_FLAG_SIGNED
				| InputType.TYPE_NUMBER_FLAG_DECIMAL);
		calculateButton = (Button) findViewById(R.id.calculatebtn);
		clearButton = (Button) findViewById(R.id.clearbtn);

		// add listener
		calculateButton.setOnClickListener(calculateClick);
		clearButton.setOnClickListener(clearClick);
	}

	/* Main Option Listener *********************************/
	OnItemSelectedListener mainOptionListener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View v, int position,
				long id) {

			/* Temperature Option *********************************/
			if (mainOption[position] == mainOption[0]) {

				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,temperature);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,temperature);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}

			/* Length Option *********************************/
			else if (mainOption[position] == mainOption[1]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,length);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,length);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}

			/* Mass Option *********************************/
			else if (mainOption[position] == mainOption[2]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,mass);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,mass);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}
			
			/* Speed Option *********************************/
			else if (mainOption[position] == mainOption[3]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,speed);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,speed);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}
			
			/* Blood Sugar Option *********************************/
			else if (mainOption[position] == mainOption[4]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,bloodSugar);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,bloodSugar);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}
			
			/* Data Transfer Option *********************************/
			else if (mainOption[position] == mainOption[5]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,dataTransfer);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,dataTransfer);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}
			
			/* Area Option *********************************/
			else if (mainOption[position] == mainOption[6]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,area);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,area);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}
			
			/* Time Option *********************************/
			else if (mainOption[position] == mainOption[7]) {
				
				subOption1eText.setText("");
				subOption2eText.setText("");
				
				// Sub Option 1
				subOption1Spinner = (Spinner) findViewById(R.id.sunOption1spn);
				subOption1Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,time);
				subOption1Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);				
				subOption1Spinner.setAdapter(subOption1Adapter);

				// Sub Option 2
				subOption2Spinner = (Spinner) findViewById(R.id.subOption2spn);
				subOption2Adapter = new ArrayAdapter<String>(Main.this, R.layout.simple_spinner_item,time);
				subOption2Adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);	
				subOption2Spinner.setAdapter(subOption2Adapter);

			}

		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
		}

	};
	
	

	/* Clear Button Method *********************************/
	OnClickListener clearClick = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Toast.makeText(getApplicationContext(), "Clear", Toast.LENGTH_SHORT)
					.show();
			subOption1eText.setText("");
			subOption2eText.setText(""); 
		}
	};
	
	
	

	/* Calculate Button Method *********************************/
	OnClickListener calculateClick = new OnClickListener() {

		@Override
		public void onClick(View arg0) {

			try {
				String mainOptionCheek = mainOptionSpinner.getSelectedItem()
						.toString();
				String subOption1CheekString = subOption1Spinner
						.getSelectedItem().toString();
				String subOption2CheekString = subOption2Spinner
						.getSelectedItem().toString();
				double subOption1EditText = Double.parseDouble(subOption1eText
						.getText().toString());

				// Showing Temperature Result
				if (mainOptionCheek == "Temperature") {

					double result = Temperature.temperature(
							subOption1CheekString, subOption2CheekString,
							subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.###").format(result)));
				}

				// Showing Length Result
				else if (mainOptionCheek == "Length") {
					double result = Length.length(subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}

				// Showing Mass Result
				else if (mainOptionCheek == "Mass") {
					double result = Mass.mass(subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}
				
				// Showing Speed Result
				else if (mainOptionCheek == "Speed") {
					double result = Speed.speed (subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}
				
				// Showing Blood Sugar Result
				else if (mainOptionCheek == "Blood Sugar") {
					double result = BloodSugar.bloodSugar (subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}
				
				// Showing Data Transfer Result
				else if (mainOptionCheek == "Data Transfer") {
					double result = DataTransfer.dataTransfer (subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}
				
				// Showing Area Result
				else if (mainOptionCheek == "Area") {
					double result = Area.area (subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}
				
				// Showing Time Result
				else if (mainOptionCheek == "Time") {
					double result = com.sunapps.unitconverter.Time.time (subOption1CheekString,
							subOption2CheekString, subOption1EditText);
					subOption2eText.setText(String.valueOf(new DecimalFormat(
							"#.#####").format(result)));
				}
			}

			catch (Exception ex) {

				Toast.makeText(getApplicationContext(),
						"Please, Enter a value", Toast.LENGTH_SHORT).show();

			}
		}
	};
	
	
	
	/***************************** Home Screen ShortCut Creating Code **********************************************************/
	
	public void createShortcut () {	
		Intent HomeScreenShortCut= new Intent(getApplicationContext(),
                Main.class);
		
        HomeScreenShortCut.setAction(Intent.ACTION_MAIN);
        HomeScreenShortCut.putExtra("Duplicate", true); 
        //shortcutIntent is added with addIntent 
        Intent addIntent = new Intent();
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, HomeScreenShortCut);
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "Unit Converter");
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
            Intent.ShortcutIconResource.fromContext(getApplicationContext(),
                        R.drawable.ic_launcher));

        addIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT"); 

        getApplicationContext().sendBroadcast(addIntent);
        
        Toast.makeText(getApplicationContext(), "Shortcut Created", Toast.LENGTH_SHORT)
		.show();
        
	}


	/***************************** Home Screen ShortCut Removing Code **********************************************************/
	/*
	private void removeShortcut() {

	    Intent shortcutIntent = new Intent(getApplicationContext(),
	            Main.class);
	    shortcutIntent.setAction(Intent.ACTION_MAIN);
	     
	    Intent addIntent = new Intent();
	    addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
	    addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "Unit Converter");
	 
	    addIntent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
	   getApplicationContext().sendBroadcast(addIntent);
	    
	    Toast.makeText(getApplicationContext(), "Shortcut Removed", Toast.LENGTH_SHORT)
		.show();
	    
	} */

}
