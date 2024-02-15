/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_jonnygomez;

import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author aleja
 */

public class Muelle {
    private ArrayList<Barco> barcos;

    public Muelle() {
        this.barcos = new ArrayList<>();
    }

    public void agregarBarco(String tipo, String nombre) {
        if (buscarBarco(nombre) == null) {
            if (tipo.equalsIgnoreCase("PESQUERO")) {
                barcos.add(new BarcoPesquero(nombre, TipoPesquero.PEZ)); // Aquí se debería pedir el tipo de pesquero y el nombre desde la entrada estándar, pero eso no es posible en este entorno.
            } else if (tipo.equalsIgnoreCase("PASAJERO")) {
                barcos.add(new BarcoPasajero(nombre, 100, 50.0)); // Aquí se debería pedir el máximo de pasajeros y el precio del boleto desde la entrada estándar, pero eso no es posible en este entorno.
            }
        }
    }

    public void agregarElemento(String nombre) {
        Barco barco = buscarBarco(nombre);
        if (barco != null) {
            barco.agregarElemento();
        }
    }

    public double vaciarBarco(String nombre) {
        Barco barco = buscarBarco(nombre);
        if (barco != null) {
            if (barco instanceof BarcoPasajero) {
                ((BarcoPasajero) barco).listarPasajeros();
            }
            return barco.vaciarCobrar();
        }
        return 0;
    }

    public void barcosDesde(int year) {
        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR, year);
        for (Barco barco : barcos) {
            if (barco.getFechaCirculacion().after(fecha)) {
                System.out.println(barco.getNombre() + " " + barco.getFechaCirculacion().getTime());
            }
        }
    }

    private Barco buscarBarco(String nombre) {
        for (Barco barco : barcos) {
            if (barco.getNombre().equals(nombre)) {
                return barco;
            }
        }
        return null;
    }
}
