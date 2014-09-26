package com.example.aaassistant.adapter;

import java.util.List;

import com.example.aaassistant.R;
import com.example.aaassistant.controls.SlideMenuItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AdapterList extends AdapterBase {

	Context mContext;
	List mList;
	ViewHolder vHolder=new ViewHolder();
	
	LayoutInflater inflater=getInflater();
	public AdapterList(Context pContext, List pList) {
		super(pContext, pList);
		this.mContext=pContext;
		this.mList=pList;
		
		
		
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if(convertView==null){
			convertView=inflater.inflate(R.layout.listitem, null);
			
			vHolder.tv_listitem=(TextView) convertView.findViewById(R.id.tv_llistitem);
			convertView.setTag(vHolder);
		}else{
			vHolder=(ViewHolder) convertView.getTag();
			
		}
		SlideMenuItem slideMenuItem=(SlideMenuItem) mList.get(position);
		String _title=slideMenuItem.getTitle();
		vHolder.tv_listitem.setText(_title);
		
		return convertView;
	}
	
  class ViewHolder{
	  TextView tv_listitem;
  }

}


