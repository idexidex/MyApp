package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity {

	TextView tvOut;
	Button btnOk;
	Button btnCancel;
	
	
	public interface GetTime {
		public long now();
	}
	
	public GetTime SystemTime = new GetTime() {
		@Override
		public long now() {	return System.currentTimeMillis(); }
	};

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// найдем View-элементы
		tvOut = (TextView) findViewById(R.id.tvOut);
		btnOk = (Button) findViewById(R.id.btnOk);
		btnCancel = (Button) findViewById(R.id.btnCancel);

		// создаем обработчик нажатия
		OnClickListener oclBtnOk = new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Меняем текст в TextView (tvOut)
				tvOut.setText("C" + SystemTime);
				

				}
				};
			

		// присвоим обработчик кнопке OK (btnOk) иии
		btnOk.setOnClickListener(oclBtnOk);
		
		
    OnClickListener oclBtnCancel = new OnClickListener() {
		@Override
		public void onClick(View v) {
			// Меняем текст в TextView (tvOut)
			tvOut.setText("Нажата кнопка Cancel");
			}
			};
			
			btnCancel.setOnClickListener(oclBtnCancel);
		
	 }
	 }
