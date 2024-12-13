
package ec.edu.espoch.herencia.clases;


public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String genero;
    private int Edad;

    public Persona(String nombre, String apellido, String cedula, String genero, int Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.genero = genero;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", cedula: " + cedula + ", genero: " + genero + ", Edad: " + Edad + '}';
    }
    
    
}
