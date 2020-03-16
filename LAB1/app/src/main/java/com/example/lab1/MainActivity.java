package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText litesrEdit;
    private EditText gallonsEdit;
    private Button help_btn;
    double liters;
    double gallons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        litesrEdit = findViewById(R.id.liters_val);
        gallonsEdit= findViewById(R.id.gallons_val);

        help_btn = findViewById(R.id.help_btn);
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpActivity();
            }
        });
    }

    public void onButtonClick(View v)
    {
        liters = Double.parseDouble(litesrEdit.getText().toString());
        gallons = liters * 0.264172;
        gallonsEdit.setText(String.valueOf(gallons));
    }

    public void openHelpActivity()
    {
        EditText liters = (EditText) findViewById(R.id.liters_val);
        Double liters_val = Double.parseDouble(liters.getText().toString());

        EditText gallons = (EditText) findViewById(R.id.gallons_val);
        Double gallons_val= Double.parseDouble(gallons.getText().toString());

        Intent intent = new Intent(this, HelpActivity.class);
        intent.putExtra("liters", liters_val);
        intent.putExtra("gallons", gallons_val);
        startActivity(intent);
    }
}
