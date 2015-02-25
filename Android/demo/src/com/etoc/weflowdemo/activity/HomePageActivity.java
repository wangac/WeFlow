package com.etoc.weflowdemo.activity;

import com.etoc.weflowdemo.R;
import com.etoc.weflowdemo.view.MagicTextView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;

public class HomePageActivity extends TitleRootActivity {

	private RelativeLayout useFlowLayout = null;
	private RelativeLayout discoverLayout = null;
	//UI Component
	private MagicTextView mtvFlow;
	private RelativeLayout rlMakeFlow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initViews();
	}
	
	private void initViews() {
		setTitleText("微流量");
		setLeftButtonText("宝典");
		setRightButtonText("消息");
		
		useFlowLayout = (RelativeLayout) findViewById(R.id.rl_use_flow);
		discoverLayout = (RelativeLayout) findViewById(R.id.rl_discover);
		
		useFlowLayout.setOnClickListener(this);
		discoverLayout.setOnClickListener(this);
		mtvFlow = (MagicTextView) findViewById(R.id.tv_flow);
		mtvFlow.showNumberWithAnimation(98.5f, 1000);
		
		rlMakeFlow = (RelativeLayout) findViewById(R.id.rl_make_flow);
		rlMakeFlow.setOnClickListener(this);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(mtvFlow != null) {
			mtvFlow.showNumberWithAnimation(98.5f, 1000);
		}
	}
	
	
	@Override
	public boolean handleMessage(Message arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int subContentViewId() {
		// TODO Auto-generated method stub
		return R.layout.activity_homepage;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.rl_discover:
			break;
		case R.id.rl_make_flow:
			startActivity(new Intent(this, AdvertActivity.class));
			break;
		case R.id.rl_use_flow:
			break;

		default:
			break;
		}
		super.onClick(v);
	}

}
