package Bol13Ex11;

import java.util.Comparator;

public class ComparatorListaSinLetra implements Comparator<Academico> {

    @Override
    public int compare(Academico ac1, Academico ac2) {
        int compararNome=ac1.compareTo(ac2);
        if (compararNome==0){
            return ac1.nome.compareTo(ac2.nome);
        }
        else {
            return compararNome;
        }
    }
}
