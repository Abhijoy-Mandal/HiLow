package com.example.challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/*Author: Abhijoy Mandal

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStartClick(View view){
        //TODO: Jump to game class
        EditText name = findViewById(R.id.editName);
        String nameStr = name.getText().toString();
        Intent intent = new Intent(MainActivity.this, LevelSelect.class);
        intent.putExtra("usrName", nameStr);
        startActivity(intent);

    }
}