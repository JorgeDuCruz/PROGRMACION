public class ej2 {
    public static void main(String[] args){
        String contido = """
                Esto es el titulo
                Esto es un parrafo
                y esto sigue siendo parrafo""";

        System.out.println(CrearHTML(contido));
    }

    private static String CrearHTML(String texto) {
        String html;
        int titulo = texto.indexOf("\n");
        html = "<html>\n"+"<h1>"+texto.substring(0,titulo).trim()+"</h1>"+"\n"+"<p>"+texto.substring(titulo+1).trim()+"</p>"+
                "\n</html>";

        return html;
    }
}
