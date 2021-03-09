package Wyjatki;

import java.util.Random;

public class Wyjatki1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        try{


        for(int i = 0; i < 11; i ++){
            int intRandom = random.nextInt(99);
            array[i] = intRandom;
            System.out.println(array[i]);

        }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("tablica jest już pełna nie moża wpisać więcej danych");
        }
    }

}
