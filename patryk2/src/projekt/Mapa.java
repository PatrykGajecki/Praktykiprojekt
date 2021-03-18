package projekt;

import java.util.Scanner;

public class Mapa{
    int wysokosc;       //--------------|
    int dlogosc;        //              |
    String gracz;       //              |
    String sciany;      //              |
    int pozycjaX;       //              |==>pola / zmienne
    int pozycjaY;       //              |
    int [][] sciana2;   //              |
    int metaX;          //              |
    int metaY;          //              |
    String meta;        //--------------|

    public Mapa() {
        wysokosc = 10;                          //--------------|
        dlogosc = 20;                           //              |
        gracz = "o";                            //              |
        sciany = "x";                           //              |=> przepisanie wartości do pól /zmiennych
        meta ="M";                              //              |
        pozycjaX = 0;                           //              |
        pozycjaY = 9;                           //              |
        sciana2 = new int[wysokosc][dlogosc];   //--------------|
    }



    public void gracze(){                       //metoda
        for(int i = 0; i < dlogosc + 2; i++){   //za pomocą pentli zostanie wypisana górna sciana, + 2 jest po to żeby górna sciana była równa co do bocznych
            System.out.print(sciany);
        }
        System.out.println();

        for (int i = 0; i < wysokosc; i++){     //główna pentla rysująca
            System.out.print(sciany);            //rysuje lewą sciane
            for (int j = 0; j < dlogosc; j++){      //wszystko co zostanie narysowane w środku mapy
                if(i == pozycjaY && j == pozycjaX){     //pozycji gracza
                    System.out.print(gracz);
                }else if (sciana2 [i][j] == 1){         //sciana wewnętrzna, zamienia jedynki ze sciana2 na x
                    System.out.print(sciany);
                }else if (i == metaY && j == metaX){    //meta
                    System.out.print(meta);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(sciany);                   //prawa sciana
            System.out.println();
        }
        for(int i = 0; i < dlogosc + 2; i++){               //dolna sciana
            System.out.print(sciany);
        }

    }
    public void ruch(char w) {                                  //metoda
        switch (w) {                                            //za pomocą switcha użytkownik może sie poruszać w,a,s,d
            case 'w':                                           //case w pozwala sie porószać w góre
                if (pozycjaY > 0) {                             //jeśli użytkownik spróbóje wyjść poza mape to go cofnie
                    if(sciana2[pozycjaY -1][pozycjaX] == 0){    //te if nie pozwala wejść w ustaloną sciane
                        pozycjaY -= 1;                          //ruch
                    }
                }
                break;
            case 's':
                if (pozycjaY < wysokosc -1) {

                    if(sciana2[pozycjaY +1][pozycjaX] == 0){
                        pozycjaY += 1;
                    }
                }

                break;
            case 'a':
                if (pozycjaX > 0) {
                    if(sciana2[pozycjaY][pozycjaX -1] == 0){
                        pozycjaX -= 1;
                    }
                }
                break;
            case 'd':
                if (pozycjaX < dlogosc -1 ) {

                    if(sciana2[pozycjaY][pozycjaX +1] == 0){
                        pozycjaX += 1;
                    }
                }
                break;
            default:
                break;
        }
        gracze();
    }
    public void klawisz(){                      //wczytuje co poda użytkownik
        Scanner k = new Scanner(System.in);
        while (true) {
            char l = k.next().charAt(0);
            ruch(l);
            if(pozycjaX == metaX && pozycjaY == metaY){
                System.out.println();
                System.out.println("gratulacje");
                break;

            }
        }
    }
}
