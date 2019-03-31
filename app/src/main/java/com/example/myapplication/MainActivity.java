package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

    }

    public void drawChart(View v) {
        if(v.getId() == R.id.button)
        {
            Intent intent = new Intent(this, LineChart.class);
            startActivity(intent);
        }

        else
        {
            Intent intent = new Intent(this, BartChart.class);
            startActivity(intent);
        }
    }
}
