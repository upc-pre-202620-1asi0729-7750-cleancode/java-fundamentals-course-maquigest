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

        // TODO: Recorre los arrays con un bucle for.
        // Muestra el número, nombre en mayúsculas y puntuación de cada juego.

        int opcion = -1;

        while (opcion != 0) {
            System.out.print(
                    "\nEscribe el número de un videojuego "
                    + "para consultarlo o 0 para salir: "
            );

            opcion = scanner.nextInt();

            // TODO: Comprueba si la opción corresponde a un videojuego.
            // Recuerda que las opciones empiezan en 1,
            // pero los índices de los arrays empiezan en 0.

            // TODO: Si la opción no existe y no es 0,
            // muestra un mensaje de opción inválida.
        }

        System.out.println("Consulta finalizada.");
        scanner.close();
    }
}