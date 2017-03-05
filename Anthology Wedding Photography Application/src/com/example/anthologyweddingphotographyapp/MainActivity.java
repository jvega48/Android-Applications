package com.example.anthologyweddingphotographyapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

	Integer [] weddingImg = {R.drawable.images1, R.drawable.images2, R.drawable.images3, R.drawable.images4
			 , R.drawable.images5, R.drawable.images6, R.drawable.images7, R.drawable.images8, 
			  R.drawable.images9, R.drawable.images10};
	ImageView imageView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gallery ga = (Gallery) findViewById(R.id.gallery1);
        imageView = (ImageView) findViewById(R.id.imageView);
        ga.setAdapter(new ImageAdapter(this));
        ga.setOnItemClickListener(new OnItemClickListener()
        {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) 
			{
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), " You have selected picture " + (arg2 + 1) + 
						" of your sample wedding pictures. ", Toast.LENGTH_SHORT).show();
				imageView.setImageResource(weddingImg[arg2]);
			}
        	
        	
        });
    }
    public class ImageAdapter extends BaseAdapter
    {
    	Context context;
    	
		public ImageAdapter(Context c) {
			// TODO Auto-generated constructor stub
			context = c;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			
			return weddingImg.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			ImageView pic = new ImageView(context);
			pic.setImageResource(weddingImg[arg0]);
			pic.setScaleType(ImageView.ScaleType.FIT_XY);
			pic.setLayoutParams(new Gallery.LayoutParams(200,200));
			
			return pic;
		}
    	
    	
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
