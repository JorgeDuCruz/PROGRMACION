import java.util.Scanner;

public class ej1 {
    public static void main(String []args){
        int n,negativos=0,positivos=0,ceros=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una lista de 10 números");
        for(int i =1; i<11;i++) {
            System.out.println("Dime el " + i + "º número");
            n = sc.nextInt();
            if (n < 0) negativos++;
            else if (n>0) positivos++;
            else ceros++;
        }
        System.out.println("Me has dado "+negativos+ " números negativos, "+positivos+ " números positivos y "+ceros+" ceros");
    }
}
