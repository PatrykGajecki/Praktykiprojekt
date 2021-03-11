package Wyjatki;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Wyjatek3 {

    public static void main(String[] args) {
        List<String> listTowns = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < 10; i++){
            String intScanner = scanner.nextLine();
            if(listTowns.contains(intScanner)){
                i = -1;
                listTowns.clear();
                System.out.println("element sie powtórzył");
            }else{
                listTowns.add(intScanner);

            }


        }

        System.out.println("usuwanue");



        for(int j = 0; j < 5;j++){
            int intiii = scanner.nextInt();
            try{
            listTowns.remove(intiii);

        }catch (IndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("błąd indexu");
        }
        }
        System.out.println("zamiana");


        for(int i = 0; i < 2; i++){
            int t = scanner.nextInt();
            String o = scanner.nextLine();
            String k = scanner.nextLine();
            listTowns.set(t, k);

        }
        for (int i = 0; i < 5; i++){
            System.out.println(listTowns.get(i));
        }
    }

}
