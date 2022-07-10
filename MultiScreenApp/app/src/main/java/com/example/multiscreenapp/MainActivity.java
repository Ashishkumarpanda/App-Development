package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button button;
     EditText editText;
    public static  final String EXTRA_NAME = "com.example.multiscreenapp.extra.NANE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(),MainActivity2.class);
                intent.putExtra(EXTRA_NAME,editText.getText().toString());
                startActivity(intent);
            }
        });


    }
}