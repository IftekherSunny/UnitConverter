package com.sunapps.unitconverter;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

@SuppressLint("NewApi")
public class About extends FragmentActivity {
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		// For showing back button
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
	}
	
	
	// For going main activity
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:			
			NavUtils.navigateUpTo(this,
					new Intent(this, Main.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
