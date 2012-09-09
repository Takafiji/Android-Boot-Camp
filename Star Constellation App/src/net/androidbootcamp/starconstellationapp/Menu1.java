package net.androidbootcamp.starconstellationapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu1 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu1);
		Button pegasus = (Button)findViewById(R.id.btnPegasus);
		pegasus.setOnClickListener(new OnClickListener() {
				
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Menu1.this, Pegasus.class));
			}
		});
	}
}
