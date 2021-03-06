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

                String palindromString = input.getText().toString().trim();

                result.setText(null);

                if (palindromString.isEmpty()) {
                    input.setError("Bitte geben Sie einen Wert ein!");
                } else {
                    if (palindromString.length() < 5) {
                        input.setError("Es muss 5 oder mehr Zeichen haben!");
                        Toast.makeText(MainActivity.this, "Versuchen Sie es nocheinmal!", Toast.LENGTH_SHORT).show();
                    } else {
                        if (isPalindrome(palindromString)) {
                            result.setText(palindromString + " " + "ist ein Palindrom!");
                        } else {
                            result.setText(palindromString + " " + "ist kein Palindrom!");
                        }
                    }
                }
            }
        });
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}



