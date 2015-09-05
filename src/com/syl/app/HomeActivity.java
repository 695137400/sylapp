package com.syl.app;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.graphics.*;

public class HomeActivity extends Activity
{

	Button homeMenu;
	Button typeBtn;
	Button vipBtn;
	Button brandBtn;
	Button shopBtn;
	Button orderBtn;

	LinearLayout leftNavit;
	LinearLayout viplt;
	LinearLayout typelt;
	LinearLayout brandlt;
	LinearLayout shoplt;
	LinearLayout orderlt;
	LinearLayout defelt;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		homeMenu = (Button)findViewById(R.id.homeMenu);
		typeBtn = (Button)findViewById(R.id.typeBtn);
		vipBtn = (Button)findViewById(R.id.vipBtn);
		brandBtn = (Button)findViewById(R.id.brandBtn);
		shopBtn = (Button)findViewById(R.id.shopBtn);
		orderBtn = (Button)findViewById(R.id.orderBtn);


		leftNavit = (LinearLayout)findViewById(R.id.leftNavit);
		viplt = (LinearLayout)findViewById(R.id.vipLayout);
		typelt = (LinearLayout)findViewById(R.id.typeLayout);
		brandlt = (LinearLayout)findViewById(R.id.brandLayout);
		shoplt = (LinearLayout)findViewById(R.id.shopLayout);
		orderlt = (LinearLayout)findViewById(R.id.orderLayout);
		defelt = (LinearLayout)findViewById(R.id.defeltlayout);

		/**
		 *主页菜单
		 */
		homeMenu.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					//Toast.makeText(HomeActivity.this,""+(leftNavit.getVisibility()==0),0).show();
					leftNavit.setRight(350);
					leftNavit.setBackgroundColor(Color.parseColor("#1061A5"));
					if (leftNavit.getVisibility() == 0)
					{
						leftNavit.setVisibility(8);
					}
					else
					{
						leftNavit.setVisibility(0);
					}

				}
			});

		typeBtn.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					leftNavit.setVisibility(8);
					viplt.setVisibility(8);
					typelt.setVisibility(0);
					brandlt.setVisibility(8);
					shoplt.setVisibility(8);
					orderlt.setVisibility(8);
					defelt.setVisibility(8);
				}
			});

		vipBtn.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					leftNavit.setVisibility(8);
					viplt.setVisibility(0);
					typelt.setVisibility(8);
					brandlt.setVisibility(8);
					shoplt.setVisibility(8);
					orderlt.setVisibility(8);
					defelt.setVisibility(8);
				}
			});
		
		brandBtn.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					leftNavit.setVisibility(8);
					viplt.setVisibility(8);
					typelt.setVisibility(8);
					brandlt.setVisibility(0);
					shoplt.setVisibility(8);
					orderlt.setVisibility(8);
					defelt.setVisibility(8);	
				}
			});

		shoplt.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					Toast.makeText(HomeActivity.this,"",0).show();
					leftNavit.setVisibility(8);
					viplt.setVisibility(8);
					typelt.setVisibility(8);
					brandlt.setVisibility(8);
					shoplt.setVisibility(0);
					orderlt.setVisibility(8);
					defelt.setVisibility(8);

				}
			});

		orderlt.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1)
				{
					leftNavit.setVisibility(8);
					viplt.setVisibility(8);
					typelt.setVisibility(8);
					brandlt.setVisibility(8);
					shoplt.setVisibility(8);
					orderlt.setVisibility(0);
					defelt.setVisibility(8);
				}
			});

	}

}
