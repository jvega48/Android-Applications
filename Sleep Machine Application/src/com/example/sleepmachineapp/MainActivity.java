package com.example.sleepmachineapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	Button btFan, btWave;
	MediaPlayer mpFan, mpWave;
	int playing;
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		btFan =(Button) findViewById(R.id.btnFan);
		btWave = (Button) findViewById(R.id.btnOcean);

		btWave.setOnClickListener(bWave);
		btFan.setOnClickListener(bFan);
		
		mpFan = new MediaPlayer();
		mpFan = MediaPlayer.create(this, R.raw.fan);
		mpWave = new MediaPlayer();
		mpWave = MediaPlayer.create(this, R.raw.waves);
				
		playing = 0;
	}

	Button.OnClickListener bFan = new OnClickListener()
	{

		@Override
		public void onClick(View v) 
		{
			switch(playing)
			{
			case 0:
				mpFan.start();
				playing = 1;
				btFan.setText("Pause Fan");
				btWave.setVisibility(View.INVISIBLE);
				
				break;
			case 1:
				mpFan.pause();
				playing = 0;
				btFan.setText("Play Fan");
				btWave.setVisibility(View.VISIBLE);
				break;
			}
			
		}
		
	};
	Button.OnClickListener bWave = new OnClickListener()
	{

		@Override
		public void onClick(View v) 
		{
			switch(playing)
			{
			case 0:
				mpWave.start();
				playing = 1;
				btWave.setText("Pause Waves");
				btFan.setVisibility(View.INVISIBLE);
				break;
			case 1:
				mpWave.pause();
				playing = 0;
				btWave.setText("Play Waves");
				btFan.setVisibility(View.VISIBLE);
				break;
			}
						
			
		}
		
	};
}
