import Animais.Aguia;
import Animais.Can;
import Animais.Canguro;
import Animais.Golfinho;
import B10Ej2SinInterface.AsalariadosABS;
import B10Ej2SinInterface.MembroAsociacionABS;
import B10Ej2SinInterface.SociosABS;
import B10Ej2SinInterface.VoluntariosABS;
import B10Ej2SoloInterface.MembroAsociacionIN;
import B10Ej2SoloInterface.SociosIN;
import Boletin10Ej2.*;
import Datas.Data;
import Geometria.*;
import Persoas.ContaCorrente;
import Persoas.Persoaxe;
import inmobiliaria.PrazaGaraxeConTrasteiro;
import inmobiliaria.Vivenda;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExcepcionPuntoForaPrimeiroCadrante {

        String[] hab ={"Rayo hielo", "Gran Salto","Fuego","Agua"};
        String[] equi ={"Alas de ícaro", "Ray gun","Hoja del Olimpo","Espadas del Caos","Botas de hermes","Gi naranja"};

        Persoaxe mario = new Persoaxe("Mario",5,4,3,22,1,"soldado",hab,equi);

        System.out.println(Arrays.toString(mario.getEquipamento()));
        System.out.println(mario.getVelocidad());

        Punto p1 = new Punto(0,3);
        Punto p2 = new Punto(0,3);

        System.out.println("Coordenada x de p1: "+p1.getX());
        System.out.println("Coordenada x de p2: "+p2.getX());
        System.out.println("Coordenada y de p2: "+p2.getY());
        System.out.println(p1.equals(p2));
        System.out.println(p1.getClass());
        System.out.println(p1.toString());

        Data data1 = new Data(28,12,2028);
        data1.mostrarData();
        System.out.println(data1.incrementarDia(1));
        data1.mostrarData();
        System.out.println(data1.incrementarDia(1));
        data1.mostrarData();
        System.out.println(data1.incrementarDia(1));
        data1.mostrarData();
        System.out.println(data1.incrementarDia(1));
        data1.mostrarData();
        System.out.println(data1.toString());
        Data data2 = new Data(1,1,2029);
        System.out.println(data1.equals(data2));

        Circulo c1= new Circulo(2.8,15,5);
        System.out.println(c1.obterArea());
        System.out.println(c1.obterDiametro());
        System.out.println(c1.obterPerimetro());
        System.out.println(c1.toString());

        Cilindro ci1 = new Cilindro(25);
        System.out.println(ci1.toString());
        System.out.println(ci1.obterPerimetro());

        ContaCorrente co1 = new ContaCorrente("joseLuis","00000023E","LS546556");
        System.out.println(ContaCorrente.getContador());
        ContaCorrente co2 = new ContaCorrente("joseLuis","00000023E","LS546556");
        System.out.println(ContaCorrente.getContador());

        ListaV2 lis = new ListaV2();
        lis.engadirUltimo(5);
        lis.engadirUltimo(15);
        lis.engadirPrimeiro(10);
        lis.listar();
        System.out.println(lis.getTamanho());

        PuntoCentro pc = new PuntoCentro();
        Cadrado cd = new Cadrado(4.98);
        System.out.println("Superficie: "+cd.obterArea());
        System.out.println("Perimetro: "+cd.obterPerimetro());
        Cubo cu= new Cubo(7,2,3);
        System.out.println(cu.aCadea());
        System.out.println(cu.volumen());
        System.out.println(cu.obterArea());

        Can ca = new Can("lopez",12);
        ca.desprazar();
        ca.comer();
        ca.durmir();
        ca.Mamar();

        Aguia ja = new Aguia("calva");
        ja.desprazar();
        ja.comer();
        ja.durmir();

        Canguro cang = new Canguro("Merche");
        cang.desprazar();
        cang.comer();
        cang.durmir();
        cang.Mamar();
        cang.voz();

        Golfinho gol = new Golfinho("Fin",5);
        gol.desprazar();
        gol.comer();
        gol.durmir();

        PrazaGaraxeConTrasteiro garaxe = new PrazaGaraxeConTrasteiro("ab",5,"Vigo",4.2,true,2.12,2.12,4,25);
        Vivenda vivenda=new Vivenda("ab",5,"Vigo",4.2,true,"2º","6ºD",5,false,garaxe,"N");

        Socios pepe = new Socios("0000000T","Pepe",2500,new Data(1,5),"Pepelandia","Peterland");
        System.out.println(pepe.aCadea());
        Asalariados peter = new Asalariados("0000000T","Pepe",new Data(1,5),"Limpiador",25,1500,24);
        System.out.println(peter.aCadea());
        Voluntarios pepper = new Voluntarios("0000000T","Pepe",new Data(1,5),25,5,"Ingenirio en puentes y caminos","Recogepelotas");
        System.out.println(pepper.aCadea());
        CalculoGastosIngresos[] asoAntiDrog = new CalculoGastosIngresos[3];
        asoAntiDrog[0] = pepe;
        asoAntiDrog[1] = peter;
        asoAntiDrog[2] = pepper;
        System.out.println(asoAntiDrog[0].gastosINgresos());
        double total =0;
        for (CalculoGastosIngresos membro:asoAntiDrog){
            total= total+membro.gastosINgresos();
        }
        System.out.println("Saldo da Asociacion: "+total);
        Traballadores trab1;
        trab1 = pepper;
        System.out.println(trab1.aCadea());

        SociosABS pepeAbs = new SociosABS("0000000T","PepeAbs",2500,new Data(1,5),"Pepelandia","Peterland");
        System.out.println(pepeAbs.aCadea());
        AsalariadosABS peterAbs = new AsalariadosABS("0000000T","PeterAbs",new Data(1,5),"Limpiador",25,1500,24);
        System.out.println(peter.aCadea());
        VoluntariosABS pepperAbs = new VoluntariosABS("0000000T","PepperAbs",new Data(1,5),25,5,"Ingenirio en puentes y caminos","Recogepelotas");
        System.out.println(pepper.aCadea()+"\n");
        MembroAsociacionABS[] memAbs = new MembroAsociacionABS[3];
        memAbs[0]=pepeAbs;
        memAbs[1]=peterAbs;
        memAbs[2]=pepperAbs;
        for (MembroAsociacionABS memAb : memAbs) {
            System.out.println(memAb.aCadea());
            System.out.println(memAb.gastosINgresos());
        }

        Data prueba = new Data("12-13/2025");
        System.out.println(prueba.toString());

        lis.listar();
        lis.eliminarUltimo();
        lis.listar();
        lis.elimiarPrimeiro();
        lis.listar();

        Cadrado cad = new Cadrado(2,-1,5);
    }
}