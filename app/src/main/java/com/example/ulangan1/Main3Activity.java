package com.example.ulangan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent=getIntent();

        String result = intent.getStringExtra("data");
        TextView tv = findViewById(R.id.tvresult);
        tv.setText(result);
    }
}
