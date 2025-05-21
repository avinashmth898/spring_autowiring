package autowire.annotation;

import autowire.Personal;
import autowire.School;

public class Student {
    private int rollno;
    private String s_name;
    private School school;
    private Personal personal;
    public Student(int rollno, String s_name, School school, Personal personal){
        System.out.println("Inside constructor");
        this.rollno=rollno;
        this.s_name=s_name;
        this.school=school;
        this.personal=personal;
    }

    public Student() {
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
    public Personal getPersonal(){
        return personal;
    }
    public void setPersonal(Personal personal){
        this.personal=personal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", s_name='" + s_name + '\'' +
                ", school=" + school +
                ", personal=" + personal +
                '}';
    }
}
