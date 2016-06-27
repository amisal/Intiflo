package cipla.intiflo.intiflo1;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;


public class contraindication extends Activity {
	public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contraindication);
        
        WebView w=(WebView) findViewById(R.id.webView1);
        w.loadUrl("file:///android_asset/intiflo_contraindication.html");
        
		Button bt1 =(Button) findViewById(R.id.button1);
		Button bt2 =(Button) findViewById(R.id.button2);
		bt1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(contraindication.this, calcinfo.class);
				startActivity(i);
			}
		});
bt2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			
				// TODO Auto-generated method stub
			/*	calc.finish();
				calcinfo.finish();
				contraindication.this.finish();
				dbhelper.finish();
				instruction.finish();
				Intiflo1Activity.finish();
				showfinal.finish();
				showresult.finish();
				webviewpdf.finish();
				Intent intent = new Intent(getApplicationContext(), "//Your activity to be invoked");   
				intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP);   
				startActivity(intent);  */
				//super.f
				
				/*Intent myIntent = new Intent(Context.getApplicationContext(), contraindication.class);
				myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(myIntent); finish(); */
			}
		});
    }

}
