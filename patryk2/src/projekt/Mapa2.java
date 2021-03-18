package projekt;

public class Mapa2 extends Mapa{
    public Mapa2(){
        super();
        pozycjaX = 19;
        pozycjaY = 9;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 8; j++){
                sciana2[i][j] = 1;
            }
        }
        for(int i = 1; i < 10; i++){
            sciana2[i][17] = 1;
        }
        for(int i = 0; i < 9; i++){
            sciana2[i][14] = 1;
        }
        for(int i = 1; i < 10; i++) {
            sciana2[i][11] = 1;
        }







            metaX = 9;
            metaY = 5;
    }
}
