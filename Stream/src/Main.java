public class Main {
    public static void main(String[] args) {
        /*ExemploBufferedReader.leer("src/ficheiroTextoDeProba");
        SumaMediaNumeros.sumaMedia("src/ficheiroDeNumeros");
        System.out.println("2º intento");
        SumaMediaConArray.sumaMedia("src/ficheiroDeNumeros");
        System.out.println("3º tipo");
        MediaSumaFicheiroNumScanner.sumaMedia("src/ficheiroDeNumeros");
        IntroducirNumeros.escribir("src/Numeros");
        */
        int[] taboa = {12,15,45,100,0,12,15,48,68,79,89,85,55,4613,1021,10};
        new EscrituraTaboaNumerosBinaria(taboa);
        new LecturaTaboaNumerosBinario("numeros.dat");
    }
}