package com.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Group {
    private int grade;
    private static String name;
    private List<Student> students = new ArrayList<>();
    private Teacher groupTeacher;
    private Student groupPresident;

    public Group(int grade, String name, Teacher groupTeacher) {
        this.grade = grade;
        this.name = String.valueOf(grade) + name;
        this.groupTeacher = groupTeacher;
        groupTeacher.setGroupAffiliation(name);
    }
    public void addStudent(Student student){
        students.add(student);
        student.setGrade(grade);
        student.setGroupAffiliation(name);
    }

    public void removeStudentFromAGroup(Student student){
        students.remove(student);
        student.setGroupAffiliation(null);
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

    public void printStudentsInOrder()
    {
        int counter = 1;
        students.sort(Comparator.comparing(Student::getName));
        for(Student student : students){
            System.out.printf("%d. %s ", counter, student.getName());
            counter += 1;
        }
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
