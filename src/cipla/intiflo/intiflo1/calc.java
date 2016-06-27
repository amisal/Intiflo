package cipla.intiflo.intiflo1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class calc extends Activity {
	int weight,age;
    float sc;
    String gender;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        Button bb= (Button) findViewById(R.id.button1);
        final RadioButton male = (RadioButton) findViewById(R.id.radio0);
        final RadioButton female = (RadioButton) findViewById(R.id.radio1);
        final EditText et1 =(EditText) findViewById(R.id.editText1);
      //  final EditText et2 =(EditText) findViewById(R.id.editText2);
        final EditText et3 =(EditText) findViewById(R.id.editText3);
        final EditText et4 =(EditText) findViewById(R.id.editText4);
        
     
   //et2.setEnabled(false);
   //////
        male.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 if(male.isChecked())
			        {
			        	//et2.setText("Male");
					gender="Male";
			        }
			        
			}
		});
        /////////////////////
 female.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 if(female.isChecked())
			        {
			        	//et2.setText("Female");
					gender="Female";
			        }
			        
			}
		});
 //////////////////////////////
 bb.setOnClickListener(new OnClickListener()
{
	
	public void onClick(View arg0) 
	{
		////////////////////////
	
		if(female.isChecked() || male.isChecked())
		{
			if(et1.getText().toString().equals(""))
			{
				Toast.makeText(calc.this,"Please enter weight",Toast.LENGTH_SHORT).show(); 
			}
			else
			{
				weight=Integer.valueOf(et1.getText().toString());
				 if(weight<1 || weight>600)
				 {
					 Toast.makeText(calc.this,"Please enter valid weight",Toast.LENGTH_SHORT).show();
					 
				 }
				 else
				 {
					 if(weight<37)
					 {
			  Toast.makeText(calc.this,"Weight should not be less than 37",Toast.LENGTH_SHORT).show();
					 }
					 else{
					 if(et3.getText().toString().equals(""))
					 {
						 Toast.makeText(calc.this,"Please enter age",Toast.LENGTH_SHORT).show();
					 }
					 else
					 {
						 age=Integer.valueOf(et3.getText().toString());
						 if(age<1 || age>150)
						 {
							 Toast.makeText(calc.this,"Please enter valid age",Toast.LENGTH_SHORT).show(); 
						 }
						 else
						 {
							 if(et4.getText().toString().equals(""))
							 {
								 Toast.makeText(calc.this,"Please enter serum creatinine",Toast.LENGTH_SHORT).show(); 
							 }
							 else
							 {
								 sc=Float.valueOf(et4.getText().toString());
								 if(sc<0.0 || sc>20.0)
								 {
									 Toast.makeText(calc.this,"Please enter valid serum creatinine",Toast.LENGTH_SHORT).show();  
								 }
								 else
								 {
									 
								String s1 = String.valueOf(weight);
								String s2 = gender;
								String s3 = String.valueOf(age);
								String s4 = String.valueOf(sc);
								Intent i = new Intent(calc.this, showfinal.class);
								i.putExtra("key1",s1);
								i.putExtra("key2",s2);
								i.putExtra("key3",s3);
								i.putExtra("key4",s4);
								startActivity(i); 
								 }
							 }
						 }
					 }
				 }
			}
			}
		}
		else
		{
			Toast.makeText(calc.this,"Please select gender",Toast.LENGTH_SHORT).show(); 
		}
			
	}
});

 
}
}
