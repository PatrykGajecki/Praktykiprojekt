package tablice;

public class tablice6 {
    public static void main(String[] args) {
        double[] a = {2.23, 213.2, 1.23, -12.3, 332.33, -2.2,-9.9};
        for(int i = 0; i < 7; i++ ){
            System.out.println("element [" + i + "]" + a[i] );

            }
        System.out.println();
        for (int j = 0; j < 7; j++){
            System.out.println("element [" + j + "]" + a[6 - j] );
        }
    }
}
