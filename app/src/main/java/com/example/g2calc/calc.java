package com.example.g2calc;
import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
public class calc extends AppCompatActivity {

    Button button, button2, button3, button4;
    Animation android_button, android_button2;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

//Don't change the  duration of this animation section, kay?

        setContentView(R.layout.calc);
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(300);
        animationDrawable.setExitFadeDuration(700);
        animationDrawable.start();

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

//Animation Buttons Only

        android_button = AnimationUtils.loadAnimation(this, R.anim.android_button);
        android_button2 = AnimationUtils.loadAnimation(this, R.anim.android_button2);

        button.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                button.startAnimation(android_button);

                EditText input1 = findViewById(R.id.editTextNumber4);
                EditText input2 = findViewById(R.id.editTextNumber5);
                TextView tot = findViewById(R.id.editTextNumber6);
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double total =  num1 + num2;

                tot.setText(String.valueOf(total));

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                button.startAnimation(android_button2);
            }
            return true;
        });

        button2.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                button2.startAnimation(android_button);

                EditText input1 = findViewById(R.id.editTextNumber4);
                EditText input2 = findViewById(R.id.editTextNumber5);
                TextView tot = findViewById(R.id.editTextNumber6);
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double total =  num1 - num2;

                tot.setText(String.valueOf(total));

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                button2.startAnimation(android_button2);
            }
            return true;
        });

        button3.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                button3.startAnimation(android_button);

                EditText input1 = findViewById(R.id.editTextNumber4);
                EditText input2 = findViewById(R.id.editTextNumber5);
                TextView tot = findViewById(R.id.editTextNumber6);
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double total =  num1 * num2;

                tot.setText(String.valueOf(total));

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                button3.startAnimation(android_button2);
            }
            return true;
        });

        button4.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                button4.startAnimation(android_button);

                EditText input1 = findViewById(R.id.editTextNumber4);
                EditText input2 = findViewById(R.id.editTextNumber5);
                TextView tot = findViewById(R.id.editTextNumber6);
                Double num1 = Double.parseDouble(input1.getText().toString());
                Double num2 = Double.parseDouble(input2.getText().toString());
                Double total =  num1 / num2;

                tot.setText(String.valueOf(total));

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                button4.startAnimation(android_button2);
            }
            return true;
        });

    }
}
