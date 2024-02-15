/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_jonnygomez;

/**
 *
 * @author aleja
 */
public final class BarcoPasajero extends Barco {
    private String[] pasajeros;
    private double precioBoleto;
    private int contadorPasajeros;

    public BarcoPasajero(String nombre, int maxPasajeros, double precioBoleto) {
        super(nombre);
        this.pasajeros = new String[maxPasajeros];
        this.precioBoleto = precioBoleto;
        this.contadorPasajeros = 0;
    }

    @Override
    public void agregarElemento() {
        if (contadorPasajeros < pasajeros.length) {
            // Aquí deberías pedir el nombre del pasajero desde la entrada estándar, pero eso no es posible en este entorno.
            // Así que simplemente agregaremos un nombre genérico.
            pasajeros[contadorPasajeros] = "Pasajero " + (contadorPasajeros + 1);
            contadorPasajeros++;
        }
    }

    @Override
    public double vaciarCobrar() {
        double total = contadorPasajeros * precioBoleto;
        contadorPasajeros = 0;
        return total;
    }

    @Override
    public double precioElemento() {
        return precioBoleto;
    }

    @Override
    public String toString() {
        return super.toString() + " Cantidad de Pasajeros que compraron boleto: " + contadorPasajeros;
    }

    public void listarPasajeros() {
        for (int i = 0; i < contadorPasajeros; i++) {
            System.out.println(pasajeros[i]);
        }
    }
}
