package com.codeclan.example.calculater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TotalActivity extends AppCompatActivity {

    TextView answer_textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        answer_textview = (TextView) findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int answer = extras.getInt("answer");
        String result = "The answer is " + Integer.toString(answer);

        answer_textview.setText(result);
    1
    }
}
