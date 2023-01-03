package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private int count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView2.setText(Integer.toString(count));
        Button button = (Button) findViewById(R.id.Test);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textView.setText("Hello World " + count + "!");
                String stringText = Integer.toString(count);
                textView2.setText(stringText);
                textView4.setText(count2 + 1 + 2);
                System.out.println("Hello");
            }
        });
    }
}