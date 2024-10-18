package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    Nodo raiz;
    int cardinalidad;

    private class Nodo {
        // Agregar atributos privados del Nodo
        Nodo izq, der, pred;
        T val;
        // Crear Constructor del nodo

        Nodo(T elem) {
            this.izq = null;
            this.der = null;
            this.pred = null;
            this.val = elem;
        }
    }

    public ABB() {
        this.raiz = null;
        this.cardinalidad = 0;
    }

    public int cardinal() {
        return this.cardinalidad;
    }

    public T minimo(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public T maximo(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void insertar(T elem){
        Nodo insNodo = new Nodo(elem);

        int i = cardinalidad;
        Nodo curNodo = this.raiz;

        while (i > 0) {
            
            i--;
        }
    }

    public boolean pertenece(T elem){
        int i = cardinalidad;
        Nodo curNodo = this.raiz;
        while (i > 0) {
            if(curNodo.val == elem) {
                return true;
            } else if (elem.compareTo(curNodo.val) < 0) {
                curNodo = curNodo.izq;
            } else { 
                curNodo = curNodo.der;
            }
            i--;
        }
        return false;
    }

    public void eliminar(T elem){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public String toString(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;

        public boolean haySiguiente() {            
            throw new UnsupportedOperationException("No implementada aun");
        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
