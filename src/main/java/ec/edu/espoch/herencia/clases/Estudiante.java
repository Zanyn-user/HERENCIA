
package ec.edu.espoch.herencia.clases;


public class Estudiante extends Persona {
    
    private String codigo;
    
    //Constructor
    public Estudiante(String codigo, String nombre, String apellido, String cedula, String genero, int Edad) {
        super(nombre, apellido, cedula, genero, Edad);
        this.codigo = codigo;
    }

    //Getter and setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+ "Estudiante{" + "codigo: " + codigo + '}';
    }

   
    
    
    
}
