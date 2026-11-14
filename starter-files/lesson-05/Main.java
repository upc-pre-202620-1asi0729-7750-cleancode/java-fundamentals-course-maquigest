public class Main {
    public static boolean esRecomendado(int puntuacion) {
        // TODO: Devuelve true cuando la puntuación sea 7 o mayor.
        return false;
    }

    public static String obtenerCategoria(int puntuacion) {
        // TODO: Devuelve:
        // "Excelente" para puntuaciones de 9 a 10.
        // "Bueno" para puntuaciones de 7 a 8.
        // "Regular" para las puntuaciones restantes.
        return "";
    }

    public static void mostrarFicha(
            String nombre,
            String genero,
            int puntuacion
    ) {
        // TODO: Muestra nombre, género y puntuación.

        // TODO: Llama a obtenerCategoria.

        // TODO: Llama a esRecomendado y muestra "Sí" o "No".
    }

    public static double calcularPromedio(int[] puntuaciones) {
        // TODO: Recorre el array y suma las puntuaciones.

        // TODO: Divide la suma entre la cantidad de elementos.
        return 0.0;
    }

    public static void mostrarResumen(
            String[] nombres,
            String[] generos,
            int[] puntuaciones
    ) {
        System.out.println("CATÁLOGO DE VIDEOJUEGOS\n");

        // TODO: Recorre los arrays y llama a mostrarFicha
        // para cada videojuego.

        // TODO: Calcula y muestra el promedio del catálogo.
    }

    public static void main(String[] args) {
        String[] nombres = {
                "Minecraft",
                "Celeste",
                "Portal"
        };

        String[] generos = {
                "Aventura",
                "Plataformas",
                "Puzles"
        };

        int[] puntuaciones = {
                9,
                8,
                10
        };

        mostrarResumen(
                nombres,
                generos,
                puntuaciones
        );
    }
}