package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class location extends AppCompatActivity {
   private Button move2;
   private Button move3;
   private  Button move4;
   private Button move5;
   private Button move6;
   private Button move7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        move2= findViewById(R.id.b2);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( location.this,Top_Places.class);
                startActivity(intent);
            }
        });
        move3= findViewById(R.id.b3);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( location.this,lodging.class);
                startActivity(intent);
            }
        });
        move4= findViewById(R.id.b4);
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( location.this,Restaurant.class);
                startActivity(intent);
            }
        });
        move5= findViewById(R.id.b5);
        move5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( location.this,reli.class);
                startActivity(intent);
            }
        });

        move6= findViewById(R.id.b7);
        move6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( location.this,Hospitals.class);
                startActivity(intent);
            }
        });

        move7 = findViewById(R.id.b6);
        move7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( location.this,pumps.class);
                startActivity(intent);
            }
        });

    }
}