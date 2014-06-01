
package miGPUI ;
public class PacienteSeguroMedico extends Paciente{
 
    private static int numeroPacientesSeguroMedico;
    
    private int ratioAseguradora;
    private int numeroTratamientosNoCubiertos;
    
  public PacienteSeguroMedico(String nif, int annioPrimeraConsulta, String nombrePaciente, int numeroTratamientosPorFacturar,  String emailNotificaciones,
             int ratioAseguradora, int numeroTratamientosNoCubiertos)throws IllegalArgumentException{
         super(nif, annioPrimeraConsulta, nombrePaciente, numeroTratamientosPorFacturar, emailNotificaciones);
         this.setRatioAseguradora(ratioAseguradora);
         this.setNumeroTratamientosNoCubiertos(numeroTratamientosNoCubiertos);
         PacienteSeguroMedico.numeroPacientesSeguroMedico=PacienteSeguroMedico.getNumeroPacientesSeguroMedico()+1;
     }
   
    /**
     * @return the ratioAseguradora
     */
    protected int getRatioAseguradora() {
        return this.ratioAseguradora;
    }

    /**
     * @param ratioAseguradora the ratioAseguradora to set
     */
    protected void setRatioAseguradora(int ratioAseguradora) throws IllegalArgumentException{
         if (ratioAseguradora>=1 && ratioAseguradora<=5){
              this.ratioAseguradora=ratioAseguradora;
         }else{
            throw new IllegalArgumentException ("Error: La ratio de la aseguradora debe ser mayor o igual que 1 y menor o igual que 5.");    
         }     
   }

    /**
     * @return the numeroTratamientosNoCubiertos
     */
    protected int getNumeroTratamientosNoCubiertos() {
        return this.numeroTratamientosNoCubiertos;
    }

    /**
     * @param numeroTratamientosNoCubiertos the numeroTratamientosNoCubiertos to set
     */
    protected void setNumeroTratamientosNoCubiertos(int numeroTratamientosNoCubiertos) throws IllegalArgumentException{
        if (numeroTratamientosNoCubiertos>=0){
            this.numeroTratamientosNoCubiertos = numeroTratamientosNoCubiertos;
        }else{
           throw new IllegalArgumentException ("Error: El  número de tratamientos No Cubiertos no puede ser negativo.");
        }
    }
    
   public static int getNumeroPacientesSeguroMedico() {
        return PacienteSeguroMedico.numeroPacientesSeguroMedico;
   }
    
   protected static void setNumeroPacientesSeguroMedico (int numeroPacientesSeguroMedico)throws IllegalArgumentException{
       if(numeroPacientesSeguroMedico >=0){
          PacienteSeguroMedico.numeroPacientesSeguroMedico=numeroPacientesSeguroMedico;
       }else{
           throw new IllegalArgumentException("Error: El número de pacientes con Seguro médico no puede ser negativo."); 
       }  
    }
    
    protected int getNumeroTratamientosPagadosPorAseguradora(){
        return this.getNumeroTratamientosPorFacturar()- this.getNumeroTratamientosNoCubiertos();
    }
    
   protected double liquidarFacturacion()throws IllegalArgumentException{
        double liquidacion;
        liquidacion=this.getNumeroTratamientosNoCubiertos()*70 * this.getNumeroTratamientosPagadosPorAseguradora()*(0.05d/this.getRatioAseguradora())-this.getAntiguedad()*0.10d;
        return liquidacion;
   }
   
   public String toString(){
       String cadenaPacienteSeguroMedico=super.toString();
       cadenaPacienteSeguroMedico+=String.format("\n Ratio Aseguradora: "+this.getRatioAseguradora()+". Número de Tratamientos No cubiertos: "+ this.getNumeroTratamientosNoCubiertos()+"."+
               "\n Liquidación de la facturación: %.2f €.", this.liquidarFacturacion());
       return cadenaPacienteSeguroMedico;
   }
}