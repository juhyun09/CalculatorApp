package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){
        // check if valid input (int) is entered
        EditText input1 = (EditText) findViewById(R.id.input1); // get text from input1
        EditText input2 = (EditText) findViewById(R.id.input2); // get text from input1


    }
    public void goToActivity(String s){
        Intent intent = new Intent(this, ShowResult.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}