package com.Project.Subjects;

public abstract class AbstractSubject{
    private String name;
    private String subjectType;

    public AbstractSubject(String name, String subjectType) {
        this.name = name;
        this.subjectType = subjectType;
    }
}
