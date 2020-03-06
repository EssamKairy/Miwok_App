package com.essam.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    private List<String> nums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        nums = new ArrayList<>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add("Five");
        nums.add("Six");
        nums.add("Seven");
        nums.add("Eight");
        nums.add("Nine");
        nums.add("Ten");
    }
}
