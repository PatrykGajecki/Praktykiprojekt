package klasy;

import java.util.Scanner;

public class klasyObiekty
{
    public static void main(String[] args) {
        Okrag mojOkrąg = new Okrag(10);
        System.out.println(mojOkrąg.obwud());
        System.out.println(mojOkrąg.pole());

        boolean Działa = true;
        Kalkulator mojKalkulator = new Kalkulator();
        Trojkat mojTrojkat = new Trojkat(4, 5, 6);
        mojTrojkat.pole();
        System.out.println( mojTrojkat.getPole());
        System.out.println();
        Prostokat mojProstokąt = new Prostokat(5, 4);
        System.out.println(mojProstokąt.obliczPrzekątną());
        System.out.println(mojProstokąt.obliczPole());
        mojProstokąt.setBokA(8);
        mojProstokąt.setBokB(2);
        System.out.println(mojProstokąt.obliczPrzekątną());
        System.out.println(mojProstokąt.obliczPole());
        if(mojTrojkat.getBokA() < mojProstokąt.getBokA()){
            System.out.println("większy jest prostokąt" + mojProstokąt.getBokA());
        }
        else {
            System.out.println("większy jest trójkąt" + mojTrojkat.getBokA());
        }
        Scanner wczytaj = new Scanner(System.in);
        double o;
        double p;
        while (Działa){
            System.out.println("1. dodawanie ");
            System.out.println("2. odejmowanie");
            System.out.println("3. mnożenie");
            System.out.println("4. dzielenie");
            System.out.println("5. wyjście");
            int wybor;
            wybor = wczytaj.nextInt();
            switch (wybor){
                case 1:
                     o = wczytaj.nextDouble();
                     p = wczytaj.nextDouble();
                    System.out.println(mojKalkulator.dodawanie(o, p));
                    break;
                case 2:
                    o = wczytaj.nextDouble();
                    p = wczytaj.nextDouble();
                    System.out.println(mojKalkulator.odejmowanie(o, p));
                    break;
                case 3:
                    o = wczytaj.nextDouble();
                    p = wczytaj.nextDouble();
                    System.out.println(mojKalkulator.mnożenie(o, p));
                    break;
                case 4:
                    o = wczytaj.nextDouble();
                    p = wczytaj.nextDouble();
                    System.out.println(mojKalkulator.dzielenie(o, p));
                    break;
                case 5:
                    Działa = false;
                    break;
            }
        }
    }


}
