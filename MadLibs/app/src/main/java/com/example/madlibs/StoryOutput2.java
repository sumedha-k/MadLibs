package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoryOutput2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_output2);

        Intent intent = getIntent();
        String[] inputWords = intent.getStringArrayExtra(StoryInput2.INPUT_WORDS2);
        String printToScreen = "Two " + inputWords[0] + ", both alike in dignity,\n" +
                "In fair " + inputWords[1] + ", where we lay our scene,\n" +
                "From ancient " + inputWords[2] + " break to new mutiny,\n" +
                "Where civil blood makes civil hands unclean.\n" +
                "From forth the fatal loins of these two foes\n" +
                "A pair of star-cross'd " + inputWords[3] + " take their life;\n" +
                "Whole misadventured piteous overthrows\n" +
                "Do with their " + inputWords[4] + " bury their parents` strife.\n" +
                "The fearful passage of their " + inputWords[5] + " love,\n" +
                "And the continuance of their parents' rage,\n" +
                "Which, but their children's end, nought could " + inputWords[6] + ",\n" +
                "Is now the " + inputWords[7] + " hours' traffic of our stage;\n" +
                "The which if you with " + inputWords[8] + " " + inputWords[9] + " attend,\n" +
                "What here shall " + inputWords[10] + ", our toil shall strive to mend.\n";

        TextView textView = findViewById(R.id.Story2);
        textView.setText(printToScreen);
    }

    public void returnToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
