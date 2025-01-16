public class ej11 {
    public static void main(String []args){
        String nome = "Jo  rge";
        String apelido = "Duran";
        System.out.println(FormatearNome(nome,apelido));
    }

    private static String FormatearNome(String nome, String apelido) {
        String formateo = null;
        nome = nome.replace(" ","");
        apelido = apelido.replace(" ","");
        formateo = nome.toUpperCase()+" "+apelido.toUpperCase();
        return formateo;
    }
}
