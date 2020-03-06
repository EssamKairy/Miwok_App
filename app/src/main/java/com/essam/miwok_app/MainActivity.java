package com.essam.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView numbers;
    private TextView colors;
    private TextView phrases;
    private TextView family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //numbers item
        numbers = findViewById(R.id.numbers_btn);
        //colors item
        colors = findViewById(R.id.colors_btn);
        //phrases item
        phrases = findViewById(R.id.phrases_btn);
        //family members item
        family = findViewById(R.id.family_members_btn);

        // open NumbersActivity
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create new intent to call Numbers Activity
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });

        // open FamilyActivity
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create new intent to call Numbers Activity
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(i);
            }
        });

        // open ColorsActivity
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create new intent to call Numbers Activity
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });

        // open PhrasesActivity
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create new intent to call Numbers Activity
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);
            }
        });
    }

}
