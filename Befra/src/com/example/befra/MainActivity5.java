package com.example.befra;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;
import android.view.*;
import android.text.TextUtils;
import android.util.Log;
import android.content.*;
import java.util.ArrayList;


public class MainActivity5 extends Activity {

	TextView r;
	ArrayList<String> usuario=new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity5);
		

        r=(TextView)findViewById(R.id.textView1);
	
		Intent recuperar=getIntent();
	    usuario=recuperar.getStringArrayListExtra(MainActivity4.guardar);
			
	    r.setText(""+usuario);
		
	}
	
	public void dr (View view)
	{
		
		
		
	}

	public void r (View view)
	{
		Intent ventana4=new Intent (this , MainActivity4.class);
	    startActivity(ventana4);
		
	}
}
