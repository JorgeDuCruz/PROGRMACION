public class ej10 {
    public static void main(String[] args){
        String  contrasinal = "jjjj";
        System.out.println(ValidarContrsinal(contrasinal));
    }

    private static boolean ValidarContrsinal(String contra) {
        boolean valido = false;
        if (contra.length()>7){
            if (!contra.toLowerCase().equals(contra) && !contra.toUpperCase().equals(contra)){
                for (int i=0;i<10;i++){
                    if (contra.contains(""+i)){
                        valido = true;
                        break;
                    }
                }
            }
        }

        return valido;
    }
}
