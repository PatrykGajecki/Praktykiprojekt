package projekt;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manu {
    public static void main(String[] args) throws IOException {
        boolean k = true;
        Scanner scanner = new Scanner(System.in); //za pomocą skanera pozwalamy użytkownikowi wpisywać określone rzeczy

            while (k) {
                try {                               //wykrywa błędy
                System.out.println("1.mapa");       //----------|
                System.out.println("2.mapa");       //          |
                System.out.println("3.mapa");       //          |=>za pomocą sout(System.out.println) wypisane manu
                System.out.println("4.mapa");       //          |=>
                System.out.println("5.mapa");       //          |
                System.out.println("6.wyjście");    //----------|
                int IntScanner = scanner.nextInt(); // int pozwalający do odczytania zawartości napisaną przez użytkownika
                switch (IntScanner) {               // za pomocą switcha użytkownik ma wybór od 1 do 6
                    case 1:                         // gdy użytkownik wybieże nr 1 to wyświetli sie mapa 1
                        Mapa1 mapa1 = new Mapa1();  //odwołójemy sie do klasy Mapa1 i zostanie wyświetlona mapa
                        mapa1.klawisz();            //
                        break;
                    case 2:
                        Mapa2 mapa2 = new Mapa2();
                        mapa2.klawisz();
                        break;
                    case 3:
                        Mapa3 mapa3 = new Mapa3();
                        mapa3.klawisz();
                        break;
                    case 4:
                        Mapa4 mapa4 = new Mapa4();
                        mapa4.klawisz();
                        break;
                    case 5:
                        Mapa5 mapa5 = new Mapa5();
                        mapa5.klawisz();
                        break;
                    case 6:
                        k = false;                  //odnosi sie do boolean z 8 lini, k = false żeby program sie zakończył
                        System.out.println("dzięki za gre");
                        break;
                    default:
                        System.out.println("nie ma takiej opcji");
                }
            }catch(InputMismatchException inputMismatchException){      //catch co ma wykryć błędy
                    System.out.println("musisz pisać liczby");
                    scanner.next();                                     //oczyszcza pętle
                }

        }
    }
}
