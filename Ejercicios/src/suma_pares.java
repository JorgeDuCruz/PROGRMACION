/**
 * Suma los pares de 0 a 9
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class suma_pares {
    public static void main(String[]args){
        int sum=0;
        for(int i=0;i<9;i++){
            if(i%2!=0) continue;
            sum =sum+i;
        }
        System.out.println(sum);
    }
}
