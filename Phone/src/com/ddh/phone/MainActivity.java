package com.ddh.phone;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView mobileView;
	
	private Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			Toast.makeText(MainActivity.this, msg.obj.toString(), Toast.LENGTH_LONG).show();
		}
		
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mobileView = (TextView) findViewById(R.id.mobile);
		
		Button phoneBtn = (Button) findViewById(R.id.phone);
		phoneBtn.setOnClickListener(new PhoneClickListener());
		
	}

	private class PhoneClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			String mobile = mobileView.getText().toString();
			
			Intent intent = new Intent();
			intent.setAction("android.intent.action.CALL");
			intent.setData(Uri.parse("tel:" + mobile));
			
			startActivity(intent);
		}
		
	}
	
	
	public void click(View view) {
		new Thread() {

			@Override
			public void run() {
				super.run();
				Message msg = new Message();
				msg.what = 1;
				msg.obj = mobileView.getText().toString();
				handler.sendMessage(msg);
			}
			
		}.start();
	}
	

}
