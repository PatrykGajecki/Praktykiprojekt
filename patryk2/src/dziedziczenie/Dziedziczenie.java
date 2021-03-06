package dziedziczenie;

public class Dziedziczenie {
    public static void main(String[] args)
    {
    Kwadrat MojKwadrat = new Kwadrat(4);
        System.out.println(MojKwadrat.PoliczPole());
    Prostokat MojProstokat = new Prostokat(5,4);
        System.out.println(MojProstokat.PoliczPole());
    Pies MojPies = new Pies("biała",5,6,4,"kkkk");
        MojPies.DajGłos();
    Spawacz MojSpawacz = new Spawacz(2000,2.33,true,true);
        MojSpawacz.wykonujePrace();
        KlasaB B = new KlasaB();
        B.methodTwo(2);
        B.methodThree(5);
    }
}

