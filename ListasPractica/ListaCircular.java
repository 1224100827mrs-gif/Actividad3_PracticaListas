/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasPractica;

/**Marisol Rincón Solís 
 * Este es un proyecto de repaso donde s muestra como funciona una lista circular
 * resolviendo la actividad que nos realizo el profesor el dia viernes 
 *13/Octubre/2025
 * @author DELL
 */

public class ListaCircular {
    private Nodo inicio;

    private class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
        }
    }
    public void crear() {
        Nodo rojo = new Nodo("Rojo");
        Nodo verde = new Nodo("Verde");
        Nodo azul = new Nodo("Azul");
        Nodo amarillo = new Nodo("Amarillo");

        rojo.siguiente = verde;
        verde.siguiente = azul;
        azul.siguiente = amarillo;
        amarillo.siguiente = rojo;

        inicio = rojo;
    }

    public void insertar(String nuevoDato, String despuesDe) {
        Nodo actual = inicio;

        do {
            if (actual.dato.equals(despuesDe)) {
                Nodo nuevo = new Nodo(nuevoDato);
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
                return;
            }
            actual = actual.siguiente;
        } while (actual != inicio);
    }
    public void eliminar(String dato) {
        Nodo actual = inicio;

        do {
            if (actual.siguiente.dato.equals(dato)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        } while (actual != inicio);
    }

    public void mostrar() {
        Nodo actual = inicio;

        do {
            System.out.print("[" + actual.dato + "] → ");
            actual = actual.siguiente;
        } while (actual != inicio);

        System.out.println("(vuelve a " + inicio.dato + ")");
    }
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.crear();
        lista.mostrar();

        lista.insertar("Morado", "Azul");
        lista.mostrar();

        lista.eliminar("Verde");
        lista.mostrar();
    }
    
}