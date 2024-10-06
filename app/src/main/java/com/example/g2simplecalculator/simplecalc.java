package com.example.g2simplecalculator;


import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/*import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;*/
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;


/** @noinspection */
public class simplecalc extends AppCompatActivity {

    //for da numbers and dot
    Button b1, b2, b3, b4, b5, b6, b7, b8,b9,b0, bdot, bclear,bplus,bequals,bminus,bmultiply,bdivide,bpercent,bdelete;

    Animation android_button, android_button2;
    double tnum1,pnum,cnum1;
    String op = "";
    String tempString;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.simplecalc);
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(2500);
        animationDrawable.start();

        //custom toast inflater :(

        /*ayoutInflater inflater = getLayoutInflater();
        View toastInvalidNumInf = inflater.inflate(R.layout.calctoasts,(ViewGroup) findViewById(R.id.toastInvalidNum));
        TextView toasttxtInvalidNum = toastInvalidNumInf.findViewById(R.id.toast_text_1);
        Toast toastInvalidNum = new Toast(getApplicationContext());
        toastInvalidNum.setDuration(Toast.LENGTH_SHORT);
        toastInvalidNum.setView(toastInvalidNumInf);
*/


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bdot = findViewById(R.id.bdot);
        bclear = findViewById(R.id.bclear);
        bplus =findViewById(R.id.bplus);
        bequals = findViewById(R.id.bequals);
        bdivide = findViewById(R.id.bdivide);
        bminus = findViewById(R.id.bminus);
        bmultiply = findViewById(R.id.bmultiply);
        bpercent = findViewById(R.id.bpercent);
        bdelete = findViewById(R.id.bSdelete);
        android_button = AnimationUtils.loadAnimation(this, R.anim.android_button);
        android_button2 = AnimationUtils.loadAnimation(this, R.anim.android_button2);
        b1.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b1.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "1";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b1.startAnimation(android_button2);
            }
            return true;
        });
        b2.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b2.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "2";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b2.startAnimation(android_button2);
            }
            return true;
        });
        b3.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b3.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "3";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b3.startAnimation(android_button2);
            }
            return true;
        });
        b4.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b4.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "4";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b4.startAnimation(android_button2);
            }
            return true;
        });
        b5.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b5.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "5";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b5.startAnimation(android_button2);
            }
            return true;
        });
        b6.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b6.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "6";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b6.startAnimation(android_button2);
            }
            return true;
        });
        b7.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b7.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "7";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b7.startAnimation(android_button2);
            }
            return true;
        });
        b8.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b8.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "8";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b8.startAnimation(android_button2);
            }
            return true;
        });
        b9.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b9.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "9";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b9.startAnimation(android_button2);
            }
            return true;
        }); b0.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                b0.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += "0";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                b0.startAnimation(android_button2);
            }
            return true;
        });
        bdot.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bdot.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                num1 += ".";
                inputbox.setText(num1);

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bdot.startAnimation(android_button2);
            }
            return true;
        });
        bclear.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bclear.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                op = "";
                inputbox.setText("");
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bclear.startAnimation(android_button2);
            }
            return true;
        });
        bdelete.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bdelete.startAnimation(android_button);

                EditText inputbox = findViewById(R.id.inputBox);
                String num1 = inputbox.getText().toString();
                if (!num1.isEmpty()) {
                    num1 = num1.substring(0, num1.length() - 1);

                }
                inputbox.setText(num1);
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bdelete.startAnimation(android_button2);
            }
            return true;
        });
        bplus.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bplus.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                tempString = String.valueOf(inputbox.getText());
                if(tempString.isEmpty()){
                /*toastInvalidNum.show();*/
                    Toast.makeText(this, "Please Input A number!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (tempString.equals(".")) {
                    Toast.makeText(this, "Please enter a valid input!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else{
                    try {
                        if (op.equals("+")) {
                            cnum1 = Double.parseDouble(inputbox.getText().toString());
                            pnum = tnum1 + cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            tnum1 = 0;
                            op = "";
                        }
                        /*else if(op.equals("-")){
                            cnum1 = Double.parseDouble(inputbox.getText().toString());
                            pnum = tnum1 - cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            tnum1 = 0;
                            op = "";
                        } */
                        else {

                            tnum1 = Double.parseDouble(inputbox.getText().toString());
                            op = "+";
                            inputbox.setText("");
                        }
                    } catch (NumberFormatException e) {

                        Toast.makeText(this, "Invalid number format!", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }

            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bplus.startAnimation(android_button2);
            }
            return true;

        });
        bminus.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bminus.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                tempString = String.valueOf(inputbox.getText());
                if(tempString.isEmpty()){
                    /*toastInvalidNum.show();*/
                    Toast.makeText(this, "Please Input A number!", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (tempString.equals(".")) {
                    Toast.makeText(this, "Please enter a valid input!", Toast.LENGTH_SHORT).show();
                    return true;
                } else {
                    try {
                        if (op.equals("-")) {
                            cnum1 = Double.parseDouble(inputbox.getText().toString());
                            pnum = tnum1 - cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            tnum1 = 0;
                            op = "";
                        } else {

                            tnum1 = Double.parseDouble(inputbox.getText().toString());
                            op = "-";
                            inputbox.setText("");
                        }
                    } catch (NumberFormatException e) {

                        Toast.makeText(this, "Invalid number format!", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bminus.startAnimation(android_button2);
            }
            return true;
        });
        bmultiply.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bmultiply.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                tempString = String.valueOf(inputbox.getText());
                if(tempString.isEmpty()){
                    /*toastInvalidNum.show();*/
                    Toast.makeText(this, "Please Input A number!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (tempString.equals(".")) {
                    Toast.makeText(this, "Please enter a valid input!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else {
                    try {
                        if (op.equals("*")) {
                            cnum1 = Double.parseDouble(inputbox.getText().toString());
                            pnum = tnum1 * cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            tnum1 = 0;
                            op = "";
                        } else {

                            tnum1 = Double.parseDouble(inputbox.getText().toString());
                            op = "*";
                            inputbox.setText("");
                        }
                    } catch (NumberFormatException e) {

                        Toast.makeText(this, "Invalid number format!", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bmultiply.startAnimation(android_button2);
            }
            return true;
        });
        bdivide.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bdivide.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                tempString = String.valueOf(inputbox.getText());
                if(tempString.isEmpty()){
                    /*toastInvalidNum.show();*/
                    Toast.makeText(this, "Please Input A number!", Toast.LENGTH_SHORT).show();

                } else if (tempString.equals(".")) {
                    Toast.makeText(this, "Please enter a valid input!", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        if (op.equals("/")) {
                            if (cnum1 == 0) {
                                Toast.makeText(this, "Cannot divide by zero!", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                cnum1 = Double.parseDouble(inputbox.getText().toString());
                                pnum = tnum1 / cnum1;
                                inputbox.setText(String.valueOf(pnum));
                                tnum1 = 0;
                                op = "";
                            }
                        } else {

                            tnum1 = Double.parseDouble(inputbox.getText().toString());
                            op = "/";
                            inputbox.setText("");
                        }
                    } catch (NumberFormatException e) {
                        Toast.makeText(this, "Invalid number format!", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bdivide.startAnimation(android_button2);
            }
            return true;
        });
        bpercent.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bpercent.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                tempString = String.valueOf(inputbox.getText());
                if(tempString.isEmpty()) {
                    Toast.makeText(this, "Please Input A number!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if(!op.isEmpty()){
                    Toast.makeText(this, "Complete the operation first!", Toast.LENGTH_SHORT).show();
                }
                else if (tempString.equals("0")) {
                    Toast.makeText(this, "Cannot do the operation by zero!", Toast.LENGTH_SHORT).show();
                }
                else {
                    tnum1 = Double.parseDouble(inputbox.getText().toString());
                    double total = tnum1 / 100;
                    inputbox.setText(String.valueOf(total));
                }
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bpercent.startAnimation(android_button2);
            }
            return true;
        });

        bequals.setOnTouchListener((v, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                bequals.startAnimation(android_button);
                EditText inputbox = findViewById(R.id.inputBox);
                tempString = inputbox.getText().toString();
                if (tempString.isEmpty()) {
                    Toast.makeText(this, "Please Input a number!", Toast.LENGTH_SHORT).show();
                    return true;  // Exit early to avoid further processing
                }
                else if (tempString.equals(".")) {
                    Toast.makeText(this, "Please Input a valid number!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                try {
                    cnum1 = Double.parseDouble(tempString);
                    switch (op) {
                        case "+":
                            pnum = tnum1 + cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            return true;
                        case "-":
                            pnum = tnum1 - cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            return true;
                        case "*":
                            pnum = tnum1 * cnum1;
                            inputbox.setText(String.valueOf(pnum));
                            return true;
                        case "/":
                            if (cnum1 == 0) {
                                Toast.makeText(this, "Cannot divide by zero!", Toast.LENGTH_SHORT).show();
                            } else {
                                pnum = tnum1 / cnum1;
                                inputbox.setText(String.valueOf(pnum));
                            }
                            return true;
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(this, "Invalid number format!", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
            else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bequals.startAnimation(android_button2);
            }
            return true;
        });

    }
}