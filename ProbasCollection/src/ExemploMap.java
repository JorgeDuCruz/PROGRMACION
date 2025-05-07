import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new TreeMap<>();
        mapa.put("Ana",23);
        mapa.put("Jose",32);
        mapa.put("Ramón",13);
        mapa.put("Jose",25);
        System.out.println(mapa);
        System.out.println(mapa.get("Ana"));
        mapa.remove("Jose");
        System.out.println(mapa);
        System.out.println(mapa.containsKey("Ana"));
        System.out.println(mapa.containsValue(23));

        //Vistas
        Set<String> claves = mapa.keySet();
        System.out.println(claves);
        Collection<Integer> valores = mapa.values();
        System.out.println(valores);

        Set<Map.Entry<String,Integer>> entradas = mapa.entrySet();
        System.out.println(entradas);

        //Iteracion del mapa con un for-each
        for (Map.Entry<String,Integer> entrada:entradas){
            System.out.println(entrada);
        }

        //Iteracion del mapa con un for y un elemento Iterator
        Iterator<Map.Entry<String,Integer>> it;
        for (it = entradas.iterator();it.hasNext();){
            Map.Entry<String,Integer> elemento = it.next();
            System.out.println("Llave "+elemento.getKey());
            System.out.println("Valor "+elemento.getValue());
        }

        //Iteracion del mapa con un for y usando una Vista de las llaves y no del mapa entero
        for (String clave:claves){
            System.out.println("LLave: "+clave+" Valor: "+mapa.get(clave));
        }
        mapa.put("Piero",45);
        mapa.put("Juan",31);

        for (Map.Entry<String,Integer> entrada:entradas){
            if (entrada.getValue()<30){
                entrada.setValue(20);
            }
        }
        for (it = entradas.iterator(); it.hasNext();){
            Map.Entry<String,Integer> elemneto = it.next();
            if (elemneto.getValue()==20){
                it.remove();
            }
        }
        System.out.println(mapa);
    }
}
