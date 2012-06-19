package com.robo.dojo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RobotiumTestsActivity extends Activity {
	private Button fillButton;
	private EditText editText;
	private Button cleanButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setControls();
    }

	private void setControls() {
		editText = (EditText)findViewById(R.id.textBox);
		
		fillButton = (Button)findViewById(R.id.fillButton);
		fillButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						editText.setText("Write something here");
					}
				});
			}
		});
		
		
		cleanButton = (Button)findViewById(R.id.cleanButton);
		cleanButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						editText.setText("");
					}
				});
			}
		});
		
	}
}