package com.Project;

import com.Project.Subjects.AbstractSubject;
import com.Project.Subjects.English;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        English english = new English("english", "human");
        List<AbstractSubject> abstractSubjects = new ArrayList<>();
        List<Group> groups = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        School school = new School(groups, teachers);
        Teacher andrzejkozlowski = new Teacher("Andrzej Kozłowski", 27, 3200,"inżynier",10,abstractSubjects);
        school.addTeacher(andrzejkozlowski);
        andrzejkozlowski.addSubject(english);



    }
}
