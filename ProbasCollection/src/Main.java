//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Contedor<Integer> num = new Contedor<Integer>();
        num.gardar(5);
        int n = num.extraer();
        System.out.println(n);
        Contedor<String> cad = new Contedor<>();
        cad.gardar("Hola");
        String st = cad.extraer();
        System.out.println(st);

        Contedor c = new Contedor();
        c.gardar(12.25);
        Object nu = c.extraer();
        System.out.println(nu);

        Double [] temp = new Double[5];
        temp[0] = 2.5;
        temp[1] = 15.53;
        temp[2] = 22.43;
        temp[3] = -5.66;
        temp[4]= 15.77;

        ContedorElementos<Double> t = new ContedorElementos<>(temp);
        t.apilar(2.45);
        t.apilar(33.56);
        t.encolar(12.45);
        t.encolar(41.44);
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());

         */
        Cliente cl=new Cliente("00000000T","Pepe","21/02/2015");
        System.out.println(cl.toString());
    }
}