public class Main {
    public static void main(String[] args) {
        Videojuego juegoUno = new Videojuego("Minecraft", "Aventura", 9);
        Videojuego juegoDos = new Videojuego("Celeste", "Plataformas", 8);

        juegoUno.mostrarInformacion();
        juegoDos.mostrarInformacion();
    }
}

class Videojuego {
    String nombre;
    String genero;
    int puntuacion;

    public Videojuego(String nombre, String genero, int puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.puntuacion = puntuacion;
    }

    public void mostrarInformacion() {
        System.out.println(nombre + " | " + genero + " | " + puntuacion + "/10");
    }
}
