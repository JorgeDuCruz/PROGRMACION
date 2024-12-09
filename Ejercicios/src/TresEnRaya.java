import java.util.Scanner;

/**
 * Hacer tres en raya funcional
 * @version 0.6
 * @author Jorge Duran Cruz
 */
public class TresEnRaya {
    public static void main(String[]args){
        int[][] tablero={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        Scanner sc=new Scanner(System.in);
        int coordX1,coordY1,coordX2,coordY2;
        do {
            System.out.println("Jugador 1, eliga su posicion");
            System.out.println("Coordenada X:");
            coordX1= sc.nextInt();
            System.out.println("Coordenada Y:");
            coordY1 = sc.nextInt();
            tablero[coordX1][coordY1]=1;
            if (HayVictoria(tablero)){
                System.out.println("Gano el jugador 1");
                break;
            }
            System.out.println("Jugador 2, eliga su posicion");
            System.out.println("Coordenada X:");
            coordX2= sc.nextInt();
            System.out.println("Coordenada Y:");
            coordY2 = sc.nextInt();
            tablero[coordX2][coordY2]=2;
            if (HayVictoria(tablero)){
                System.out.println("Gano el jugador 2");
                break;
            }
        }while(!TableroLleno(tablero));
    }

    private static boolean TableroLleno(int[][] tablero) {
        return true;
    }

    private static boolean HayVictoria(int[][] tablero) {
        boolean victoria=false;
        for (int i =0;i<tablero.length;i++){ // Comprueba la victoria en horizontal
            if (tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2]){
                victoria=true;
                break;
            }
        }
        for (int i =0;i<tablero.length;i++){ // Comprueba la victoria en vertical
            if (tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i]){
                victoria=true;
                break;
            }
        }
        if (tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2]) victoria=true;
        if (tablero[2][0]==tablero[1][1] && tablero[2][0]==tablero[0][2]) victoria=true;
        return victoria;
    }
}
