public class ListaV2 {
    private Nodo inicio;
    private Nodo ultimo;
    private int tamanho=0;

    //CONSTRUCTORES

    public ListaV2(Nodo inicio) {
        this.inicio = inicio;
        if (inicio!=null) tamanho++;
    }

    public ListaV2() {
        inicio=null;
    }

    //GETTER

    public int getTamanho() {
        return tamanho;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    //METODOS
    public boolean estaValeira(){
        return tamanho==0;
    }
    public void listar(){
        String lista="";
        Nodo nodS=inicio;

            while (nodS!=null){
                lista=lista+nodS.getValor()+",";
                nodS=nodS.getPunteiroSeguinte();
            }

        System.out.println(lista+"\b");
    }
    public void engadirUltimo(int valor){
        if (estaValeira()){
            inicio=new Nodo(valor);
            ultimo=inicio;
        }
        else {
            Nodo nodS = ultimo;
            nodS.setPunteiroSeguinte(new Nodo(valor));
            ultimo=nodS.getPunteiroSeguinte();
        }

        tamanho++;
    }
    public void engadirPrimeiro(int valor){
        inicio=new Nodo(valor,inicio);
        tamanho++;
    }
    public int obterUltimo(){
        return ultimo.getValor();
    }
    public int obterPrimeiro(){
        return inicio.getValor();
    }

    private Nodo nodoPenultimo(){
        Nodo nodS = inicio;
        if (tamanho==1){
            return null;
        }
        while (nodS.getPunteiroSeguinte()!=ultimo){
            nodS=nodS.getPunteiroSeguinte();
        }
        return nodS;
    }


    public void elimiarPrimeiro(){
        if (!estaValeira()){
            inicio=inicio.getPunteiroSeguinte();
            tamanho--;
        }
    }
    public void eliminarUltimo(){
        if (!estaValeira()){
            ultimo=nodoPenultimo();
            if (ultimo!=null) ultimo.setPunteiroSeguinte(null);
            else inicio=null;
            tamanho--;
        }
    }

    private void eliminarUltimoSinUltimo(){
        if (!estaValeira()){
            Nodo nodS =inicio;
            if (nodS.getPunteiroSeguinte()==null){
                inicio=null;
            }else {
                while (nodS.getPunteiroSeguinte().getPunteiroSeguinte()!=null){
                    nodS=nodS.getPunteiroSeguinte();
                }
                nodS.setPunteiroSeguinte(null);
            }
                tamanho--;
        }
    }

}
