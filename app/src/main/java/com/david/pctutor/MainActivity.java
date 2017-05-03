package com.david.pctutor;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
	private Toolbar mToolbar;
	private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle mDrawerToggle;
	private CardView mDDCardview;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mToolbar = (Toolbar) findViewById(R.id.main_toolbar);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
		mDDCardview = (CardView) findViewById(R.id.update_device_drivers_cardview);
		
		setSupportActionBar(mToolbar);
		getSupportActionBar().setTitle("Home");
		getSupportActionBar().setDisplayShowTitleEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		
		setupNavDrawer();
		setDDCardviewListener();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.menu_main_toolbar, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		return super.onOptionsItemSelected(item);
	}
	
	private void setupNavDrawer()
	{
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.nav_drawer_opened, R.string.nav_drawer_closed)
		{
			@Override
			public void onDrawerOpened(View drawerView)
			{
				super.onDrawerOpened(drawerView);
			}
			
			@Override
			public void onDrawerClosed(View drawerView)
			{
				super.onDrawerClosed(drawerView);
			}
		};
		
		mDrawerLayout.addDrawerListener(mDrawerToggle);
		mDrawerToggle.syncState();
	}
	
	private void setDDCardviewListener()
	{
		mDDCardview.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				Intent intent = new Intent(MainActivity.this, TutorialActivity.class);
				startActivity(intent);
			}
		});
	}
}
