package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view){
        Log.i("INFO", "Button Pressed");
        // check if valid input (int) is entered
        EditText input1 = (EditText) findViewById(R.id.input1); // get text from input1
        EditText input2 = (EditText) findViewById(R.id.input2); // get text from input1
        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());
        Log.i("Info", "num1 = " + num1 + " num2 = "+ num2);

        if(view.getId() == R.id.addButton){
            Log.i("Info", "add clicked");
            goToActivity(Integer.toString(num1+num2));
        } else if(view.getId() == R.id.subtractButton) {
            Log.i("Info", "subtract clicked");
            goToActivity(Integer.toString(num1-num2));
        } else if(view.getId() == R.id.timesButton) {
            Log.i("Info", "times clicked");
            goToActivity(Integer.toString(num1*num2));
        } else if(view.getId() == R.id.divideButton) {
            Log.i("Info", "divide clicked");
            if(num2 == 0)
                Toast.makeText(MainActivity.this, "Please enter non-zero value for divisor.", Toast.LENGTH_LONG).show();
            else
                goToActivity(Double.toString(((double) num1)/((double)num2)));
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