public class ej11 {
    public static void main(String []args){
        String nome = "jo rGe";
        String apelido = "duran";
        System.out.println(FormatearNome(nome,apelido));
    }

    private static String FormatearNome(String nome, String apelido) {
        String formateo;
        nome = nome.replace(" ","");
        nome = Character.toUpperCase(nome.charAt(0))+nome.toLowerCase().substring(1);
        apelido = apelido.replace(" ","");
        apelido = Character.toUpperCase(apelido.charAt(0))+apelido.toLowerCase().substring(1);
        formateo = nome+" "+apelido;
        return formateo;
    }
}
