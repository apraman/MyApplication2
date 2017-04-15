package com.example.arnab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;
import java.lang.*;

public class MainActivity extends AppCompatActivity {
    private String op = "";
    double val1 = 0;
    double val2 = 0;
    double result = 0;

    void calc(String op, double val1, double val2){

        switch(op){
            case "+": result = val1 + val2;break;
            case "-": result = val1 - val2;break;
            case "*": result = val1 * val2;break;
            case "/": result = (val2 == 0)?  999999999 :  val1/val2;break;
            }
            val1 = result;
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView)findViewById(R.id.textView);
        final Button button0 = (Button) findViewById(R.id.button12);


        button0.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                text.append("0");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button1 = (Button) findViewById(R.id.button13);
        button1.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){

                text.append("1");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button2 = (Button) findViewById(R.id.button14);
        button2.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                text.append("2");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button3 = (Button) findViewById(R.id.button2);
        button3.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){

                text.append("3");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button4 = (Button) findViewById(R.id.button);
        button4.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                text.append("4");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }

            }
        });

        final Button button5 = (Button) findViewById(R.id.button3);
        button5.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){

                text.append("5");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }

            }
        });

        final Button button6 = (Button) findViewById(R.id.button4);
        button6.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something
                text.append("6");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button7 = (Button) findViewById(R.id.button5);
        button7.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                text.append("7");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button8 = (Button) findViewById(R.id.button6);
        button8.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                //Do something
                text.append("8");
                if (op == "") {
                    val1 = Double.parseDouble(text.getText().toString());
                } else {
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op, val1, val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button button9 = (Button) findViewById(R.id.button7);
        button9.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something
                text.append("9");
                if(op == ""){
                    val1 = Double.parseDouble(text.getText().toString());
                }
                else{
                    val2 = Double.parseDouble(text.getText().toString());
                    calc(op,val1,val2);
                    val1 = result;
                    op = "";
                }
            }
        });

        final Button buttonDot = (Button) findViewById(R.id.button15);
        buttonDot.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something
                text.append(".");
            }
        });
        final Button buttonPlus = (Button) findViewById(R.id.button8);
        buttonPlus.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                op = "+";
                text.setText("");
            }
        });

        final Button buttonMinus = (Button) findViewById(R.id.button9);
        buttonMinus.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                op = "-";
                text.setText("");
            }
        });

        final Button buttonDiv = (Button) findViewById(R.id.button11);
        buttonDiv.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                op = "/";
                text.setText("");
            }
        });

        final Button buttonMult = (Button) findViewById(R.id.button10);
        buttonMult.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something

                op = "*";
                text.setText("");

            }
        });

        final Button buttonDel = (Button) findViewById(R.id.button16);
        buttonDel.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something
                CharSequence temp = text.getText();
                String stemp = temp.toString();
                if(stemp.length() > 0) {

                    stemp = stemp.substring(0, stemp.length() - 1);
                    text.setText((CharSequence) stemp);

                }

            }
        });
        final Button buttonEq = (Button) findViewById(R.id.button18);
        buttonEq.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something
                op = "";
                String sresult = Double.toString(result);
                text.setText((CharSequence)sresult);
            }
        });
        final Button buttonClr = (Button) findViewById(R.id.button19);
        buttonClr.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                //Do something
                text.setText("");
            }
        });


    }
}
