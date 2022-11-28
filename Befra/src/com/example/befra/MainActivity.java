package com.example.befra;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.widget.*;
import android.view.*;



public class MainActivity extends Activity {

	EditText e1,e2;
	TextView r;
	String[] informacion;
	final static String guardar=("com.example.befra.MainActivity2");
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		r=(TextView)findViewById(R.id.textView3);
		
		informacion=new String[2];
    
	}

	public void i (View view)
	{
		informacion[0]=e1.getText().toString();
    	informacion[1]=e2.getText().toString();
    	if (informacion[0].equals("BEFRAUNIDAD")&&informacion[1].equals("enviosytraslados"))
    	{
    		Intent ventana2=new Intent(this,MainActivity2.class);
    		ventana2.putExtra(guardar, informacion);
    		startActivity(ventana2);
    	}
    	else{
    		
    		r.setText("usuario y/o contraseña incorrecto intentelo de nuevo");
	}
}

}