package com.Project;

import java.util.List;

public class School {
    private List<Class> classes;
    private List<Teacher> teachers;
    private  int totalmoneyEarned;
    private static int totalmoneySpent;
    private int totalProfit;

    public School(List<Class> classes, List<Teacher> teachers) {
        this.classes = classes;
        this.teachers = teachers;
        this.totalmoneyEarned = 0;
        this.totalmoneySpent = 0;
        this.totalProfit = 0;
    }

    public int getTotalProfit() {
        return getTotalmoneyEarned() - getTotalmoneySpent();
    }
    public void addclass(Class classe) {
        classes.add(classe);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getTotalmoneyEarned() {
        return totalmoneyEarned;
    }

    public void updateTotalMoneyEarnedBySchool(int moneyEarned) {
        this.totalmoneyEarned += moneyEarned;
    }

    public int getTotalmoneySpent() {
        return totalmoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalmoneySpent += moneySpent;
    }
}
