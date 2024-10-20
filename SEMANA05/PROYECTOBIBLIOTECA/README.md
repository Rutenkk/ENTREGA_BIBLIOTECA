## Introducción

Este programa permite crear tu propia biblioteca y guardar los tus libros preferidos.

## Estructura de las carpetas

The workspace contains two folders by default, where:

- `src`: En esta carpeta se encuentra el código del proyecto, el cual se divide en dos:
    - `modelo`: En esta carpeta se almacenan las clases de los objetos que vamos a necesitar para crear nuestra biblioteca:
        - `Autor.java`: Esta clase contiene como atributos: el nombre del autor, los apellidos del autor y un booleano que nos indica si ha recibido un premio.
        - `Libro.java`: Esta clase contiene como atributos: un campo de tipo "Autor" (permite acceder a la clase Autor), el titulo, el año de publicación, el número de páginas y el precio del libro. 
        - `Almacén.java`: Esta clase contiene como atributos: un array del tipo "Libro", un contador para saber cuantos libros llevamos almacenados y un número que determina el ritmo con el que se van a leer las páginas de los libros de nuestra biblioteca.
    -`EjercicioBiblioteca.java`: Esta es la clase principal de nuestro proyecto, desde la que vamos a instanciar los objetos de las otras clases para llevar a cabo la realización de la bibioteca. Se resume en un "Switch" (que permite realizar distintas acciones dentro de nuestra biblioteca) dentro de un "Do-While" que pedirá al usuario que elija una opción hasta que este decida terminar el programa.

- `lib`: Aquí se almacenan las librerías externas que se necesitan incluir para que el proyecto funcione. En mi caso he utilizado la librería "biblioteca11.jar", en concreto "Esdia". Para poder implementarla, escribe en la cabecera: "import com.coti.tools.Esdia;"

Los archivos de salida compilados se generarán en la carpeta `bin` por defecto.

## Manejo de las dependencias

Haciendo click en "Esdia" puedes acceder a la definición de todos los métodos de esta librería, la cual es muy útil principalmente para imprimir por pantalla.
