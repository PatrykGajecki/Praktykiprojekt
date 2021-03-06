package dziedziczenie;

public class Zwierze {
    private int wiek;
    private int ilość;
    private String nazwa;
    public Zwierze(int wiek, int ilość, String nazwa){
        this.wiek = wiek;
        this.ilość = ilość;
        this.nazwa = nazwa;
    }
    public void DajGłos(){
        System.out.println("daje głos");
    }
}
