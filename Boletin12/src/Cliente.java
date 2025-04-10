import java.io.Serializable;

public class Cliente implements Serializable {
    private String id;
    private String nome;
    private int telefono;

    public Cliente(String id,String nome, int telefono){
        setId(id);
        setNome(nome);
        setTelefono(telefono);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(int telefono) throws ExcepcionTelefonoNoValido {
        if (Integer.toString(telefono).length()==9) this.telefono = telefono;
        else throw new ExcepcionTelefonoNoValido();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "ID: "+id+" Nome: "+nome+" Teléfono: "+telefono;
    }
}
