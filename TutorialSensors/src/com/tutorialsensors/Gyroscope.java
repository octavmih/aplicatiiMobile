package com.tutorialsensors;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Gyroscope extends Activity implements SensorEventListener{
	
	SensorManager sm;
	Sensor gyroscopes;
	TextView gyroscope;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gyroscope);
		
		sm = (SensorManager) getSystemService(SENSOR_SERVICE);
		gyroscopes = sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
		sm.registerListener(this,gyroscopes,SensorManager.SENSOR_DELAY_NORMAL);

		gyroscope = (TextView) findViewById(R.id.gyroscope);
		
	}



	@Override
	public void onSensorChanged(SensorEvent event) {
			gyroscope.setText("X: "+event.values[0]+
				       "\nY: "+event.values[1]+
				       "\nZ: "+event.values[2]);
			   }
		
	

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}
}
