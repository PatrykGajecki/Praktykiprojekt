package tablice;

import java.util.Scanner;

public class tablice8 {
    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        String imie;
        String rasa;
        String klasa;
        String bron;
        System.out.println("wybierz imie");
        imie = K.nextLine();
        System.out.println("wybierz rase");
        rasa = K.nextLine();
        System.out.println("wybierz klase");
        klasa = K.nextLine();
        System.out.println("wybierz borń");
        bron = K.nextLine();
        System.out.println("twoja postać to:");
        System.out.println(imie);
        System.out.println(rasa);
        System.out.println(klasa);
        System.out.println(bron);

    }
}
