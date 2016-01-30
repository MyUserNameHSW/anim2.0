package com.example.anim2_0;

import android.os.Bundle;
import android.os.Handler;
import android.R.integer;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initAnim1();
	}

	private void initAnim1() {
		// TODO Auto-generated method stub
		AnimationSet animationSet = new AnimationSet(true);
		WindowManager wm = this.getWindowManager();
		int width = wm.getDefaultDisplay().getWidth();
		int height = wm.getDefaultDisplay().getHeight();
		ImageView imageView = (ImageView) findViewById(R.id.img1);
		TranslateAnimation animation1 = new TranslateAnimation(0,width-300,0,0);
		TranslateAnimation animation2 = new TranslateAnimation(0,0,0,height-300);
		animation1.setDuration(5000);
		animation2.setDuration(5000);
		animationSet.addAnimation(animation1);
		animationSet.addAnimation(animation2);
		animationSet.setFillAfter(true);
		imageView.startAnimation(animationSet);
		
	}

//	public void rotateyAnimRun(final View view) {
//					ObjectAnimator
//							.ofFloat(view, "rotationY", 180.0F, 0.0F)
//							.setDuration(1000)//
//							.start();
//
//	}
	
}
	