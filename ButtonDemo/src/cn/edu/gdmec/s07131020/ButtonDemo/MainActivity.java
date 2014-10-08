package cn.edu.gdmec.s07131020.ButtonDemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTextView;
	Button myBtn;
	ImageButton myImageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.textView1);
		
		myTextView.setText("haha");
	
		myBtn = (Button) findViewById(R.id.button1);
		//Ϊ��ťע����������
		myBtn.setOnClickListener(buttonlistener);
		
		myImageBtn = (ImageButton) findViewById(R.id.imageButton1);
		myImageBtn.setImageResource(R.drawable.ic_launcher);
    }

    Button.OnClickListener buttonlistener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 myTextView.setText(" click button");
		}
    
    };
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
