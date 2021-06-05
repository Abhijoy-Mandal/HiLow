package com.example.challenge2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/*Author: Abhijoy Mandal

 */
public class gameOverPage extends AppCompatActivity {
    int actual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        this.actual = bundle.getInt("actual");
        setContentView(R.layout.gameover_page);
        TextView displayActual = findViewById(R.id.actualNumberView);
        displayActual.setText("Correct number: "+String.valueOf(this.actual));
    }
//    gameOverPage(int actual){
//
//        this.actual = actual;
//
//        TextView displayActual = findViewById(R.id.actualNumberView);
//        displayActual.setText("Correct number: "+String.valueOf(this.actual));
//    }

    public void playAgain(View view){
        startActivity(new Intent(gameOverPage.this, MainActivity.class));
    }
}
