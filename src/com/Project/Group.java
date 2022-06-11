package com.Project;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int grade;
    private static String name;
    private List<Student> students = new ArrayList<>();
    private Teacher groupTeacher;
    private Student groupPresident;

    public Group(int grade, String name, List<Student> students, Teacher groupTeacher) {
        this.grade = grade;
        this.name = String.valueOf(grade) + name;
        this.students = students;
        this.groupTeacher = groupTeacher;
        groupTeacher.setGroupAffiliation(this.name);
    }
    public void addStudent(Student student){
        students.add(student);
        student.setGroupAffiliation(this.name);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public  String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getGroupTeacher() {
        return groupTeacher;
    }

    public void setGroupTeacher(Teacher groupTeacher) {
        this.groupTeacher = groupTeacher;
    }

    public int getSizeOfTheGroup(){
        return students.size();
    }

    public Student getGroupPresident() {
        return groupPresident;
    }

    public void setGroupPresident(Student groupPresident) {
        this.groupPresident = groupPresident;
    }

}
