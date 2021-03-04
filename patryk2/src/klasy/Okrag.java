package klasy;

public class Okrag {

    private int promien;
    private int średnica;

    public Okrag(int r){
        promien = r;
        średnica = r * 2;
    }
    public double pole(){
        return Math.PI * promien * promien;

    }
    public  double obwud(){
        return Math.PI * 2 *promien;
    }

    public int getPromien() {
        return promien;
    }

    public int getŚrednica() {
        return średnica;
    }

    public void setPromien(int promien) {
        this.promien = promien;
        this.średnica = promien * 2;
    }
}
