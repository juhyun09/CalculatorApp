package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view){
        // check if valid input (int) is entered
        EditText input1 = (EditText) findViewById(R.id.input1); // get text from input1
        EditText input2 = (EditText) findViewById(R.id.input2); // get text from input1
        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());

        if(view.getId() == R.id.addButton){
            goToActivity(Integer.toString(num1+num2));
        } else if(view.getId() == R.id.subtractButton) {
            goToActivity(Integer.toString(num1-num2));
        } else if(view.getId() == R.id.timesButton) {
            goToActivity(Integer.toString(num1*num2));
        } else if(view.getId() == R.id.divideButton) {
            if(num2 == 0)
                Toast.makeText(MainActivity.this, "Please enter non-zero values.", Toast.LENGTH_LONG).show();
            else
                goToActivity(Integer.toString(num1/num2));
        } else {
            Toast.makeText(MainActivity.this, "Unrecognized button clicked.", Toast.LENGTH_LONG).show();
        }
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