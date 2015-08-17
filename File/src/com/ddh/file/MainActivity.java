package com.ddh.file;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText filenameView;
	private EditText contentView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		filenameView = (EditText) findViewById(R.id.filename);
		contentView = (EditText) findViewById(R.id.content);

		Button saveBtn = (Button) findViewById(R.id.save);

		saveBtn.setOnClickListener(new SaveListener());
	}

	private final class SaveListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {

			String filename = filenameView.getText().toString();
			String content = contentView.getText().toString();
			
			Log.i("test", getApplicationContext().getFilesDir().getAbsolutePath());
			FileService fileService = new FileService(getApplicationContext());
			try {
				fileService.save(filename, content);
				Toast.makeText(getApplicationContext(), R.string.success,
						Toast.LENGTH_SHORT).show();
			} catch (IOException e) {
				Toast.makeText(getApplicationContext(), R.string.fail,
						Toast.LENGTH_SHORT).show();
			}

		}

	}
}
