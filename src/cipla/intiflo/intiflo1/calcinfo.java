package cipla.intiflo.intiflo1;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class calcinfo extends Activity {
	 Boolean flag;
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.calcinfo);
	        flag=true;
	        Button b2 = (Button) findViewById(R.id.button23);
	        b2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
			
					
					Intent i = new Intent(calcinfo.this, dbhelper.class);
					startActivity(i);
					
				}
			});
	        Button b4 = (Button) findViewById(R.id.button1);
	        b4.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					Intent i = new Intent(calcinfo.this, calc.class);
					startActivity(i);
					
				}
			});
	       
	      
}


	  
		
		}
