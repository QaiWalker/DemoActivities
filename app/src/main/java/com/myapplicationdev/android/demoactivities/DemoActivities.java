package com.myapplicationdev.android.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DemoActivities extends AppCompatActivity {

    Button btnDone;
    EditText etName, etAge;
    TextView tvName, tvAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        Button btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the EditText that user keys in name
                EditText etName = (EditText) findViewById(R.id.etName);
                // Get the EditText that user keys in age
                EditText etAge = (EditText) findViewById(R.id.etAge);
                // Put the name and age into an array
                String[] info = {etName.getText().toString(),
                        etAge.getText().toString()};
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(DemoActivities.this,
                        DemoActivities2.class);

                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }});
    }
}
