package modelo;

import com.coti.tools.Esdia;

public class Almacen {


    private Libro[] libros;

    public Almacen(int cantidad){
        this.libros = new Libro[cantidad];
    }
    
    
    public Libro[] getLibros() {
        return libros;
    }

   public void setLibros(Libro[] libros) {
       this.libros = libros;
   }

    public static Libro nuevoLibro(){

        Libro libro = new Libro();

        String titulo = Esdia.readString("Introduce el titulo: ");
        libro.setTitulo(titulo);

        int ano = Esdia.readInt("Introduce el año de publicacion: ");
        libro.setAno_publi(ano);

        String nombre = Esdia.readString("Introduce el nombre del autor: ");
        libro.getAutor().setNombre(nombre);

        String apellidos = Esdia.readString("Introduce los apellidos del autor: ");
        libro.getAutor().setApellidos(apellidos);

        int pag = Esdia.readInt("Introduce el numero de paginas: ");
        libro.setNumpg(pag);

        float precio = Esdia.readFloat("Introduce el precio: ");
        libro.setPrecio(precio);

        return libro;


    }


    public void agregarLibro(int indice, Libro libro) {
        if (indice >= 0 && indice < libros.length) {
            libros[indice] = libro;
        } else {
            System.err.println("Índice fuera de rango.");
        }
    }

    //meter en tabla
   // System.out.println("Título: " + libro.getTitulo() + ", Año de publicacion: " + libro.getAno_publi() + ", Autor: " + libro.getAutor() + "Premio Planeta" + libro.getPremioPlaneta+", Paginas: "+libro.getNumpg()+"Tiempo lectura minutos"+ funcioncalculaminutos+" Precio: "+ libro.getPrecio());
            

    

}
