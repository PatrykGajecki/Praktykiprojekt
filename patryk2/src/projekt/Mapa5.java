package projekt;

public class Mapa5 extends Mapa{
    public Mapa5(){
        super();
        metaX = 10;
        metaY = 0;
        for(int i = 0; i < 12; i++){
            sciana2[7][i] = 1;
        }
        for(int i =19; i> 15; i--){
            sciana2 [7][i] = 1;
        }
        for(int i = 0; i < 5; i ++){
            sciana2 [5][i] = 1;
        }
        for(int i = 19; i > 7; i--){
            sciana2 [5][i] = 1;
        }
        for(int i = 0; i < 10; i++){
            sciana2 [3][i] = 1;
        }
        for(int i = 19; i > 12; i--){
            sciana2 [3] [i] = 1;
        }
        for(int i = 0; i < 18; i++){
            sciana2 [1][i] = 1;
        }

    }

}
