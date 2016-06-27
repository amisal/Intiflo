package cipla.intiflo.intiflo1;


/*(140 - Age) × (actual body wt in kg)
	____________________ 
	72 × (Serum creatinine) 
	 Females 
	 (140 - age) × (actual body wt in kg) × (0.85)
	______________________ 
	72 × (serum creatinine) 
	 */
import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class showfinal extends Activity {
	float cc;
	float bolus;
	float inf1;
	float inf2;
	String volume,s1,s2,s3,s4,ss1,ss2,ss3,ss4;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showfinal);
        TextView tv2=(TextView) findViewById(R.id.textgender);
        TextView tv1=(TextView) findViewById(R.id.textweight);
        TextView tv3=(TextView) findViewById(R.id.textage);
        TextView tv4=(TextView) findViewById(R.id.sc);
        Intent receiver = getIntent();
    	s1 = receiver.getStringExtra("key1");
    	s2 = receiver.getStringExtra("key2");
    	s3 = receiver.getStringExtra("key3");
    	s4 = receiver.getStringExtra("key4");
    	Log.d("archana", s1);
   	    Log.d("archana", s2);
   	    Log.d("archana", s3);
   	    Log.d("archana", s4);
   	    
   	    int wtbolus=Integer.valueOf(s1.trim()).intValue();
   	    float weight = Float.valueOf(s1.trim()).floatValue();
   	    float age = Float.valueOf(s3.trim()).floatValue();
   	    float sc = Float.valueOf(s4.trim()).floatValue();
   	 if (s2.equalsIgnoreCase("Male"))
   	 {
   		 cc=(float) ((140.0-age)*weight/(72.0*sc));
   		
   	 }
   	 else
	 {
   		 cc=(float) ((140.0-age)*weight*0.85/(72.0*sc));
   		
   	 }
   	 tv1.setText(s1);    //weight
   	 tv2.setText(s2);    //gender
   	 tv3.setText(s3);    //age
   	 tv4.setText(s4);    //sc
    	TextView tv=(TextView) findViewById(R.id.cc);
    	DecimalFormat dtime = new DecimalFormat("#.##"); 
    	 tv.setText(String.valueOf(dtime.format(cc)));
    	 if(cc<50.0){
    		 tv.setBackgroundColor(Color.RED);
    	
    	 if(37<=wtbolus && wtbolus<=41)
    	 {
    		 bolus= (float) 3.4;
    		 inf1=(float) 1.0;
    		 inf2=(float) 3.0;
    	 }
    	 else if(42<=wtbolus && wtbolus<=46)
    	 {
    		 bolus= (float) 4.0;
    		 inf1=(float) 1.3;
    		 inf2=(float) 3.5;
    	 }
    	 else if(47<=wtbolus && wtbolus<=53)
    	 {
    		 bolus= (float) 4.5;
    		 inf1=(float) 1.5;
    		 inf2=(float) 4.0;
    	 }
    	 else if(54<=wtbolus && wtbolus<=59)
    	 {
    		 bolus= (float) 5.0;
    		 inf1=(float) 1.8;
    		 inf2=(float) 4.5;
    	 }
    	 else if(60<=wtbolus && wtbolus<=65)
    	 {
    		 bolus= (float) 5.6;
    		 inf1=(float) 1.9;
    		 inf2=(float) 5.0;
    	 }
    	 else if(66<=wtbolus && wtbolus<=71)
    	 {
    		 bolus= (float) 6.2;
    		 inf1=(float) 2.0;
    		 inf2=(float) 5.5;
    	 }
    	 else if(72<=wtbolus && wtbolus<=78)
    	 {
    		 bolus= (float) 6.8;
    		 inf1=(float) 2.3;
    		 inf2=(float) 6.0;
    	 }
    	 else if(79<=wtbolus && wtbolus<=84)
    	 {
    		 bolus= (float) 7.3;
    		 inf1=(float) 2.5;
    		 inf2=(float) 6.5;
    	 }
    	 else if(85<=wtbolus && wtbolus<=90)
    	 {
    		 bolus= (float) 7.9;
    		 inf1=(float) 2.7;
    		 inf2=(float) 7.0;
    	 }
    	 else if(91<=wtbolus && wtbolus<=96)
    	 {
    		 bolus= (float) 8.5;
    		 inf1=(float) 2.8;
    		 inf2=(float) 7.5;
    	 }
    	 else if(97<=wtbolus && wtbolus<=103)
    	 {
    		 bolus= (float) 9.0;
    		 inf1=(float) 3.0;
    		 inf2=(float) 8.0;
    	 }
    	 else if(104<=wtbolus && wtbolus<=109)
    	 {
    		 bolus= (float) 9.5;
    		 inf1=(float) 3.2;
    		 inf2=(float) 8.5;
    	 }
    	 else if(110<=wtbolus && wtbolus<=115)
    	 {
    		 bolus= (float) 10.2;
    		 inf1=(float) 3.4;
    		 inf2=(float) 9.0;
    	 }
    	 else if(116<=wtbolus && wtbolus<=121)
    	 {
    		 bolus= (float) 11.3;
    		 inf1=(float) 3.5;
    		 inf2=(float) 9.5;
    	 }
    	 else if(121<wtbolus )
    	 {
    		 bolus= (float) 11.7;
    		 inf1=(float) 3.7;
    		 inf2=(float) 10.0;
    	 }
    	 }
    	 else if(cc>=50.0)
    	 {
    		 
    		 if(37<=wtbolus && wtbolus<=41)
        	 {
        		 bolus= (float) 3.4;
        		 inf1=(float) 2.0;
        		 inf2=(float) 6.0;
        	 }
        	 else if(42<=wtbolus && wtbolus<=46)
        	 {
        		 bolus= (float) 4.0;
        		 inf1=(float) 2.5;
        		 inf2=(float) 7.0;
        	 }
        	 else if(47<=wtbolus && wtbolus<=53)
        	 {
        		 bolus= (float) 4.5;
        		 inf1=(float) 3.0;
        		 inf2=(float) 8.0;
        	 }
        	 else if(54<=wtbolus && wtbolus<=59)
        	 {
        		 bolus= (float) 5.0;
        		 inf1=(float) 3.5;
        		 inf2=(float) 9.0;
        	 }
        	 else if(60<=wtbolus && wtbolus<=65)
        	 {
        		 bolus= (float) 5.6;
        		 inf1=(float) 3.8;
        		 inf2=(float) 10.0;
        	 }
        	 else if(66<=wtbolus && wtbolus<=71)
        	 {
        		 bolus= (float) 6.2;
        		 inf1=(float) 4.0;
        		 inf2=(float) 11.0;
        	 }
        	 else if(72<=wtbolus && wtbolus<=78)
        	 {
        		 bolus= (float) 6.8;
        		 inf1=(float) 4.5;
        		 inf2=(float) 12.0;
        	 }
        	 else if(79<=wtbolus && wtbolus<=84)
        	 {
        		 bolus= (float) 7.3;
        		 inf1=(float) 5.0;
        		 inf2=(float) 13.0;
        	 }
        	 else if(85<=wtbolus && wtbolus<=90)
        	 {
        		 bolus= (float) 7.9;
        		 inf1=(float) 5.3;
        		 inf2=(float) 14.0;
        	 }
        	 else if(91<=wtbolus && wtbolus<=96)
        	 {
        		 bolus= (float) 8.5;
        		 inf1=(float) 5.6;
        		 inf2=(float) 15.0;
        	 }
        	 else if(97<=wtbolus && wtbolus<=103)
        	 {
        		 bolus= (float) 9.0;
        		 inf1=(float) 6.0;
        		 inf2=(float) 16.0;
        	 }
        	 else if(104<=wtbolus && wtbolus<=109)
        	 {
        		 bolus= (float) 9.5;
        		 inf1=(float) 6.4;
        		 inf2=(float) 17.0;
        	 }
        	 else if(110<=wtbolus && wtbolus<=115)
        	 {
        		 bolus= (float) 10.2;
        		 inf1=(float) 6.8;
        		 inf2=(float) 18.0;
        	 }
        	 else if(116<=wtbolus && wtbolus<=121)
        	 {
        		 bolus= (float) 11.3;
        		 inf1=(float) 7.0;
        		 inf2=(float) 19.0;
        	 }
        	 else if(121<wtbolus )
        	 {
        		 bolus= (float) 11.7;
        		 inf1=(float) 7.4;
        		 inf2=(float) 20.0;
        	 }
    	 }
    	 if (cc<50.0)
    	 {
    	volume="1.0 µg/kg/min";
    	 }
    	 else   	 
    	 {
    	 volume="2.0 µg/kg/min";
    	 }
    	Button bt1=(Button) findViewById(R.id.next);
    	bt1.setOnClickListener(new OnClickListener() {
    		
    		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ss1 = String.valueOf(bolus);
	    		ss2 = String.valueOf(inf1);
	    		ss3 = String.valueOf(inf2);
	    		ss4 = String.valueOf(volume);
	    		SharedPreferences someData=getSharedPreferences("Myprefs", 0);
                SharedPreferences.Editor editor= someData.edit();
  				editor.putString("weight", s1);
  				editor.putString("gender", s2);
  				editor.putString("age", s3);
  				editor.putString("serumc", s4);
  				editor.putString("bolus", ss1);
  				editor.putString("infusion1", ss2);
  				editor.putString("infusion2", ss3);
  				editor.putString("cc", String.valueOf(cc));
  				editor.commit();
				Intent i = new Intent(showfinal.this, showresult.class);
		    	 i.putExtra("key11",ss1);
		    	 i.putExtra("key12",ss2);
		    	 i.putExtra("key13",ss3);
		    	 i.putExtra("key14",ss4);	
					startActivity(i);
			}
		});
}
}