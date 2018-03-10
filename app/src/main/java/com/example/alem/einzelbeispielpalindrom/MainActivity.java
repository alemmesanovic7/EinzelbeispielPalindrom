package com.example.alem.einzelbeispielpalindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText input;
    Button button;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.inputField);
        button = (Button) findViewById(R.id.buttonCheckString);
        result = (EditText) findViewById(R.id.ergebnis);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String palindromString = result.getText().toString();

            }
        });
    }
}


