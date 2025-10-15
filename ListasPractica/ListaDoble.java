/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasPractica;

/**Marisol Rincón Solís 
 * Este es un proyecto de repaso donde s muestra como funciona una lista doble
 * resolviendo la actividad que nos realizo el profesor el dia viernes 
 *13/Octubre/2025
 * @author DELL
 */


public class ListaDoble {
    private Nodo inicio;

    private class Nodo {
        String dato;
        Nodo siguiente, anterior;

        Nodo(String dato) {
            this.dato = dato;
        }
    }

    public void crear() {
        Nodo prog = new Nodo("Programación");
        Nodo mate = new Nodo("Matemáticas");
        Nodo ingles = new Nodo("Inglés");
        Nodo fisica = new Nodo("Física");

        prog.siguiente = mate;
        mate.anterior = prog;

        mate.siguiente = ingles;
        ingles.anterior = mate;

        ingles.siguiente = fisica;
        fisica.anterior = ingles;

        inicio = prog;
    }

    public void insertarInicio(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = inicio;
        if (inicio != null) {
            inicio.anterior = nuevo;
        }
        inicio = nuevo;
    }

    public void eliminar(String dato) {
        Nodo actual = inicio;

        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    inicio = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
    }
    public void mostrar() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print("[" + actual.dato + "] ↔ ");
            actual = actual.siguiente;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.crear();
        lista.insertarInicio("Arte");
        lista.eliminar("Matemáticas");
        lista.mostrar();
    }
}

