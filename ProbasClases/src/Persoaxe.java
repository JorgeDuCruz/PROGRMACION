public class Persoaxe {
    private String nome;
    private int vida;
    private int resistencia;
    private int forza;
    private int velocidad;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamento;

    public Persoaxe(){
        nome="Invitado";
        vida=3;
        resistencia=3;
        forza=3;
        velocidad=3;
        experiencia=1;
        apariencia="Soldado raso";
        habilidades=new String[5];
        equipamento=new String[5];

    }

    public Persoaxe(String nome, int vida, int resistencia, int forza, int velocidad, int experiencia, String apariencia, String[] habilidades, String[] equipamento) {
        this.nome = nome;
        this.vida = vida;
        this.resistencia = resistencia;
        this.forza = forza;
        this.velocidad = velocidad;
        this.experiencia = experiencia;
        this.apariencia = apariencia;
        this.habilidades=new String[5];
        setHabilidades(habilidades);
        this.equipamento=new String[5];
        setEquipamento(equipamento);
    }


    public static void main(String[] args) {
        String[] hab ={"Rayo hielo", "Gran Salto","Fuego","Agua"};
        String[] equi ={"Alas de ícaro", "Ray gun","Hoja del Olimpo","Espadas del Caos","Botas de hermes","Gi naranja"};
        Persoaxe mario = new Persoaxe("Mario Bros",5,5,7,1,4,"Isaac",hab,equi);
    }
    //SETTERS
    public void setEquipamento(String[] equipamento) {
        int numEquipamento=equipamento.length;
        if (numEquipamento>5) numEquipamento=5;
        for (int i =0;i<numEquipamento;i++){
            this.equipamento[i]=equipamento[i];
        }
    }

    public void setHabilidades(String[] habilidades) {
        int numHabilidades=habilidades.length;
        if (numHabilidades>5) numHabilidades=5;
        for (int i =0;i<numHabilidades;i++){
            this.habilidades[i]=habilidades[i];
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }
    //GETTER
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getForza() {
        return forza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public String getApariencia() {
        return apariencia;
    }

    public String[] getEquipamento() {
        return equipamento;
    }
}
