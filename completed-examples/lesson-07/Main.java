import java.util.Scanner;

class Videojuego {
    private String nombre;
    private String genero;
    private int puntuacion;

    public Videojuego(String nombre, String genero, int puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        setPuntuacion(puntuacion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (puntuacion >= 0 && puntuacion <= 10) {
            this.puntuacion = puntuacion;
        }
    }

    public boolean esRecomendado() {
        return puntuacion >= 7;
    }
}


public class Main {
    public static int leerPuntuacion(Scanner scanner) {
        int puntuacion;

        do {
            System.out.print("Puntuación de 0 a 10: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Escribe un número entero.");
                scanner.nextLine();
                System.out.print("Puntuación de 0 a 10: ");
            }

            puntuacion = scanner.nextInt();
            scanner.nextLine();

            if (puntuacion < 0 || puntuacion > 10) {
                System.out.println("La puntuación debe estar entre 0 y 10.");
            }
        } while (puntuacion < 0 || puntuacion > 10);

        return puntuacion;
    }

    public static void mostrarCatalogo(Videojuego[] catalogo) {
        System.out.println("\nCATÁLOGO DE VIDEOJUEGOS");

        for (int i = 0; i < catalogo.length; i++) {
            Videojuego juego = catalogo[i];
            String recomendacion = juego.esRecomendado() ? "Sí" : "No";

            System.out.println((i + 1) + ". " + juego.getNombre());
            System.out.println("   Género: " + juego.getGenero());
            System.out.println("   Puntuación: " + juego.getPuntuacion() + "/10");
            System.out.println("   Recomendado: " + recomendacion);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        System.out.println("REGISTRO DE VIDEOJUEGOS");
        
        do {
            System.out.print("\nCuántos juegos registrará?: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Escribe un número entero.");
                scanner.nextLine();
                System.out.print("Mínimo 1, máximo 10: ");
            }

            cantidad = scanner.nextInt();
            scanner.nextLine();

            if (cantidad < 1 || cantidad > 10) {
                System.out.println("Debe ser un número entre 1 y 10.");
            }
        } while (cantidad < 1 || cantidad > 10);
        

        
        Videojuego[] catalogo = new Videojuego[cantidad];
        
        for (int i = 0; i < catalogo.length; i++) {
            System.out.println("\nVideojuego " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();

            System.out.print("Género: ");
            String genero = scanner.nextLine().trim();

            int puntuacion = leerPuntuacion(scanner);
            catalogo[i] = new Videojuego(nombre, genero, puntuacion);
        }

        mostrarCatalogo(catalogo);
        scanner.close();
    }
}
