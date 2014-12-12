package com.tutorialsensors;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//butonul pt Accelerometru
		Button btnAccelerometer = (Button) findViewById(R.id.btnAccelerometer);
		btnAccelerometer.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v){
				Intent intent = new Intent(v.getContext(), Accelerometer.class);
				startActivityForResult(intent, 0);
			}
		});
		
		//butonul pt Gyroscope
		Button btnGyroscope = (Button) findViewById(R.id.btnGyroscope);
		btnGyroscope.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v){
				Intent intent = new Intent(v.getContext(), Gyroscope.class);
				startActivityForResult(intent, 0);
			}
		});
		
		/**
		 * lista senzorilor din device
		SensorManager sManager = (SensorManager) this.getSystemService(this.SENSOR_SERVICE);
        List<Sensor> sList = sManager.getSensorList(Sensor.TYPE_ALL);

        List<String> sNames = new ArrayList();
        for (int i =0; i<sList.size();i++){
            sNames.add(((Sensor)sList.get(i)).getName());
        }

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sNames));
        getListView().setTextFilterEnabled(true);
		*/
	}


}
