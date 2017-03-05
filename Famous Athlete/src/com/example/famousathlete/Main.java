package com.example.famousathlete;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();

        TabSpec photospec = tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.tab1));
        Intent photoIntent = new Intent(this, Tab1.class);
        photospec.setContent(photoIntent);
        
        TabSpec athleteSpec = tabHost.newTabSpec("Athlete");
        athleteSpec.setIndicator("Athelete", getResources().getDrawable(R.drawable.tab1));
        Intent athleteIntent = new Intent(thi
        		s, Tab2.class);
        athleteSpec.setContent(athleteIntent);
        
        TabSpec webSpec = tabHost.newTabSpec("Website");
        athleteSpec.setIndicator("Website", getResources().getDrawable(R.drawable.tab1));
        Intent webIntent = new Intent(this, Tab3.class);
        webSpec.setContent(webIntent);
        tabHost.addTab(photospec);
        tabHost.addTab(athleteSpec);
        tabHost.addTab(webSpec);
    }

	private TabHost getTabHost() {
		// TODO Auto-generated method stub
		return null;
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
