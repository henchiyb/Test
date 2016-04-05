package com.example.nhan.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class DialogActivity extends AppCompatActivity {
    Button btnBack;
    DatePicker datePick;
    public String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        datePick = (DatePicker)findViewById(R.id.datePick);
        btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain();
            }
        });
    }
    private void moveToMain(){
        Intent intent = new Intent(this,MainActivity.class);
        String s = datePick.toString();
        intent.putExtra("Extra",s);
        startActivity(intent);
    }
}
