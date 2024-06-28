package com.middemo.mid_spring23;

public class Student {
    public boolean studentId;
    public int hasScholarship;
    public int scholarshipRate;


    public Student(boolean studentId, int hasScholarship, int scholarshipRate) {
        this.studentId = studentId;
        this.hasScholarship = hasScholarship;
        this.scholarshipRate = scholarshipRate;
    }

    public boolean getStudentId() {
        return studentId;
    }

    public void setStudentId(boolean studentId) {
        this.studentId = studentId;
    }

    public int isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(int hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public int getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(int scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }

    @Override
    public String toString() {
        return "studentID: " + this.studentId + "," + "Scholarship : " + this.hasScholarship + "," + this.scholarshipRate + "," + this.scholarshipRate
                        + "%" + "Tuition fee per credit: 6000 TK" ;
    }
}
