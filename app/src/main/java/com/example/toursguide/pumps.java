package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pumps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pumps);
        TextView t1= (TextView) findViewById(R.id.textView24);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2= (TextView) findViewById(R.id.textView25);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3= (TextView) findViewById(R.id.textView26);
        t1.setMovementMethod(LinkMovementMethod.getInstance());


    }
}