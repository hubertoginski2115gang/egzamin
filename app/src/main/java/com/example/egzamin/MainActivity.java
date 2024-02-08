package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String liczba1;
    String liczba2;

    TextView text;
    Button jeden, dwa, trzy, cztery, piec, szesc, siedem, osiem, dziewiec, zero, rownasie, reset, plus, minus, razy, podzielic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView2);
        jeden = findViewById(R.id.button5);
        dwa = findViewById(R.id.button6);
        trzy = findViewById(R.id.button7);
        cztery = findViewById(R.id.button8);
        piec = findViewById(R.id.button9);
        szesc = findViewById(R.id.button10);
        siedem = findViewById(R.id.button11);
        osiem = findViewById(R.id.button12);
        dziewiec = findViewById(R.id.button13);
        zero = findViewById(R.id.button15);
        rownasie = findViewById(R.id.button16);
        reset = findViewById(R.id.button17);
        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        razy = findViewById(R.id.button3);
        podzielic = findViewById(R.id.button4);

        jeden.setOnClickListener(viev -> onClick1());
        dwa.setOnClickListener(viev -> onClick2());
        trzy.setOnClickListener(viev -> onClick3());
        cztery.setOnClickListener(viev -> onClick4());
        piec.setOnClickListener(viev -> onClick5());
        szesc.setOnClickListener(viev -> onClick6());
        siedem.setOnClickListener(viev -> onClick7());
        osiem.setOnClickListener(viev -> onClick8());
        dziewiec.setOnClickListener(viev -> onClick9());
        zero.setOnClickListener(viev -> onClick0());
        reset.setOnClickListener(viev -> reset());

        plus.setOnClickListener(viev -> pierwsza_liczba());
        minus.setOnClickListener(viev -> pierwsza_liczba());
        razy.setOnClickListener(viev -> pierwsza_liczba());
        podzielic.setOnClickListener(viev -> pierwsza_liczba());
    }
    protected void onClick1(){

        text.setText(text.getText()+"1");
    }
    protected void onClick2(){
        text.setText(text.getText()+"2");
    }
    protected void onClick3(){
        text.setText(text.getText()+"3");
    }
    protected void onClick4(){
        text.setText(text.getText()+"4");
    }
    protected void onClick5(){
        text.setText(text.getText()+"5");
    }
    protected void onClick6(){
        text.setText(text.getText()+"6");
    }
    protected void onClick7(){
        text.setText(text.getText()+"7");
    }
    protected void onClick8(){
        text.setText(text.getText()+"8");
    }
    protected void onClick9(){
        text.setText(text.getText()+"9");
    }
    protected void onClick0(){
        text.setText(text.getText()+"0");
    }
    protected void reset(){
        text.setText("");
    }
    protected void pierwsza_liczba(){
        liczba1 = (String) text.getText();
        text.setText("");
    }
    protected void rowna_sie(){
        
    }
}