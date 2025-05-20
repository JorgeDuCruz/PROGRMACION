package Bol13Ex11;

import java.util.*;

public class Ej11 {
    public static void main(String[] args) {
        Map<Character,Academico> lista = new TreeMap<>();
        Academico.novoAcademico(lista,new Academico("pepe","15/2/2020"),'a');
        Academico.novoAcademico(lista,new Academico("luis","16/2/2020"),'v');
        Academico.novoAcademico(lista,new Academico("ana","1/2/2020"),'e');
        Academico.novoAcademico(lista,new Academico("saul","20/2/2020"),'r');
        Academico.novoAcademico(lista,new Academico("maria","15/5/2020"),'b');


        Set<Academico> lista1 = new TreeSet<>(new ComparatorListaSinLetra());
        lista1.addAll(lista.values());
        System.out.println(lista1);

        Set<Map.Entry<Character,Academico>> lista2 = lista.entrySet();
        System.out.println(lista2);
    }

}
