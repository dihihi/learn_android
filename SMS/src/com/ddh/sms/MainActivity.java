package com.ddh.sms;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText phoneView;
	private EditText contentView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		phoneView = (EditText) findViewById(R.id.phone);
		contentView = (EditText) findViewById(R.id.conetent);
		
		Button sendBtn = (Button)findViewById(R.id.sendBtn);
		sendBtn.setOnClickListener(new SendOnClickListener());
	}

	private class SendOnClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			String phone = phoneView.getText().toString();
			String content = contentView.getText().toString();
			
			SmsManager smsManager = SmsManager.getDefault();
			ArrayList<String> texts = smsManager.divideMessage(content);
			
			for (String text : texts) {
				smsManager.sendTextMessage(phone, null, text, null, null);
			}
			
			Toast.makeText(MainActivity.this, R.string.successTip, Toast.LENGTH_SHORT).show();
		}
		
	}
}
