package com.example.currencyconversionapplication;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
		double dollarEnter;
		double pesos = 16.5957;
		double euro = 0.907525;
		double canadian = 1.31660;
		double totalConverted;
		long maxAmmount = 100000;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        
       final RadioButton conToEuro = (RadioButton) findViewById(R.id.conEuro);
       final RadioButton conToPeso = (RadioButton) findViewById(R.id.conPesos);
       final RadioButton conToCan = (RadioButton) findViewById(R.id.conCanada);
       final EditText money = (EditText) findViewById(R.id.txtHint);
       final EditText result = (EditText) findViewById(R.id.txtResult);

       Button convert = (Button)findViewById(R.id.btnConvert);

       convert.setOnClickListener(new OnClickListener(){
    	   		
    	   @Override
    	   public void onClick(View v) 
    	   {
			
    		 //Retrieves the value of the user to check and see if the input
   			dollarEnter = Double.parseDouble(money.getText().toString());
   			//formats 
   			DecimalFormat tenth = new DecimalFormat("###,###.##");
   			//checks the current checked state of the view
   			if(conToEuro.isChecked())
   				{
   					if(dollarEnter <= maxAmmount)
   					{
   						totalConverted = dollarEnter * euro;
   						result.setText(tenth.format(totalConverted) + " euro's. ");
   					}
   					else 
   					{
   						Toast.makeText(MainActivity.this, " Money converstion must be below $100,000 U.S Dollars.", 
   								Toast.LENGTH_LONG).show(); //() Goes before the period or dot operator.
   					}
   				}
   			if(conToPeso.isChecked())
   				{
   					if(dollarEnter <= maxAmmount )
   						{
       						totalConverted = dollarEnter * pesos;
       						result.setText(tenth.format(totalConverted) + " peso's. ");
       					}
       					else 
       					{
       						Toast.makeText(MainActivity.this, " Money converstion must be below $100,000 U.S Dollars.", 
       								Toast.LENGTH_LONG).show(); 
       					}
   						
   				
   				}
   			if(conToCan.isChecked())
				{
					if(dollarEnter <= maxAmmount )
						{
   						totalConverted = dollarEnter * canadian;
   						result.setText(tenth.format(totalConverted) + " canadian's. ");
   					}
   					else 
   					{
   						Toast.makeText(MainActivity.this, " Money converstion must be below $100,000 U.S Dollars.", 
   								Toast.LENGTH_LONG).show();
   					}
						
				
				}
    	   
    	   }
    	   
       });

        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
