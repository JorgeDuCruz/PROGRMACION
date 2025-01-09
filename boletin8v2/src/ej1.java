public class ej1 {
    public static void main(String[] args){
        String cadena = "reflejo";
        DosPrimeros(cadena);
        System.out.println();
        TresUltimos(cadena);
        System.out.println();
        CadaDos(cadena);
        System.out.println();
        NormalEInvertyido(cadena);

    }
    public static void DosPrimeros(String cadena){
        int i =0;
        do {
            System.out.println(cadena.charAt(i));
            i++;
        }while (i<2);
    }

    public static void TresUltimos(String cadena){
        int i =cadena.length()-3;
        do {
            System.out.println(cadena.charAt(i));
            i++;
        }while (i<cadena.length());
    }

    public static void CadaDos(String cadena){
        for (int i=0;i<cadena.length();i+=2){
            if (!(cadena.charAt(i)==' ')){
                System.out.println(cadena.charAt(i));
            }

        }
    }

    public static void NormalEInvertyido(String cadena){
        System.out.print(cadena);
        StringBuilder cadea = new StringBuilder(cadena).reverse();
        System.out.println(cadea);
    }
}
