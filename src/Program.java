import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        String response = Program.numberEvaluate(-5);
        System.out.println("El numero es: " + response);

        System.out.println("*************************");
        System.out.println("While");
        System.out.println("*************************");
        Program.iterarWhile();

        System.out.println("*************************");
        System.out.println("Do While");
        System.out.println("*************************");
        Program.iterarDo();

        System.out.println("*************************");
        System.out.println("For Loop");
        System.out.println("*************************");
        Program.iterarFor();

        System.out.println("*************************");
        System.out.println("Switch Case");
        System.out.println("*************************");
        Program.iterarSwitch("comida");
    }

    static String numberEvaluate(int numeroIf) {
        if(numeroIf>0) {
            return "positivo";
        }else if(numeroIf==0){
            return "cero";
        }else {
            return "negativo";
        }
    }

    static void iterarWhile(){
        int numeroWhile = 0;

        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    static void iterarDo(){
        int numeroWhile = 0;

        do{
            System.out.println("Ejecutando Do While");
            numeroWhile++;
        }while (numeroWhile<=0);
    }

    static void iterarFor(){
        for (int numeroFor = 0; numeroFor <=3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    static void iterarSwitch(String estacion){
        switch (estacion.toLowerCase()){
            case "verano":
                System.out.println("La estacion es " + estacion.toUpperCase());
                break;
            case "primavera":
                System.out.println("La estacion es " + estacion.toUpperCase());
                break;
            case "otoño":
                System.out.println("La estacion es " + estacion.toUpperCase());
                break;
            case "invierno":
                System.out.println("La estacion es " + estacion.toUpperCase());
                break;
            default:
                System.out.println("Ingrese una estación válida");
                break;
        }
    }

}
