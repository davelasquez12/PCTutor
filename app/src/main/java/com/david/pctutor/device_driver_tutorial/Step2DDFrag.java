package com.david.pctutor.device_driver_tutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.david.pctutor.R;
import com.squareup.picasso.Picasso;


public class Step2DDFrag extends Fragment
{
	private ImageView mImage1, mImage2, mImage3, mImage4, mImage5, mImage6;
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		
		View view = inflater.inflate(R.layout.step_two_dd_frag, container, false);
		mImage1 = (ImageView) view.findViewById(R.id.step2dd_01);
		mImage2 = (ImageView) view.findViewById(R.id.step2dd_02);
		mImage3 = (ImageView) view.findViewById(R.id.step2dd_03);
		mImage4 = (ImageView) view.findViewById(R.id.step2dd_04);
		mImage5 = (ImageView) view.findViewById(R.id.step2dd_05);
		mImage6 = (ImageView) view.findViewById(R.id.step2dd_06);
		
		Picasso.with(getActivity()).load(R.drawable.step2dd_01).into(mImage1);
		Picasso.with(getActivity()).load(R.drawable.step2dd_02).into(mImage2);
		Picasso.with(getActivity()).load(R.drawable.step2dd_03).into(mImage3);
		Picasso.with(getActivity()).load(R.drawable.step2dd_04).into(mImage4);
		Picasso.with(getActivity()).load(R.drawable.step2dd_05).into(mImage5);
		Picasso.with(getActivity()).load(R.drawable.step2dd_06).into(mImage6);
		return view;
	}
}
