package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Button btn;
    private SeekBar seekBar;
    // private Randomizer randomizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.resultTextView);
        btn = findViewById(R.id.rollButton);
        seekBar = findViewById(R.id.seekBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use the Randomizer class to generate a random number from the seek bar
                int randomValue = new Random().nextInt(seekBar.getProgress());
                result.setText(String.valueOf(randomValue));
            }
        });
    }
}
