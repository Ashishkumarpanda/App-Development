package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView name,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        name = findViewById(R.id.scorer_name);
        result = findViewById(R.id.score_result);

        Intent intent = getIntent();
        String user = intent.getStringExtra(EnterName.EXTRA_NAME);
        name.setText("Welcome "+user);
        result.setText("Your Score Is "+MainActivity.score);

    }
}