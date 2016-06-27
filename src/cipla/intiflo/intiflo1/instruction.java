package cipla.intiflo.intiflo1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;


public class instruction extends Activity {
	 public void onCreate(Bundle savedInstanceState)
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.instruction);
	        
	        WebView w=(WebView) findViewById(R.id.webView1);
	        w.loadUrl("file:///android_asset/intiflo_instruction.html");
	        
			Button bt2= (Button) findViewById(R.id.button1);
			bt2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(instruction.this, calcinfo.class);
		 			startActivity(i);
				}
			});
			/*Button bt1= (Button) findViewById(R.id.button1);
			bt1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(instruction.this, showresult.class);
		 			startActivity(i);
				}
			});*/
	        
	    }
}
