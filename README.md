# spring_autowiring
We'll learn all the mode of autowiring
Till now, we were doing manual wiring by
```xml

    <bean class="autowire.School" name="school1">
        <constructor-arg value="MS MPS" type="String" />
        <constructor-arg value="2001" type="int" />
    </bean>
    <bean class="autowire.Student" name="student1">
        <constructor-arg value="15" type="int" />
        <constructor-arg value="Avinash Kumar" type="String" />
        <constructor-arg ref="school1" />
    </bean>

```
We are creating bean of the dependent class and wiring it manually
by using ref as:
```xml
<constructor-arg ref="school1" />
```
or,
```xml

<bean id="student1" class="autowire.Student"
      c:id="15"
      c:name="Avinash Kumar"
      c:school-ref="school1" />
```
You can refer https://github.com/avinashmth898/DependencyInjectionRef repository

Ground is set lets start it from here.
We can use two methods
1. xml
2. Annotation

**xml:**

modes
a. no
b. byName
c. byType
d. constructor
e. autodetect(deprecated from java 3) 

A. no: it's the default mode where autowiring is not enabled

B. byName: IoC will search by the name of the dependency.
1. the type variable name should be same with the name of the bean created
```java
private School school;
```
```xml
<bean class="autowire.School" name="school" c:sch_name="MS MPS" c:estb="2001" />
<bean class="autowire.Student" name="student2" autowire="byName" p:s_name="Amitabh" p:rollno="4"/>
```
So that after seeing byName method it'll go the the class and look for the type and it's variable and will search for the reference variable same name in xml file.


2. Since it'll not look for those variable with primitive datatype so will look for the bean of class called in our current class.


C. byType: IoC will search by the type of the dependency.

1. the type variable name should be same with the name of the bean created
```java
private School school;
```
```xml
<bean class="autowire.School" name="school" c:sch_name="MS MPS" c:estb="2001" />
<bean class="autowire.Student" name="student2" autowire="byType" p:s_name="Amitabh" p:rollno="4"/>
```
So that after seeing byType method it'll go the the class and look for the type and it's variable and will search for the reference variable name in xml file.


2. Since it'll not look for those variable with primitive datatype so will look for the bean of class called in our current class.
3. Suppose we've two beans of same type so, it'll get confused and give exception. can't be used in such cases. and we'll fallback to call byName or manual wiring.

D. Constructor: IoC will search by the name of constructor of the dependency.
1. You must need to have proper definition of constructor that includes all the variables and references;
```java
private int rollno;
    private String s_name;
    private School school;
    private Personal personal;
    public Student(int rollno, String s_name, School school, Personal personal){
        this.rollno=rollno;
        this.s_name=s_name;
        this.school=school;
        this.personal=personal;
    }
```
Create all the getter and setter methods for accessibility.
```xml
<bean class="autowire.School" name="school" c:sch_name="MS MPS" c:estb="2001" />
    <bean class="autowire.Personal" name="personal" c:age="26" c:height="183" c:skin_color="Brown" />
<!--    <bean class="autowire.Personal" name="personal1" c:age="28" c:height="170" c:skin_color="Brown" />-->


<!--    <bean class="autowire.Student" name="student1">-->
<!--        <constructor-arg value="15" type="int" />-->
<!--        <constructor-arg value="Avinash Kumar" type="String" />-->
<!--        <constructor-arg ref="school" />-->
<!--    </bean>-->
<!--    byName-->
<bean class="autowire.Student" name="student2" autowire="byName" p:s_name="Amitabh" p:rollno="4"/>
    <bean class="autowire.Student" name="student3" autowire="byType" p:s_name="dev" p:rollno="89"/>
    <bean class="autowire.Student" name="student4" autowire="constructor" >
        <constructor-arg value="Sohan" type="String" />
        <constructor-arg value="76" type="int" />
```
All these are calling setter injection.

If we call by constructor: It'll check constructor inside the bean class

If we call byName: it'll check the setters but will check the name as well

If we call byaType: It'll check the type and can hold only one of it;s kind

**Annotation:**

modes
a. **@Autowired**

we can simply apply autowired annotation at these three places.
1. at Setter
2. at properties
3. at constructor

it depends upon the way are doing our dependency injection. 

