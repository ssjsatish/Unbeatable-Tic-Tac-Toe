package com.seafle.satish.unbeatabletictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button one_player, two_player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one_player = (Button)findViewById(R.id.single_player);
        two_player = (Button) findViewById(R.id.two_player);

        one_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, LevelSelection.class);
                startActivity(in);
            }
        });
        two_player.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,TwoPlayer.class);
                startActivity(i);
            }
        });
    }
}
