package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    EditText editText;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonadd;
    Button buttonminus;
    Button buttonmul;
    Button buttondiv;
    Button buttondot;
    Button buttonequal;
    Button buttonclear;

    double no1,no2;
    boolean add,minus,mul,div;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        editText = (EditText) findViewById(R.id.et);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button0 = (Button) findViewById(R.id.btn0);
        buttonadd = (Button) findViewById(R.id.btnplus);
        buttonminus = (Button) findViewById(R.id.btnminus);
        buttonmul = (Button) findViewById(R.id.btnmul);
        buttondiv = (Button) findViewById(R.id.btndiv);
        buttondot = (Button) findViewById(R.id.btndot);
        buttonequal = (Button) findViewById(R.id.btnequal);
        buttonclear = (Button) findViewById(R.id.clear);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else {
                    no1 = Double.parseDouble(editText.getText()+"");
                    add=true;
                    editText.setText(null);
                }
            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else {
                    no1 = Double.parseDouble(editText.getText()+"");
                    minus=true;
                    editText.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    no1 = Double.parseDouble(editText.getText() + "");
                    mul = true;
                    editText.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    no1 = Double.parseDouble(editText.getText() + "");
                    div = true;
                    editText.setText(null);
                }
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no2 = Double.parseDouble(editText.getText()+"");
                if (add==true){
                    editText.setText(no1+no2+"");
                    add=false;
                } else if (minus==true) {
                    editText.setText(no1-no2+"");
                    minus=false;
                } else if (mul==true) {
                    editText.setText(no1*no2+"");
                    mul=false;
                } else if (div==true) {
                    editText.setText(no1/no2+"");
                    div=false;
                }
            }
        });
    }
}
