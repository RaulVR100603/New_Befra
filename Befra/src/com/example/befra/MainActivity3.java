package com.example.befra;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;
import android.view.*;
import android.content.*;


public class MainActivity3 extends Activity {

	TextView n,u;
	String[] informacion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);

		n=(TextView)findViewById(R.id.textView4);
		u=(TextView)findViewById(R.id.textView5);
		
		Intent recuperar=getIntent();
		informacion=recuperar.getStringArrayExtra(MainActivity2.guardar);
		
		n.setText(informacion[0]);
		u.setText(informacion[1]);
		
	}
	
          public void sig (View view)
          {
        	  Intent ventana4=new Intent(this,MainActivity4.class);
          	startActivity(ventana4);
          }
}
