/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasPractica;

/**Marisol Rincón Solís 
 * Este es un proyecto de repaso donde s muestra como funciona una lista simple 
 * resolviendo la actividad que nos realizo el profesor el dia viernes 
 *13/Octubre/2025
 * @author DELL
 */

  
public class ListaSimple {
    private Nodo inicio;

    private class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
        }
    }

    public void crear() {
        Nodo ana = new Nodo("Ana");
        Nodo benjamin = new Nodo("Benjamín");
        Nodo carla = new Nodo("Carla");
        Nodo diego = new Nodo("Diego");

        ana.siguiente = benjamin;
        benjamin.siguiente = carla;
        carla.siguiente = diego;

        inicio = ana;
    }

    public void insertar(String nuevoDato, String despuesDe) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato.equals(despuesDe)) {
                Nodo nuevo = new Nodo(nuevoDato);
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void eliminar(String dato) {
        if (inicio == null) return;

        if (inicio.dato.equals(dato)) {
            inicio = inicio.siguiente;
            return;
        }

        Nodo actual = inicio;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(dato)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void mostrar() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print("[" + actual.dato + "] → ");
            actual = actual.siguiente;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.crear();
        lista.insertar("Elena", "Carla");
        lista.insertar("Dalia", "Diego");
        lista.eliminar("Benjamín");
        lista.mostrar();
    }
}