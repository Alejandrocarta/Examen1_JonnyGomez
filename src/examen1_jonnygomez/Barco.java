    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_jonnygomez;
import java.util.Calendar;

/**
 *
 * @author aleja
 */

public abstract class Barco {
    protected String nombre;
    protected Calendar fechaCirculacion;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaCirculacion = Calendar.getInstance();
    }

    public final String getNombre() {
        return nombre;
    }

    public final Calendar getFechaCirculacion() {
        return fechaCirculacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
}
