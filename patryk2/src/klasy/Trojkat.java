package klasy;
public class Trojkat
{
    private int wysokosc;
    private int podstawa;
    private int BokA;
    private double pole;
    public Trojkat(int wysokosc, int podstawa, int BokA)
    {
        this.podstawa = podstawa;
        this.BokA = BokA;
        this.wysokosc = wysokosc;
    }

    public int getBokA() {
        return BokA;
    }

    public void setBokA(int bokA) {
        BokA = bokA;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }
    public void pole(){
        pole = BokA * wysokosc / 2;

    }

    public double getPole() {
        return pole;
    }
    public int obwod(){
        return  podstawa + BokA + BokA;

    }

}