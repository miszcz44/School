package com.Project;

import java.sql.*;
import java.util.HashMap;

public class Student {
    private String name;
    private int grade;
    private int id;
    private int salaryFee;
    private int salaryPaid;
    private String groupAffiliation;
    private HashMap<Course, Integer> marksByCourse = new HashMap<Course, Integer>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.salaryFee = 30000;
        this.salaryPaid = 0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFee(int paidFee){
        salaryPaid += paidFee;
        System.out.println("Stan opłacenia roku: " + salaryPaid + " / " + salaryFee);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public int getSalaryFee() {
        return salaryFee;
    }

    public int getSalaryPaid() {
        return salaryPaid;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public void setGroupAffiliation(String groupAffiliation)
    {
        if(this.groupAffiliation == null){
            this.groupAffiliation = groupAffiliation;
            return;
        }
        System.out.println("To transfer a student to another class you need to first remove him from his current class.");
    }

}
