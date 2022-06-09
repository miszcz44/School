package com.Project;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int grade;
    private static String name;
    static List<Student> students = new ArrayList<>();
    private Teacher groupTeacher;

    public Group(int grade, String name, List<Student> students, Teacher groupTeacher) {
        this.grade = grade;
        this.name = String.valueOf(grade) + name;
        this.students = students;
        this.groupTeacher = groupTeacher;
        groupTeacher.setGroupAffiliation(getName());
    }
    public static void addStudent(Student student){
        students.add(student);
        student.setGroupAffiliation(getName());
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public static String getName() {
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
}
