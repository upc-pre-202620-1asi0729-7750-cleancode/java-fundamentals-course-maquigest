# Lección 5: Organiza el programa con funciones

**Duración objetivo:** 6 minutos  
**Archivo usado:** `completed-examples/lesson-05/Main.java`  
**Objetivo:** crear funciones con parámetros, valores de retorno y `void`, y combinarlas para resolver una tarea más completa.

## Guion listo para grabar

### — Apertura

**En pantalla:** mostrar el resultado completo del catálogo y después la estructura general del código.

**Voz:**

> Nuestro programa ya puede recorrer un catálogo y repetir consultas. Sin embargo, colocar todas las instrucciones dentro de main haría que el código crezca rápidamente. En esta lección dividiremos el trabajo en funciones pequeñas. Algunas devolverán un resultado y otras utilizarán void para realizar una acción sin devolver ningún valor.

### — Aclaración sobre el término “función”

**En pantalla:** mostrar:

```text
Funciones auxiliares → static
Métodos de objetos → desde la lección 6
```

**Voz:**

> Durante esta lección las llamaremos funciones auxiliares porque podemos utilizarlas directamente desde Main. Técnicamente, Java define estas funciones como métodos static, ya que todo el código debe encontrarse dentro de una clase. Desde la siguiente lección utilizaremos el término método de instancia para las acciones que pertenezcan a objetos específicos.

### — Función booleana

**Acción:** resaltar `esRecomendado`.

**Voz:**

> La primera función se llama esRecomendado. Recibe una puntuación entera como parámetro y devuelve un valor booleano.

> La comparación puntuación mayor o igual que siete produce true o false. La instrucción return entrega ese resultado al lugar desde donde se llamó a la función.

> Si enviamos nueve, la función devuelve true. Si enviamos cinco, devuelve false.

### — Función que devuelve texto

**Acción:** resaltar `obtenerCategoria` y sus tres retornos.

**Voz:**

> La segunda función se llama obtenerCategoria. También recibe una puntuación, pero su tipo de retorno es String porque entregará una categoría en forma de texto.

> Si la puntuación es nueve o diez, devuelve “Excelente”. Si es siete u ocho, devuelve “Bueno”. Las puntuaciones restantes reciben la categoría “Regular”.

> Cuando Java encuentra un return, devuelve el resultado y finaliza la ejecución de esa función. Por eso cada caso puede retornar directamente su categoría.

### — Función `void`

**Acción:** enfocar la declaración de `mostrarFicha`.

**Voz:**

> La función mostrarFicha recibe el nombre, el género y la puntuación de un videojuego.

> Antes de su nombre aparece la palabra void. Esto significa que la función realiza una acción, pero no devuelve un resultado. En este caso, su responsabilidad es imprimir una ficha completa.

> Dentro de ella llamamos a esRecomendado para decidir si debemos guardar “Sí” o “No”. También llamamos a obtenerCategoria para incluir la categoría correspondiente.

> Una función puede utilizar otras funciones. Esto evita repetir reglas y permite que cada bloque tenga una responsabilidad concreta.

### — Función que calcula un promedio

**Acción:** resaltar `calcularPromedio`, el acumulador y el `return`.

**Voz:**

> La función calcularPromedio recibe el array completo de puntuaciones y devuelve un número decimal.

> La variable suma comienza en cero. Después, un bucle for recorre las puntuaciones y agrega cada valor al acumulador.

> Finalmente dividimos la suma entre la cantidad de elementos. Escribimos double entre paréntesis para asegurar que la división pueda producir decimales. El resultado se devuelve mediante return.

### — Coordinar el programa

**Acción:** enfocar `mostrarResumen`.

**Voz:**

> La función mostrarResumen coordina las tareas principales. Recibe los tres arrays y utiliza un for para recorrerlos.

> En cada repetición llama a mostrarFicha con el nombre, el género y la puntuación ubicados en la misma posición.

> Después de mostrar todas las fichas, llama a calcularPromedio y guarda el resultado. MostrarResumen es void porque su propósito es presentar la información, no devolverla.

### — La función principal

**Acción:** enfocar `main` y después la llamada a `mostrarResumen`.

**Voz:**

> Main prepara los datos del programa. Contiene los arrays de nombres, géneros y puntuaciones.

> Su última instrucción llama a mostrarResumen y envía los tres arrays como argumentos. Main no necesita conocer cada detalle del cálculo o de la presentación. Solo inicia el proceso.

### — Ejecutar

**Acción:** ejecutar y mostrar las tres fichas y el promedio.

**Voz:**

> Al ejecutar el programa obtenemos tres fichas. Minecraft recibe la categoría Excelente, Celeste recibe Bueno y Portal recibe Excelente. Después aparece el promedio del catálogo.

> El resultado es el mismo que podríamos construir dentro de main, pero ahora el código está dividido en partes reutilizables y fáciles de comprobar.

### — Reto breve

**En pantalla:** “Pausa: crea `obtenerMejorPuntuacion`”.

**Voz:**

> Pausa el video y crea una función llamada obtenerMejorPuntuacion. Debe recibir el array de puntuaciones, buscar el valor más alto y devolverlo como entero. Después llama a la función desde mostrarResumen e imprime la mejor puntuación del catálogo.

### — Cierre

**Voz:**

> En esta lección usamos parámetros, argumentos, return y void. También combinamos varias funciones para construir un programa más ordenado. En la siguiente lección agruparemos datos y comportamientos dentro de objetos.

## Control antes de publicar

- Aclarar que Java técnicamente utiliza métodos `static`.
- Utilizar “funciones auxiliares” como término didáctico durante esta lección.
- Diferenciar claramente parámetro, argumento y valor retornado.
- Explicar que `void` realiza una acción y no devuelve un resultado.
- Mostrar al menos una función booleana, una función que devuelve texto, una función numérica y una función `void`.
- No presentar todavía las funciones `static` como comportamientos de un objeto.
- No mostrar identidad personal, institución, cuentas ni notificaciones.