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
				//s = Integer.parseInt(EditText.getText().toString());
				
				if (oldTime > 0) {   
				float b = (float) 0.000000278;
					float z = (float) 0.001;
					
				float h = delta * z ;
				float ss = (float) 0.002089;
				float v = ss/h;
				//DecimalFormat df = new DecimalFormat("#.#####"); df.format(0.912385);
				
				
					tvOut.setText(""+ h);
				}  
				
				oldTime=time;
				
				
				}
				};
			

		// присвоим обработчик кнопке OK (btnOk) иии
		btnOk.setOnClickListener(oclBtnOk);

		
}
		@Override

	public boolean  onKeyDown(int keyCode, KeyEvent event) {
		// Обработайте нажатие, верните true, если обработка выполнена
		if (keyCode == KeyEvent.KEYCODE_INFO)
		{
			tvOut.setText("ok");
		return true;
		
			} 
	 return super.onKeyDown(keyCode, event);
	 }
	 }
