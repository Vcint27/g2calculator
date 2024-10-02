package com.example.g2calc;
import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
;
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

        EditText inp1 = findViewById(R.id.input1);
        EditText inp2 = findViewById(R.id.input2);
        EditText out = findViewById(R.id.output);


//Animation Buttons Only

     ;   android_button = AnimationUtils.loadAnimation(this, R.anim.android_button);
        android_button2 = AnimationUtils.loadAnimation(this, R.anim.android_button2);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    button.startAnimation(android_button);

                    if (inp1.getText().toString().isEmpty() || inp2.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please Input Both Numbers", Toast.LENGTH_SHORT).show();
                        out.setText("");
                    }else{

                        String input1 = inp1.getText().toString();
                        String input2 = inp2.getText().toString();

                        if (input1.contains(".") || input2.contains(".")) {
                            Double num1 = Double.parseDouble(inp1.getText().toString());
                            Double num2 = Double.parseDouble(inp2.getText().toString());
                            Double result = num1 + num2;
                            out.setText(String.valueOf(result));

                        }else{
                            int num1 = Integer.parseInt(input1);
                            int num2 = Integer.parseInt(input2);
                            int result = num1 + num2;
                            out.setText(String.valueOf(result));

                        }
                    }

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button.startAnimation(android_button2);
                }
                return true;
            }
        });

        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    button2.startAnimation(android_button);

                    if (inp1.getText().toString().isEmpty() || inp2.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please Input Both Numbers", Toast.LENGTH_SHORT).show();
                        out.setText("");
                    }else{

                        String input1 = inp1.getText().toString();
                        String input2 = inp2.getText().toString();

                        if (input1.contains(".") || input2.contains(".")) {
                            Double num1 = Double.parseDouble(inp1.getText().toString());
                            Double num2 = Double.parseDouble(inp2.getText().toString());
                            Double result = num1 - num2;
                            out.setText(String.valueOf(result));

                        }else{
                            int num1 = Integer.parseInt(input1);
                            int num2 = Integer.parseInt(input2);
                            int result = num1 - num2;
                            out.setText(String.valueOf(result));

                        }
                    }

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button2.startAnimation(android_button2);
                }
                return true;
            }
        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    button3.startAnimation(android_button);

                    if (inp1.getText().toString().isEmpty() || inp2.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please Input Both Numbers", Toast.LENGTH_SHORT).show();
                        out.setText("");

                    }else{
                        String input1 = inp1.getText().toString();
                        String input2 = inp2.getText().toString();

                        if (input1.contains(".") || input2.contains(".")) {
                            Double num1 = Double.parseDouble(inp1.getText().toString());
                            Double num2 = Double.parseDouble(inp2.getText().toString());
                            Double result = num1 * num2;
                            out.setText(String.valueOf(result));

                        }else{
                            int num1 = Integer.parseInt(input1);
                            int num2 = Integer.parseInt(input2);
                            int result = num1 * num2;
                            out.setText(String.valueOf(result));

                        }
                    }

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button3.startAnimation(android_button2);
                }
                return true;
            }
        });

        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    button4.startAnimation(android_button);

                    if (inp1.getText().toString().isEmpty() || inp2.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please Input Both Numbers", Toast.LENGTH_SHORT).show();
                        out.setText("");

                    }else{
                        String input1 = inp1.getText().toString();
                        String input2 = inp2.getText().toString();

                        if (input1.contains(".") || input2.contains(".")) {
                            Double num1 = Double.parseDouble(inp1.getText().toString());
                            Double num2 = Double.parseDouble(inp2.getText().toString());
                            Double result = num1 / num2;
                            out.setText(String.valueOf(result));

                        }else{
                            int num1 = Integer.parseInt(input1);
                            int num2 = Integer.parseInt(input2);
                            int result = num1 / num2;
                            out.setText(String.valueOf(result));

                        }
                    }

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button4.startAnimation(android_button2);
                }
                return true;
            }
        });

    }
}
