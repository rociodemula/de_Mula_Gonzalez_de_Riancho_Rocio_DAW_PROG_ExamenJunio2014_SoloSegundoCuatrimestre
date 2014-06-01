
package miGPUI ;

public class PacientePrivado extends Paciente{
    public enum TipoDePago {Metalico, Tarjeta};
    
    private int numeroDeVisitas;
    private TipoDePago tipoDePago;
    private static int numeroPacientesPrivados;
    
     public PacientePrivado(String nif, int annioPrimeraConsulta, String nombrePaciente, int numeroTratamientosPorFacturar, String emailNotificaciones,
             int numeroDeVisitas, TipoDePago tipoDePago){
         super(nif, annioPrimeraConsulta, nombrePaciente, numeroTratamientosPorFacturar, emailNotificaciones);
         this.setNumeroDeVisitas(numeroDeVisitas);
         this.setTipoDePago(tipoDePago);
         PacientePrivado.numeroPacientesPrivados++;
     }
    /**
     * @return the numeroDeVisitas
     */
    public int getNumeroDeVisitas() {
        return numeroDeVisitas;
    }

    /**
     * @param numeroDeVisitas the numeroDeVisitas to set
     */
    public void setNumeroDeVisitas(int numeroDeVisitas) throws IllegalArgumentException{
        if(numeroDeVisitas>=0) {
            this.numeroDeVisitas = numeroDeVisitas;
        }else{
            throw new IllegalArgumentException("Error: El número de visitas  tiene que ser un entero positivo.");
        }    
    }

    /**
     * @return the tipoDePago
     */
    public TipoDePago getTipoDePago() {
        return this.tipoDePago;
    }

    /**
     * @param tipoDePago the tipoDePago to set
     */
    public void setTipoDePago(TipoDePago tipoDePago) throws IllegalArgumentException {
        if(tipoDePago.equals(TipoDePago.Metalico) || tipoDePago.equals(TipoDePago.Tarjeta)){
            this.tipoDePago = tipoDePago;
        }else{
            throw new IllegalArgumentException("Error: El tipo de pago sólo puede ser Metálico o con Tarjeta");      
        }
    }
    
    protected static int getNumeroPacientesPrivados(){
        return PacientePrivado.numeroPacientesPrivados;
    }
        
    protected static void setNumeroPacientesPrivados (int numeroPacientesPrivados)throws IllegalArgumentException{
       if(numeroPacientesPrivados >=0){
          PacientePrivado.numeroPacientesPrivados=numeroPacientesPrivados;
       }else{
           throw new IllegalArgumentException("Error: El número de pacientes privados no puede ser negativo."); 
       }  
    }

    protected double liquidarFacturacion()throws IllegalArgumentException{
        double liquidacion;
        if(this.tipoDePago.equals(TipoDePago.Metalico )){
            liquidacion = this.getNumeroTratamientosPorFacturar() * 70 * 0.95d - this.getAntiguedad()*0.10d - getNumeroDeVisitas()*0.20d;
        }else{
            if(this.tipoDePago.equals(TipoDePago.Tarjeta)){
                 liquidacion = this.getNumeroTratamientosPorFacturar() * 70  - this.getAntiguedad()*0.10d - getNumeroDeVisitas()*0.20d;
            }else{
                throw new IllegalArgumentException("Error: Tipo de pago incorrecto. No se pudo hacer la liquidación");
            }
        }
        return liquidacion;
    }
    
   public String toString(){
       String cadenaPacientePrivado=super.toString();
       cadenaPacientePrivado+=String.format("\n NumeroVisitas: "+this.getNumeroDeVisitas() +
               ". Tipo de pago: "+ this.getTipoDePago()+". " +
               "\n Liquidación de la Facturación: %.2f €.", this.liquidarFacturacion());
       return cadenaPacientePrivado;
   }
   
}
