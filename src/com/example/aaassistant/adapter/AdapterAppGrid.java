package com.example.aaassistant.adapter;

import com.example.aaassistant.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterAppGrid extends BaseAdapter {

	private class Holder {
		ImageView img_griditem;
		TextView tv_griditem;
	}

	private Integer[] mImageInteger = { R.drawable.grid_payout,
			R.drawable.grid_bill, R.drawable.grid_report,
			R.drawable.grid_account_book, R.drawable.grid_category,
			R.drawable.grid_user, };

	private String[] mImageString = new String[6];

	private Context mContext;

	public AdapterAppGrid(Context pContext) {
		mContext = pContext;
		mImageString[0] = pContext.getString(R.string.appGridTextPayoutAdd);
		mImageString[1] = pContext.getString(R.string.appGridTextPayoutManage);
		mImageString[2] = pContext
				.getString(R.string.appGridTextStatisticsManage);
		mImageString[3] = pContext
				.getString(R.string.appGridTextAccountBookManage);
		mImageString[4] = pContext
				.getString(R.string.appGridTextCategoryManage);
		mImageString[5] = pContext.getString(R.string.appGridTextUserManage);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mImageString.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mImageString[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
	Holder _holder = new Holder();
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.griditemview, null);
			_holder.img_griditem = (ImageView) convertView
					.findViewById(R.id.img_griditem);
			_holder.tv_griditem = (TextView) convertView
					.findViewById(R.id.tv_griditem);
			convertView.setTag(_holder);
		} else {

			_holder = (Holder) convertView.getTag();
		}

		_holder.img_griditem.setImageResource(mImageInteger[position]);
		_holder.tv_griditem.setText(mImageString[position]);
		
		return convertView;
	}
}
