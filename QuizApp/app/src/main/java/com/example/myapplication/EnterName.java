package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterName extends AppCompatActivity {

    EditText editText;
    Button finishButton;
    public  static  final  String EXTRA_NAME = "com.example.myapplication.extra_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_name);

        finishButton = findViewById(R.id.button2);

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = findViewById(R.id.editTextTextPersonName);
                String name = editText.getText().toString();
                Toast.makeText(EnterName.this,"Generating Your Score Card",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(),ResultActivity.class);
                intent.putExtra(EXTRA_NAME,name);
                startActivity(intent);
            }
        });
    }
}