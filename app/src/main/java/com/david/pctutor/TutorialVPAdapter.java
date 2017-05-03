package com.david.pctutor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.david.pctutor.device_driver_tutorial.Step1DDFrag;
import com.david.pctutor.device_driver_tutorial.Step2DDFrag;


public class TutorialVPAdapter extends FragmentStatePagerAdapter
{
	public TutorialVPAdapter(FragmentManager fm)
	{
		super(fm);
	}
	
	@Override
	public Fragment getItem(int position)
	{
		switch (position)
		{
			case 0:
				return new Step1DDFrag();
			case 1:
				return new Step2DDFrag();
			default:
				return null;
		}
	}
	
	@Override
	public int getCount()
	{
		return 2;
	}
}
