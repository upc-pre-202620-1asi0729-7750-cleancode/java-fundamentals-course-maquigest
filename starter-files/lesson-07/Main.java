import java.util.Scanner;

class Videojuego {
    private String nombre;
    private String genero;
    private int puntuacion;

    public Videojuego(
            String nombre,
            String genero,
            int puntuacion
    ) {
        // TODO: Asigna el nombre y el género.

        // TODO: Utiliza setPuntuacion para asignar
        // una puntuación válida.
    }

    public String getNombre() {
        // TODO: Devuelve el nombre.
        return "";
    }

    public String getGenero() {
        // TODO: Devuelve el género.
        return "";
    }

    public int getPuntuacion() {
        // TODO: Devuelve la puntuación.
        return 0;
    }

    public void setPuntuacion(int puntuacion) {
        // TODO: Guarda la puntuación solamente si
        // se encuentra entre 0 y 10.
    }

    public boolean esRecomendado() {
        // TODO: Devuelve true cuando la puntuación
        // sea 7 o mayor.
        return false;
    }
}

public class Main {
    public static int leerPuntuacion(Scanner scanner) {
        // TODO: Solicita una puntuación.

        // TODO: Rechaza entradas que no sean enteros.

        // TODO: Rechaza números menores que 0 o mayores que 10.

        return 0;
    }

    public static void mostrarCatalogo(
            Videojuego[] catalogo
    ) {
        // TODO: Recorre el catálogo.

        // TODO: Muestra nombre, género, puntuación
        // y si cada videojuego es recomendado.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;

        System.out.println("REGISTRO DE VIDEOJUEGOS");

        // TODO: Solicita la cantidad de videojuegos.

        // TODO: Repite la pregunta si la entrada no es
        // un entero entre 1 y 10.

        Videojuego[] catalogo =
                new Videojuego[cantidad];

        // TODO: Recorre el array y registra
        // todos los videojuegos.

        mostrarCatalogo(catalogo);
        scanner.close();
    }
}