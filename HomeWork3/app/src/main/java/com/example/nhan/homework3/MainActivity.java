package com.example.nhan.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    EditText editName;
    EditText editAge;
    EditText editClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    @Override
    protected void onResume(){
        super.onResume();
        connected();
    }
    private void init(){
        editName = (EditText)findViewById(R.id.editName);
        editAge = (EditText)findViewById(R.id.editAge);
        editClass = (EditText)findViewById(R.id.editClass);
    }
    private void connected(){

        btnAdd = (Button) this.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String age = editAge.getText().toString();
                String sClass = editAge.getText().toString();
                Student student = new Student(name, age, sClass,"test");

                StudentManager.getInstance().getStudentArrayList().add(student);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);

            }
        });
    }
}
