package dziedziczenie;

public class KlasaA {
//A. methodTwo jest przysłonięta przez klasę B
//B. w klasieB metody methodOne methodFour są ukryte
        public static void methodOne(int i)
        {
                System.out.println("KlasaA");
        }
        public void methodTwo(int i)
        {
                System.out.println("KlasaA");
        }
        public void methodThree(int i)
        {
                System.out.println("KlasaA");
        }
        public static void methodFour(int i)
        {
                System.out.println("KlasaA");
        }
    }

