package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    //Atributos propios de la clase vehiculo.
    private final TipoMoto tipoMoto;
    private final int velocidadMax;
    
    /**
     *  Metodo constructor de la clase Moto que hereda de la clase vehiculo.
     * @param placa
     * @param modelo
     * @param propietario
     * @param tipoMoto
     * @param velocidadMax
     */
    public Moto(String placa, String modelo, Propietario propietario, TipoMoto tipoMoto, int velocidadMax){
        super(placa, modelo, propietario);
        this.tipoMoto = tipoMoto;
        this.velocidadMax = velocidadMax;
    }

    /**
     * Metodo para obtener el tipo de moto.
     * @return tipo de moto (Clasica o hibrida).
     */       
    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }
    
    /**
     * Metodo para Consultar velocidad Maxima de la moto.
     * @return la velocidada maxima que alcanza la moto.
     */
    public int consultarVelocidadMaxMoto() {
        return velocidadMax;
    }
    
}