# Lección 6: Crea clases y objetos

**Duración objetivo:** 4 minutos  
**Archivo usado:** `completed-examples/lesson-06/Main.java`  
**Objetivo:** definir una clase con atributos, constructor y método de instancia; luego crear objetos.

## Guion listo para grabar

### — Apertura

**En pantalla:** dibujo simple de un molde y dos tarjetas de videojuegos.

**Voz:**

> Hasta ahora guardamos datos en variables separadas. Cuando varios valores describen una misma entidad, podemos agruparlos en una clase. Una clase funciona como un molde: define qué información y qué comportamiento tendrán sus objetos. Hoy crearemos la clase Videojuego y, a partir de ella, dos objetos distintos.

### — Clase y atributos

**Acción:** enfocar `class Videojuego` y sus tres atributos.

**Voz:**

> Después de cerrar la clase Main, declaramos la clase Videojuego. En este archivo no lleva la palabra public, porque Java solo permite una clase pública por archivo y el archivo se llama Main punto java.

> La clase define tres atributos: nombre y genero son textos; puntuacion es un entero. Cada objeto Videojuego tendrá su propia copia de estos datos. Un objeto podrá representar Minecraft y otro podrá representar Celeste sin mezclar su información.

### — Constructor y `this`

**Acción:** resaltar el constructor y emparejar visualmente cada asignación.

**Voz:**

> El constructor prepara un objeto cuando lo creamos. Tiene el mismo nombre que la clase y no declara un tipo de retorno. Recibe nombre, genero y puntuacion como parámetros.

> Dentro aparece la palabra this. This punto nombre se refiere al atributo del objeto actual. El nombre sin this se refiere al parámetro recibido. Por tanto, esta asignación guarda el valor del parámetro en el atributo. Lo mismo ocurre con género y puntuación.

### — Crear objetos

**Acción:** volver a `main` y resaltar las dos instrucciones con `new`.

**Voz:**

> En main declaramos una variable de tipo Videojuego llamada juegoUno. La palabra new crea el objeto y llama al constructor con tres argumentos. Este objeto contiene Minecraft, Aventura y nueve.

> La segunda instrucción crea otro objeto con Celeste, Plataformas y ocho. Ambos siguen el mismo molde, pero conservan valores independientes. Esta es una de las ideas centrales de la programación orientada a objetos.

### — Método de instancia

**Acción:** enfocar `mostrarInformacion` y luego sus dos llamadas.

**Voz:**

> La clase también incluye el método mostrarInformacion. No es static, porque pertenece a cada objeto. Desde el método podemos acceder directamente a sus atributos y construir una línea con nombre, género y puntuación.

> Para ejecutarlo escribimos el nombre de la variable, un punto y el método. JuegoUno muestra sus propios datos. JuegoDos muestra los suyos. El mismo comportamiento funciona con cualquier objeto Videojuego.

### — Ejecutar

**Acción:** ejecutar el programa.

**En pantalla:**

```text
Minecraft | Aventura | 9/10
Celeste | Plataformas | 8/10
```

**Voz:**

> La consola muestra una línea por objeto. La estructura es la misma, pero los datos cambian según la instancia que recibió la llamada.

### — Reto breve

**En pantalla:** “Pausa: agrega `horasJugadas`”.

**Voz:**

> Pausa el video y agrega un atributo entero llamado horasJugadas. Inclúyelo como parámetro del constructor, asígnalo con this y muéstralo dentro de mostrarInformacion. Finalmente, agrega el nuevo argumento al crear ambos objetos. Recuerda que todas las llamadas al constructor deben coincidir con su nueva lista de parámetros.

### — Cierre

**Voz:**

> Hoy usamos una clase como molde y creamos objetos con new. Los atributos guardaron el estado, el constructor asignó los valores iniciales y un método de instancia mostró la información de cada objeto. En el proyecto final protegeremos los atributos, validaremos datos y construiremos un catálogo completo.

## Control antes de publicar

- Aclarar que `this` representa el objeto actual.
- Mantener `Main` como única clase pública del archivo.
- Ocultar rostro, nombres, institución y datos de cuentas.
