public class HorarioSol {
    public static void main(String[]args){
        System.out.println(horarioCursp("mércores",5));
    }
    public static String horarioCursp(String dia,int hora){
        String[][] horario ={
                {"BD","BD","BD","BD","DS","PR","PR","PR"},
                {"BD","BD","BD","SASP","DS","SI","SI","IPE"},
                {"PR","PR","PR","LMSXI","DS","LMSXI","COD","COD"},
                {"IN","IN","SI","SI","DS","PR","PR","PR"},
                {"COD","LMSXI","LMSXI","SI","DS","SI","IPE","IPE"}
        };
        int diaNum = switch (dia){
            case "luns"->0;
            case "martes"->1;
            case "mércores"->2;
            case "xoves"->3;
            case "venres"->4;
            default -> -1;
        };
        if (diaNum == -1) return "introduce un dia entre luns e venres";
        else if (hora<=0 || hora>8) return "Introduce una hora entre 1-8";
        else return horario[diaNum][hora-1];

    }
}
