package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLClientInfoException;

import static com.example.myapplication.MainActivity.data;
import static com.example.myapplication.MainActivity.from;
import static com.example.myapplication.MainActivity.number;
import static com.example.myapplication.MainActivity.too;

public class last extends AppCompatActivity {

    TextView text1,text2,text3,text4;
    Button book;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        text1=(TextView) findViewById(R.id.from);
        text2=(TextView) findViewById(R.id.to);
        text3=(TextView) findViewById(R.id.data);
        text4=(TextView) findViewById(R.id.number);


        text1.setText(from);

        text2.setText(too);
        text3.setText(data);
        text4.setText(number);

        Button createid = findViewById(R.id.button6);
        createid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(last.this,MainActivity.class);
                startActivity(i);
            }

        });
    }
}
