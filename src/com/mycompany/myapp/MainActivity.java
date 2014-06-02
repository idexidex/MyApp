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
	EditText EditText;
	
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// найдем View-элементы
		tvOut = (TextView) findViewById(R.id.tvOut);
		btnOk = (Button) findViewById(R.id.btnOk);
		btnCancel = (Button) findViewById(R.id.btnCancel);
		EditText= (EditText) findViewById(R.id.EditText);
		
		// создаем обработчик нажатия
		OnClickListener oclBtnOk = new OnClickListener() {
			long time = 0;
			long oldTime = 0;
			long delta = 0;
			
			int s; 
			
			@Override
			public void onClick(View view) {
				// Меняем текст в TextView (tvOut)
				time  = System.currentTimeMillis();
				delta = time - oldTime;
				s = Integer.parseInt(EditText.getText().toString());
				
				if (oldTime > 0) {   
				float v = s/delta;
				float ch = delta ;
					tvOut.setText(""+v );
				}  
				
				oldTime=time;
				
				
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
