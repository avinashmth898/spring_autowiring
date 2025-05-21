package autowire.annotation;

public class Personal {
    private int height;
    private int age;
    private String skin_color;
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public void setAge( int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setSkin_color(String skin_color){
        this.skin_color=skin_color;
    }
    public String getSkin_color(){
        return skin_color;
    }
    public Personal(){}
    public Personal(int age, int height, String skin_color){
        this.skin_color=skin_color;
        this.age=age;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "height=" + height +
                ", age=" + age +
                ", skin_color='" + skin_color + '\'' +
                '}';
    }
}
