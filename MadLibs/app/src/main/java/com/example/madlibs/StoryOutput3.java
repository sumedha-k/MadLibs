package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoryOutput3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_output3);

        Intent intent = getIntent();
        String[] inputWords = intent.getStringArrayExtra(StoryInput3.INPUT_WORDS3);
        String printToScreen = "The " + inputWords[0] + " Dragon is the " + inputWords[1] +
                " Dragon of all. It has " + inputWords[2] + " " + inputWords[3] + ", and a " + inputWords[4] + " shaped like a " + inputWords[5] +
                ". It loves to eat " + inputWords[6] + ", although it will feast on nearly anything. It is " + inputWords[7] + " and " + inputWords[8] +
                ". You must be " + inputWords[9] + " around it, or you may end up as it's meal!\n";

        TextView textView = findViewById(R.id.Story3);
        textView.setText(printToScreen);
    }

    public void returnToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
