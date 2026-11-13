# Java Start: fundamentos de Java para principiantes

Java Start es un curso introductorio que enseña los fundamentos de Java y programación orientada a objetos mediante la creación progresiva de un registro de videojuegos.

El curso está dirigido a estudiantes de 12 a 17 años sin experiencia previa. Todos los ejemplos pueden ejecutarse directamente desde el navegador utilizando OnlineGDB.

## Contenido

1. [Descripción](#descripción)
2. [Resultado final](#resultado-final)
3. [Público objetivo](#público-objetivo)
4. [Prerrequisitos](#prerrequisitos)
5. [Duración](#duración)
6. [Herramientas](#herramientas)
7. [¿Qué aprenderás?](#qué-aprenderás)
8. [Lecciones](#lecciones)
9. [Cómo utilizar el curso](#cómo-utilizar-el-curso)
10. [Proyecto final](#proyecto-final)
11. [Estructura del repositorio](#estructura-del-repositorio)
12. [Recursos adicionales](#recursos-adicionales)

## Descripción

El curso presenta los conceptos fundamentales de Java mediante siete lecciones breves y progresivas.

Cada lección contiene:

- Un video explicativo.
- Una práctica inicial precargada en OnlineGDB con actividades `TODO`.
- Una solución completa disponible en línea.
- Un reto breve para aplicar lo aprendido.
- Una demostración del resultado esperado.
- Un resumen final.

Todas las actividades se realizan directamente desde el navegador. El estudiante no necesita descargar archivos, instalar Java ni configurar un entorno de desarrollo.

Los ejemplos utilizan videojuegos como temática común para facilitar la comprensión de los conceptos.

## Resultado final

Al terminar el curso, el estudiante podrá construir un programa que:

- Solicita cuántos videojuegos se registrarán.
- Acepta entre 1 y 10 videojuegos.
- Solicita nombre, género y puntuación.
- Valida entradas numéricas.
- Rechaza puntuaciones fuera del rango de 0 a 10.
- Crea objetos de la clase `Videojuego`.
- Almacena los objetos en un array.
- Muestra un catálogo completo.
- Indica cuáles videojuegos son recomendados.

## Público objetivo

Estudiantes de 12 a 17 años interesados en aprender programación y que no necesitan contar con experiencia previa.

## Prerrequisitos

- Manejo básico de un navegador web.
- Conexión a Internet.
- Interés por aprender programación.

No se necesita instalar Java ni un entorno de desarrollo.

## Duración

- Lecciones: 7.
- Duración total aproximada: 54 minutos.
- Duración por lección: entre 6 y 10 minutos.

## Herramientas

- [OnlineGDB Java Compiler](https://www.onlinegdb.com/online_java_compiler)
- Navegador web actualizado.
- Repositorio de GitHub.
- Videos no listados en YouTube.

## ¿Qué aprenderás?

- Estructura básica de un programa Java.
- Salida de datos con `System.out`.
- Variables y tipos de datos.
- Entrada de datos con `Scanner`.
- Operadores y conversiones.
- Condiciones con `if`, `else if` y `else`.
- Arrays e índices.
- Bucles `for`, `while` y `do while`.
- Funciones auxiliares con parámetros y retorno.
- Funciones `void`.
- Clases, constructores y objetos.
- Métodos de instancia.
- Encapsulación, getters y setters.
- Validación de entradas.


## Lecciones

| # | Lección | Duración | Video | Práctica en OnlineGDB | Solución en OnlineGDB |
|---:|---|---:|---|---|---|
| 1 | Tu primer programa en Java | 6 min | Pendiente | Pendiente | Pendiente |
| 2 | Datos de un videojuego | 7 min | Pendiente | Pendiente | Pendiente |
| 3 | Decide con condiciones | 7 min | Pendiente | Pendiente | Pendiente |
| 4 | Repite y consulta datos | 8 min | Pendiente | Pendiente | Pendiente |
| 5 | Organiza el programa con funciones | 8 min | Pendiente | Pendiente | Pendiente |
| 6 | Crea clases y objetos | 8 min | Pendiente | Pendiente | Pendiente |
| 7 | Proyecto final: registro de videojuegos | 10 min | Pendiente | Pendiente | Pendiente |
|  | **Duración total** | **54 min** |  |  |  |

Los enlaces definitivos se agregarán después de publicar los videos y preparar las prácticas precargadas en OnlineGDB.

## Cómo utilizar el curso

### 1. Ver el video

Abre el video correspondiente y sigue la explicación hasta llegar al reto práctico.

### 2. Abrir el starter

Entra en:

```text
starter-files/lesson-XX/Main.java
```

Copia el código inicial.

### 3. Ejecutar en OnlineGDB

1. Abre [OnlineGDB Java Compiler](https://www.onlinegdb.com/online_java_compiler).
2. Confirma que el lenguaje seleccionado sea Java.
3. Reemplaza el contenido de `Main.java` por el código del starter.
4. Completa las actividades marcadas con `TODO`.
5. Presiona **Run**.
6. Si el programa solicita información, utiliza la consola interactiva.
7. Compara tu resultado con la solución.

### 4. Consultar la solución

Después de intentar el ejercicio, revisa:

```text
completed-examples/lesson-XX/Main.java
```

No se recomienda copiar la solución antes de intentar la práctica.

## Proyecto final

El proyecto final es un registro de videojuegos desarrollado en Java.

El usuario selecciona una cantidad de 1 a 10 videojuegos. Para cada juego, el programa solicita:

- Nombre.
- Género.
- Puntuación de 0 a 10.

El programa valida la cantidad y las puntuaciones, crea objetos de la clase `Videojuego`, los almacena en un array y muestra un catálogo indicando cuáles son recomendados.

Un videojuego se considera recomendado cuando su puntuación es igual o mayor que 7.

## Estructura del repositorio

```text
java-fundamentals-course/
├── README.md
├── course-plan.md
├── .gitignore
├── starter-files/
│   ├── lesson-01/
│   ├── lesson-02/
│   ├── lesson-03/
│   ├── lesson-04/
│   ├── lesson-05/
│   ├── lesson-06/
│   └── lesson-07/
├── completed-examples/
│   ├── lesson-01/
│   ├── lesson-02/
│   ├── lesson-03/
│   ├── lesson-04/
│   ├── lesson-05/
│   ├── lesson-06/
│   └── lesson-07/
└── quality/
    ├── code-review-checklist.md
    ├── link-review.md
    ├── test-cases.md
    └── video-review-checklist.md
```

## Recursos adicionales

- [Aprender Java en dev.java](https://dev.java/learn/)
- [Documentación de Java](https://docs.oracle.com/en/java/)
- [OnlineGDB Java Compiler](https://www.onlinegdb.com/online_java_compiler)