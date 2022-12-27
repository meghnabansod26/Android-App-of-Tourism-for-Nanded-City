package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        TextView t10= (TextView) findViewById(R.id.textView16);
        t10.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t11= (TextView) findViewById(R.id.textView17);
        t11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t12= (TextView) findViewById(R.id.textView18);
        t12.setMovementMethod(LinkMovementMethod.getInstance());
    }
}