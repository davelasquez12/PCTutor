package com.david.pctutor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class TutorialActivity extends AppCompatActivity
{
	private Toolbar mToolbar;
	private ViewPager mViewPager;
	private TutorialVPAdapter mVPAdapter;
	private TextView mStepTextView;
	private ImageView mPageLeftBtn, mPageRightBtn;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_layout);
		
		mToolbar = (Toolbar) findViewById(R.id.tutorial_toolbar);
		mViewPager = (ViewPager) findViewById(R.id.tutorial_viewpager);
		mStepTextView = (TextView) findViewById(R.id.step_text_view);
		mPageLeftBtn = (ImageView) findViewById(R.id.page_left_btn);
		mPageRightBtn = (ImageView) findViewById(R.id.page_right_btn);
		
		setSupportActionBar(mToolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setTitle("Updating Device Drivers");
		
		mVPAdapter = new TutorialVPAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mVPAdapter);
		mViewPager.setOffscreenPageLimit(2);
		mViewPager.setCurrentItem(0);
		mStepTextView.setText("Step 1");
		setListeners();
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
	
	private void setListeners()
	{
		mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
			{
				
			}
			
			@Override
			public void onPageSelected(int position)
			{
				if(position == 0)
					mStepTextView.setText("Step 1");
				else if(position == 1)
					mStepTextView.setText("Step 2");
				else
					mStepTextView.setText("Step 3");
			}
			
			@Override
			public void onPageScrollStateChanged(int state)
			{
				
			}
		});
		
		mPageLeftBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				mViewPager.setCurrentItem(mViewPager.getCurrentItem()-1);
			}
		});
		
		mPageRightBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
			}
		});
	}
}
