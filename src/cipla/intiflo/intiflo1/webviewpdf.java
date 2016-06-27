package cipla.intiflo.intiflo1;

import android.app.Activity;
import android.os.Bundle;

import android.text.Html;
import android.webkit.WebView;
import android.widget.ScrollView;
//import archu.pdf.R;
import android.widget.TextView;

public class webviewpdf extends Activity {

	
	String s="";
		final String mimeType = "text/html";     
		final String encoding = "utf-8"; 
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewpdf);
       WebView w=(WebView) findViewById(R.id.webView1);
       w.loadUrl("file:///android_asset/data.html");
       //w.loadDataWithBaseURL("", s, mimeType, encoding, ""); 
     
}
}
