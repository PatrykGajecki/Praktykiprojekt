package dziedziczenie;

public class Pies extends Zwierze{
    private String siersc;
    private int dlogosc;
    public Pies(String siersc, int dlogosc, int wiek, int ilosc, String nazwa){
        super(wiek, ilosc, nazwa);
        this.siersc = siersc;
        this.dlogosc = dlogosc;
    }
    @Override
    public void DajGłos(){
        System.out.println("HAU HAU");
    }
}
