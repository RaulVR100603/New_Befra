package com.example.befra;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.content.*;


public class MainActivity2 extends Activity {

	EditText e1,e2;
	String[] informacion;
	final static String guardar=("com.example.befra.MainActivity2;");
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);


e1=(EditText)findViewById(R.id.editText1);
e2=(EditText)findViewById(R.id.editText2);

informacion=new String[2];

    }
	
	public void a(View View)
	{
		
		informacion[0]=e1.getText().toString();
    	informacion[1]=e2.getText().toString();
    	
    	Intent ventana3=new Intent(this,MainActivity3.class);
    	ventana3.putExtra(guardar, informacion);
    	startActivity(ventana3);
		
	}
	
}

