package com.stephen.buttons1;



import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Buttons1 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//AnimationView av = new AnimationView(getApplicationContext());
		requestWindowFeature(Window.FEATURE_NO_TITLE); // remove the title bar
		setContentView(R.layout.activity_buttons1);
		//surface = (SurfaceView) find
		
		//

        /*Display display = getWindowManager().getDefaultDisplay();
        
        DisplayMetrics outMetrics = new DisplayMetrics();
        
		display.getMetrics(outMetrics);*/
		
		//setContentView(new AnimationView(getApplicationContext()));
		
	}
	
}

/*
 A handle to the thread that's actually running the animation. *//*
private LunarThread mLunarThread;
 A handle to the View in which the game is running. *//*
private LunarView mLunarView;*/