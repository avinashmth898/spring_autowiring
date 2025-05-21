package autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class AutowireMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");
        Student student= (Student) context.getBean("student2");
//        System.out.println(student);
//        System.out.println();
//        Student student1 = (Student) context.getBean("student2");
        System.out.println(student);
        Student student1= (Student) context.getBean("student3");
        System.out.println(student1);
        Student student2= (Student) context.getBean("student4");
        System.out.println(student2);
    }
}