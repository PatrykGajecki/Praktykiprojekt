package projekt;

public class Mapa1 extends Mapa{
    public Mapa1(){
        super();
        for(int i = 0; i < 8;i++){
            for(int j = 0; j < 7; j++){
                sciana2[i][j] = 1;
            }
        }
        for(int i = 1; i < 10; i++){
            for(int j = 16; j < 20; j++){
                sciana2 [i][j] = 1;
            }
        }




        metaX = 19;
        metaY = 0;
    }


}
