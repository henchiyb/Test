package com.example.nhan.homework3;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NHAN on 4/11/2016.
 */
public class CustomAdapter extends ArrayAdapter<Student> {
    private TextView tvName;
    private TextView tvAge;
    private TextView tvClass;
    private TextView nameDetail;
    private TextView ageDetail;
    private TextView classDetail;
    private ImageView avt;
    private ImageView avtDetail;
    private Context context;
    private Student student;
    Dialog dialogDetail;
    Button btnDetail;
    Button btnBackDialog;

    public CustomAdapter(Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        student = getItem(position);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.students_item, parent, false);
        }
        tvName = (TextView) view.findViewById(R.id.txtName);
        tvAge = (TextView) view.findViewById(R.id.txtAge);
        tvClass = (TextView) view.findViewById(R.id.txtClass);
        avt = (ImageView) view.findViewById(R.id.avt_image_view);
        btnDetail = (Button) view.findViewById(R.id.btnDetail);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogDetail = new Dialog(getContext());
                dialogDetail.setContentView(R.layout.student_detail);
                dialogDetail.setTitle("STUDENT");

                avtDetail = (ImageView) dialogDetail.findViewById(R.id.avtStudent);
                nameDetail = (TextView) dialogDetail.findViewById(R.id.txtNameDetail);
                ageDetail = (TextView) dialogDetail.findViewById(R.id.txtAgeDetail);
                classDetail = (TextView) dialogDetail.findViewById(R.id.txtClassDetail);
                btnBackDialog = (Button) dialogDetail.findViewById(R.id.btnDetailBack);

                avtDetail.setImageResource(R.drawable.ic_launcher);
                nameDetail.setText(student.getName().toString());
                ageDetail.setText(student.getAge().toString());
                classDetail.setText(student.getsClass().toString());

                btnBackDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogDetail.dismiss();
                    }
                });

                dialogDetail.show();
            }
        });
        avt.setImageResource(R.drawable.ic_launcher);
        tvName.setText(student.getName());
        tvAge.setText(student.getAge());
        tvClass.setText(student.getsClass());
        return view;
    }
}
