package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class StoryInput3 extends AppCompatActivity {

    static int NUM_BUTTONS = 10;
    public static final String INPUT_WORDS3 = "Input_Words2";

    Button[] b1;
    EditText[] t1;
    HashMap<Button, EditText> m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_input3);

        b1 = new Button[]{findViewById(R.id.button204), findViewById(R.id.button205), findViewById(R.id.button206), findViewById(R.id.button207),
                findViewById(R.id.button208), findViewById(R.id.button209), findViewById(R.id.button210), findViewById(R.id.button211),
                findViewById(R.id.button212), findViewById(R.id.button213)};

        t1 = new EditText[]{findViewById(R.id.editText204), findViewById(R.id.editText205), findViewById(R.id.editText206), findViewById(R.id.editText207),
                findViewById(R.id.editText208), findViewById(R.id.editText209), findViewById(R.id.editText210), findViewById(R.id.editText211),
                findViewById(R.id.editText212), findViewById(R.id.editText213)};

        m = new HashMap<>();
        for (int i = 0; i < NUM_BUTTONS; i++){
            m.put(b1[i], t1[i]);
        }
    }

    public void randomVerb (View view){
        String[] verbs = getResources().getStringArray(R.array.verbs);
        Random r = new Random();
        int randomNumber = r.nextInt(verbs.length);
        EditText textSlot = m.get(view);
        textSlot.setText(verbs[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomAdjective (View view){
        String[] adjectives = getResources().getStringArray(R.array.adjectives);
        Random r = new Random();
        int randomNumber = r.nextInt(adjectives.length);
        EditText textSlot = m.get(view);
        textSlot.setText(adjectives[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomNoun (View view){
        String[] nouns = getResources().getStringArray(R.array.nouns);
        Random r = new Random();
        int randomNumber = r.nextInt(nouns.length);
        EditText textSlot = m.get(view);
        textSlot.setText(nouns[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomBodyPart(View view){
        String[] bodyPart = getResources().getStringArray(R.array.body_parts);
        Random r = new Random();
        int randomNumber = r.nextInt(bodyPart.length);
        EditText textSlot = m.get(view);
        textSlot.setText(bodyPart[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomColor (View view){
        String[] colors = getResources().getStringArray(R.array.colors);
        Random r = new Random();
        int randomNumber = r.nextInt(colors.length);
        EditText textSlot = m.get(view);
        textSlot.setText(colors[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomSuperlative (View view){
        String[] superlatives = getResources().getStringArray(R.array.superlatives);
        Random r = new Random();
        int randomNumber = r.nextInt(superlatives.length);
        EditText textSlot = m.get(view);
        textSlot.setText(superlatives[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomPluralBodyPart(View view){
        String[] bodyPart = getResources().getStringArray(R.array.plural_body_parts);
        Random r = new Random();
        int randomNumber = r.nextInt(bodyPart.length);
        EditText textSlot = m.get(view);
        textSlot.setText(bodyPart[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomPluralAnimal(View view){
        String[] animals = getResources().getStringArray(R.array.plural_animals);
        Random r = new Random();
        int randomNumber = r.nextInt(animals.length);
        EditText textSlot = m.get(view);
        textSlot.setText(animals[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void submit (View view){
        String[] inputWords = new String[NUM_BUTTONS];
        boolean validInput = true;
        for (int i = 0; i < NUM_BUTTONS; i++){ // add input words to an array
            String temp = t1[i].getText().toString();
            if (!validString(temp)){
                this.findViewById(R.id.error_message3).setVisibility(View.VISIBLE);
                validInput = false;
                break;
            }
            inputWords[i] = temp;
        }
        if(validInput)
        {
            Intent intent = new Intent(this, StoryOutput3.class);
            intent.putExtra(INPUT_WORDS3, inputWords);
            startActivity(intent);
        }
    }

    private boolean validString(String s){
        for (int i = 0; i < s.length(); i++) // checks that string isn't empty and contains non spaces
        {
            if (s.charAt(i) != ' ')
                return true;
        }
        return false;
    }
}
