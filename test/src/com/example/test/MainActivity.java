package com.example.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button okBtn = (Button) findViewById(R.id.button1);
		
		okBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast toast = Toast.makeText(MainActivity.this, "点击了按钮", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
		
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast toast = Toast.makeText(MainActivity.this, "点击了按钮", Toast.LENGTH_SHORT);
				toast.show();
				Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
				startActivity(intent);
			}
		});
	}

	
	
}
