package com.example.challenge2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
/*Author: Abhijoy Mandal

 */
public class CongratulationsPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulations_page);
    }

    public void playAgain(View view){

        startActivity(new Intent(CongratulationsPage.this, MainActivity.class));
    }

}
