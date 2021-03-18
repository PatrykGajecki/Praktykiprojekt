package projekt;

public class Mapa3 extends Mapa{
    public Mapa3(){
        super();
        for(int i = 0; i < 10; i++){
            sciana2 [7][i] = 1;
        }

        for (int i = 9 ; i < 17; i++){
            sciana2[8][i] = 1;
        }
        for(int i = 8; i > 3;i--){
            sciana2 [i][16]=1;
        }
        for(int i = 16; i > 3;i--){
            sciana2 [3][i] = 1;
        }
        for(int i = 3; i > 0;i--){
            sciana2 [i][3]=1;
        }





            metaX = 1;
            metaY = 0;

    }
}
