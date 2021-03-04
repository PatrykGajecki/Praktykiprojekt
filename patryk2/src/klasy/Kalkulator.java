package klasy;

public class Kalkulator
{

    public double dodawanie(double a, double b){
        return a + b;
    }
    public double odejmowanie(double a, double b){
        return a - b;
    }
    public double dzielenie(double a, double b){
        if(b == 0){
            System.out.println("nie dziel przez zero");
            return 0;
        }
        return a / b;

    }
    public double mnożenie(double a, double b){
        return a * b;
    }



}
