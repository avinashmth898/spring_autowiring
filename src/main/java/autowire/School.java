package autowire;

public class School {
    private String sch_name;
    private int estb;
    School(String sch_name, int estb){
        this.sch_name=sch_name;
        this.estb=estb;
    }

    public School() {
    }

    public void setSch_name(String sch_name){
        this.sch_name=sch_name;
    }
    public String getSch_name(){
        return sch_name;
    }

    public int getEstb() {
        return estb;
    }

    public void setEstb(int estb) {
        this.estb = estb;
    }

    @Override
    public String toString() {
        return "School{" +
                "sch_name='" + sch_name + '\'' +
                ", estb=" + estb +
                '}';
    }
}
