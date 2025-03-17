public class ListaV2 {
    private Nodo inicio;
    private Nodo ultimo;
    private int tamanho=0;

    //CONSTRUCTORES

    public ListaV2(Nodo inicio) {
        this.inicio = inicio;
        tamanho++;
    }

    public ListaV2() {
        inicio=null;
    }

    //GETTER

    public int getTamanho() {
        return tamanho;
    }

    //METODOS
    public boolean estaValeira(){
        return tamanho==0;
    }
    public void listar(){
        String lista="";
        Nodo nodS=inicio;
        for (int i =0;i<tamanho;i++){
            if (nodS!=null){
                lista=lista+nodS.getValor()+",";
                nodS=nodS.getPunteiroSeguinte();
            }
            else break;
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
        while (nodS.getPunteiroSeguinte()!=ultimo){
            nodS=nodS.getPunteiroSeguinte();
        }
        return nodS;
    }


    public void elimiarPrimeiro(){
        if (tamanho!=0){
            inicio=inicio.getPunteiroSeguinte();
            tamanho--;
        }
    }
    public void eliminarUltimo(){
        if (tamanho!=0){
            ultimo=nodoPenultimo();
            tamanho--;
        }
    }

}
