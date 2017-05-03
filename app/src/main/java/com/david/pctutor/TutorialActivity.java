package com.david.pctutor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class TutorialActivity extends AppCompatActivity
{
	private Toolbar mToolbar;
	private ViewPager mViewPager;
	private TutorialVPAdapter mVPAdapter;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_layout);
		
		mToolbar = (Toolbar) findViewById(R.id.tutorial_toolbar);
		mViewPager = (ViewPager) findViewById(R.id.tutorial_viewpager);
		
		setSupportActionBar(mToolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setTitle("Updating Device Drivers");
		
		mVPAdapter = new TutorialVPAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mVPAdapter);
		mViewPager.setCurrentItem(0);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.tutorial_menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case android.R.id.home:
				onBackPressed();
				return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
