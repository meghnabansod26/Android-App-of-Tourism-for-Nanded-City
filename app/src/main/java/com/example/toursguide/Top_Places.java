package com.example.toursguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Top_Places extends AppCompatActivity {
    ImageView m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_places);
        TextView t7= (TextView) findViewById(R.id.textView8);
        t7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t8= (TextView) findViewById(R.id.textView9);
        t8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t9= (TextView) findViewById(R.id.textView10);
        t9.setMovementMethod(LinkMovementMethod.getInstance());

    }
}