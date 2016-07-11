package com.inferno.fahim.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstNameEdittext;
    EditText lastNameEdittext;
    EditText middleNameEdittext;
    Button btnGetFullname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameEdittext=(EditText) findViewById(R.id.firstNameEdittext);
        lastNameEdittext=(EditText) findViewById(R.id.lastNameEdittext);
        middleNameEdittext=(EditText) findViewById(R.id.middleNameEdittext);
        btnGetFullname=(Button)findViewById(R.id.btnGetFullname);
        btnGetFullname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first=firstNameEdittext.getText().toString();
                String last=lastNameEdittext.getText().toString();
                String middle=middleNameEdittext.getText().toString();
                String full=first+" "+middle+" "+last;
                Toast.makeText(MainActivity.this,full,Toast.LENGTH_LONG).show();

            }
        });
    }
}
