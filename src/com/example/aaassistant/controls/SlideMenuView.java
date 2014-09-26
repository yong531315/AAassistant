package com.example.aaassistant.controls;

import java.util.ArrayList;
import java.util.List;

import com.example.aaassistant.R;
import com.example.aaassistant.adapter.AdapterList;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.RelativeLayout.LayoutParams;

public class SlideMenuView {
	
		Activity mActivity;
		List mList;
		boolean isClosed;
		RelativeLayout mBottomBox;
		
		
		public  SlideMenuView(Activity pActivity){
			this.mActivity=pActivity;
			InitVariable();
			InitView();
			InitListener();
			
		}
		public void InitListener(){
			mBottomBox.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toggle();
				}
			});
			
		}
		
		public void InitVariable(){
			 mList=new ArrayList();
		
			 isClosed=true;
			 
			
		}
		
		public void InitView(){
			mBottomBox=(RelativeLayout) mActivity.findViewById(R.id.inc_bottom_box);
			
		}
		
		public void BindList(){
			AdapterList adapterList=new AdapterList(mActivity, mList);
			ListView lv_list=(ListView) mBottomBox.findViewById(R.id.lv_list);
			lv_list.setAdapter(adapterList);
			lv_list.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
					
				}
			});
		}
	
	public void Open(){
		RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
		mBottomBox.setLayoutParams(params);
		isClosed=false;
	}
	
	public void Close(){
		RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,68);
		params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		mBottomBox.setLayoutParams(params);
		isClosed=true;
	}
	
	public void  Toggle(){
		if(isClosed){
			Open();
		}else{
			Close();
		}
		
	}
	
	public void Add(SlideMenuItem pSMItem){
		mList.add(pSMItem);
	}
	
	
	
	
	

}
