public class Main {
    public static boolean esRecomendado(int puntuacion) {
        return puntuacion >= 7;
    }

    public static String obtenerCategoria(int puntuacion) {
        if (puntuacion >= 9) {
            return "Excelente";
        } else if (puntuacion >= 7) {
            return "Bueno";
        } else {
            return "Regular";
        }
    }

    public static void mostrarFicha(
            String nombre,
            String genero,
            int puntuacion
    ) {
        String recomendacion;

        if (esRecomendado(puntuacion)) {
            recomendacion = "Sí";
        } else {
            recomendacion = "No";
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Puntuación: " + puntuacion + "/10");
        System.out.println(
                "Categoría: " + obtenerCategoria(puntuacion)
        );
        System.out.println("Recomendado: " + recomendacion);
        System.out.println();
    }

    public static double calcularPromedio(int[] puntuaciones) {
        int suma = 0;

        for (int i = 0; i < puntuaciones.length; i++) {
            suma += puntuaciones[i];
        }

        return (double) suma / puntuaciones.length;
    }

    public static void mostrarResumen(
            String[] nombres,
            String[] generos,
            int[] puntuaciones
    ) {
        System.out.println("CATÁLOGO DE VIDEOJUEGOS\n");

        for (int i = 0; i < nombres.length; i++) {
            mostrarFicha(
                    nombres[i],
                    generos[i],
                    puntuaciones[i]
            );
        }

        double promedio = calcularPromedio(puntuaciones);

        System.out.println(
                "Promedio del catálogo: " + promedio
        );
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