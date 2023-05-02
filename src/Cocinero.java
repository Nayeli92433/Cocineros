public class Cocinero {
    private static int contadorCocinero = 0;
    private static String especialidadCocina= "Comida internacional";
    private static double tiempoDeCocinaEquipo=0;
    private int idCocinero;
    private String nombre;
    private double tiempoCocinar;

    public Cocinero(String nombre, double tiempoCocinar) {
        this.idCocinero = ++contadorCocinero;
        this.nombre = nombre;
        this.tiempoCocinar = tiempoCocinar;

        tiempoDeCocinaEquipo = (tiempoDeCocinaEquipo+tiempoCocinar);
    }
    public static int getContadorCocinero() {
        return contadorCocinero;
    }
    public int getIdCocinero() {
        return idCocinero;
    }
    public static double getTiempoDeCocinaEquipo() {
        return tiempoDeCocinaEquipo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getTiempoCocinar() {
        return tiempoCocinar;
    }
    public static void imprimirEspecialidadCocina() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("Especialidad de cocina: " + especialidadCocina);
        System.out.println("-----------------------------------------------");
    }
}


