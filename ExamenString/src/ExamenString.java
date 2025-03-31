public class ExamenString {
        public static void main(String[] args) {
            System.out.println(Acronimo("     Open     Systems Interconnection"));
            System.out.println(Invertir2("Open Systems Interconnection"));
        }

        private static String Acronimo(String origen) {
            String acronimo = "";

            for(origen = origen.trim(); origen.contains("  "); origen = origen.replace("  ", " ")) {
            }

            String[] palabras = origen.split(" ");

            for(int i = 0; i < palabras.length; ++i) {
                acronimo = acronimo + palabras[i].charAt(0);
            }

            return acronimo.toUpperCase();
        }

        private static String Invertir2(String origen) {
            String invertido = "";

            for(int j = origen.length() - 1; j >= 0; --j) {
                invertido = invertido + origen.charAt(j);
            }

            return invertido;
        }
}
