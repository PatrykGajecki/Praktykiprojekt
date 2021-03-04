package klasy;

public class Prostokat {
    private int BokA;
    private int BokB;

    public Prostokat(int BokA, int BokB){
        this.BokA = BokA;
        this.BokB = BokB;

    }
    public int obliczPole(){
        return BokA * BokB;

    }
    public double obliczPrzekątną(){
        return Math.sqrt(BokA * BokA + BokB * BokB) ;

    }

    public int getBokA() {
        return BokA;
    }

    public int getBokB() {
        return BokB;
    }

    public void setBokA(int bokA) {
        BokA = bokA;
    }

    public void setBokB(int bokB) {
        BokB = bokB;
    }
}
