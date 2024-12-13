
package ec.edu.espoch.herencia.clases;


public class Coordinador extends Persona {
    
    
    private int id;
    private String titulo;
    private String cargo;

    public Coordinador(int id, String titulo, String cargo, String nombre, String apellido, String cedula, String genero, int Edad) {
        super(nombre, apellido, cedula, genero, Edad);
        this.id = id;
        this.titulo = titulo;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Coordinador{" + "id: " + id + ", titulo: " + titulo + ", cargo: " + cargo + '}';
    }
    
   
    
    
}
