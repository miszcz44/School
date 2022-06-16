package com.Project;



import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private int id;
    public int salary;
    private int moneyEarned;
    private String groupAffiliation;
    private String degree;
    private int yearsofWork;
    private List<String> coursesCapableOfTeaching = new ArrayList<String>();

    public Teacher(String name, int id, int salary, String degree, int yearsofWork) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.yearsofWork = yearsofWork;
        this.moneyEarned = 0;
        this.degree = degree;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    public void teacherReceivesSalary() {
        moneyEarned += getSalary();
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public void setGroupAffiliation(String groupAffiliation) {
        this.groupAffiliation = groupAffiliation;
    }

    public void addCourse(String courseName) {
        coursesCapableOfTeaching.add(courseName);
    }

    public void getCoursesCapableOfTeaching(){
        for(String course : coursesCapableOfTeaching) {
            System.out.println(course);
        }
    }

}
