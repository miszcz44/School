package com.Project;

import com.Project.Subjects.AbstractSubject;

import java.util.List;

public class Teacher {
    private String name;
    private int id;
    public int salary;
    private int moneyEarned;
    private String groupAffiliation;
    private String degree;
    private int yearsofWork;
    private List<AbstractSubject> subjectsCapableOfTeaching;

    public Teacher(String name, int id, int salary, String degree, int yearsofWork, List<AbstractSubject> subjectsCapableOfTeaching) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.yearsofWork = yearsofWork;
        this.subjectsCapableOfTeaching = subjectsCapableOfTeaching;
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

    public void addSubject(AbstractSubject subject){
        subjectsCapableOfTeaching.add(subject);
    }

    public void getSubjects(){
        for(AbstractSubject abstractSubject : subjectsCapableOfTeaching) {
            System.out.println(abstractSubject);
        }
    }
}
