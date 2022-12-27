package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Hospitals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        TextView t4= (TextView) findViewById(R.id.textView20);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5= (TextView) findViewById(R.id.textView21);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6= (TextView) findViewById(R.id.textView22);
        t6.setMovementMethod(LinkMovementMethod.getInstance());

    }
}