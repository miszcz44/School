package com.Project;

import java.util.List;

public class School {
    private List<Group> groups;
    private List<Teacher> teachers;
    private int totalmoneyEarned;
    private int totalmoneySpent;
    private int totalProfit;

    public School(List<Group> groups, List<Teacher> teachers) {
        this.groups = groups;
        this.teachers = teachers;
        this.totalmoneyEarned = 0;
        this.totalmoneySpent = 0;
        this.totalProfit = 0;
    }

    public int getTotalProfit() {
        return getTotalmoneyEarned() - getTotalmoneySpent();
    }
    public void addgroup(Group group) {
        groups.add(group);
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

    public void updateTotalMoneySpent(int moneySpent) {
        this.totalmoneySpent += moneySpent;
    }
}
