import java.util.Scanner;

public class ej2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime cantos ecos queres");
        int n = sc.nextInt();
        sc.close();
        ecos(n);
    }
    static void ecos(int veces){
        for (int i=0;i<veces;i++){
            System.out.println("Ecoo...");
        }
    }
}
