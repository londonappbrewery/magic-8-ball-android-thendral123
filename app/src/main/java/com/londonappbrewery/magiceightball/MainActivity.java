package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Shake=(Button)findViewById(R.id.shakeButton);
        final ImageView Ball=(ImageView)findViewById(R.id.ball);
       final int[] ballArray={R.drawable.ball1,
       R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        Shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumbergenerator=new Random();
                int number=randomNumbergenerator.nextInt(5);
                Ball.setImageResource(ballArray[number]);
            }
        });
    }
}
