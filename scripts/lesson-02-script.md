# Lección 2: Datos de un videojuego

**Duración objetivo:** 19 minutos  
**Archivo usado:** `completed-examples/lesson-02/Main.java`  
**Objetivo:** usar variables, tipos de datos, operadores y entrada con `Scanner`.

## Guion listo para grabar

### — Apertura

**En pantalla:** título y una ficha con nombre, horas, puntuación y estado.

**Voz:**

> En la lección anterior mostramos mensajes fijos. Ahora haremos que el programa recuerde información ingresada por el usuario. Crearemos una ficha con el nombre de un videojuego, las horas jugadas, su puntuación y si fue terminado.

### — Variables y tipos

**Acción:** mostrar las declaraciones a medida que se explican.

**Voz:**

> Una variable es un espacio con nombre donde guardamos un dato. Java necesita conocer el tipo de cada variable. String guarda texto, como el nombre del juego. Int guarda números enteros, como las horas jugadas. Double guarda números con decimales, como una puntuación de ocho punto cinco. Boolean representa uno de dos valores: true o false.

> Elegir el tipo correcto ayuda a Java a saber qué operaciones puede realizar. Los nombres de variables se escriben aquí con estilo camel case. Por ejemplo, horasJugadas comienza con minúscula y une la segunda palabra usando una mayúscula.

### — Crear el lector

**Acción:** resaltar `import java.util.Scanner;` y `Scanner scanner = new Scanner(System.in);`.

**Voz:**

> Para leer lo que una persona escribe, utilizaremos Scanner. La primera línea importa esta herramienta desde la biblioteca de Java. Luego creamos un Scanner asociado a System punto in, que representa la entrada del programa. La variable se llama scanner y la reutilizaremos para todas las preguntas.

### — Leer texto y números

**Acción:** recorrer las tres preguntas del código.

**Voz:**

> Primero mostramos la pregunta “Nombre del videojuego”. Print, sin ele ene al final, mantiene el cursor en la misma línea. NextLine lee el texto completo. Después usamos trim para eliminar espacios sobrantes al inicio y al final.

> Para las horas usamos nextInt, porque esperamos un número entero. Para la puntuación usamos nextDouble, porque aceptamos decimales. El valor leído se guarda en la variable situada a la izquierda del signo igual.

> En esta versión básica asumimos que el usuario escribe números válidos. En el proyecto final aprenderemos a detectar una entrada incorrecta.

### — Operador y estado lógico

**Acción:** resaltar `boolean terminado = false;` y `int minutosJugados = horasJugadas * 60;`.

**Voz:**

> La variable terminado empieza con el valor false, es decir, falso. Después calculamos los minutos jugados. El asterisco es el operador de multiplicación. Tomamos las horas ingresadas, las multiplicamos por sesenta y guardamos el resultado en minutosJugados.

### — Construir la salida

**Acción:** resaltar las instrucciones de la ficha y ejecutar con `Minecraft`, `12`, `8.5`.

**Voz:**

> Para formar la ficha combinamos texto y variables mediante el signo más. Esta operación se llama concatenación. La secuencia barra invertida ene agrega una línea en blanco antes del título. Probemos con Minecraft, doce horas y una puntuación de ocho punto cinco.

**En pantalla:** mostrar una salida donde se distingan `Horas: 12`, `Minutos: 720`, `Puntuación: 8.5` y `Terminado: false`.

> El cálculo devuelve setecientos veinte minutos. Al final cerramos el Scanner para liberar el recurso que ya no utilizaremos.

### — Reto breve

**En pantalla:** “Pausa: agrega el año de lanzamiento”.

**Voz:**

> Tu reto es agregar el año de lanzamiento. Declara una variable entera llamada anioLanzamiento, solicita el dato con nextInt y muéstralo en la ficha. Si quieres evitar la letra eñe en el nombre de la variable, escribe anio. Pausa el video y prueba tu cambio.

### — Cierre

**Voz:**

> Hoy usamos String, int, double y boolean. Con Scanner leímos datos y con el operador de multiplicación convertimos horas en minutos. También concatenamos texto y variables para producir una ficha. En la siguiente lección el programa tomará decisiones usando condiciones.

## Control antes de publicar

- Ejecutar el ejemplo con los datos indicados y mostrar el resultado completo.
- Explicar que esta versión aún no valida entradas numéricas.
- Mantener en privado toda identidad personal o institucional.