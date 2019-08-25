package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import java.util.HashMap;
import java.util.Map;

public class StoryInput1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_input1);
    }

    Map map = new HashMap<Button, EditText>();
    EditText t1 = findViewById(R.id.editText4);
    Button b1 = findViewById(R.id.button4);
    
}


