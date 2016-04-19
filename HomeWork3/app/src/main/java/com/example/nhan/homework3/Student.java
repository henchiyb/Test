package com.example.nhan.homework3;

import java.io.Serializable;

/**
 * Created by NHAN on 4/8/2016.
 */
public class Student implements Serializable{
    private String name;
    private String age;
    private String sClass;
    private String gender;
    public  Student(String name,String age, String sClass,String gender){
        this.name=name;
        this.age=age;
        this.sClass=sClass;
        this.gender=gender;
    }
    public String getName(){return this.name;}
    public String getAge(){return this.age;}
    public String getsClass(){
        return this.sClass;
    }
    public String getGender(){
        return this.gender;
    }
}
