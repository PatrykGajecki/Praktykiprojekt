package projekt;

public class Mapa4 extends Mapa{
    public Mapa4(){
        super();
        for(int i = 0; i < 8;i++){
            for(int j = 0; j < 7; j++){
                sciana2[i][j] = 1;
            }
        }
        sciana2 [9][13] = 1;
        for(int i = 13; i < 19; i++){
            sciana2 [8][i] = 1;
        }
        for(int i = 14; i < 19; i++){
            sciana2 [7][i] = 1;
        }
        for(int i = 15; i < 19; i++){
            sciana2 [6][i] = 1;
        }
        for(int i = 16; i < 19; i++){
            sciana2 [5][i] = 1;
        }
        for(int i = 17; i < 19; i++){
            sciana2 [4][i] = 1;
        }
        for(int i = 18; i < 19; i++){
            sciana2 [3][i] = 1;
        }

        metaX =19;
        metaY =0;
    }
}
