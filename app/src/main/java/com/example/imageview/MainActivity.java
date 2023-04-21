package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    ImageView v;
    int num=0;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.imageButton2);
        v = findViewById(R.id.imageView);
    }

    public void imgbtn(View view) {
        num = rnd.nextInt(3)+1;
        switch (num){
            case 1:
                btn.setImageResource(R.drawable.three);
                v.setImageResource(R.drawable.rock);
                break;
            case 2:
                btn.setImageResource(R.drawable.two);
                v.setImageResource(R.drawable.paper);
                break;
            case 3:
                btn.setImageResource(R.drawable.n3);
                v.setImageResource(R.drawable.scissors);
        }
    }
}