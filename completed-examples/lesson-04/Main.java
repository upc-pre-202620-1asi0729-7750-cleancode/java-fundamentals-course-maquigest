import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] videojuegos = {
                "Minecraft",
                "Celeste",
                "Portal"
        };

        int[] puntuaciones = {
                9,
                8,
                10
        };

        System.out.println("CATÁLOGO DISPONIBLE");

        for (int i = 0; i < videojuegos.length; i++) {
            String nombreFormateado = videojuegos[i].trim().toUpperCase();

            System.out.println(
                    (i + 1) + ". " + nombreFormateado
                    + " - " + puntuaciones[i] + "/10"
            );
        }

        int opcion = -1;

        while (opcion != 0) {
            System.out.print(
                    "\nEscribe el número de un videojuego "
                    + "para consultarlo o 0 para salir: "
            );

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= videojuegos.length) {
                int indice = opcion - 1;

                System.out.println(
                        "Videojuego seleccionado: "
                        + videojuegos[indice]
                );

                System.out.println(
                        "Puntuación: "
                        + puntuaciones[indice] + "/10"
                );
            } else if (opcion != 0) {
                System.out.println(
                        "Opción inválida. Elige un número del catálogo."
                );
            }
        }

        System.out.println("Consulta finalizada.");
        scanner.close();
    }
}