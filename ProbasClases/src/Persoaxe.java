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
        setNome(nome);
        setVida(vida);
        setResistencia(resistencia);
        setForza(forza);
        setVelocidad(velocidad);
        setExperiencia(experiencia);
        setApariencia(apariencia);
        setHabilidades(habilidades);
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
        this.equipamento=new String[5];
        if (numEquipamento>5) numEquipamento=5;
        for (int i =0;i<numEquipamento;i++){
            this.equipamento[i]=equipamento[i];
        }
    }

    public void setHabilidades(String[] habilidades) {
        int numHabilidades=habilidades.length;
        this.habilidades=new String[5];
        if (numHabilidades>5) numHabilidades=5;
        for (int i =0;i<numHabilidades;i++){
            this.habilidades[i]=habilidades[i];
        }
    }

    public void setNome(String nome) {
        if (nome.length()>15) System.out.println("Nome moi longo");
        else if (nome.isEmpty()) System.out.println("Nome moi curto");
        else this.nome = nome;
    }

    public void setVida(int vida) {
        if (vida<=5 && vida>=0) this.vida = vida;
        else this.vida = 3;
    }

    public void setResistencia(int resistencia) {
        if (resistencia<=5 && resistencia>=0) this.resistencia = resistencia;
        else this.resistencia = 3;
    }

    public void setForza(int forza) {
        if (forza<=5 && forza>=0) this.forza = forza;
        else this.forza = 3;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia<=5 && experiencia>=0) this.experiencia = experiencia;
        else this.experiencia = 0;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad<=5 && velocidad>=0) this.velocidad = velocidad;
        else this.velocidad = 3;
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
