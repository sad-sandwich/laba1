package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // устанавливаем в качестве интерфейса файл
        // second_layout.xml
        setContentView(R.layout.second_layout);
        // получаем элемент textView
        TextView textView = this.<TextView>findViewById(R.id.header);
        // переустанавливаем у него текст
        textView.setText("Hello from Java!");
    }
}