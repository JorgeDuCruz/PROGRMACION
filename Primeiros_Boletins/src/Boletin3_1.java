import java.util.Scanner;

/**
 * Este programa te pide un número
 * y en caso de que sea positivo te devuelve el número
 * junto con un mensaje que indica que es positivo
 * El 0 lo considera un número positivo
 */
public class Boletin3_1 {
    public static void main(String[]args){
        //Codifica un programa que saque, por consola, un número tecleado, sempre que sexa positivo,xunto coa mensaxe “ e positivo “.
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el número?(Sin decimales)");
        num1 = sc.nextInt();
        sc.close();
        if (num1>=0)
            System.out.println(num1+" é postivo");
    }
}
