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

public class StoryInput2 extends AppCompatActivity {

    static int NUM_BUTTONS = 11;
    public static final String INPUT_WORDS2 = "Input_Words2";

    Button[] b1;
    EditText[] t1;
    HashMap<Button, EditText> m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_input2);

        b1 = new Button[]{findViewById(R.id.button104), findViewById(R.id.button105), findViewById(R.id.button106), findViewById(R.id.button107),
                findViewById(R.id.button108), findViewById(R.id.button109), findViewById(R.id.button110), findViewById(R.id.button111),
                findViewById(R.id.button112), findViewById(R.id.button113), findViewById(R.id.button114)};

        t1 = new EditText[]{findViewById(R.id.editText104), findViewById(R.id.editText105), findViewById(R.id.editText106), findViewById(R.id.editText107),
                findViewById(R.id.editText108), findViewById(R.id.editText109), findViewById(R.id.editText110), findViewById(R.id.editText111),
                findViewById(R.id.editText112), findViewById(R.id.editText113), findViewById(R.id.editText114)};

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

    public void randomNumber(View view){
        String[] numbers = getResources().getStringArray(R.array.numbers);
        Random r = new Random();
        int randomNumber = r.nextInt(numbers.length);
        EditText textSlot = m.get(view);
        textSlot.setText(numbers[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomPlace(View view){
        String[] places = getResources().getStringArray(R.array.places);
        Random r = new Random();
        int randomNumber = r.nextInt(places.length);
        EditText textSlot = m.get(view);
        textSlot.setText(places[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomBodyPart(View view){
        String[] bodyPart = getResources().getStringArray(R.array.body_parts);
        Random r = new Random();
        int randomNumber = r.nextInt(bodyPart.length);
        EditText textSlot = m.get(view);
        textSlot.setText(bodyPart[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomPluralNoun (View view){
        String[] pluralNouns = getResources().getStringArray(R.array.plural_nouns);
        Random r = new Random();
        int randomNumber = r.nextInt(pluralNouns.length);
        EditText textSlot = m.get(view);
        textSlot.setText(pluralNouns[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void submit (View view){
        String[] inputWords = new String[NUM_BUTTONS];
        boolean validInput = true;
        for (int i = 0; i < NUM_BUTTONS; i++){ // add input words to an array
            String temp = t1[i].getText().toString();
            if (!validString(temp)){
                this.findViewById(R.id.error_message2).setVisibility(View.VISIBLE);
                validInput = false;
                break;
            }
            inputWords[i] = temp;
        }
        if(validInput)
        {
            Intent intent = new Intent(this, StoryOutput2.class);
            intent.putExtra(INPUT_WORDS2, inputWords);
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
