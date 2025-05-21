package autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireAnnotation {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        StudentAnno studentAnno2 = context.getBean("studentAnno2", StudentAnno.class);
        StudentAnno studentAnno3 = (StudentAnno) context.getBean("studentAnno3");
        StudentAnno studentAnno4 = (StudentAnno) context.getBean("studentAnno4") ;
        System.out.println(studentAnno2);
//        studentAnno3.getPersonalAnno();
        System.out.println(studentAnno3);
        System.out.println(studentAnno4);

    }
}
