package com.example.nhan.homeworkactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBtnRed(R.id.btn_red1);
        setBtnRed(R.id.btn_red2);
        setBtnRed(R.id.btn_red3);
        setBtnRed(R.id.btn_red4);
        setBtnBlue(R.id.btn_blue1);
        setBtnBlue(R.id.btn_blue2);
        setBtnBlue(R.id.btn_blue3);
        setBtnBlue(R.id.btn_blue4);
        /*Button btnRed = (Button)findViewById(R.id.btn_red1);
            btnRed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    moveToRedActivity();
                }
            });
        Button btnBlue = (Button)findViewById(R.id.btn_blue1);
            btnBlue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    moveToBlueActivity();
                }
            });*/

    }

    private void setBtnRed(int btnId){
        Button btn = (Button)findViewById(btnId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToRedActivity();
            }
        });
    }
    private void setBtnBlue(int btnId){
        Button btn = (Button)findViewById(btnId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToBlueActivity();
            }
        });
    }
    private void moveToRedActivity(){
        Intent intent = new Intent(this, RedActivity.class);
        startActivity(intent);
    }

    private void moveToBlueActivity(){
        Intent intent = new Intent(this, BlueActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart(){
        super.onStart();

    }
    @Override
    protected void onStop(){
        super.onStop();

    }
    @Override
     protected void onPause(){
        super.onPause();

    }
    @Override
    protected void onResume(){
        super.onResume();

    }
    @Override
    protected void onRestart(){
        super.onRestart();

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();

    }

}
