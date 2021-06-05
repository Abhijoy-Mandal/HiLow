package com.example.challenge2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LevelSelect extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_select);
    }
    public void startGame(View view){
        EditText lowerEdt = findViewById(R.id.lowerBound);
        EditText upperEdt = findViewById(R.id.upperBound);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("usrName");
        Intent intent = new Intent(LevelSelect.this, gamePage.class);
        intent.putExtra("usrName", name);
        intent.putExtra("lower", Integer.parseInt(lowerEdt.getText().toString()));
        intent.putExtra("upper", Integer.parseInt(upperEdt.getText().toString()));
        startActivity(intent);
    }
}
