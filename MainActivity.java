package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static Editable from;
    public static Editable too;
    public static Editable data;
    public static Editable number;

    private EditText to;
    private Button login;

    EditText editTextdata;
    EditText editTextdata1;
    EditText editTextdata2;
    EditText editTextdata3;


    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextdata=(EditText) findViewById(R.id.editText);
        editTextdata1=(EditText) findViewById(R.id.editText3);
        to = (EditText)findViewById(R.id.editText3);
        editTextdata2 = findViewById(R.id.editText4);
        editTextdata3 = findViewById(R.id.editText2);

        /*from=editTextdata.getText().toString();
        too=editTextdata1.getText().toString();*/
        from=editTextdata.getText();
        too=editTextdata1.getText();
        data=editTextdata2.getText();
        number=editTextdata3.getText();


        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.all_classes,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        login= (Button)findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(to.getText().toString());
            }
        });


    }
    private void validate(String name)
    {
        if(name.equals("chennai"))
        {
            Intent intent = new Intent(MainActivity.this,list1.class);
            startActivity(intent);
        }else if(name.equals("delhi"))
        {
            Intent intent =new Intent(MainActivity.this,list2.class);
            startActivity(intent);
        }else if(name.equals("bangalore"))
        {
            Intent intent =new Intent(MainActivity.this,list3.class);
            startActivity(intent);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}