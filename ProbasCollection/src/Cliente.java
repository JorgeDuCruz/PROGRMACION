import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente>{
    String dni;
    String nome;
    LocalDate dataNacemento;

    public Cliente (String dni, String nome, String dataNacemento){
        this.dni=dni;
        this.nome=nome;
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNacemento=LocalDate.parse(dataNacemento,formatoData);
    }

    int edade(){
        return (int) dataNacemento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        return this.edade() - otroCliente.edade();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "DNI: "+dni+", Nome: "+nome+", Edade: "+edade()+", Data nacemento: "+dataNacemento.format(formatoData);
    }
}

