package modelo;

import com.coti.tools.Esdia;

public class Almacen {


    private Libro[] libros;
    private int contadorLibros;
    private int ritmoLectura;

    public Almacen(int cantidad){
        this.libros = new Libro[cantidad];
        this.contadorLibros = 0;
        this.ritmoLectura = 1;
    }
    
    
    public Libro[] getLibros() {
        return libros;
    }

    public int getRitmoLectura() {
        return ritmoLectura;
    }

    public void setRitmoLectura(int ritmoLectura) {
        this.ritmoLectura = ritmoLectura;
    }

   public void setLibros(Libro[] libros) {
       this.libros = libros;
   }

   public void insertarLibro(Libro libro) {
    if (contadorLibros < libros.length) {
        libros[contadorLibros] = libro;
        contadorLibros++;
    } else {
        System.err.println("No hay espacio en el almacén para más libros");
    }
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

        boolean premioPlaneta = Esdia.yesOrNo("Introduce si este autor ha obtenido el Premio Planeta: ");
        libro.getAutor().setPremioPlaneta(premioPlaneta);

        int pag = Esdia.readInt("Introduce el numero de paginas: ");
        libro.setNumpg(pag);

        float precio = Esdia.readFloat("Introduce el precio: ");
        libro.setPrecio(precio);

        return libro;


    }

    
        public void imprimirLibros() {

        //aqui declaro guiones, que sirve para no tenerlo que escribir 147 veces y no se pueda saber cuantas veces se escribe
        String guiones = "-".repeat(147);
        String espacios = " ".repeat(135);
               


        System.out.printf("|%s|\n", guiones);        
        System.out.printf("| MIS LIBROS %s|",espacios);
        System.out.printf("|%s|\n", guiones);          
        System.out.printf("| %-20s | %-15s | %-31s | %-15s | %-10s | %-25s | %-11s |\n", 
                "Título", "Año Publicación", "Autor", "Premio Planeta", "Páginas", "Tiempo lectura minutos", "Precio"); 
        System.out.printf("|%s|\n", guiones);          


        float precioTotal = 0;
        int tiempoTotal = 0;
        
        for (int i = 0; i < contadorLibros; i++) {
            
                String premio = "NO";

                if(libros[i].getAutor().getPremioPlaneta() == true )
                    premio = "SI";

                int tiempoLectura = (getRitmoLectura() * libros[i].getNumpg());
                tiempoTotal = tiempoTotal + tiempoLectura;

                precioTotal = precioTotal + libros[i].getPrecio();

            
                System.out.printf("| %-20s | %-15d | %-15s %-15s | %-15s | %-10d | %25d | %-9.2f € |\n", 
                        libros[i].getTitulo(), libros[i].getAno_publi(), libros[i].getAutor().getNombre(), libros[i].getAutor().getApellidos(), premio, libros[i].getNumpg(), tiempoLectura, libros[i].getPrecio());

            
            }
            System.out.printf("|%s|\n", guiones);              
            System.out.printf("| %-106s %20s min | %-11s |\n","Tiempo de lectura total del almacen:", tiempoTotal," ");
            System.out.printf("| %-131s | %-9.2f € |\n", "Valor total del almacen:", precioTotal);
            System.out.printf("|%s|\n", guiones);              
      
    }

    

}
