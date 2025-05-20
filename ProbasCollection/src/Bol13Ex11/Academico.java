package Bol13Ex11;


import java.util.Map;

public class Academico implements Comparable {
    String nome;
    String dataIngreso;

    public Academico(String nome, String data){
        this.nome=nome.toUpperCase();
        this.dataIngreso=data;
    }
    static boolean novoAcademico(Map<Character,Academico> academia, Academico novo, Character letra){
        if (academia.containsKey(Character.toUpperCase(letra)) || !Character.isLetter(letra)){
            return false;
        }else {
            academia.put(Character.toUpperCase(letra),novo);
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Academico ac = (Academico) o;
        return nome.compareTo(ac.nome);
    }

    @Override
    public String toString() {
        return nome+" "+dataIngreso;
    }
}
