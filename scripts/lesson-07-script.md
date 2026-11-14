# Lección 7: Proyecto final — Registro de videojuegos

**Duración objetivo:** 6 minutos  
**Archivo usado:** `completed-examples/lesson-07/Main.java`  
**Objetivo:** integrar entrada, validación, funciones, arrays dinámicos, bucles, clases, objetos y encapsulación.

## Guion listo para grabar

### — Presentar el resultado

**Acción:** ejecutar primero el programa completo. Elegir una cantidad de tres videojuegos y completar el registro.

**Voz:**

> Cerraremos el curso construyendo un registro de videojuegos. Primero, el usuario decidirá cuántos juegos desea registrar, con un mínimo de uno y un máximo de diez. Después ingresará el nombre, el género y la puntuación de cada videojuego. El programa validará los datos, creará los objetos necesarios y mostrará el catálogo completo.

### — La clase `Videojuego`

**Acción:** enfocar `class Videojuego` y sus tres atributos.

**Voz:**

> Comenzamos con la clase Videojuego. Esta clase funciona como el molde de los objetos que almacenaremos en el catálogo.

> Sus atributos nombre, genero y puntuacion son private. Esto significa que no pueden modificarse directamente desde cualquier parte del programa. Esta protección se denomina encapsulación.

> A partir de esta lección llamaremos métodos a los comportamientos que pertenecen a los objetos. Por ejemplo, getNombre y esRecomendado son métodos de cada objeto Videojuego.

### — Constructor, getters y setter

**Acción:** resaltar el constructor, los getters y `setPuntuacion`.

**Voz:**

> El constructor recibe el nombre, el género y la puntuación. Los dos primeros valores se guardan utilizando this.

> Para asignar la puntuación, el constructor llama al método setPuntuacion. Este método solo guarda valores comprendidos entre cero y diez.

> Los métodos get permiten consultar los atributos privados. GetNombre devuelve el nombre, getGenero devuelve el género y getPuntuacion devuelve la puntuación.

> De esta forma, el objeto controla cómo se consulta y modifica su información.

### — Regla de recomendación

**Acción:** resaltar `esRecomendado`.

**Voz:**

> El método esRecomendado devuelve true cuando la puntuación es siete o mayor. La regla se encuentra dentro de la clase porque está directamente relacionada con el estado de cada videojuego.

### — Solicitar la cantidad de videojuegos

**Acción:** enfocar el inicio de `main`, la variable `cantidad` y el primer `do while`.

**Voz:**

> Dentro de main creamos el Scanner y declaramos la variable cantidad. A diferencia de la versión anterior, el tamaño del catálogo ya no está escrito directamente en el código. Ahora será decidido por el usuario.

> Utilizamos un do while porque la pregunta debe realizarse al menos una vez. El programa solicita cuántos juegos se registrarán.

> La función hasNextInt comprueba si la próxima entrada es un número entero. El signo de exclamación representa negación. Por tanto, mientras la entrada no sea un entero, el programa muestra una explicación, descarta el texto incorrecto y vuelve a solicitar el dato.

### — Validar el rango de cantidad

**Acción:** resaltar la lectura de `cantidad`, el `if` y la condición final del `do while`.

**Voz:**

> Cuando la entrada ya es un entero, nextInt la guarda en cantidad. Después utilizamos nextLine para consumir el salto de línea pendiente.

> El catálogo debe tener como mínimo un videojuego y como máximo diez. Si la cantidad está fuera de ese rango, aparece un mensaje de error.

> El do while repite la pregunta mientras la cantidad sea menor que uno o mayor que diez. El programa solo continúa cuando recibe un valor permitido.

### — Crear un array dinámico

**Acción:** resaltar:

```java
Videojuego[] catalogo = new Videojuego[cantidad];
```

**Voz:**

> Después de validar la cantidad, creamos el array. Su tamaño utiliza el valor ingresado por el usuario.

