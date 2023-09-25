package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {

    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        resultView = (TextView) findViewById(R.id.resultView);
        Intent intent=getIntent();
        String str = intent.getStringExtra("message");
        resultView.setText(str);
    }
}