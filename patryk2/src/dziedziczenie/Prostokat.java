package dziedziczenie;

public class Prostokat extends Figura {
    double BokB;
    public Prostokat(double S, double D){
        super(S);
        BokB = D;
    }

   public double PoliczPole(){
        return BokA * BokB;
   }
}
