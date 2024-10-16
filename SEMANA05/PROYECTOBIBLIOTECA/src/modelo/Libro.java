package modelo;

public class Libro {

    private Autor autor;
    private String titulo;
    private int ano_publi;
    private int numpg;
    private float precio;
    
    public Libro() {
        this.autor = new Autor();
        
    }
 
    public Autor getAutor() {
        return autor;
    }

    public int getAno_publi() {
        return ano_publi;
    }

    public int getNumpg() {
        return numpg;
    }

    public float getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAno_publi(int ano_publi) {
        this.ano_publi = ano_publi;
    }

    public void setNumpg(int numpg) {
        this.numpg = numpg;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }





}
