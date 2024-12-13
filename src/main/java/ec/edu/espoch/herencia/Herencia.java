
package ec.edu.espoch.herencia;

import ec.edu.espoch.herencia.clases.Coordinador;
import ec.edu.espoch.herencia.clases.Estudiante;
import ec.edu.espoch.herencia.clases.Profesor;

/**
 *
 * @author Eddy
 */
public class Herencia {

    public static void main(String[] args) {
        Estudiante objEstudiante = new Estudiante(" 002", " Eddy", " Laje", " 2250204084", " Masculino",  18);
        System.out.println(objEstudiante.toString());
        
        
         Profesor objProfesor = new Profesor(123456789, "Ing. Sotfware", "Pedro", "Aguilar", "123456", "Masculino", 32);
         System.out.println(objProfesor.toString());
         
         
         Coordinador objCoordinador = new Coordinador(123456, "Ing. Sotfware", "Coodinador", "Paul", "Paguay", "123456789", "Masculino", 40);
         System.out.println(objCoordinador.toString());
         
    }  
}
