package com.example.aaassistant.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AdapterBase extends BaseAdapter {

	private Context mContext;
	private List mlist;
	private LayoutInflater inflater;
	
	
	public  AdapterBase(Context pContext,List pList){
		this.mContext=pContext;
		this.mlist=pList;
		inflater=LayoutInflater.from(mContext);
		
	}
	
	public Context getContext(){
		return mContext;
	}
	public  LayoutInflater getInflater(){
		return inflater;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
