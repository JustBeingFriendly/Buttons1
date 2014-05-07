package com.stephen.buttons1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
//import android.view.SurfaceView;

public class AnimationView extends SurfaceView implements Runnable, SurfaceHolder.Callback{
	
	Thread animation = null;
	private boolean running;
	Bitmap spaceShip;
	
	public AnimationView(Context context) {
		super(context);
		spaceShip = BitmapFactory.decodeResource(getResources(), R.drawable.craftmain);
		 
		getHolder().addCallback(this);
		//(SurfaceView) findViewById(R.id.animationView1)
		//getHolder().addCallback(super.getApplicationContext());
	}
	
	public AnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        getHolder().addCallback(this);
        // TODO Auto-generated constructor stub
    }

    public AnimationView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        getHolder().addCallback(this);
        // TODO Auto-generated constructor stub
    }

	
	@Override
	public void surfaceChanged(SurfaceHolder holder, int format,
			int width, int height) {
	}
	
	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// start the animation thread once the surface has been created		
		animation = new Thread(this);
		running = true;		
		animation.start(); // start a new thread to handle this activities animation		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		running = false;
		if(animation != null)
		{
			try {
				animation.join();  // finish the animation thread and let the animation thread die a natural death
			} 
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}		
	}
	
	int xPos = 0;
	int yPos = 0;
	
	@Override
	public void run() {
		while(running)
		{
			Canvas canvas = null;
			SurfaceHolder holder = getHolder();
			
			synchronized(holder)
			{
				canvas = holder.lockCanvas();								
				canvas.scale(1, 1);
				canvas.drawColor(Color.BLACK);
				canvas.drawBitmap(spaceShip, xPos, yPos, null);
				xPos+=5;
				yPos+=5;
			}
			
			try 
			{
				Thread.sleep(40);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			holder.unlockCanvasAndPost(canvas);			
		}		
	}
	
	
	
}
