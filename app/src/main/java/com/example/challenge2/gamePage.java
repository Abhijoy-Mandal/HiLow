package com.example.challenge2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
/*Author: Abhijoy Mandal

 */

public class gamePage extends AppCompatActivity{
    private String name;
    private int tries = 5;
    private int actual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_page);
        Bundle bundle = getIntent().getExtras();
        this.name = bundle.getString("usrName");
        createGamepage(this.name);

    }
    public void createGamepage(String userName) {

        this.name = userName;
        TextView gamePrompt = findViewById(R.id.gamePrompt);
        gamePrompt.setText("Guess a number "+this.name+"!");
        TextView triesLeft = findViewById(R.id.triesLeftView);
        triesLeft.setText(String.valueOf(this.tries) + " tries left.");

        this.actual = (int)(Math.random()*2);
    }

    public void gameFunction(View view){

        if(this.tries !=0) {

           EditText guess = findViewById(R.id.guessInput);
           String temp = guess.getText().toString();
           int value = 0;
           if (!"".equals(temp)) {
               value = Integer.parseInt(temp);
           }

           if (value == actual) {
               //TODO: call congratulations screen
               Intent intent = new Intent(gamePage.this, CongratulationsPage.class);
               startActivity(intent);
           } else {

               TextView hint = findViewById(R.id.higherLowerView);
               if (value < actual) {
                   hint.setText("Higher");
               } else {
                   hint.setText("Lower");
               }
               guess.getText().clear();
               this.tries-=1;
               if (this.tries == 0){
                   Intent intent = new Intent(gamePage.this, gameOverPage.class);
                   intent.putExtra("actual", this.actual);
                   startActivity(intent);
               }
               TextView triesLeft = findViewById(R.id.triesLeftView);
               triesLeft.setText(String.valueOf(this.tries) + " tries left.");
           }
        }
        else{
            //TODO: gameOver screen
            Intent intent = new Intent(gamePage.this, gameOverPage.class);
            intent.putExtra("actual", this.actual);
            startActivity(intent);
        }
    }
}
