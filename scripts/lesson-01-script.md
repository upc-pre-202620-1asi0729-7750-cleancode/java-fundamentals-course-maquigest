# Lección 1: Tu primer programa en Java

**Duración objetivo:** 8 minutos  
**Archivo usado:** `completed-examples/lesson-01/Main.java`  
**Objetivo:** reconocer la estructura mínima de un programa y mostrar mensajes en consola.

## Guion listo para grabar

### — Apertura

**En pantalla:** título de la lección y luego el editor, sin pestañas personales, cuentas ni notificaciones.

**Voz:**

> ¿Cómo le damos una instrucción a una computadora? En esta primera lección crearemos un programa sencillo en Java. Al terminar, podrás reconocer sus partes principales, ejecutarlo y cambiar los mensajes que aparecen en la consola. No necesitas instalar nada si utilizas un editor de Java en línea.

### — Qué significa programar

**En pantalla:** texto breve: “entrada → instrucciones → resultado”.

**Voz:**

> Programar consiste en escribir instrucciones precisas para que una computadora realice una tarea. Java es un lenguaje de programación. El código que escribimos debe respetar su sintaxis, del mismo modo que una oración debe respetar ciertas reglas para poder entenderse. En este ejemplo, la tarea será mostrar tres mensajes relacionados con un videojuego.

### — Preparar el archivo

**Acción:** abrir el starter de la lección y enfocar `Main.java`.

**Voz:**

> El archivo se llama Main punto java. Dentro encontramos una clase llamada Main. Por ahora, piensa en una clase como el espacio que agrupa nuestro código. Java distingue mayúsculas de minúsculas, por eso el nombre del archivo y el de la clase deben coincidir exactamente.

**Acción:** resaltar `public class Main` y después las llaves.

> Las llaves marcan dónde comienza y termina cada bloque. Una llave que se abre necesita otra que se cierre. Mantener la sangría nos permite ver con claridad qué instrucciones pertenecen a cada bloque.

### — El método principal

**Acción:** resaltar `public static void main(String[] args)`.

**Voz:**

> Esta línea declara el método principal, llamado main. Cuando ejecutamos el programa, Java empieza aquí. No hace falta memorizar todas estas palabras en la primera lección. Lo importante es reconocer la línea y escribirla con exactitud. Dentro de sus llaves colocaremos las instrucciones que queremos ejecutar.

### — Mostrar mensajes

**Acción:** escribir lentamente las tres instrucciones `System.out.println` del ejemplo completo.

**Voz:**

> Para mostrar texto usamos System punto out punto println. Entre paréntesis escribimos el mensaje, rodeado por comillas dobles. El punto y coma indica que la instrucción terminó. La primera línea da la bienvenida. La segunda muestra el videojuego favorito. La tercera explica por qué nos gusta.

> Cada instrucción println agrega un salto de línea. Por eso los tres mensajes aparecerán uno debajo de otro. Las comillas y el punto y coma forman parte del código; no deben omitirse.

### — Ejecutar y comprobar

**Acción:** ejecutar el programa y mostrar la consola.

**En pantalla:**

```text
¡Bienvenido a Java Start!
Videojuego favorito: Minecraft
Me gusta porque permite construir y explorar.
```

**Voz:**

> Ejecutamos el programa. La consola presenta las tres líneas en el mismo orden en que aparecen en el código. Si obtienes este resultado, tu primer programa funciona correctamente.

### — Reto breve

**En pantalla:** “Pausa y cambia el juego y la razón”.

**Voz:**

> Ahora inténtalo tú. Pausa el video y cambia Minecraft por otro videojuego. Después, modifica la última oración para indicar por qué lo elegiste. Conserva las comillas, los paréntesis y el punto y coma. Cuando termines, ejecuta otra vez el programa.

**Edición:** mantener el reto visible cinco segundos. No incluir una espera larga; el estudiante pausará el video.

### — Cierre

**Acción:** mostrar código y consola lado a lado.

**Voz:**

> En esta lección reconocimos una clase, el método main y las llaves que organizan los bloques. También usamos println para mostrar texto en la consola. El programa ya puede comunicar información, pero todavía no la guarda. En la siguiente lección utilizaremos variables para representar los datos de un videojuego.

## Control antes de publicar

- El código visible debe compilar y producir exactamente las tres líneas mostradas.
- No mostrar rostro, nombre personal, institución, correo, perfil ni notificaciones.
- Usar voz modulada o sintética y subtítulos revisados manualmente.