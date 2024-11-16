import java.util.Scanner;

public class ej3 {
    public static void main(String[]args){
        int[] notas= new int[30];
        int identificador;
        String[] nombres = {
                "Ana", "Carlos", "María", "Pedro", "Laura",
                "Juan", "Lucía", "David", "Elena", "Miguel",
                "Sofía", "Javier", "Clara", "Antonio", "Isabel",
                "Francisco", "Raquel", "Roberto", "Carmen", "Ricardo",
                "Verónica", "Felipe", "Marta", "Alberto", "Teresa",
                "Tomás", "Nuria", "Gerardo", "Paula", "Luis", "Beatriz"
        };
        for (int i=0;i<notas.length;i++){
            notas[i] = (int) Math.floor(Math.random()*11);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime de que alumno quieres ver su nota:");
        String nome =sc.next();
        sc.close();

        for (identificador=0;identificador<nombres.length;identificador++){
            if (nombres[identificador].equals(nome)){
                break;
            }
        }
        System.out.println("La nota de "+nome+" es "+notas[identificador]);

        System.out.println("Aprobados: ");
        for (int i=0;i<notas.length;i++) {
            if (notas[i] >= 5) System.out.println(nombres[i]);
        }

    }
}
