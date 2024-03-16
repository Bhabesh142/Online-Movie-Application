package com.example.androidstart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText e3,e4,e5,e6;
    Button b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        b5=(Button)findViewById(R.id.bt5);
        b6=(Button)findViewById(R.id.bt6);
        e3=(EditText)findViewById(R.id.ed3);
        e4=(EditText)findViewById(R.id.ed4);
        e5=(EditText)findViewById(R.id.ed5);
        e6=(EditText)findViewById(R.id.ed6);
        String un=e3.getText().toString();

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(),Details.class);
                i3.putExtra("UName",un);
                startActivity(i3);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello " +un+ "You are Registered Succesfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}