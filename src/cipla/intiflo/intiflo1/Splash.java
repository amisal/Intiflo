package cipla.intiflo.intiflo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Handler hand=new Handler();
	    hand.postDelayed(new SplashHandler(), 3000);
	}
	class SplashHandler implements Runnable {
    	public void run() {
			// TODO Auto-generated method stub
    	
			Intent intent = new Intent(Splash.this, Intiflo1Activity.class);
			startActivity(intent);
			Splash.this.finish();
            	
        }
        
		
	}

}
