package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.text.*;

public class MainActivity extends Activity {

	TextView tvOut;
	Button btnOk;
	Button btnCancel;
	EditText EditText;
	TextView distanse;
	TextView Time;
	Button cnl;
	TextView lap1;
	TextView lap2;
	TextView lap3;
	TextView lap4;
	TextView lap5;
	TextView lap6;
	 
	float ddistanse = 0;
	
	
	
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// найдем View-элементы
		tvOut = (TextView) findViewById(R.id.tvOut);
		btnOk = (Button) findViewById(R.id.btnOk);
		Time= (TextView) findViewById(R.id.Time);
		distanse = (TextView) findViewById(R.id.distanse);
		cnl = (Button) findViewById(R.id.cnl);
		lap1 = (TextView) findViewById(R.id.lap1);
		lap2 = (TextView) findViewById(R.id.lap2);
		lap3 = (TextView) findViewById(R.id.lap3);
		lap4 = (TextView) findViewById(R.id.lap4);
		lap5 = (TextView) findViewById(R.id.lap5);
		lap6 = (TextView) findViewById(R.id.lap6);
		
	
		//пытаюсь зоздать обработку поле время , чтобы оно стартовало только при первом нажатии
	/*	public void T( View view){
			int t=0;
			
			@Override
			
			//t ++;
			if (t>0)
				{
				*/
			
//создаю обработчик кнопки кгруг чтобы записывать значения в текстовые поля lap1 > lap6
	//	OnClickListener oclLAP = new OnClickListener() {
			
		
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
				float b = (float) 0.000000278;// часов в одной милисек
				float h = delta * b;
				float ss = (float) 0.002089;//длина окружности колеса 16 " в КМ
				float sss= (float) 0.000001;// мм в км
				float v = ss/h;
				ddistanse = ss + ddistanse;
				DecimalFormat df = new DecimalFormat("#.#");
					DecimalFormat rf = new DecimalFormat("#.###");

					
				
				//df.format(0.912385);
				
				
					tvOut.setText(""+ df.format(v)+ " КМ/Ч");
					distanse.setText("" + rf.format(ddistanse) + "КМ");
				}  
				
				oldTime=time;
				
				
				}
				};
			
				
			
		// присвоим обработчик кнопке OK (btnOk) иии
		btnOk.setOnClickListener(oclBtnOk);
		OnClickListener oclcnl = new OnClickListener() {
			@Override
			public void onClick(View view) {
				ddistanse = 0;
				DecimalFormat tf = new DecimalFormat("#.###");
				
				distanse.setText("" + tf.format(ddistanse) + "КМ");
			
				}
				};
		cnl.setOnClickListener(oclcnl);
		
		}
		@Override

	public boolean  onKeyDown(int keyCode, KeyEvent event) {
			
		//super.onKeyUp(keyCode, event);
		/*/Обработайте нажатие, верните true, если обработка выполнена
			  
			long time = 0;
			long oldTime = 0;
			long delta = 0;

			int s; 
			time  = System.currentTimeMillis();
			delta = time - oldTime;
			if (oldTime > 0) {  // Как послеэтого ставить return
				//return true;
				//}
				float b = (float) 0.000000278;// часов в одной милисек
				float h = delta * b;
				float ss = (float) 0.002089;//длина окружности колеса 16 " в КМ
				float sss= (float) 0.000001;// мм в км
				float v = ss/h;
				DecimalFormat df = new DecimalFormat("#.#");

				*/
			
		if (keyCode == KeyEvent.KEYCODE_Q /*KEYCODE_VOLUME_DOWN */)//  INFO)
			btnOk.performClick(); //тормозит при быстром нажатии
			{
		/*	long time = 0;
			long oldTime = 0;
			long delta = 0;

			int s; 
			time  = System.currentTimeMillis();
			delta = time - oldTime;
			if (oldTime > 0) {  // Как послеэтого ставить return
				//return true;
				//}
				float b = (float) 0.000000278;// часов в одной милисек
				float h = delta * b;
				float ss = (float) 0.002089;//длина окружности колеса 16 " в КМ
				float sss= (float) 0.000001;// мм в км
				float v = ss/h;
				DecimalFormat df = new DecimalFormat("#.#");
				
		
				
			tvOut.setText(""+ df.format(v)+ " КМ/Ч");
			
			oldTime=time;*/
			}
			
			
			
			return true;
		
			}
			
	//return super.onKeyDown(keyCode, event);
	 
	 
	 
	 
	 }
	
