package com.middemo.mid_spring23;

public class RegisterCourse {

    private String courseId;
    private int courseCredit;
    private int section;


    public RegisterCourse(int courseId, String courseCredit, int section) {
        this.courseId = String.valueOf(courseId);
        this.courseCredit = Integer.parseInt(courseCredit);
        this.section = section;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "RegisterCourse{" +
                "courseId='" + courseId + '\'' +
                ", courseCredit=" + courseCredit +
                ", section=" + section +
                '}';
    }
}
