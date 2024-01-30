/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres = tipo;
    }
    
     /**
     * Obtiene el estado actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o insuficiente saldo.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Obtiene el nombre asociado a la cuenta.
     *
     * @return Nombre asociado a la cuenta.
     */
    
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre (setter)
    
    /**
     * Establece el nombre asociado a la cuenta.
     *
     * @param nombre Nuevo nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la cuenta (getter)
    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta a establecer.
     */

    // Método para establecer la cuenta (setter)
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return Tipo de interés aplicado a la cuenta.
     */

    // Método para obtener el tipo de interés (getter)
    public double getTipoInteres() {
        return tipoInteres;
    }
    
    /**
     * Establece el tipo de interés aplicado a la cuenta.
     *
     * @param tipoInteres Nuevo tipo de interés a establecer.
     */

    // Método para establecer el tipo de interés (setter)
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    
    
    
}
}