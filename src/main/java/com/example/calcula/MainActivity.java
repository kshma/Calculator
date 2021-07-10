package com.example.calcula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonsum, buttonsub, buttonmul, buttondiv, buttonequals,buttonclear,button10;

    EditText textarea;

    float value1,value2;

    boolean sum,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonsum = (Button) findViewById(R.id.buttonsum);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttonequals = (Button) findViewById(R.id.buttonequals);
        button10 = (Button) findViewById(R.id.button10);
        buttonclear = (Button) findViewById(R.id.buttonclear);
        textarea = (EditText) findViewById(R.id.edt1);

        buttonclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+".");
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textarea.setText(textarea.getText()+"9");
            }
        });

        buttonsum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textarea == null){
                    textarea.setText("");
                }
                else{
                    value1 = Float.parseFloat((textarea.getText() + ""));
                    sum = true;
                    textarea.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textarea == null){
                    textarea.setText("");
                }
                else{
                    value1 =Float.parseFloat((textarea.getText()+""));
                    sub= true;
                    textarea.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textarea == null){
                    textarea.setText("");
                }
                else{
                    value1 = Float.parseFloat((textarea.getText() + ""));
                    mul = true;
                    textarea.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textarea == null){
                    textarea.setText("");
                }
                else{
                    value1 =Float.parseFloat((textarea.getText()+""));
                    div= true;
                    textarea.setText(null);
                }
            }
        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(textarea.getText()+"");
                if (sum == true) {
                    textarea.setText(value1 + value2 + "");
                    sum = false;
                }

                if (sub == true) {
                    textarea.setText(value1 - value2 + "");
                    sub = false;
                }

                if (mul == true) {
                    textarea.setText(value1 * value2 + "");
                    mul= false;
                }

                if (div == true) {
                    textarea.setText(value1 / value2 + "");
                    div = false;
                }
            }
        });

    }
}