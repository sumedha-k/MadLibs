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

public class StoryInput1 extends AppCompatActivity {

    static int NUM_BUTTONS = 21;
    public static final String INPUT_WORDS = "Input_Words1";

    Button[] b1;
    EditText[] t1;
    HashMap<Button, EditText> m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_input1);

        b1 = new Button[]{findViewById(R.id.button4), findViewById(R.id.button5), findViewById(R.id.button6), findViewById(R.id.button7),
                findViewById(R.id.button8), findViewById(R.id.button9), findViewById(R.id.button10), findViewById(R.id.button11),
                findViewById(R.id.button12), findViewById(R.id.button13), findViewById(R.id.button14), findViewById(R.id.button15),
                findViewById(R.id.button16), findViewById(R.id.button17), findViewById(R.id.button18), findViewById(R.id.button19),
                findViewById(R.id.button20), findViewById(R.id.button21), findViewById(R.id.button22), findViewById(R.id.button23),
                findViewById(R.id.button24)};

        t1 = new EditText[]{findViewById(R.id.editText4), findViewById(R.id.editText5), findViewById(R.id.editText6), findViewById(R.id.editText7),
                findViewById(R.id.editText8), findViewById(R.id.editText9), findViewById(R.id.editText10), findViewById(R.id.editText11),
                findViewById(R.id.editText12), findViewById(R.id.editText13), findViewById(R.id.editText14), findViewById(R.id.editText15),
                findViewById(R.id.editText16), findViewById(R.id.editText17), findViewById(R.id.editText18), findViewById(R.id.editText19),
                findViewById(R.id.editText20), findViewById(R.id.editText21), findViewById(R.id.editText22), findViewById(R.id.editText23),
                findViewById(R.id.editText24)};

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

    public void randomAdverb (View view){
        String[] adverbs = getResources().getStringArray(R.array.adverbs);
        Random r = new Random();
        int randomNumber = r.nextInt(adverbs.length);
        EditText textSlot = m.get(view);
        textSlot.setText(adverbs[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomNoun (View view){
        String[] nouns = getResources().getStringArray(R.array.nouns);
        Random r = new Random();
        int randomNumber = r.nextInt(nouns.length);
        EditText textSlot = m.get(view);
        textSlot.setText(nouns[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomPluralNoun (View view){
        String[] pluralNouns = getResources().getStringArray(R.array.plural_nouns);
        Random r = new Random();
        int randomNumber = r.nextInt(pluralNouns.length);
        EditText textSlot = m.get(view);
        textSlot.setText(pluralNouns[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void randomVerbING (View view){
        String[] verbsING = getResources().getStringArray(R.array.verbs_ing);
        Random r = new Random();
        int randomNumber = r.nextInt(verbsING.length);
        EditText textSlot = m.get(view);
        textSlot.setText(verbsING[randomNumber], TextView.BufferType.EDITABLE);
    }

    public void submit (View view){
        String[] inputWords = new String[NUM_BUTTONS];
        boolean validInput = true;
        for (int i = 0; i < NUM_BUTTONS; i++){ // add input words to an array
            String temp = t1[i].getText().toString();
            if (!validString(temp)){
                this.findViewById(R.id.error_message).setVisibility(View.VISIBLE);
                validInput = false;
                break;
            }
            inputWords[i] = temp;
        }
        if(validInput)
        {
            Intent intent = new Intent(this, StoryOuput1.class);
            intent.putExtra(INPUT_WORDS, inputWords);
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


