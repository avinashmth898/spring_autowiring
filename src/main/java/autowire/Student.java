package autowire;

public class Student {
    private int rollno;
    private String s_name;
    School school;
    public Student(int rollno, String s_name, School school){
        this.rollno=rollno;
        this.s_name=s_name;
        this.school=school;
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

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", s_name='" + s_name + '\'' +
                ", school=" + school +
                '}';
    }
}
