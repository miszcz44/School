package com.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.createConnection();

        English english = new English();
        Maths maths = new Maths();
        List<Course> Courses = new ArrayList<>();
        Courses.add(english);
        Courses.add(maths);
        System.out.println(Courses.get(0).getName());
        List<Group> groups = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        School school = new School(groups, teachers);
        Teacher andrzejkozlowski = new com.Project.Teacher("Andrzej Kozłowski", 27, 3200,"inżynier",10);
        school.addTeacher(andrzejkozlowski);
        andrzejkozlowski.addCourse(english.getName());
        Student student = new Student("ABC",151880);
        Student student2 = new Student("ABCdef",151880);
        Student student3 = new Student("cqwaaewrq",151880);
        Student student4 = new Student("brberaewrq",151880);
        Group group = new Group(5, "a", andrzejkozlowski);
        group.addStudent(student);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.printStudentsInOrder();




    }
}
