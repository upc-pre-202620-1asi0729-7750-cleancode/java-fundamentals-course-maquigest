# Lección 4: Repite y consulta datos

**Duración objetivo:** 6 minutos  
**Archivo usado:** `completed-examples/lesson-04/Main.java`  
**Objetivo:** almacenar datos en arrays, recorrerlos con `for` y mantener activo un menú mediante `while`.

## Guion listo para grabar

### — Apertura

**En pantalla:** mostrar brevemente el catálogo final y realizar dos consultas antes de seleccionar cero.

**Voz:**

> Hasta ahora nuestro programa ejecutaba sus instrucciones una sola vez. Sin embargo, un catálogo resulta más útil si puede mostrar varios videojuegos y permitir que el usuario realice todas las consultas que necesite. En esta lección almacenaremos información en arrays, mostraremos el catálogo con un bucle for y mantendremos activo un menú mediante un bucle while.

### — Crear los arrays

**Acción:** enfocar las declaraciones de `videojuegos` y `puntuaciones`.

**Voz:**

> Comenzamos creando dos arrays. El primero almacena los nombres de los videojuegos y el segundo almacena sus puntuaciones. Los dos deben conservar el mismo orden.

> Minecraft ocupa la posición cero en el array de nombres y su puntuación, nueve, también ocupa la posición cero en el array de puntuaciones. Celeste y su puntuación están en la posición uno. Portal y su puntuación están en la posición dos.

> Esta relación por posiciones nos permite consultar el nombre y la puntuación de un mismo videojuego utilizando un solo índice.

**En pantalla:** relacionar visualmente las posiciones:

```text
Posición 0 → Minecraft → 9
Posición 1 → Celeste → 8
Posición 2 → Portal → 10
```

### — Mostrar el catálogo con `for`

**Acción:** resaltar el bucle `for` y sus tres partes.

**Voz:**

> Para mostrar todos los videojuegos utilizamos un bucle for. Este bucle es apropiado porque conocemos la cantidad de posiciones que debemos recorrer.

> Primero declaramos el contador i con el valor cero. Después indicamos que el bucle continuará mientras i sea menor que videojuegos punto length. Finalmente, i más más aumenta el contador después de cada repetición.

> En cada vuelta usamos videojuegos corchete i para obtener el nombre y puntuaciones corchete i para obtener su puntuación correspondiente.

> La propiedad length evita que escribamos manualmente la cantidad de elementos. Si posteriormente agregamos otro videojuego y su puntuación, el bucle podrá recorrerlos sin cambiar su condición.

### — Formatear y numerar

**Acción:** resaltar `.trim().toUpperCase()` y después `(i + 1)`.

**Voz:**

> Antes de mostrar el nombre usamos trim para eliminar espacios sobrantes y toUpperCase para convertirlo a mayúsculas.

> Los índices internos empiezan en cero, pero para el usuario queremos mostrar las opciones uno, dos y tres. Por eso imprimimos i más uno. De esta manera, el catálogo resulta más natural de utilizar.

### — Mantener el menú con `while`

**Acción:** resaltar `int opcion = -1;` y `while (opcion != 0)`.

**Voz:**

> Después de mostrar el catálogo, declaramos la variable opcion con el valor menos uno. Este valor inicial permite entrar al bucle.

> La condición del while indica que el menú continuará funcionando mientras la opción sea diferente de cero. A diferencia del for, aquí no sabemos cuántas consultas realizará el usuario. Podría realizar una, cinco o ninguna. Por eso while es la opción adecuada.

> En cada repetición solicitamos el número de un videojuego y guardamos la respuesta en opcion. Si el usuario escribe uno, dos o tres, el programa realiza la consulta. Después vuelve al inicio del while y permite escoger nuevamente.

> Cuando el usuario escribe cero, la condición deja de cumplirse y el programa sale del bucle.

### — Consultar una posición

**Acción:** resaltar la condición y `int indice = opcion - 1;`.

**Voz:**

> Antes de acceder a los arrays comprobamos que la opción se encuentre entre uno y la cantidad de videojuegos.

> Como el usuario selecciona opciones desde uno, pero los índices comienzan en cero, calculamos el índice restando uno. Si la opción es uno, el índice será cero. Si la opción es tres, el índice será dos.

> Con ese índice consultamos el nombre y la puntuación correspondientes. Si la opción no existe y tampoco es cero, mostramos un mensaje de opción inválida.

### — Ejecutar y comprobar

**Acción:** ejecutar el programa. Consultar primero la opción `2`, después `1`, luego una opción inválida como `5` y finalmente `0`.

**Voz:**

> Probemos el programa. Al ingresar dos, obtenemos los datos de Celeste. Después podemos ingresar uno y consultar Minecraft. Si escribimos cinco, aparece el mensaje de opción inválida, pero el menú continúa disponible. Finalmente escribimos cero y la consulta termina.

**En pantalla:** mantener visible:

```text
Videojuego seleccionado: Celeste
Puntuación: 8/10
```

### — Reto breve

**En pantalla:** “Pausa: agrega un cuarto videojuego”.

**Voz:**

> Pausa el video y agrega un cuarto videojuego con su respectiva puntuación. Debes colocarlo en la misma posición de ambos arrays. No cambies las condiciones de los bucles. Si utilizaste correctamente length, la nueva opción aparecerá y podrá consultarse automáticamente.

### — Cierre

**Voz:**

> En esta lección utilizamos for cuando conocíamos la cantidad de elementos y while cuando no sabíamos cuántas consultas realizaría el usuario. En la siguiente lección organizaremos estas responsabilidades en funciones reutilizables.

## Control antes de publicar

- Mostrar que ambos arrays conservan el mismo orden.
- Explicar la diferencia entre la opción del usuario y el índice del array.
- Realizar al menos dos consultas antes de ingresar cero.
- Ingresar una opción inválida y demostrar que el menú continúa.
- Indicar que en esta lección se esperan números enteros válidos.
- La validación de texto se desarrollará en el proyecto final.
- No mostrar identidad personal, institución, cuentas ni notificaciones.
