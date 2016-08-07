package com.seafle.satish.unbeatabletictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button single_player, two_player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        single_player = (Button)findViewById(R.id.single_player);
        two_player = (Button) findViewById(R.id.two_player);
    }
}
