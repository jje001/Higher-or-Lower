package com.escobar.j0e009t.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r = new Random();
    int random = r.nextInt(20) + 1;

    private void getNewRandomNumber(){
        random = r.nextInt(20) + 1;
        Toast.makeText(this, "New Random Number generated. ", Toast.LENGTH_SHORT).show();
    }

    private void createToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        EditText editText = findViewById(R.id.editText);
        String num = editText.getText().toString();
        int enteredNumber = Integer.parseInt(num);

        if(enteredNumber < random){
            createToast("Higher");
        }
        else if(enteredNumber > random){
            createToast("Lower");
        }
        else{
            createToast("Good Job! You guessed it.");
            getNewRandomNumber();
        }
    }
}
