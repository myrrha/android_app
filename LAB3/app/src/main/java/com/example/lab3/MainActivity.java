package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.Phaser;

public class MainActivity extends AppCompatActivity {

    private String new_string;
    private String left_str;
    private String right_str;
    private TextView tv_text;
    private TextView tv_result;
    private Button gen_btn;
    private String[] array_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gen_btn = findViewById(R.id.gen_btn);
        gen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genNewString();
            }
        });

    }

    protected void genNewString()
    {
        PhaserGen phaser_obj = new PhaserGen();
        new_string = "Все, что вам нужно это - " + phaser_obj.GenNew();
        tv_text = findViewById(R.id.tv_text);
        tv_text.setText(new_string);
        //Разделяем строку на символе -
        array_str = new_string.split("это -");
        //Меняем местами левую и правую часть
        left_str = array_str[1];
        right_str = array_str[0];
        //убираем лишиние пробелы
        left_str = left_str.trim();
        right_str = right_str.trim();
        //приводим правую часть к нижнему регистру
        right_str = right_str.toLowerCase();
        //Заглавная буква
        String s1, s2;
        s1 = left_str.substring(0,1).toUpperCase();
        s2 = left_str.substring(1);

        left_str = s1+s2;

        tv_result = findViewById(R.id.tv_result);
        tv_result.setText(left_str + " это - "+right_str+".");

    }
}
