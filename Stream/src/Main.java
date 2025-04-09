public class Main {
    public static void main(String[] args) {
        /*
        ExemploBufferedReader.leer("src/ficheiroTextoDeProba");
        SumaMediaNumeros.sumaMedia("src/ficheiroDeNumeros");
        System.out.println("2º intento");
        SumaMediaConArray.sumaMedia("src/ficheiroDeNumeros");
        System.out.println("3º tipo");
        MediaSumaFicheiroNumScanner.sumaMedia("src/ficheiroDeNumeros");
        IntroducirNumeros.escribir("src/Numeros");

        int[] taboa = {12,15,45,100,0,12,15,48,68,79,89,85,55,4613,1021,10};
        new EscrituraTaboaNumerosBinaria(taboa);
        new LecturaTaboaNumerosBinario("numeros.dat");
        new SeparacionParesImpares("numeros.dat");
        new LecturaTaboaNumerosBinario("pares.dat");
        new LecturaTaboaNumerosBinario("impares.dat");
         */
        Socio[] socios = new Socio[5];
        String[] datos = {"00000000T","00000001R","00000002M","00000003L","00000004J"};
        String[] nomes={"pablo","manolo","pedro","miguel","goku"};
        for (int i =0;i< socios.length;i++){
            Socio s = new Socio(datos[i],nomes[i]);
            socios[i]=s;
        }
        new EscrituraFicheiroSocios("socios.dat",socios);
        new LecturaFicheiroSocios("socios.dat");
    }
}