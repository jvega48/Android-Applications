package com.example.famousathlete;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Tab3 extends Activity 
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab3);
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.google.com")));
	}
}
