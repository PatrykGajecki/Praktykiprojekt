package tablice;




public class tablice {
    public static void main(String[] args) {

        double[] a = {2.23, 213.2, 1.23, -12.3, 332.33, -2.2,-9.9};
        double min = a[0];
        double max = a[0];
        int pmin = 0;
        int pmax = 0;
        for(int i = 0; i < 7; i++){
            if(max < a[i]){
                max = a[i];
                pmax = i;
            }
            if(min > a[i]){
                min = a[i];
                pmin = i;
            }
            System.out.println("element [" + i + "] = " + a[i]);
        }
        a[pmax] = min;
        a[pmin] = max;
        System.out.println();
        for( int j = 0; j < 7; j++){

            System.out.println("element [" + j + "] = " + a[j]);
        }

        }

    }

