package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button move1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move1=findViewById(R.id.b1);
        move1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intend = new Intent( MainActivity.this,location.class);
             startActivity(intend);
            }

        });

    }
}