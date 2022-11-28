package com.example.befra;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.ArrayList;





public class MainActivity4 extends Activity {

	EditText e1,e2,e3,e4,e5;
	TextView r;
	ArrayList<String> usuario=new ArrayList<String>();
	final static String guardar=("com.example.befra.MainActivity5;");
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity4);
		
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		e4=(EditText)findViewById(R.id.editText4);
		e5=(EditText)findViewById(R.id.editText5);
}
public void ingresar (View view)
{
	
	String a=e1.getText().toString();
	String b=e2.getText().toString();
	String c=e3.getText().toString();
	String d=e4.getText().toString();
	String f=e5.getText().toString();
	 
    if(usuario.contains(a)&&usuario.contains(b)&&usuario.contains(c)&&usuario.contains(d)&&usuario.contains(f))
	{
		Toast.makeText(this, "YA INGRESASTE ", 2).show();
	}
	else
	{
		usuario.add(e1.getText().toString());
		usuario.add(e2.getText().toString());
		usuario.add(e3.getText().toString());
		usuario.add(e4.getText().toString());
		usuario.add(e5.getText().toString());
		
		Toast.makeText(this,"USUARIO GUARDADO",2).show();
		
		Intent ventana5=new Intent(this,MainActivity5.class);
    	ventana5.putExtra(guardar, usuario);
    	startActivity(ventana5);
    	
    	usuario.add(e1.getText().toString());
    	usuario.add(e2.getText().toString());
    	usuario.add(e3.getText().toString());
    	usuario.add(e4.getText().toString());
    	usuario.add(e5.getText().toString());
}
	
}
}
