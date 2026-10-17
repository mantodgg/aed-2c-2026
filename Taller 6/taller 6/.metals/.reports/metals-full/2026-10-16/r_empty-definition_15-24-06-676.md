error id: file://<HOME>/Descargas/Taller%204%20-%20ABB/src/main/java/aed/ABB.java:
file://<HOME>/Descargas/Taller%204%20-%20ABB/src/main/java/aed/ABB.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 779
uri: file://<HOME>/Descargas/Taller%204%20-%20ABB/src/main/java/aed/ABB.java
text:
```scala
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
        altura = 0;
    }

    public int cardinal() {
        return cardinal;
    }

    public T minimo(){
        Nodo nodo = new Nodo(raiz.valor);
        T res = raiz.valor;
        while (nodo != null) {
            res = nodo.valor;
            nodo@@ = nodo.izquierdo;
        }
        return res;
    }

    public T maximo(){
        Nodo nodo = new Nodo(raiz.valor);
        while (nodo != null) {
            nodo = nodo.derecho;
        }
        return nodo.padre.valor;
    }

    public void insertar(T elem){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public boolean pertenece(T elem){
        throw new UnsupportedOperationException("No implementada aun");
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

```


#### Short summary: 

empty definition using pc, found symbol in pc: 