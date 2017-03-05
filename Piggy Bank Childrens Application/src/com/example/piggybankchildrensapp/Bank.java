package com.example.piggybankchildrensapp;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Bank extends Activity 
{	
	double currentBalance = 00.00;
	double totalBalance;
	double finalBalance;
	String groupChoice;
	@Override
	public void onCreate(Bundle saveInstanceState)
		{
			super.onCreate(saveInstanceState);
			setContentView(R.layout.bank_page);
			//Grab on text field called txtMoney.
			final EditText money =(EditText) findViewById(R.id.txtMoney);
			//Grab on spinner called txtGroup.
			final Spinner group =(Spinner) findViewById(R.id.txtGroup);
			//Grab the button btncalculate.
			Button cost = (Button) findViewById(R.id.btnCalculate);
			
			cost.setOnClickListener(new OnClickListener()
			{

					@Override
					public void onClick(View v) 
					{
						//Grab on text view field txtResult.
						// TODO Auto-generated method stub
						final TextView result =((TextView)findViewById(R.id.txtResult));
						totalBalance = Integer.parseInt(money.getText().toString());
						finalBalance = totalBalance + currentBalance;
						DecimalFormat currency = new DecimalFormat("$###,###.##");
						groupChoice = group.getSelectedItem().toString();
						result.setText("Total is " + 
						currency.format(finalBalance));
					}
				
			});
			
		}

}
