package autowire.annotation;

import autowire.Personal;
import autowire.School;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentAnno {
    private int rollno;
    private String s_name;
    @Autowired
    private SchoolAnno schoolAnno;
@Autowired
    private PersonalAnno personalAnno;
//    @Autowired
    public StudentAnno(int rollno, String s_name, SchoolAnno schoolAnno, PersonalAnno personalAnno){
        System.out.println("Inside constructor");
        this.rollno=rollno;
        this.s_name=s_name;
        this.schoolAnno=schoolAnno;
        this.personalAnno=personalAnno;
    }
//    public StudentAnno(){}
//@Autowired
    public StudentAnno() {
        super();
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


    public SchoolAnno getSchoolAnno() {
        return schoolAnno;
    }
    @Autowired
    public void setSchoolAnno(SchoolAnno schoolAnno) {
        System.out.println("Using @Annotation at setter method");
        this.schoolAnno = schoolAnno;
    }
    public PersonalAnno getPersonalAnno(){
        return personalAnno;
    }
    public void setPersonalAnno(PersonalAnno personalAnno){
        this.personalAnno=personalAnno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", s_name='" + s_name + '\'' +
                ", school=" + schoolAnno +
                ", personal=" + personalAnno +
                '}';
    }
}
