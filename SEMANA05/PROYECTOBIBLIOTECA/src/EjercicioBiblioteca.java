import com.coti.tools.Esdia;

import modelo.Almacen;
import modelo.Libro;

public class EjercicioBiblioteca {
    public static void main(String[] args) throws Exception {
        
        int opcion = 0;
       
        Almacen almacen = null;
        

        do{
        
        System.out.println("|----------------------------------------------|");
        System.out.println("| MIS LIBROS                                   |");
        System.out.println("|----------------------------------------------|");
        System.out.println("     1) Nuevo almacén de libros");
        System.out.println("     2) Establecer ritmo de lectura (páginas por minuto)");
        System.out.println("     3) Añadir un nuevo libro al almacén");
        System.out.println("     4) Mostrar información actual de libros");
        System.out.println("     5) Salir (se borrará toda la información)");
        System.out.println("|----------------------------------------------|");

        opcion = Esdia.readInt("Introduce una opcion: ",1,5);
        
        switch (opcion) {
            case 1:

            int cantidad = Esdia.readInt("Introduce la cantidad de libros que quieres que tenga tu almacen: ");

            almacen = new Almacen(cantidad);  
            
  
                break;
            case 2:

            int ritmo = Esdia.readInt("Introduce el ritmo de lectura: ");
            almacen.setRitmoLectura(ritmo);

                break;
            case 3:

            if (almacen == null) {

                System.out.println("Primero debes crear un almacén de libros (opción 1).");

                } else {

                    Libro libroNuevo = Almacen.nuevoLibro();  
                    almacen.insertarLibro(libroNuevo);  
            }

                break;
            case 4:
                almacen.imprimirLibros();
                
                break;
            case 5:
                
                break;
            default:

                break;
        }




    }while(opcion != 5);


    }
}
