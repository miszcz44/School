package com.Project;

public class Maths extends Course{
    public Maths() {
        this.name = "Mathematics";
        this.courseType = "Science";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getCourseType() {
        return super.getCourseType();
    }
}
