package com.example.androidstart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Collections;

public class Details extends AppCompatActivity {

    Spinner s1,s2;
    Button b7;
    String []mvnm={"WAR","KRRISH","3 Idiots","Baaghi 2", "Bodyguard", "Badhaai Ho", "Airlift", "Jolly LLB 2", "Kaabil", "Runway 34"};
    int []dt={Integer.parseInt("07:00 - 10:00, 10:30 - 01:30, 02:00-05:00, 05:30-08:30, 09:00-12:00")};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        s1=(Spinner)findViewById(R.id.sp1);
        ArrayAdapter aa=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,mvnm);
        aa.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(aa);

        s2=(Spinner)findViewById(R.id.sp2);
        ArrayAdapter aa1=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Collections.singletonList(dt));
        aa.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(aa1);

//        Intent i=getIntent();
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(getApplicationContext(),Ticket.class);
                startActivity(i5);
                Intent i6=new Intent(getApplicationContext(),Ticket.class);
                startActivity(i6);
                Intent i7=new Intent(getApplicationContext(),Ticket.class);
                startActivity(i7);
            }
        });
    }
}