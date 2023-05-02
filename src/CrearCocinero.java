import java.util.Scanner;

public class CrearCocinero {
    ImprimirCocineros imprimirCocineros = new ImprimirCocineros();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Diego Lopez", 1);
        Cocinero cocinero2 = new Cocinero("Juan Zambrano", 2);
        Cocinero cocinero3 = new Cocinero("Maria Herrera", 1.30);
        Cocinero cocinero4 = new Cocinero("Alejandro Peralta", 2);
        Cocinero cocinero5 = new Cocinero("Gilberto Herrera", 3);
        Cocinero cocinero6 = new Cocinero("Mario Martinez", 5);

        Cocinero[] cocineros = {cocinero1, cocinero2, cocinero3, cocinero4, cocinero5, cocinero6};
        ImprimirCocineros.imprimirDatosCocineros(cocineros);
        Cocinero.imprimirEspecialidadCocina();
        System.out.println("Tiempo total para cocinar para 400 personas: " + CrearCocinero.tiempoTotalCocinar400Personas() + " horas");
        System.out.println("-----------------------------------------------------------------------------");
    }


    public static double tiempoTotalCocinar400Personas() {
        int tiempoPorPersona = (int) (400 / Cocinero.getTiempoDeCocinaEquipo());
        System.out.println("-----------------------------------------------");
        System.out.println("Se cocina para "+tiempoPorPersona+" personas por hora ");
        System.out.println("-----------------------------------------------------------------------------");
        double tiempoTotal=  400/(400/Cocinero.getTiempoDeCocinaEquipo());

        return tiempoTotal;
    }



}

