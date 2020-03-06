package com.essam.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    private List<Word> nums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        nums = new ArrayList<>();
        nums.add(new Word("one","lutti"));
        nums.add(new Word("two","otiiko"));
        nums.add(new Word("three","tolookosu"));
        nums.add(new Word("four","oyyisa"));
        nums.add(new Word("five","massokka"));
        nums.add(new Word("six","temmokka"));
        nums.add(new Word("seven","kenekaku"));
        nums.add(new Word("eight","kawinta"));
        nums.add(new Word("nine","wo'e"));
        nums.add(new Word("ten","na'aacha"));

        WordsAdapter itemsAdapter = new WordsAdapter(this, nums);

        GridView listView = (GridView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
