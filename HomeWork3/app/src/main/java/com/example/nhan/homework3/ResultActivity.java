package com.example.nhan.homework3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ResultActivity extends AppCompatActivity {
    private ListView listView;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        loadStudents();
    }

    private void loadStudents()
    {
        btnBack = (Button) this.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.this.finish();

                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        CustomAdapter adapter = new CustomAdapter(this, StudentManager.getInstance().getStudentArrayList());
        listView = (ListView) this.findViewById(R.id.listViewListEmployee);
        listView.setAdapter(adapter);
    }
}
