package cipla.intiflo.intiflo1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class dbhelper extends Activity
{  
	 //final String mimeType = "text/html";     
		//final String encoding = "utf-8"; 
		
		
	@Override public void onCreate(Bundle savedInstanceState) {   
		super.onCreate(savedInstanceState);   
		setContentView(R.layout.dbhelper);
	     WebView w=(WebView) findViewById(R.id.webView1);
	
		 w.loadUrl("file:///android_asset/data.html");
		 Button switchActivityBtn = (Button) findViewById(R.id.button1);
			/*switchActivityBtn.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					animatedStartActivity();
				}
			});*/
	
	} 
		


/*protected void onResume() {
	// animateIn this activity
	ActivitySwitcher.animationIn(findViewById(R.id.container2), getWindowManager());
	super.onResume();
}


private void animatedStartActivity() {
	// we only animateOut this activity here.
	// The new activity will animateIn from its onResume() - be sure to implement it.
	final Intent intent = new Intent(getApplicationContext(), calcinfo.class);
	// disable default animation for new intent
	intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
	ActivitySwitcher.animationOut(findViewById(R.id.container2), getWindowManager(), new ActivitySwitcher.AnimationFinishedListener() {
		public void onAnimationFinished() {
			startActivity(intent);
		}
	});
}*/
}