package com.comandapizza.pizzaorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PizzaPickerActivity extends Activity {

	Button BPizzaQuatroFormaggi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_picker_pizza);
		BPizzaQuatroFormaggi = (Button) findViewById(R.id.IDButtonQuatroFormaggi);
		BPizzaQuatroFormaggi.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent goToPizzaOptions = new Intent(PizzaPickerActivity.this,
						PizzaOptionsActivity.class);
				// goToPizzaOptions.
				startActivity(goToPizzaOptions);

			}
		});

	}
}
