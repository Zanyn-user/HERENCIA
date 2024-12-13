
package ec.edu.espoch.herencia.clases;


public class Profesor extends Persona {
    
    private int id;
    private String titulo;

    public Profesor(int id, String titulo, String nombre, String apellido, String cedula, String genero, int Edad) {
        super(nombre, apellido, cedula, genero, Edad);
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "id: " + id + ", titulo: " + titulo + '}';
    }
    
    
    
    
    
}
