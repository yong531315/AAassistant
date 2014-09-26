package com.example.aaassistant.base;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class ActivityBase  extends Activity{

	/**
	 * @param args
	 */
	

	public void showMsg(String pstrs){
		
		Toast.makeText(getApplicationContext(), pstrs, Toast.LENGTH_LONG).show();
		
	}
	
	public void openActivity(Class<?> pclass){
		Intent _intent=new Intent();
		_intent.setClass(getApplicationContext(), pclass);
		startActivity(_intent);
		
	}

}
