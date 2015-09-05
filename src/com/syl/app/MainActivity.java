package com.syl.app;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.view.View.*;

public class MainActivity extends Activity
{
	Button gotHome;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		gotHome = (Button) findViewById(R.id.goHome);
		gotHome.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					try
					{
						Intent intent = new Intent();
						intent.setClass(MainActivity.this, HomeActivity.class);
						startActivity(intent);
						//startActivity(intent);
						//MainActivity.this.finish();
					}
					catch (Exception e)
					{
						Toast.makeText(MainActivity.this, "" + e.getMessage(), 0).show();
					}
				}
			});
    }
}
