package dziedziczenie;

public class Spawacz extends Praca {
    boolean niebezpieczna;
    public Spawacz(int pensja, double etat, boolean fajna, boolean niebezpieczna){
        super(pensja, etat, fajna);
        this.niebezpieczna = niebezpieczna;
    }
    @Override
    public void wykonujePrace(){
        System.out.println("nie wykonuje czynności");
    }
}
