package com.example.andu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.flutterButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(
                        FlutterActivity.createDefaultIntent(MainActivity.this)
                );
            }
        });
    }
}