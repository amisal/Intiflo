package cipla.intiflo.intiflo1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ACS extends Activity{
	
	String s="";
	final String mimeType = "text/html";     
	final String encoding = "utf-8"; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acs);
		WebView w=(WebView) findViewById(R.id.webView1);
	    w.loadUrl("file:///android_asset/acs.html");
	}

}
