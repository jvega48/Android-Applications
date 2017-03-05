package com.example.famousathlete;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Tab1 extends Activity 
{
		public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.tab1);
			GridView g = (GridView) findViewById(R.id.photos);
			g.setAdapter(new ImageAdapter(this));
		}
		public class ImageAdapter extends BaseAdapter
		{	
			private Context context;
			private Integer[] Athlete= {R.drawable.ibrahimovic, R.drawable.luissuarez, R.drawable.neymar};

			public ImageAdapter(Context c) 
			{
				context = c;
			}

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 0;
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
			public View getView(int arg0, View arg1, ViewGroup arg2) 
			{
				ImageView pic = new ImageView(context);
				pic.setLayoutParams(new GridView.LayoutParams(275,250));
				pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
				pic.setPadding(8,8,8,8);
				pic.setImageResource(Athlete[arg0]);
				return pic;
			}}
}
