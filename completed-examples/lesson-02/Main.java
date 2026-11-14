import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del videojuego: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Horas jugadas: ");
        int horasJugadas = scanner.nextInt();

        System.out.print("Puntuación de 0 a 10: ");
        double puntuacion = scanner.nextDouble();

        boolean terminado = false;
        int minutosJugados = horasJugadas * 60;

        System.out.println("\nFicha del videojuego");
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas: " + horasJugadas);
        System.out.println("Minutos: " + minutosJugados);
        System.out.println("Puntuación: " + puntuacion);
        System.out.println("Terminado: " + terminado);

        scanner.close();
    }
}
