public class recursiva_fibonaci {
    public static void main(String[]args) {
        int numeros;
        for (int n = 0; n < 10; n++) {
            numeros = fibonaci(n);
            System.out.println(numeros);
        }
    }
        static int fibonaci ( int n){
            int res = 0;
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else res = fibonaci(n - 1) + fibonaci(n - 2);
            return res;
        }
    }


