package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> {
    private Nodo raiz;
    private int cardinal; 
    private int altura;

    private class Nodo {
        T valor;
        Nodo padre;
        Nodo derecho;
        Nodo izquierdo; 

        Nodo(T v) {valor = v;};
    }

    public ABB() {
        raiz = null;
        cardinal = 0;
    }

    public int cardinal() {
        return cardinal;
    }

    public T minimo(){
        Nodo nodo = new Nodo(raiz.valor);
        T res = raiz.valor;
        while (nodo != null) {
            res = nodo.valor;
            nodo = nodo.izquierdo;
        }
        return res;
    }

    public T maximo(){
        Nodo nodo = new Nodo(raiz.valor);
        T res = raiz.valor;
        while (nodo != null) {
            res = nodo.valor;
            nodo = nodo.derecho;
        }
        return res;
    }

    public void insertar(T elem){ //tenemos que agregarle al nodo toda la info, que es nuevo, quien es su padre, y como es su valor
        Nodo nuevo = new Nodo(elem);
        Nodo actual = raiz;
        while (actual != null){
            if (actual.valor.compareTo(elem) < 0) {
                if (actual.derecho != null) {
                    actual = actual.derecho;
                } else {
                    actual.derecho = nuevo;
                    nuevo.padre = actual;
                    cardinal ++;
                    return;
                }
            }
            else if (actual.valor.compareTo(elem) > 0) {
                if (actual.izquierdo != null) {
                    actual = actual.izquierdo;
                } else {
                    actual.izquierdo = nuevo;
                    nuevo.padre = actual;
                    cardinal ++;
                    return;
                }
            }
            else {
                return;
            }
        }
        if (raiz == null) { 
            raiz = nuevo;
            cardinal = 1;
        }
    }
    
    public boolean pertenece(T elem){
        if (raiz == null) {
            return false;
        }
        Nodo actual = raiz;
        while (actual != null) {
            if (actual.valor.compareTo(elem) < 0) {
                actual = actual.derecho;
            }
            else if (actual.valor.compareTo(elem) > 0) {
                actual = actual.izquierdo;
            } else {
                return true;
            }
        }
        return false;
    }

    public void eliminar(T elem){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public String toString(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public class ABB_Iterador {
        private Nodo _actual;

        public boolean haySiguiente() {            
            throw new UnsupportedOperationException("No implementada aun");
        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public ABB_Iterador iterador() {
        return new ABB_Iterador();
    }

}
