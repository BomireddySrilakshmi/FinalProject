package com.example.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JockDisplay extends AppCompatActivity {
    TextView joke_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jock_display);
        joke_text=findViewById(R.id.joke_tv);
        Intent intent=getIntent();
        String joke=intent.getStringExtra("joke");
        joke_text.setText(joke);
    }
}
