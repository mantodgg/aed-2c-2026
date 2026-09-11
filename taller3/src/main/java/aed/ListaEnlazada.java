package aed;

public class ListaEnlazada<T> {
    // Completar atributos privados
    private Nodo primero;
    private Nodo ultimo;

    private class Nodo {
        T valor;
        Nodo siguiente;
        Nodo anterior;
        Nodo(T v) {valor = v;}
    }

    public ListaEnlazada() {
        primero = null;
        ultimo = null;
    }

    public int longitud() {
        int longitud = 0;
        Nodo actual = primero;
        while (actual != null) {
            longitud += 1;
            actual = actual.siguiente;
        }
        return longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (primero == null) {
           primero = nuevo;
           ultimo = nuevo;
           primero.siguiente = null;
           primero.anterior = null;
        } else {
            nuevo.anterior = null;
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
        

    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            primero.siguiente = null;
            primero.anterior = null;
        } else {
            nuevo.anterior = ultimo;
            nuevo.siguiente = null;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public T obtener(int i) {
        int contador = 0;
        Nodo res = primero;
        while (contador != i) {
            contador += 1;
            res = res.siguiente;
        }
        return res.valor;
    }

    public void eliminar(int i) {
        Nodo nodo = primero;
        int contador = 0;
        while (i != contador) {
            nodo = nodo.siguiente;
            contador += 1;
        }
        
        if (nodo.anterior != null) {
            nodo.anterior.siguiente = nodo.siguiente;
        } else {
            primero = nodo.siguiente;
        }

        if (nodo.siguiente != null) {
            nodo.siguiente.anterior = nodo.anterior;
        } else {
            ultimo = nodo.anterior;
        }

        ;
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public class ListaIterador{
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public ListaIterador iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
