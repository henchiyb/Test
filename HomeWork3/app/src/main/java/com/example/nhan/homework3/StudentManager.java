package com.example.nhan.homework3;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by NHAN on 4/11/2016.
 */
public class StudentManager extends Application {
    private static StudentManager ourInstance = new StudentManager();
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public static StudentManager getInstance() {
        return ourInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ourInstance = this;
    }
}
