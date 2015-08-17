package com.ddh.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionActivity {

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
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
