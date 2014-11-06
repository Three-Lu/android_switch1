package com.example.android_switch1;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity {
     private Button a,b,c,back;
     PopupWindow popup ;
   //  RelativeLayout loginLayout;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		a=(Button)findViewById(R.id.button1);
		b=(Button)findViewById(R.id.button2);
		c=(Button)findViewById(R.id.button3);
		back=(Button)findViewById(R.id.back);
		c.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inte = new Intent(MainActivity.this, Three.class);
				startActivity(inte);//启动对应的Activity  此处为硬编码  不介意这么写  写成action形式 最好
				Log.i("-------------", "------------------");
				
				
			}
		} );
	}
	public void myOnClick(View v) {
		int btnId = v.getId();
		switch (btnId) {//判断点击的按钮
		case R.id.button1://登录按钮
			Intent intent = new Intent(MainActivity.this, One.class);
			startActivity(intent);//启动对应的Activity  此处为硬编码  不介意这么写  写成action形式 最好
			
			break;

		case R.id.button2://注册按钮
			b.setTextColor(Color.RED);//文本变成红色
			View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.four, null);
			popup = new PopupWindow(view, AbsListView.LayoutParams.FILL_PARENT, AbsListView.LayoutParams.WRAP_CONTENT);
			popup.showAsDropDown(b);
			popup.setFocusable(false);
			popup.setOutsideTouchable(true);
			popup.showAtLocation(b, Gravity.CENTER, 0, 0);
			popup.update();
			//loginLayout.setBackgroundColor(Color.GRAY);
			b.setBackgroundColor(Color.GRAY);
			b.setEnabled(false);
			
			break;
			
			
		case R.id.button3://注册按钮
			Intent inte = new Intent(MainActivity.this, Three.class);
			startActivity(inte);//启动对应的Activity  此处为硬编码  不介意这么写  写成action形式 最好
			Log.i("-------------", "------------------");
			
			break;
		}
	}

	
}
