package com.codeclan.example.calculater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculaterActivity extends AppCompatActivity {
    EditText Num1_EditText;
    EditText Num2_EditText;
    Button AddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);

        Num1_EditText = (EditText) findViewById(R.id.num1_edittext);
        Num2_EditText = (EditText) findViewById(R.id.num2_edittext);
        AddButton = (Button) findViewById(R.id.btn);


    }

    public void ButtonClick(View button){
        Log.d("CAlc", "It here");
        int number1 = Integer.parseInt( Num1_EditText.getText().toString());
        int number2 = Integer.parseInt( Num2_EditText.getText().toString());
        int number3 = Calculater.add(number1, number2);

        Intent intent = new Intent(CalculaterActivity.this,TotalActivity.class);
        intent.putExtra("answer", number3);
        startActivity(intent); 
    }
}