> Si el usuario escribió tres, el array tendrá tres posiciones. Si escribió ocho, tendrá ocho. Por eso lo llamamos un catálogo de tamaño dinámico: su capacidad se decide durante la ejecución.

### — Registrar los objetos

**Acción:** enfocar el primer `for`.

**Voz:**

> El bucle for recorre todas las posiciones del catálogo. Su condición utiliza catalogo punto length, por lo que funciona con cualquier cantidad permitida.

> En cada repetición mostramos el número del videojuego, leemos el nombre y el género, y eliminamos los espacios sobrantes con trim.

> Después llamamos a leerPuntuacion para obtener un valor válido. Finalmente utilizamos new Videojuego para crear el objeto y lo guardamos en la posición actual del array.

### — Validar la puntuación

**Acción:** enfocar `leerPuntuacion`. Marcar el `while` interior y el `do while` exterior con colores diferentes.

**Voz:**

> La función leerPuntuacion recibe el Scanner y devuelve un entero válido.

> El while interior evita que el programa se detenga si la persona escribe texto. Mientras la entrada no sea un entero, se muestra una explicación y se vuelve a solicitar la puntuación.

> Cuando recibimos un entero, comprobamos su rango. Las puntuaciones válidas se encuentran entre cero y diez.

> El do while exterior repite el proceso si el número es menor que cero o mayor que diez. Solo después de superar ambas validaciones, return devuelve la puntuación.

### — Mostrar el catálogo

**Acción:** enfocar `mostrarCatalogo`.

**Voz:**

> Cuando todos los objetos han sido registrados, llamamos a mostrarCatalogo y enviamos el array.

> La función recorre todos los videojuegos. En cada repetición obtiene el objeto actual y llama a su método esRecomendado.

> El operador ternario convierte el resultado booleano en un texto más claro. Si el resultado es true, se muestra “Sí”; en caso contrario, se muestra “No”.

> Los datos privados se consultan mediante los métodos get correspondientes.

### — Prueba controlada

**Acción:** ejecutar utilizando la siguiente secuencia:

```text
Cantidad: texto
Cantidad: 0
Cantidad: 11
Cantidad: 3

Primer juego:
Minecraft
Aventura
Puntuación: texto
Puntuación: 12
Puntuación: 9

Segundo juego:
Celeste
Plataformas
Puntuación: 6

Tercer juego:
Portal
Puzles
Puntuación: 7
```

**Voz:**

> Probemos las validaciones. Primero escribimos texto donde se espera la cantidad. El programa lo rechaza sin detenerse. Después probamos cero y once, que se encuentran fuera del rango. Finalmente ingresamos tres.

> Durante la primera puntuación probamos nuevamente texto y el número doce. Ambos valores son rechazados. Con nueve, el registro continúa.

> Las puntuaciones seis y siete permiten comprobar el límite de recomendación. Seis produce “No” y siete produce “Sí”.

### — Reto final

**En pantalla:** “Pausa: cuenta los videojuegos recomendados”.

**Voz:**

> Como reto final, agrega un contador dentro de mostrarCatalogo. Cada vez que un videojuego sea recomendado, aumenta el contador. Después del bucle, muestra cuántos videojuegos recomendados contiene el catálogo.

### — Cierre del curso

**Voz:**

> Completaste un programa que valida entradas, crea un array con tamaño dinámico, registra objetos y muestra un catálogo. Durante el curso utilizaste variables, condiciones, arrays, bucles, funciones, clases, objetos y encapsulación.

## Control antes de publicar

- Mostrar una cantidad no numérica.
- Probar una cantidad menor que uno y otra mayor que diez.
- Demostrar que el tamaño del array depende de `cantidad`.
- Mostrar una puntuación no numérica, una fuera del rango y una válida.
- Comprobar las puntuaciones seis y siete para la recomendación.
- Diferenciar las funciones `static` de `Main` y los métodos de los objetos `Videojuego`.
- No mostrar identidad, institución, rostro, voz real, cuentas ni notificaciones.
- Revisar que el video y los subtítulos terminen antes de los 10 minutos.