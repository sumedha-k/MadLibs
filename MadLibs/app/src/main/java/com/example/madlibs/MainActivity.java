package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int NUM_BUTTONS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting1 = findViewById(R.id.textView);
        TextView greeting2 = findViewById(R.id.textView2);

        Button[] buttons = new Button[]{findViewById(R.id.button), findViewById(R.id.button2), findViewById(R.id.button3)};

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
        greeting1.startAnimation(fadeIn);
        greeting2.startAnimation(fadeIn);
        for (int i = 0; i < NUM_BUTTONS; i++) {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadein);
            animation.setDuration(i*1000 + 2000);
            buttons[i].startAnimation(animation);
        }
    }

    public void goToStory1(View view){
        Intent intent = new Intent(this, StoryInput1.class);
        startActivity(intent);

    }
    public void goToStory2(View view){
        Intent intent = new Intent(this, StoryInput2.class);
        startActivity(intent);

    }
    public void goToStory3(View view){
        Intent intent = new Intent(this, StoryInput3.class);
        startActivity(intent);

    }
}
