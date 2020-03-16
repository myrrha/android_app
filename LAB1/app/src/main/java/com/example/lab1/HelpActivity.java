package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Intent intent = getIntent();
        Double liters = intent.getDoubleExtra("liters", 0);
        Double gallons = intent.getDoubleExtra("gallons", 0);

        TextView liters_txt = (TextView) findViewById(R.id.liters_val);
        liters_txt.setText(""+liters);

        TextView gallons_txt = (TextView) findViewById(R.id.gallons_val);
        gallons_txt.setText(""+gallons);
    }
}
