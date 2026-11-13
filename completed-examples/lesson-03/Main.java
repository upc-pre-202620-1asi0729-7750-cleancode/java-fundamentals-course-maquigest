import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una puntuación de 0 a 10: ");
        int puntuacion = scanner.nextInt();

        if (puntuacion < 0 || puntuacion > 10) {
            System.out.println("La puntuación no es válida.");
        } else if (puntuacion >= 8) {
            System.out.println("Muy recomendado");
        } else if (puntuacion >= 6) {
            System.out.println("Recomendado");
        } else {
            System.out.println("Podría mejorar");
        }

        scanner.close();
    }
}
