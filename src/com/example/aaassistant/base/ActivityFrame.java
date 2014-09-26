package com.example.aaassistant.base;

import com.example.aaassistant.R;
import com.example.aaassistant.controls.SlideMenuItem;
import com.example.aaassistant.controls.SlideMenuView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ActivityFrame extends ActivityBase {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
	}
	
	public void AppendMainView(int pResId){
		LinearLayout _layMain=(LinearLayout) findViewById(R.id.lay_main);
				
			 View _view=LayoutInflater.from(this).inflate(pResId, null);
			 RelativeLayout.LayoutParams _layoutParams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
			 
			 _layMain.addView(_view,_layoutParams);
		
		
		
	}
	
	public void CreateSlideView(int pResId){
		
			SlideMenuView slideMenuView=new  SlideMenuView(this);
			String[] strs=getResources().getStringArray(pResId);
			for(int i=0;i<strs.length;i++){
				slideMenuView.Add(new SlideMenuItem(strs[i], i));
		}
		
			slideMenuView.BindList();//我为什么会想不到这个？
	}
}
