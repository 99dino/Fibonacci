package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void find(View v){
        EditText value = findViewById(R.id.et);
        String seq = value.getText().toString();
        int integer=Integer.parseInt(seq);
        TextView ans=findViewById(R.id.tv1);
        int a=0,b=1;
        String print="";
        if(integer>=1){
            print="0  ";
        }
        if(integer>=2){
            print+="1  ";
        }
        integer-=2;
        while(integer>0){
            int c=b+a;
            a=b;
            b=c;
            print+=Integer.toString(b);
            print+="  ";
            integer--;
        }
        ans.setText(print);
    }
}