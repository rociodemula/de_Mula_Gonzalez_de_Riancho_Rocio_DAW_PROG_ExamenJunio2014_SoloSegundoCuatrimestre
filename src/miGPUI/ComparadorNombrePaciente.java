
package miGPUI;

import java.util.Comparator;

/**
 *
 * @author Profesor
 */
public class ComparadorNombrePaciente implements Comparator<Paciente>{


    @Override
/**
 * Establece un orden ascendente, en función del Nombre del paciente. Devuelve:
 * Un valor negativo si el nombre del paciente1 va lexicográficamente delante del nombre del paciente2.
 * 0 si el nombre de ambos pacientes  es el mismo.
 * Un valor positivo si el nombre del paciente1 va lexicográficamente detrás del nombre del  paciente2. 
 */
    public int compare(Paciente paciente1, Paciente paciente2) {
        
        return paciente1.getNombrePaciente().compareToIgnoreCase(paciente2.getNombrePaciente());
    } 
}
