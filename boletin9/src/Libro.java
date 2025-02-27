public class Libro {
    String titulo;
    String autor;
    int ano;
    short numPaginas;
    float valoracion;

    //Constructores

    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    public Libro() {
        titulo="Quijote";
        autor="Cervantes";
        ano=1519;
        numPaginas=596;
    }
    //GETTERS

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getValoracion() {
        return valoracion;
    }
}
