package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class reli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reli);

        TextView t13= (TextView) findViewById(R.id.textView5);
        t13.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t14= (TextView) findViewById(R.id.textView6);
        t14.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t15= (TextView) findViewById(R.id.textView7);
        t15.setMovementMethod(LinkMovementMethod.getInstance());
    }
}