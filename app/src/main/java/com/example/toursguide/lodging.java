package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class lodging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodging);
        TextView t16= (TextView) findViewById(R.id.textView11);
        t16.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t17= (TextView) findViewById(R.id.textView12);
        t17.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t18= (TextView) findViewById(R.id.textView13);
        t18.setMovementMethod(LinkMovementMethod.getInstance());
    }
}