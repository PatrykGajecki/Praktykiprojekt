package dziedziczenie;

public class Praca {
    private int pensja;
    private double etat;
    private boolean fajna;
    public Praca (int pensja, double etat, boolean fajna){
        this.pensja = pensja;
        this.etat = etat;
        this.fajna = fajna;
    }
    public void wykonujePrace(){
        System.out.println("wykonuje czynność");
    }
}
