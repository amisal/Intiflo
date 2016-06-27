package cipla.intiflo.intiflo1;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;




public class showresult extends Activity {
	
	public static String filename="Myprefs";
	SharedPreferences someData;
	String wt1,age1,gender1,sc1,bolus1,inf11,inf12,cc1;
	
	 public void onCreate(Bundle savedInstanceState)
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.showresult);
	        Intent receiver = getIntent();
	        someData=getSharedPreferences(filename, 0);
	        wt1=someData.getString("weight", "NA");
	        age1=someData.getString("age", "NA");
	        gender1=someData.getString("gender", "NA");
	        sc1=someData.getString("serumc", "NA");
	        bolus1=someData.getString("bolus", "NA");
	        inf11=someData.getString("infusion1", "NA");
	        inf12=someData.getString("infusion2", "NA");
	        cc1=someData.getString("cc", "NA");
	    	String s1 = receiver.getStringExtra("key11");
	    	String s2 = receiver.getStringExtra("key12");
	    	String s3 = receiver.getStringExtra("key13");
	    	String s4 = receiver.getStringExtra("key14");
	    	/*TextView tv1= (TextView) findViewById(R.id.txtbolus);
	    	tv1.setText(s1);*/
	    	TextView tv2= (TextView) findViewById(R.id.txtinf1);
	    	tv2.setText(s2);
	    	TextView tv3= (TextView) findViewById(R.id.txtinf2);
	    	tv3.setText(s3);
	    	TextView tv4= (TextView) findViewById(R.id.txtvolume);
	    	tv4.setText(s1);
	    	TextView tv_one=(TextView) findViewById(R.id.textView4);
	    	TextView tv_two=(TextView) findViewById(R.id.textView5);
	    	tv_one.setText("From 2mg/mL\n10 mL vial:");
	    	tv_two.setText("From 0.75mg/mL\n100 mL vial:");
	    	Button b= (Button) findViewById(R.id.button3) ;
	    	Button acs= (Button) findViewById(R.id.buttonacs);
	    	Button pci= (Button) findViewById(R.id.buttonpci);
	    	acs.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(showresult.this, ACS.class);
					startActivity(i);
				}
			});
	    	pci.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(showresult.this, PCI.class);
					startActivity(i);
				}
			});
	    	
	    	b.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(showresult.this, instruction.class);
						startActivity(i);
				}
			});
	    	
}
	 
	 @Override
		public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inf=getMenuInflater();
			inf.inflate(R.menu.mymenu, menu);
			return true;
		}	
		
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	            // For "Title only": Examples of matching an ID with one assigned in
	            //                   the XML
	            case R.id.item1:
	               
	            	Log.d("Anish", "hello menu");
	            	Intent smsIntent = new Intent(Intent.ACTION_VIEW); 
	            	smsIntent.setType("vnd.android-dir/mms-sms"); 
	            	smsIntent.putExtra("address", "9920279555"); 
	            	smsIntent.putExtra("sms_body","patient gender:"+ gender1+"\nWeight :"+ wt1+"\nSerum Creatinine :"+sc1+"\nCreatnin clearance:"+ cc1+"\nBolus volume:"+ bolus1+"ml /10 ml vial\nInfusion rate:"+ inf11+"ml/h 10 ml vial \nInfusion rate :"+inf12+" ml /h 100 ml vial "); 
	            	startActivity(smsIntent); 
	                return true;

	         
	        }

	        return false;
	    }
}