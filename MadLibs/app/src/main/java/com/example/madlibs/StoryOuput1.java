package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoryOuput1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_ouput1);

        Intent intent = getIntent();
        String[] inputWords = intent.getStringArrayExtra(StoryInput1.INPUT_WORDS);
        String printToScreen = " It's been a " + inputWords[0] + " time since I rock and rolled, \n" +
                "It's been a " + inputWords[0]+ " time since I did the " + inputWords[1] + ". \n" +
                "Ooh, let me " + inputWords[2] + " it back, let me " + inputWords[2] + " it back, \n" +
                "Let me " + inputWords[2] + " it back, baby, where I " + inputWords[3] + " from. \n" +
                "It's been a " + inputWords[4] + " time, been a " + inputWords[4] + " time, \n" +
                "Been a " + inputWords[4] + " lonely, lonely, lonely, lonely, lonely time. Yes it has. \n" +
                "\n" +
                "It's been a " + inputWords[5] + " time since the " + inputWords[6] + " of " + inputWords[7] + ", \n" +
                "I can't " + inputWords[8] + " the " + inputWords[9] + " of a life with no " + inputWords[7] + ". \n" +
                inputWords[10] + " me back, " + inputWords[10] + " me back, \n" +
                inputWords[10] + " me back, baby, where I come from. \n" +
                "It's been a " + inputWords[11] + " time, been a " + inputWords[11] + " time, \n" +
                "Been a " + inputWords[11] + " lonely, lonely, lonely, lonely, lonely time. \n" +
                "\n" +
                "Seems " + inputWords[12] + " " + inputWords[13] + " since we walked in the moonlight, \n" +
                "Making " + inputWords[14] + " that just can't " + inputWords[15] + " right. \n" +
                inputWords[16] + " your " + inputWords[17] + ", " + inputWords[16] + " your " + inputWords[17] + ", \n" +
                inputWords[16] + " your " + inputWords[17] + ", baby, let my " + inputWords[18] + " come " + inputWords[19] + " in. \n" +
                "It`s been a " + inputWords[20] + " time, been a " + inputWords[20] + " time, \n" +
                "Been a " + inputWords[20] + " lonely, lonely, lonely, lonely, lonely time. \n";

        TextView textView = findViewById(R.id.Story1);
        textView.setText(printToScreen);

    }

    public void returnToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
