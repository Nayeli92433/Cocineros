public class ImprimirCocineros {

    public static void imprimirDatosCocineros(Cocinero[] cocineros) {
        System.out.println("\n-----------------------------------------------");
        System.out.println("\t\t\tDatos de los cocineros:");
        System.out.println("-----------------------------------------------");
        System.out.println("\t\tid\t \tNombre \t\tHora");

        for (Cocinero cocinero : cocineros) {
            System.out.println("\t\t"+cocinero.getIdCocinero() + " - " + cocinero.getNombre() + " - " + cocinero.getTiempoCocinar());
        }
    }
}
