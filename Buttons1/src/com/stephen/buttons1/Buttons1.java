package com.stephen.buttons1;



import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;

public class Buttons1 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//AnimationView av = new AnimationView(getApplicationContext());
		setContentView(R.layout.activity_buttons1);
		//surface = (SurfaceView) find
		
		//requestWindowFeature(Window.FEATURE_NO_TITLE); // remove the title bar

        /*Display display = getWindowManager().getDefaultDisplay();
        
        DisplayMetrics outMetrics = new DisplayMetrics();
        
		display.getMetrics(outMetrics);*/
		
		//setContentView(new AnimationView(getApplicationContext()));
		
	}
	
}
