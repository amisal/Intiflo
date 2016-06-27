package cipla.intiflo.intiflo1;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Intiflo1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       /* Button b1 = (Button) findViewById(R.id.button2);
        
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder= new AlertDialog.Builder(Intiflo1Activity.this);
				builder.setMessage("Are you really want to exit?");
				builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						
						Intiflo1Activity.this.finish(); 
					}
				});
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						
						dialog.cancel(); 
						}
});
            AlertDialog alert= builder.create();
            alert.show();
			}
		});*/
       
       final Button b2= (Button) findViewById(R.id.button123);
       b2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			//b2.setBackgroundResource(R.drawable.yespressed);
			Intent i = new Intent(Intiflo1Activity.this, calcinfo.class);
			startActivity(i);

		}
	});
    }
}