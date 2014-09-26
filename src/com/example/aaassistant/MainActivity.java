package com.example.aaassistant;

import com.example.aaassistant.adapter.AdapterAppGrid;
import com.example.aaassistant.base.ActivityBase;
import com.example.aaassistant.base.ActivityFrame;
import com.example.aaassistant.controls.SlideMenuView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends  ActivityFrame {

	AdapterAppGrid madapterAppGrid;
	GridView mGridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AppendMainView(R.layout.main_body);
		
		InitVariable();
		InitView();
		InitListener();
		BindData();
		CreateSlideView(R.array.SlideMenuCategory);
		
	}
	
	public void InitVariable(){
		madapterAppGrid=new AdapterAppGrid(this);
		
		
	}
	
	public void InitView(){
		mGridView=(GridView) this.findViewById(R.id.gridv_main);
		
		
	}
	
	public void InitListener(){
		
		
	}
	
	public void BindData(){
		
		mGridView.setAdapter(madapterAppGrid);
		
	}
	
	
	

}
