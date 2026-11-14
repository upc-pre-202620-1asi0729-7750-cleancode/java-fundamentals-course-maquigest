# Lección 3: Decide con condiciones

**Duración objetivo:** 6 minutos  
**Archivo usado:** `completed-examples/lesson-03/Main.java`  
**Objetivo:** utilizar comparaciones, operadores lógicos y una cadena `if`, `else if`, `else`.

## Guion listo para grabar

### — Apertura

**En pantalla:** pregunta: “Si la puntuación es 7, ¿qué mensaje aparecerá?”.

**Voz:**

> Un programa resulta más útil cuando puede tomar decisiones. En esta lección recibiremos una puntuación de cero a diez y mostraremos una recomendación diferente según su valor. Antes de ver el código, piensa qué mensaje debería recibir una puntuación de siete.

### — Comparaciones

**Acción:** mostrar `puntuacion < 0`, `puntuacion > 10`, `puntuacion >= 8` y `puntuacion >= 6`.

**Voz:**

> Una condición es una expresión cuyo resultado es verdadero o falso. El símbolo menor que comprueba si un valor está por debajo de otro. El símbolo mayor que comprueba si está por encima. Mayor o igual se escribe con el signo mayor seguido del signo igual. El orden de estos dos caracteres importa.

> Además usaremos dos barras verticales. Este operador significa “o”. La primera condición será verdadera si la puntuación es menor que cero o mayor que diez. Cualquiera de esos casos está fuera del rango permitido.

### — La cadena de decisiones

**Acción:** resaltar cada bloque de la cadena.

**Voz:**

> La palabra if significa “si”. Java evalúa primero la condición entre paréntesis. Si es verdadera, ejecuta el bloque entre llaves y omite los demás. Si es falsa, continúa con else if, que permite probar otra condición. Finalmente, else cubre cualquier caso que no haya cumplido las condiciones anteriores.

> El orden es importante. Primero rechazamos valores inválidos. Después preguntamos si la puntuación es al menos ocho. En ese caso mostramos “Muy recomendado”. Si no llegó a ocho, comprobamos si es al menos seis y mostramos “Recomendado”. Los valores restantes, del cero al cinco, reciben “Podría mejorar”.

> No necesitamos escribir también “menor que ocho” en la segunda comparación. Si el programa alcanzó ese punto, ya sabemos que la condición anterior fue falsa.

### — Entrada y ejecución

**Acción:** mostrar la lectura con Scanner y ejecutar varias veces.

**Voz:**

> Solicitamos un entero con nextInt y lo guardamos en puntuacion. Probemos primero con siete. No cumple la condición de ocho o más, pero sí la de seis o más, así que aparece “Recomendado”. Con nueve obtenemos “Muy recomendado”. Con cuatro aparece “Podría mejorar”.

### — Probar los límites

**Acción:** ejecutar con `-1`, `0`, `6`, `8`, `10` y `11`, acelerando los fragmentos repetidos.

**Voz:**

> Los valores cercanos a cada límite son especialmente importantes. Menos uno y once son inválidos. Cero pertenece al último caso. Seis inicia la categoría “Recomendado”. Ocho inicia “Muy recomendado” y diez sigue siendo válido. Estas pruebas confirman que cada frontera se comporta como esperamos.

### — Reto breve

**En pantalla:** “Pausa: agrega ‘Obra maestra’ para una puntuación de 10”.

**Voz:**

> Pausa el video y agrega una categoría especial. Cuando la puntuación sea exactamente diez, muestra “Obra maestra”. Coloca esta nueva condición después de validar el rango y antes de comprobar si la puntuación es mayor o igual a ocho. Para comparar igualdad se usan dos signos igual. Ejecuta el programa con diez y con nueve para verificar que ambas rutas siguen funcionando.

### — Cierre

**Voz:**

> En esta lección usamos comparaciones y el operador lógico “o”. También construimos una cadena if, else if y else, y comprobamos sus límites con distintos datos. En la siguiente lección almacenaremos varios videojuegos y recorreremos la colección sin repetir instrucciones.

## Control antes de publicar

- Mostrar al menos un caso por cada rama y dos entradas fuera del rango.
- No decir que `else` evalúa otra condición: se ejecuta cuando las anteriores son falsas.
- No revelar datos personales o institucionales en la grabación.
