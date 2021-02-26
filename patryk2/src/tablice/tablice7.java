package tablice;

import java.util.Random;

public class tablice7 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] a = {2.23, 213.2, 1.23, -12.3, 332.33, -2.2,-9.9};
        int losuj = random.nextInt(7);
        int losuj2 = random.nextInt(7);
        if(a[losuj]>a[losuj2]){
            System.out.println("liczba " + a[losuj] + " jest większa od liczby " + a[losuj2] );
        }
        if(a[losuj]<a[losuj2]){
            System.out.println("liczba" + a[losuj] + " jest mniejsza od liczby " + a[losuj2] );
        }
        if(a[losuj] == a[losuj2]){
            System.out.println("liczba " + a[losuj] + " jest identyczna jak liczba " + a[losuj2] );
        }
    }
}
