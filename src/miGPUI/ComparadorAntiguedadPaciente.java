
package miGPUI;

import java.util.Comparator;

/**
 *
 * @author Profesor
 */
public class ComparadorAntiguedadPaciente implements Comparator<Paciente>{


    @Override
/**
 * Establece un orden ascendente, en función de la antigüedad del paciente. Devuelve:
 * Un valor negativo si la antigüedad del paciente1 es menor que la  del  paciente2.
 * 0 si ambos pacientes  tienen la misma antigüedad.  
 * Un valor positivo si la antigüedad del paciente1 es mayor que la del paciente2. 
 */
    public int compare(Paciente paciente1, Paciente paciente2) {
        int resultado;
        if(paciente1.getAntiguedad() < paciente2.getAntiguedad()){
           resultado=-1; 
        }else{
            if(paciente1.getAntiguedad() == paciente2.getAntiguedad()){
                resultado=0;
            }else{
                resultado = 1;
            }
        }
        return resultado;
    } 
}
