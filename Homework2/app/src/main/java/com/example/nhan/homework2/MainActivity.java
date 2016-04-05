package com.example.nhan.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etAge;
    Button btnDate;
    Spinner spinCountry;
    TextView select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDate = (Button)findViewById(R.id.btnDate);
        //btnDate.setText;
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDate.setText();
                moveToDialog();
            }
        });
        spinCountry = (Spinner)findViewById(R.id.spinCountry);
    }
    private void moveToDialog(){
        Intent intent = new Intent(this,DialogActivity.class);
        startActivity(intent);
    }
}
