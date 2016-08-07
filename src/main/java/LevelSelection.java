package com.seafle.satish.unbeatabletictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelection extends AppCompatActivity {


    Button normal,medium,unbeatable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);
        normal = (Button)findViewById(R.id.normal);
        medium = (Button)findViewById(R.id.medium);
        unbeatable = (Button)findViewById(R.id.unbeatable);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent normalgame = new Intent(LevelSelection.this,NormalGame.class);
                // A simple brute force to and some what probability theory
                Intent normalgame = new Intent(LevelSelection.this,NormalGame.class);
                startActivity(normalgame);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // applying normal probability theory to get this done
                Intent mediumgame = new Intent(LevelSelection.this,MediumGame.class);
                startActivity(mediumgame);

            }
        });
        unbeatable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for implementing minimax algorithm
                Intent unbeatable = new Intent(LevelSelection.this,UnbeatableGame.class);
                startActivity(unbeatable);
            }
        });

    }
}
