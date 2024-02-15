/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_jonnygomez;

/**
 *
 * @author aleja
 */
public enum TipoPesquero {
    PEZ(10.0), CAMARON(15.0), LANGOSTA(20.0);

    public final double price;

    TipoPesquero(double price) {
        this.price = price;
    }
}
