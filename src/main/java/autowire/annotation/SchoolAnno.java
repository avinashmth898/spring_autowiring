package autowire.annotation;

public class SchoolAnno {
    private String sch_name;
    private int estb;
    public SchoolAnno(String sch_name, int estb){
        this.sch_name=sch_name;
        this.estb=estb;
    }

    public SchoolAnno() {
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
